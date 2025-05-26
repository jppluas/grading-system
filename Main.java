public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("1", "John Doe");

        // Agregar calificaciones válidas
        if (student1.addGrade(100)) {
            System.out.println("Grade 100 added.");
        }
        if (student1.addGrade(90)) {
            System.out.println("Grade 90 added.");
        }

        // Intentar agregar una calificación inválida
        if (!student1.addGrade(110)) {
            System.out.println("Grade 110 not added (invalid).");
        }

        // Mostrar promedio
        System.out.printf("Average: %.2f\n", student1.average());

        // Intentar eliminar una calificación por índice inválido
        if (!student1.removeGradeByIndex(9)) {
            System.out.println("Grade at index 9 not removed (invalid index).");
        }

        // Eliminar una calificación por índice válido
        if (student1.removeGradeByIndex(1)) {
            System.out.println("Grade at index 1 removed.");
        }

        // Mostrar reporte final
        student1.reportCard();
    }
}