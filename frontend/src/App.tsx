import Barchat from "components/BarChart";
import DataTable from "components/DataTable";
import Footer from "components/Footer";
import NavBar from "components/NavBar";
import DonutChart from "components/DonutChart";


function App() {
  return (
      <>
      <NavBar />
    <div className="container"> 
      <h1 className="text-primary py-3">DashBoard de vendas</h1>
      <div className="row px-3">
        <div className="col-sm-6">
          <h5 className="text-center text-secundary">Taxa de sucesso (%)</h5>
          <Barchat />
        </div>
        <div className="col-sm-6">
          <h5 className="text-center text-secundary">Todas as vendas</h5>

          <DonutChart />
        </div>
      </div>

      <div className="py-3">
        <h2 className="text-primary">Todas as vendas</h2>
      </div>
      <DataTable />
    </div>
      <Footer />
    </>
  );
}

export default App;
