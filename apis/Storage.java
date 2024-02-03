package apis;
// public void dataStorageTest(Storage store){
//   InputReturn inputTest = store.input(new Source());
//   DelimitReturn delimTest = store.delim(new Delim());
//   OutputReturn outputTest = store.output(new Output());
// }

public interface Storage{
  InputReturn input();
  DelimitReturn delim();
  OutputReturn output();
}
