// ImagePickerButton shows an image picker to upload a image for a message
mPhotoPickerButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        //TODO
    }
});

// Enable Send button when there's text to send
mMessageEditText.addTextChangedListener(new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        if (charSequence.toString().trim().length() > 0) {
            mSendButton.setEnabled(true);
        } else {
            mSendButton.setEnabled(false);
        }
    }

    @Override
    public void afterTextChanged(Editable editable) {
    }
});
mMessageEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(DEFAULT_MSG_LENGTH_LIMIT)});

// Send button sends a message and clears the EditText
mSendButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        //TODO
        // Clear input box
        mMessageEditText.setText("");
    }
});