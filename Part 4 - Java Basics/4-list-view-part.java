// Initialize message ListView and its adapter
List<FriendlyMessage> friendlyMessages = new ArrayList<>();
mMessageAdapter = new MessageAdapter(this, R.layout.item_message, friendlyMessages);
mMessageListView.setAdapter(mMessageAdapter);
