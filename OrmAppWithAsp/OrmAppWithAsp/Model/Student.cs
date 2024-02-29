using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace OrmAppWithAsp.Model
{
    public class Student
    {
        [Key]
        public long Id { get; set; }

        public string FullName { get; set; }

        [Column("Start")]
        public DateTime DateStart { get; set; }

        public string Email { get; set; }

        public string Phone { get; set; }

        public double Note { get; set; }
    }
}
