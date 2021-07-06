package example_abstraction;

public abstract class BaseView {
    public void render(){
        beforeRender();
        // ..
        afterRender();
    }
    abstract void beforeRender();
    abstract void afterRender();
}

class StudentView extends BaseView{

    @Override
    void beforeRender() {

    }

    @Override
    void afterRender() {

    }
}

class Main2 {
    public static void main(String[] args) {
        BaseView x = new StudentView();
        x.render();
    }
}
