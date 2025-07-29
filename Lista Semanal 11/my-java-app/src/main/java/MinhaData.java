import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class MinhaData {
    private int dia;
    private int mes;
    private int ano;

    // O formatador é estático e final, uma constante da classe.
    private static final DateTimeFormatter FORMATADOR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public MinhaData(String dataStr) throws Exception {
        try {
            // LocalDate.parse é estrito e não aceita datas inválidas como "30/02/2025".
            // Ele lançará uma DateTimeParseException.
            LocalDate dataValidada = LocalDate.parse(dataStr, FORMATADOR);
            
            this.dia = dataValidada.getDayOfMonth();
            this.mes = dataValidada.getMonthValue();
            this.ano = dataValidada.getYear();

        } catch (DateTimeParseException e) {
            // Captura a exceção e lança uma nova com uma mensagem clara.
            throw new Exception("Data '" + dataStr + "' é inválida. Use o formato dia/mes/ano e uma data que exista.");
        }
    }

    /**
     * Método toString() melhorado.
     * Se você vir a data neste formato (ex: 01/01/2025), saberá que o novo código foi compilado.
     */
    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", this.dia, this.mes, this.ano);
    }

    // Getters e Setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
