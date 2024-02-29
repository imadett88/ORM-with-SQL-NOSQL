using Microsoft.EntityFrameworkCore;
using OrmAppWithAsp.Model;

namespace OrmAppWithAsp.Data
{
    public class AppDbContext : DbContext
    {
        public AppDbContext(DbContextOptions<AppDbContext> options):base(options)
        {
            
        }

        public DbSet<Student> Students { get; set; }
    }
}
