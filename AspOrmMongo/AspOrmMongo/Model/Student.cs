using MongoDB.Bson;
using MongoDB.Bson.Serialization.Attributes;

namespace AspOrmMongo.Model
{
    public class Student
    {
        [BsonId]
        public ObjectId Id { get; set; }
        public string FullName { get; set; }
        public string Email { get; set; }
        public DateTime DateStart { get; set; }
        public double Note { get; set; }
    }
}
