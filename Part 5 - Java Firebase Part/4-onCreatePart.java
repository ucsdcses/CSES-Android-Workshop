// Add this in onCreate()

attachDatabaseReadListener();

// Updated listener
mSendButton.setOnClickListener(new View.OnClickListener() 
{
    @Override
    public void onClick(View view) 
    {
        //Two new lines
        FriendlyMessage friendlyMessage = new FriendlyMessage(mMessageEditText.getText().toString(), mUsername, null);
        mMessagesDatabaseReference.push().setValue(friendlyMessage);

        // Clear input box
        mMessageEditText.setText("");
    }
});