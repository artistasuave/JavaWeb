package br.com.entra21java.web.alimentos;

import br.com.entra21java.bean.AlimentoBean;
import br.com.entra21java.dao.AlimentoDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Michelle de Jesus Rogério
 */
@WebServlet(urlPatterns = "/alimentos/store")
public class AlimentoStore extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AlimentoBean alimento = new AlimentoBean();
        alimento.setNome(req.getParameter("nome"));
        alimento.setQuantidade(Byte.parseByte(
                req.getParameter("quantidade")));
        alimento.setPreco(Double.parseDouble(req.getParameter("preco")));
        alimento.setDescricao(req.getParameter("descricao"));

        int codigo = new AlimentoDao().adicionar(alimento);

        PrintWriter out = resp.getWriter();
        out.print("Cadastrado com sucesso");
    }

}
