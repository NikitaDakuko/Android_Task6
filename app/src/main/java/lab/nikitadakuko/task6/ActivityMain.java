package lab.nikitadakuko.task6;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import lab.nikitadakuko.task6.databinding.MainLayoutBinding;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        //context for "toaster"
        Context context = getApplicationContext();

        MainLayoutBinding binding = DataBindingUtil.setContentView(this, R.layout.main_layout);
        MyViewModel viewmodel = new MyViewModel("storageExample", null, context);
        binding.setViewmodel(viewmodel);

        //for LiveData
        binding.setLifecycleOwner(this);
    }
}
