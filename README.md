# ViewFinder

一个学习 APT 的玩具项目, 实现了简单的 View 注入功能, 完成了类似于 [ButterKnife](https://github.com/JakeWharton/butterknife) 中的 `@BindView` 和 `@OnClick` 两个注解的功能。

A simple project to study with APT in Android, and it can work well like `@BindView` & `@OnClick` annotations in [ButterKnife](https://github.com/JakeWharton/butterknife) to inject for views.

### Before

```java
public class MainActivity extends AppCompatActivity {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.tv);
        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "onTextClick", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

```

### After

```java
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv) TextView mTextView;
    @OnClick(R.id.btn)
    public void onButtonClick() {
        Toast.makeText(this, "onButtonClick", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewFinder.inject(this);
    }
}

```



学习记录： [Android 利用 APT 技术在编译期生成代码](http://brucezz.itscoder.com/articles/2016/08/06/use-apt-in-android/)