package com.example.mydatabindingmodule.databinding;
import com.example.mydatabindingmodule.R;
import com.example.mydatabindingmodule.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RvItemListBindingImpl extends RvItemListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RvItemListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private RvItemListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.llItem.setTag(null);
        this.tvAccTradePrice24h.setTag(null);
        this.tvCoinName.setTag(null);
        this.tvSignedChangeRate.setTag(null);
        this.tvTradePrice.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.item == variableId) {
            setItem((com.example.mydatabindingmodule.data.FormatTickers) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.example.mydatabindingmodule.data.FormatTickers Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.mydatabindingmodule.data.FormatTickers item = mItem;
        java.lang.String itemToAccTradePrice24h = null;
        java.lang.String itemToSignedChangeRate = null;
        java.lang.String itemToMarket = null;
        java.lang.String itemToTradePrice = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.toAccTradePrice24h
                    itemToAccTradePrice24h = item.getToAccTradePrice24h();
                    // read item.toSignedChangeRate
                    itemToSignedChangeRate = item.getToSignedChangeRate();
                    // read item.toMarket
                    itemToMarket = item.getToMarket();
                    // read item.toTradePrice
                    itemToTradePrice = item.getToTradePrice();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAccTradePrice24h, itemToAccTradePrice24h);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCoinName, itemToMarket);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSignedChangeRate, itemToSignedChangeRate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTradePrice, itemToTradePrice);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}