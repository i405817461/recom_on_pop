package pku;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/*
 * 将测试集，只留下预测之后流行度top50-800的商品的边
 */
public class Devide2TopPop {

	/*
	 * public static final String PopfileName =
	 * "E:/doc/lab/dataset/recommending/movielens-100k/data_2part/1/data1_0.5Item_pop_pre5_inorder.base"
	 * ; public static final String ChoosefileName =
	 * "E:/doc/lab/dataset/recommending/movielens-100k/data_2part/1/data1_0.5Item_Test_4use.base"
	 * ; public static final String path =
	 * "E:/doc/lab/dataset/recommending/movielens-100k/data_2part/1/";
	 */

	public static String PopfileName;
	public static String ChoosefileName;
	public static String path;
	public static String recentSize ;

	public static final String COM_PATH = "E:/doc/lab/dataset/recommending/movielens-100k/forcastPopByRecom/";

	public static void main(String[] args) {
		for (int id = 1; id <= 9; id = id + 1) {
			recentSize = "0"+id ;
			System.out.println(recentSize);
/*			switch (id) {
			case 1:
				recentSize = "all";
				break;
			case 2:
				recentSize = "last30";
				break;
			case 3:
				recentSize = "last60";
				break;
			case 4:
				recentSize = "last90";
				break;
			default:
				break;
			}*/

			PopfileName = COM_PATH + "hybrid_l30_rec1/r1l30_lamda0."+recentSize+"_pop_Acd.txt";
			ChoosefileName = COM_PATH  + "uUse_ItemAcd2592000.txt";
			path = COM_PATH + "hybrid_l30_rec1/0-1/"+recentSize+"/";
			
			for (int i = 50; i <= 1600; i = i + 50) {
				ChooseTopN ctn = new ChooseTopN(i, PopfileName, ChoosefileName,path);
				System.out.println(ctn.topNPath);
			}
		}
	}
}
