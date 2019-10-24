# 🌼 Android Architecture 🌼
  - [1차 Study](#-1차-study) - MVC
  - [2차 Study](#-2차-study) - Repository
  - [3차 Study](#-3차-study) - MVP
  - [4차 Study](#-4차-study) - MVP
  - [5차 Study](#-5차-study) - DataBinding
  - [6차 Study](#-6차-study) - MVVM
  - [7차 Study](#-7차-study) - MVVM
  - [8차 Study](#-8차-study) - AAC LiveData, AAC ViewModel
  - [9차 Study](#-9차-study) - Koin
------------
<img src="https://i.imgflip.com/3dngez.gif" width="200" height="370"/>

------------



## 🌸1차 Study
- 하나의 MainActivity와 4개의 Fragment 구현
- Retrofit을 이용하여 서버통신
- [QUOTATION API](https://docs.upbit.com/reference#%EC%8B%9C%EC%84%B8-%EC%A2%85%EB%AA%A9-%EC%A1%B0%ED%9A%8C)

    >❗️**ISSUE**
    > - 프레그먼트 4개를 각각 만들었다 하나의 프레그먼트를 재활용하는 방법은 없을까? [해결](https://github.com/ganghee/Android_Pattern/issues/3)
    > - tickers를 가져올 때 market이름을 하드코딩해서 10개만 가져왔다. 하드코딩하지 않는 방법은? [해결](https://github.com/ganghee/Android_Pattern/issues/4)
    > - text의 색이 바뀌지 않는다. [해결](https://github.com/ganghee/Android_Pattern/issues/5)



## 🌸 2차 Study
- **Android Repository Pattern**
- Data 레이어를 **Repository**와 **DataSource**로 구현한 것
- DataSource는 **RemoteDataSource**와 **LocalDataSource**로 나누어져 있다.
- **RemoteDataSource**는 API통신으로 데이터를 가져오는 로직이 구현되어 있다.
- **LocalDataSource**에는 Room, SQLite, Realm, SharedPreference 등으로 구현되어 있어 내부저장소에서 데이터를 가져오는 구직이다. 
 ![image](https://user-images.githubusercontent.com/35513039/67093148-f2863100-f1eb-11e9-830d-8483ddc31038.png)
- [google todo-list sample(repository)](https://github.com/android/architecture-samples/tree/todo-mvp-kotlin)
- [우아한 형제들 기술 블로그(repository)](http://woowabros.github.io/experience/2019/01/17/baeminapp-clean-architecture.html)
  
    >❗️**ISSUE**
    > - Adapter에 ViewHolder를 구현해야 하나? [해결](https://github.com/ganghee/Android_Pattern/issues/6)
    > - ViewHolder와 Data Class는 변수형이 var인가 val인가? [해결](https://github.com/ganghee/Android_Pattern/issues/7)
    > - Adapter의 파라미터로 context가 필요한가? [해결](https://github.com/ganghee/Android_Pattern/issues/8)
    > - RecyclerView setup하는 시점은 언제인가? [해결](https://github.com/ganghee/Android_Pattern/issues/9)



## 🌸 3차, 4차 Study
- **Model**: 데이터, 상태, 비즈니스 로직을 담당

- **View**: xml, ui(Fragment, Activity), Presenter에 이벤트 전달, Presenter로 받은 데이터 보여줌
- **Presenter**: View로 받은 이벤트를 처리(로직구현)하고 Model을 업데이트
- **Contract**에서는 View 인터페이스와, Presenter 인터페이스를 정의 contract만 보고도 대략적인 코드를 알 수 있다.

  - contract 에는 view 인터페이스와 presenter 인터페이스가 있다. 
  
  - view 인터페이스는 ui에서 상속받아 구현한다. 
  - presenter 인터페이스는 presenter 객체를 만들어 이 객체가 presenter 인터페이스를 상속받아 구현한다. 
  - 구현된 presenter 객체는 ui에서 변수로 객체 생성하여 view와 연동된다.
  ![image](https://user-images.githubusercontent.com/35513039/67113465-8bc93d80-f214-11e9-8bad-42125555e50d.png)
  - [MVP 블로그](https://black-jin0427.tistory.com/149)
  - [google todo-list sample(MVP)](https://github.com/android/architecture-samples/tree/todo-mvp-kotlin)

    >❗️**ISSUE**
    >- interface method를 만들 때 많이 만드는 것이 좋을까? [해결](https://github.com/ganghee/Android_Pattern/issues/10)
    >- Fragment를 생성할 때 파라미터에 데이터를 전송하지 않고 bundle로 데이터 전송하는 방법이 있을까? [해결](https://github.com/ganghee/Android_Pattern/issues/11)



## 🌸 5차 Study
- Databinding : 프로그래매틱 방식이 아니라 선언적 형식으로 레이아웃의 UI 구성요소를 앱의 데이터 소스와 결합할 수 있는 지원 라이브러리
- @{} 형식을 통해 findViewById를 구현할 필요가 없다.
- 레이아웃 파일에서 구성요소를 결합하면 활동에서 많은 UI 프레임워크 호출을 삭제할 수 있으며 이로 인해 파일이 더욱 간소화되고 유지관리 또한 쉬워진다. 앱 성능이 향상되며 메모리 누수 및 null pointer exceptions를 방지할 수 있다.
- 사용 방법
    1. build.gradle의 kotlin-extension을 제거한다. 제거를 하지 않아도 좋지만 findViewId를 이용을 막기 위함이다.
    2. build.gradle 파일에 아래코드를 추가한다.
        ```
        dataBinding{
            enabled = true
        }  
        ```
    3. xml에서 최상위 태그를 layout으로 한다.
    4. activity에서 setContentView를 삭제하고 아래 코드로 대체한다.
        ```
        lateinit var binding = DataBindingUtil.setContentView(this, [layoutId])
        ```
    4. RecyclerView에서 각각의 item을 set해주는 작업도 xml에서 다 써주면 알아서 값이 들어간다. 즉, 데이터가 바뀌면 View가 자동으로 갱신한다.
 
- [Android Developer Web Site- Data Binding](https://developer.android.com/topic/libraries/data-binding)

- [박상권의 삽질블로그](https://gun0912.tistory.com/71) 

    >❗️**ISSUE**
    >- 함수의 파라미터가 많을 때 구현 방법 [해결](https://github.com/ganghee/Android_Pattern/issues/12)
    >- 함수의 파라미터가 길 때 구현 방법 [해결](https://github.com/ganghee/Android_Pattern/issues/13)
    >- run, let, apply, also 도대체 이것들을 잘 사용할 수 있을까? [해결](https://github.com/ganghee/Android_Pattern/issues/14)


## 🌸 6차, 7차 Study
- `MVVM`: MVVM은 Model-View-ViewModel의 약자이다. Model은 UI에 표시될 데이터 와 비즈니스 로직을 담당하고 View는 UI를 의미하며 ViewModel은 이벤트 처리나, Model과의 인터랙션 등을 담당한다.
![](https://raw.githubusercontent.com/wiki/android/architecture-samples/images/mvvm-databinding.png)
- AAC가 필요한 것은 아니다. AAC가 없어도 충분히 MVVM 구조를 만들 수 있다.
- __AAC(Android Architecture component)__ : LiveData, ViewModel, Room, Paging 등

- https://duzi077.tistory.com/196 [개발하는 두더지]
- [google todo-list sample(MVVM)](https://github.com/android/architecture-samples/tree/todo-mvvm-databinding)

    >❗️**ISSUE**
    >- FragmentPagerAdapter와 FragmentStatePagerAdapter중 어느것을 써야할까? [해결](https://github.com/ganghee/Android_Pattern/issues/15)
    >- lateinit과 lazy 초기화 중 어느것을 써야할까? [해결](https://github.com/ganghee/Android_Pattern/issues/16)
    >- compositeDisposable을 ViewModel에서 생명주기를 고려해 어느곳에 구현해야 할까? [해결](https://github.com/ganghee/Android_Pattern/issues/17)


## 🌸 8차 Study
- **AAC ViewModel**
    - ViewModel 클래스는 UI 관련 데이터를 저장하고 관리하기 위해 설계되었습니다. 즉, 스크린 회전 같은 상태 변화에도 데이터가 보존될 수 있도록 허용해줍니다. 
    
    - 만약 액티비티가 재 생성이 된다면, 처음 만들어진 ViewModel 인스턴스를 받게됩니다. 이 인스턴스를 호출한 액티비티 또는 프래그먼트가 destory 되어 메모리 해제가 되기전까지 데이터를 유지하고 있어서 데이터를 보관하고 있다가 화면 회전같은 상태 변화가 발생해도 데이터를 유지하게 됩니다.
        </img src='https://developer.android.com/images/topic/libraries/architecture/viewmodel-lifecycle.png' width='60%'>
    - **sharedViewModel**
        - Viewmodel을 공유 하는 기능
        - activity, fragment 들의 ViewModel의 변수를 공유할 수 있다.
        - `sharedViewModel?.inputNumber?.postValue(input)`을 통해 데이터를 넣는다.
        - 아래 코드를 통해 데이터가 바뀌는 것을 감지한다.
            ```
            sharedViewModel.inputNumber.observe(this,Observer {
                it?.let {
                // do some thing with the number
                }
            })
            ```
        - https://medium.com/mindorks/how-to-communicate-between-fragments-and-activity-using-viewmodel-ca733233a51c

- **AAC LiveData**
    - LiveData는 관찰 가능한 데이터 홀더 클래스이다. 일반적인 관찰가능함과는 다르게, LiveData는 Activity, Fragment, Service와 같은 앱 컴포넌트의 생명주기를 인식하고, 그대로 따르도록 구현되어 있다. 이는 LiveData가 현재 활성화된 생명주기에 있는 앱 컴포넌트의 옵저버(Observer)만 업데이트 하도록 보장한다.
    - LifecycleOwner 인터페이스를 구현한 객체와 쌍을 이루는 옵저버를 등록 할 수 있다. 이러한 특성은 특히 Activity, Fragment의 생명주기가 destroy 상태가 되었을 때, 즉시 관찰을 취소하므로 LiveData객체를 안전하게 관찰할 수 있고, 메모리 릭에 대한 우려도 없어지므로 유용하게 사용될 수 있다. 
    - LiveData 장점
        
        **1. UI를 데이터 상태와 일치 시킬 수 있다.**
            
        - LiveData는 옵저버패턴을 따르고 있다. 생명주기 상태애 변화가 생기면 LiveData는 Observer인스턴스에 알림을 보낸다. 그러므로, 개발자는 Observer 객체 안에서 UI가 갱신되도록 코드를 통합할 수 있다. 앱의 데이터가 변할 때마다 매번 UI를 갱신하는 대신, 옵저버에 변화가 감지될 때마다 UI를 갱신 하도록 바꿀 수 있다.

        **2. 메모리 릭의 요소를 없앨 수 있다.**

        - 옵저버들은 Lifecycle 객체와 바인드되고, 그 Lifecycle 객체가 destroy 상태가 되면 자동적으로 지워진다.
        **3. 정지된 엑티비티들 때문에 Crash날 일이 없다.**

        - 엑티비티가 백스택에 있을때와 같이, 옵저버의 생명주기가 비활성화 상태일 때는, 어떠한 LiveData 이벤트도 받지 않는다.
        
        **4. 직접 생명주기를 핸들링할 필요가 없다.**

        - UI 컴포넌트는 단지 연관된 에이터를 관찰하기만 하고, resume/stop을 신경쓸 필요가 없다. LiveData가 상태변화를 감지하여 알아서 처리한다.
        
        **5. 항상 최신의 데이터를 유지한다.**

        - 생명주기가 비활성화 상태에서 활성화 상태로 변했을 때,UI컴포넌트는 최신의 데이터를 받는다.
        
        **6. 구성(Configuration)이 변경되었을 때 적절하게 대응한다.**

        - Activity나 Fragment가 구성변경되어 재생성될 때, 그 컴포넌트들은 LiveData로 부터 즉시 사용가능한 최신데이터를 제공받는다.

        - 싱글턴 패턴을 이용해 시스템 서비스를 래핑하여 LiveData객체가 공유될 수 있도록 확장할 수 있다. LiveData오브젝트가 시스템 서비스에 한번 연결되면, 리소스가 필요한 모든 옵저버는 LiveData 객체를 볼 수 있다.  

    - LiveData 객체생성 방법
        1. 특정 데이터를 유지할 LiveData인스턴스르 생성한다. 이 작업은 주로 ViewModel 클래스 안에서 이루어진다.
        2. onChanged() 메서드를 정의하고 있는 Observer 인스턴스를 생성한다. onChanged() 메서드는 LiveData가 유지하고 있는 데이터에 변화가 감지되었을 때 어떻게 동작할지를 제어하도록 구현한다. 대부분 Activity나 Fragment 같은 UI컨트롤러에서 Observer 인스턴스를 생성한다.
        3. observe() 메서드를 Observer인스턴스를 LiveData 인스턴스에 연결한다.Observe 메서드는 LivecycleOwner 인스턴스를 받는다. 이는 Observer 인스턴스가 LiveData 인스턴스를 구독하도록 하여, 변화에 대해 알림을 받도록 한다. 일반적으로 Observer 인스턴스는 Activity나 Fragment 같은 UI컨트롤러에 붙인다.
    - http://dktfrmaster.blogspot.com/2018/02/livedata.html 

- `Architecture ViewModel`과 `AAC ViewModel`간의 __차이점__

  1. __Architecture ViewModel__: View에 보여질 데이터를 Repository에서 가져와 로직을 구현한다. observableField로 data가 바뀌는 것을 감지한다.
  2. __AAC ViewModel__: 생명주기를 신경쓰지 않아 데이터 처리가 쉽다. 특히 가로모드일 때 데이터가 갱신된다. ViewModel을 사용하지 않을 때는 `onSaveInstanceState()` 메소드를 써서 `onCreate()`에서 다시 데이터를 받을 수 있지만 이를 구현하지 않아도 된다.

-  https://duzi077.tistory.com/196 [개발하는 두더지]
- https://developer.android.com/topic/libraries/architecture/viewmodel

    >❗️**ISSUE**
    >- 색상 값이 binding되지 않는다 [해결](https://github.com/ganghee/Android_Pattern/issues/18)


## 🌸 9차 Study
- Koin
    - **DI(Dependency injection)**: 구성요소간의 의존 관계가 소스코드 내부가 아닌 외부 설정 파일등을 통해 정의되게하는 디자인 패턴중 하나입니다

    - 분리시켜 놓으면 객체의 생성과 사용을 분리시킬 수 있고, 재사용이 유연해집니다.

    - 키워드 
        - **module** - Koin모듈을 정의할때 사용
        - **factory** - inject하는 시점에 해당 객체를 생성
        - **single** - 앱이 살아있는 동안 전역적으로 사용가능한  객체를 생성
        - **bind** - 생성할 객체를 다른 타입으로 바인딩하고 싶을때 사용
        - **get** - 주입할 각 컴포넌트끼리의 의존성을 해결하기 위해 사용

    >❗️**ISSUE**
    >- 모듈화는 어떤 기준으로 나누는가? [해결]()
    >- Service, Datasource, Repository를 모듈화하려면 각각의 객체들을 인자, 상속, 변수 중 어떤 것을 구현해야 하는가? [해결]()