# LoadingStateView
loading view with state for android

swift version:https://github.com/StevenDXC/DxLoadingHUD

 ![image](https://github.com/StevenDXC/LoadingStateView/blob/master/image/demo.gif)
 

usage:


layout:
```xml
 <com.dxc.loadingstateview.widget.LoadingStateView
        android:id="@+id/loading_view"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        app:view_size="large"
        app:color_empty="@color/empty_color"
        app:color_normal="@color/loading_color"
        app:color_success="@color/success_color"
        app:color_failed="@color/failed_color"/>
```


success:
```java
mLoadingView.setViewState(LoadingStateView.STATE_SUCCESS);
```

failed:
```java
mLoadingView.setViewState(LoadingStateView.STATE_FAILED);
```

empty:
```java
 mLoadingView.setViewState(LoadingStateView.STATE_EMPTY_RESULT);
```

 to loading state:
 ```java
 mLoadingView.setViewState(LoadingStateView.STATE_LOADING);
 ```
