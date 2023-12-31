package com.example.lunchtray.constants;

/**
 * Object for items types. Applied to the MenuItem object.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/example/lunchtray/constants/ItemType;", "", "()V", "ACCOMPANIMENT", "", "getACCOMPANIMENT", "()I", "ENTREE", "getENTREE", "SIDE_DISH", "getSIDE_DISH", "app_debug"})
public final class ItemType {
    private static final int ENTREE = 1;
    private static final int SIDE_DISH = 2;
    private static final int ACCOMPANIMENT = 3;
    @org.jetbrains.annotations.NotNull
    public static final com.example.lunchtray.constants.ItemType INSTANCE = null;
    
    private ItemType() {
        super();
    }
    
    public final int getENTREE() {
        return 0;
    }
    
    public final int getSIDE_DISH() {
        return 0;
    }
    
    public final int getACCOMPANIMENT() {
        return 0;
    }
}