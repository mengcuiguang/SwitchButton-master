# SwitchButton-master
炫酷的滑动开关

![image](https://github.com/mengcuiguang/SwitchButton-master/blob/master/test.gif )  

使用方法：

1、布局文件

    <com.meng.switchbutton.ButtonView 
        android:layout_width="wrap_content" 
        android:layout_height="wrap_content"/>
    
2、MainActivity 

    buttonView.setChangeListener(new ButtonView.onChangeListener() {
            @Override
            public void onChange(boolean state) {
                Toast.makeText(MainActivity.this, "状态:"+state, Toast.LENGTH_SHORT).show();
            }
        });
