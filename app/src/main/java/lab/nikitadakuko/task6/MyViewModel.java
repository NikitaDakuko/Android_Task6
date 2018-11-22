package lab.nikitadakuko.task6;

import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.widget.Toast;

public class MyViewModel {
    private MutableLiveData<String> storageTextView;
    private MutableLiveData<String> inputEditText;
    private Context context;


    //constructor
    public MyViewModel(String storageTextView, String inputEditText, Context context) {
        this.storageTextView = new MutableLiveData<>();
        this.storageTextView.setValue(storageTextView);
        this.inputEditText = new MutableLiveData<>();
        this.inputEditText.setValue(inputEditText);
        this.context = context;
    }


    //onClick functions
    public void writeButtonClick(){
        this.storageTextView.setValue(this.inputEditText.getValue());
    }

    public void readButtonClick(){
        Toast.makeText(context, this.storageTextView.getValue(), Toast.LENGTH_SHORT).show();
    }


    //getters
    public MutableLiveData<String> getMyTextView() {
        return storageTextView;
    }

    public MutableLiveData<String> getMyEditText() {
        return inputEditText;
    }
}
