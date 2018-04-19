//Controlling XML views through JAVA
private ListView mMessageListView;
private MessageAdapter mMessageAdapter;
private ProgressBar mProgressBar;
private ImageButton mPhotoPickerButton;
private EditText mMessageEditText;
private Button mSendButton;

private String mUsername;

//Some members that'll help
private static final String TAG = "MainActivity";
public static final String ANONYMOUS = "anonymous";
public static final int DEFAULT_MSG_LENGTH_LIMIT = 1000;