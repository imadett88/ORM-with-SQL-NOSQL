using AspOrmMongo.Model;
using AspOrmMongo.Repository;
using Microsoft.AspNetCore.Mvc;

public class StudentController : Controller
{
    private readonly StudentRepository _studentRepository;

    public StudentController(StudentRepository studentRepository)
    {
        _studentRepository = studentRepository;
    }

    public IActionResult Index()
    {
        var students = _studentRepository.GetStudents();
        return View(students);
    }

    [HttpPost]
    public IActionResult AddStudent(Student student)
    {
        _studentRepository.InsertStudent(student);
        return RedirectToAction("Index");
    }
}
