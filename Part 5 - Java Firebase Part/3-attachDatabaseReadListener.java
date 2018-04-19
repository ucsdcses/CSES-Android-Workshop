private void attachDatabaseReadListener() 
{
    if (mChildEventListener == null) 
    {
        mChildEventListener = new ChildEventListener() 
        {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) 
            {
                FriendlyMessage friendlyMessage = dataSnapshot.getValue(FriendlyMessage.class);
                mMessageAdapter.add(friendlyMessage);
            }

            public void onChildChanged(DataSnapshot dataSnapshot, String s) {}
            public void onChildRemoved(DataSnapshot dataSnapshot) {}
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {}
            public void onCancelled(DatabaseError databaseError) {}
        };
        mMessagesDatabaseReference.addChildEventListener(mChildEventListener);
    }
}