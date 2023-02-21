
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.io.IOException;

public class GetDataFinnancialApi {

	public static void main(String[] args) throws IOException {
		String[] stockIds = { "GOOG", "SAP", "AMZN", "NTDTY", "CASDA", "MSFT", "CRM", "GENESYS.NS", "ND", "NOW", "CRM",
				"GENESYS.NS", "ND", "NOW", "SAP", "ADBE", "ORCL", "PEGA", "INFA", "DCT", "SPNS", "IBM", "VMW", "DELL",
				"PRSM.L", "PATH", "APPN", "SNOW", "C", "ISP.MI", "BMED.MI", "BKT.MC", "BBVA", "EBS.VI", "BNP.PA", "BBD",
				"CABK.MC", "D05.SI", "DBK.DE", "DB", "AVAL", "HSBC", "IDCBY", "ING", "ITUB", "MFG", "MUFG", "SAB.MC",
				"SAN", "SMFG", "UBS", "UCG.MI", "ALV.DE", "WBK", "AGS.BR", "AXA.DE", "BGN.MI", "HSX.L", "MAP.MC",
				"MUV2.DE", "SULA11.SA", "TLX.DE", "TKOMY", "UNI.MI", "UQA.VI", "ZURN.SW", "MIJ.SI", "BAS.DE", "BAYN.BE",
				"CTVA", "EVK.DE", "GNGBY", "GRFS", "RO.SW", "IQV", "KRK.WA", "LXS.DE", "NVS", "PHNX.L", "SNY", "ACCA",
				"PST.MI", "UNH", "AMX", "AMT", "CLNX.MC", "DTE.DE", "KPN.AS", "LBTYA", "ORAN", "TMUS", "SPK.AX", "TEF",
				"TIIAY", "UVV", "VOD", "WBD", "WKL.AS", "ABI.BR", "ABVG", "BTVCY", "BRBY.L", "CA.PA", "KO", "BN.PA",
				"HEIA.AS", "ITXU.TI", "MCD", "RAND.AS", "CFRUY", "SECUB.ST", "STBFY", "TSCDY", "BX", "UL", "BME.L",
				"ANA.MC", "AMS.MC", "AUTME.MI", "HLAG.DE", "IAG.L", "LTMAQ", "NHH.MC", "EDR.MC", "SEURUSD", "BSY",
				"BMW.DE", "BWA", "CLR", "DTG.DE", "GEST.MC", "HTHIY", "JGGCR", "LDO.MI", "MLAI", "POAHY", "SEAT",
				"SIEGY", "TM", "VWAGY", "F", "SGRE.MC", "SGO.PA", "A2A.MI", "ACE.MI", "0P0000RVL6.F", "NGO=F", "EC",
				"EDP.LS", "ENG.MC", "EBK.DE", "ELE.MC", "ENLAY", "E", "GALP.LS", "HER.MI", "IBE.MC", "GASNY",
				"NESTE.HE", "REP.MC", "SPM.MI", "SHEL", "SRG.MI", "TRN.MI", "TERPEL.CL", "TTE.PA", "TLW.L", "YPF",
				"ACN", "TCS.NS", "INFY", "CTSH", "CAP.PA", "DXC", "HCLTECH.NS", "WIPRO.NS", "ATO.PA", "GIB", "SOP.PA",
				"NTDTY", "CPI.L", "TEP.PA", "FJTSY", "HPE", "GFT.DE", "DATAMATICS.NS", "TECHM.NS", "TRIGYN.NS", "GLOB",
				"ISMAY", "TWKS", "ADN1.DE", "CCC.L", "REY.MI", "TIT.MI", "018260.KS"

		};
		String apiKey = "fa81bc4991bdafc296209348553902eb";

		for (String stokId : stockIds) {
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpGet request = new HttpGet("https://financialmodelingprep.com/api/v3/income-statement/" + stokId
					+ "?limit=1&apikey=" + apiKey);
			CloseableHttpResponse response = httpClient.execute(request);
			String responseString = EntityUtils.toString(response.getEntity());
			// response.close();
			// httpClient.close();
			System.out.println(responseString);
		}
	}
}