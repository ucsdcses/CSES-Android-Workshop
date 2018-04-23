@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data)
{
    if(requestCode == 101 && resultCode == RESULT_OK)
    {
        Uri file = data.getData();

        mStorageReference.putFile(file)
        .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>()
        {
            Uri downloadUrl = taskSnapshot.getDownloadUrl();
            FriendlyMessage friendlyMessage = new FriendlyMessage(null, mUsername, downloadUrl.toString());
            mMessagesDatabaseReference.push().setValue(friendlyMessage);
        })
        .addOnFailureListener(new OnFailureListener()
        {
        });
    }
}
