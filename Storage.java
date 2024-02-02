public void datStorageTest(Storage store){
    InputReturn inputTest = store.input(new Source());
    DelimitReturn delimTest = store.delim(new Delim());
    OutputReturn outputTest = store.output(new Output());
}

public Interface Storage{
    InputReturn input();
    DelimitReturn delim();
    OutputReturn output();
}