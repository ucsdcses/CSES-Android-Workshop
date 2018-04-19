//Inside onCreate - 

mUsername = ANONYMOUS;

// Initialize references to views
mProgressBar = (ProgressBar) findViewById(R.id.progressBar);
mMessageListView = (ListView) findViewById(R.id.messageListView);
mPhotoPickerButton = (ImageButton) findViewById(R.id.photoPickerButton);
mMessageEditText = (EditText) findViewById(R.id.messageEditText);
mSendButton = (Button) findViewById(R.id.sendButton);


// Initialize progress bar
mProgressBar.setVisibility(ProgressBar.INVISIBLE);