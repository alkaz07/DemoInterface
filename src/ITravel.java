public interface ITravel extends IMove{
   void setup(Site from);
   void relax(Site to);

   default void travel(Site from, Site to){
       setup(from);
       move(from, to);
       relax(to);
   }
}
