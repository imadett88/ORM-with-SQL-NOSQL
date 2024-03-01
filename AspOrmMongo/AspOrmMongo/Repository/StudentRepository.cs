using AspOrmMongo.Model;
using MongoDB.Driver;

namespace AspOrmMongo.Repository
{
    public class StudentRepository
    {
        private readonly IMongoCollection<Student> _students;

        public StudentRepository(IMongoDatabase database)
        {
            _students = database.GetCollection<Student>("students");
            
        }

        public List<Student> GetStudents() =>
        _students.Find(student => true).ToList();

        public void InsertStudent(Student student) =>
            _students.InsertOne(student);


    }
}
