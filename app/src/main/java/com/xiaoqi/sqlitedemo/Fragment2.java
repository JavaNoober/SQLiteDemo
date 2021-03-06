package com.xiaoqi.sqlitedemo;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by xiaoqi on 2016/9/1.
 */
public class Fragment2 extends Fragment{

	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		//		SQLiteDataProxy.getSQliteProxy(getActivity()).execSQLList(getList());
//		db.beginTransaction();
//		for(String sql : list){
//			db = SQLiteDatabase.openDatabase(getActivity().getFilesDir().getAbsolutePath()+"/foowwlite.db",null,
//					SQLiteDatabase.OPEN_READWRITE);
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			db.execSQL(sql);
//		}
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (String sql:getList()){
					SQLiteDataProxy.getSQLiteProxy(getActivity()).execSQL(sql);
				}
			}
		}).start();

//		DBManager.asyncExecSQLList(getActivity(),getList());
//		DBManager.execSQLList(getActivity(),getList());

//		Cursor cursor = DBManager.query(getActivity(),"select COUNT(*) FROM BuildingTypeFacility");
//		while (cursor.moveToNext()){
//			int i = cursor.getInt(0);
//			Log.i("count ",i+"");
//		}
//		DBManager.close(getActivity());

	}
	public ArrayList<String> getList(){
		ArrayList<String> lstSqls = new ArrayList<String>();
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'4e6382eb5d723a419bd6240075863b95',X'29aaac621c76d445ae9ee5cf1adbef70',X'18486825e3f1634c8fca1542af3da5c4')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'a847ae9997c68a49a7d04b5d85f2d0b1',X'a5f8739f3d430141ae1cdd376486774b',X'18486825e3f1634c8fca1542af3da5c4')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'd2ab9d9964578848904474658df8bf15',X'aad69d795561b24fbc9d50e300f07672',X'28e3716ce4d0664e9046061ce908bade')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'e7b516af666d0045b8a3779fbffe74cf',X'aba4225d90089e47bb4b6332d0d827ce',X'60ddbd848deacb40ad90726a9e76e53b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'99f6dab5d59a72478febb14d158f2f57',X'3c35563703c94946ba38a9ab6956a850',X'e284a2bb289f524b97e8f20fd1ccab7a')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'7921ee7f182b3941b815e35a348ded26',X'3c35563703c94946ba38a9ab6956a850',X'a1a3ff8fafe3ff47a54c5963a75646ef')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'd53375559dcaff458fe62d91632c69de',X'2927b98699db6645951e087c77f4d659',X'0b6246ba2ec49f458b3d05fa013b1e31')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'0e3c41823c9f7441b8ad8a0c7a577a34',X'b7d3ba562f2e0342a758af1359f454a6',X'18486825e3f1634c8fca1542af3da5c4')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'7e477185c6d90946b8847dd2a84be167',X'18170f1eec53d0419b06e9805a33c69e',X'60ddbd848deacb40ad90726a9e76e53b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'7cc54b314ed7c3488ad57ea6a9ae3dd7',X'7e296eec3debb04eac6b6ed94d067c61',X'f11be11424abb84bb72257143a413c83')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'8557fdc2e42a854fa3fad34f4f4d187a',X'2018576194a1c84eb7ad8c3eba0443ad',X'e284a2bb289f524b97e8f20fd1ccab7a')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'e724f2ed932ce04ea23207ed415e3728',X'81881c3cf64be34a9b5d02a773c35c5c',X'18486825e3f1634c8fca1542af3da5c4')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'f91d685ccec03b4bb2858644338f6ffb',X'9659dbc46af1d24d9b547d284cc719fc',X'14162492d1088841abf789d3cbd3fa91')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'5a6a651a64f915499dae778d39ca40aa',X'985e4bea0ef6a5439ccbd352d87eb030',X'cb5573aa5fde43419e01dfb8ae16c302')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'7ff81720d8dee4498a61671da91b8cc2',X'29aaac621c76d445ae9ee5cf1adbef70',X'f11be11424abb84bb72257143a413c83')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'cc19efeb384bac41bf4eaa2b9e4235e7',X'3c35563703c94946ba38a9ab6956a850',X'e85dc48bbd4ef5489c65a8a250a3676c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'9d5de1cfbd5ec94ab1ce3fedfa9570e0',X'6c2ec0f699104a47b35bd08bec183295',X'0b6246ba2ec49f458b3d05fa013b1e31')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'4a74e2067bd4ef459cb2824f9694e3e6',X'159890d6237b114e8b07421e3f7783a2',X'50d477ed1fc83b4da67db81b15b8a4e5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'6219986c0b5b0c41a7e284479f1c01a7',X'18170f1eec53d0419b06e9805a33c69e',X'd03afef3543ccf4297eb0dbc8e2b5408')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'fa8b578bfabb654fb8d726b469058070',X'29aaac621c76d445ae9ee5cf1adbef70',X'14162492d1088841abf789d3cbd3fa91')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'42630a6d8310eb419aa79dfb5c786980',X'6c2ec0f699104a47b35bd08bec183295',X'18486825e3f1634c8fca1542af3da5c4')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'19d15754ed12b3458c6e36066fed7a2b',X'2018576194a1c84eb7ad8c3eba0443ad',X'a1a3ff8fafe3ff47a54c5963a75646ef')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'216bb603c1d54d44971987ddbabd9cc6',X'7e296eec3debb04eac6b6ed94d067c61',X'e85dc48bbd4ef5489c65a8a250a3676c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'82f6cbf5af287841b375021f7c3c8051',X'56fa5172072fc64d963787a19dcf2ea1',X'0b6246ba2ec49f458b3d05fa013b1e31')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'3bfcae220c503a44b730f06ffc94cac1',X'a5f8739f3d430141ae1cdd376486774b',X'f11be11424abb84bb72257143a413c83')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'838a0968522da643a6f50225f210d25c',X'29aaac621c76d445ae9ee5cf1adbef70',X'cb5573aa5fde43419e01dfb8ae16c302')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'cfb92cc950c40d479b31ff72b1429812',X'2927b98699db6645951e087c77f4d659',X'18486825e3f1634c8fca1542af3da5c4')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'2754e35b4bf6b243b51a8b3ad26fb1eb',X'159890d6237b114e8b07421e3f7783a2',X'2668dce266931a449e69ac150d1a62d5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'c03d70383740284db9e6f6a8a4493d34',X'a5f8739f3d430141ae1cdd376486774b',X'14162492d1088841abf789d3cbd3fa91')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'a07f5f36d4c3df47ac379d82c348beb2',X'9659dbc46af1d24d9b547d284cc719fc',X'cb5573aa5fde43419e01dfb8ae16c302')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'da1532060f97744986ba8ddb50917e63',X'18170f1eec53d0419b06e9805a33c69e',X'e85dc48bbd4ef5489c65a8a250a3676c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'5ce3db72aba5db4db09d5c69d3444200',X'a5f8739f3d430141ae1cdd376486774b',X'cb5573aa5fde43419e01dfb8ae16c302')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'3593b7393a3b8949b25f2ba5ad55a374',X'56fa5172072fc64d963787a19dcf2ea1',X'18486825e3f1634c8fca1542af3da5c4')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'929cf232c01f93428a748ebea988174b',X'18170f1eec53d0419b06e9805a33c69e',X'6570c5f0bd49b948878ac638772d0223')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'9d53adf772c18b46b119900f4ead325d',X'aad69d795561b24fbc9d50e300f07672',X'ba53499045b5fc4c9462f0f75de39b1d')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'5002082f9a0b0b43bf33f4895d6e7756',X'2927b98699db6645951e087c77f4d659',X'f11be11424abb84bb72257143a413c83')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'917ca7cf330a1749a30e916a2bdda89f',X'eb1242e25e9cf44e914e55abef40f781',X'2668dce266931a449e69ac150d1a62d5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'd49452b5a8b4724da0784cc0d843320f',X'56fa5172072fc64d963787a19dcf2ea1',X'f11be11424abb84bb72257143a413c83')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'17b20b0a0cfb1e4a8288fa5d43109dc4',X'985e4bea0ef6a5439ccbd352d87eb030',X'60ddbd848deacb40ad90726a9e76e53b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'1d89bb98d2e7d54689c0946e10c80147',X'159890d6237b114e8b07421e3f7783a2',X'e85dc48bbd4ef5489c65a8a250a3676c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'346292bbbbd7424b8bccd7895accac7e',X'2018576194a1c84eb7ad8c3eba0443ad',X'e85dc48bbd4ef5489c65a8a250a3676c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'a6fd397d1b2efb41aac4c2314413dab9',X'6c2ec0f699104a47b35bd08bec183295',X'f11be11424abb84bb72257143a413c83')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'adc20b958a30f7408212c763c5e4880a',X'b7d3ba562f2e0342a758af1359f454a6',X'14162492d1088841abf789d3cbd3fa91')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'c0d05f278e376c468f5596c5785c07dc',X'7e296eec3debb04eac6b6ed94d067c61',X'60ddbd848deacb40ad90726a9e76e53b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'189bd27ffd47254e9a9196de0d216831',X'aba4225d90089e47bb4b6332d0d827ce',X'28e3716ce4d0664e9046061ce908bade')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'cf4c0a3aa602a34ea38c9c63150263eb',X'aad69d795561b24fbc9d50e300f07672',X'50d477ed1fc83b4da67db81b15b8a4e5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'23f69aa7ff6ea04ca81698b98d53b397',X'6c2ec0f699104a47b35bd08bec183295',X'14162492d1088841abf789d3cbd3fa91')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'e2546b583aa29d45af656e531859c5cd',X'b7d3ba562f2e0342a758af1359f454a6',X'60ddbd848deacb40ad90726a9e76e53b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'99c625a23245b94cb93e9e9a1f5fb71e',X'7e296eec3debb04eac6b6ed94d067c61',X'e284a2bb289f524b97e8f20fd1ccab7a')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'457ee2bdf9a68a43952c6f67a3fca320',X'2927b98699db6645951e087c77f4d659',X'14162492d1088841abf789d3cbd3fa91')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'f727aa890f435c44bfebad91feee0fef',X'a5f8739f3d430141ae1cdd376486774b',X'60ddbd848deacb40ad90726a9e76e53b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'f80e9e4de0508b43ada9778c41f9dd9b',X'6c2ec0f699104a47b35bd08bec183295',X'cb5573aa5fde43419e01dfb8ae16c302')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'626ad6ce3f7fd84f82c1a2e86e5af66d',X'eb1242e25e9cf44e914e55abef40f781',X'83d4cae4d79c5944947a7cf6bc71b427')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'302647ae11b04945b540a392b9d02504',X'159890d6237b114e8b07421e3f7783a2',X'ba53499045b5fc4c9462f0f75de39b1d')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'8f7fc0b21d7f244c8bb084489504a706',X'56fa5172072fc64d963787a19dcf2ea1',X'14162492d1088841abf789d3cbd3fa91')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'7d9cca2a5634904993b5a3c31de5f3c3',X'18170f1eec53d0419b06e9805a33c69e',X'18486825e3f1634c8fca1542af3da5c4')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'ebae7ad44df9b4449330bbb745ee99a4',X'81881c3cf64be34a9b5d02a773c35c5c',X'f11be11424abb84bb72257143a413c83')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'8d6434b466308744ba51e63432d1e6af',X'29aaac621c76d445ae9ee5cf1adbef70',X'60ddbd848deacb40ad90726a9e76e53b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'5b0db6c01677e645b9f3a5122d2d5dfc',X'aba4225d90089e47bb4b6332d0d827ce',X'f11be11424abb84bb72257143a413c83')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'a0d345ff980adf48a63c321ac3955453',X'2018576194a1c84eb7ad8c3eba0443ad',X'50d477ed1fc83b4da67db81b15b8a4e5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'59787eccfce18f4cac16a6ad3a0f858a',X'159890d6237b114e8b07421e3f7783a2',X'cb5573aa5fde43419e01dfb8ae16c302')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'd3d29ce22a3f724788e9c0f46a766bea',X'6c2ec0f699104a47b35bd08bec183295',X'60ddbd848deacb40ad90726a9e76e53b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'957006e34097c645b3afbae82d80abc5',X'b7d3ba562f2e0342a758af1359f454a6',X'28e3716ce4d0664e9046061ce908bade')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'6b0bde04e7db2b4aa846a7b2132a54a4',X'aba4225d90089e47bb4b6332d0d827ce',X'0b6246ba2ec49f458b3d05fa013b1e31')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'cd6e280685d60f41ad1ba9325af57c25',X'18170f1eec53d0419b06e9805a33c69e',X'50d477ed1fc83b4da67db81b15b8a4e5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'e1582280fc6ffe4c97d7a9a1003bcc98',X'7e296eec3debb04eac6b6ed94d067c61',X'0b6246ba2ec49f458b3d05fa013b1e31')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'dd70a65f5660424baea5a9d8b504d87b',X'159890d6237b114e8b07421e3f7783a2',X'14162492d1088841abf789d3cbd3fa91')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'bc8759a6d16b3548a136a9f9236baa72',X'18170f1eec53d0419b06e9805a33c69e',X'0b6246ba2ec49f458b3d05fa013b1e31')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'a7b5e0d03eb85b43bff8aa5481680577',X'aba4225d90089e47bb4b6332d0d827ce',X'ba53499045b5fc4c9462f0f75de39b1d')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'38b1c07a0feb284198070c18c1af959d',X'9659dbc46af1d24d9b547d284cc719fc',X'60ddbd848deacb40ad90726a9e76e53b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'402d36a91dcb7247afd3ffe7180542c9',X'3c35563703c94946ba38a9ab6956a850',X'50d477ed1fc83b4da67db81b15b8a4e5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'25e864d17c28634380853eeb79261049',X'a5f8739f3d430141ae1cdd376486774b',X'53343dd283e2d349b54ee44ef9a7b70b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'91fc77c5d3ed1e40909a67a471e86eeb',X'3c35563703c94946ba38a9ab6956a850',X'6570c5f0bd49b948878ac638772d0223')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'a0a0be1c3d1a134bae49b883d1a70874',X'3c35563703c94946ba38a9ab6956a850',X'0b6246ba2ec49f458b3d05fa013b1e31')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'3be3b8e85a5b1f428155c4015672b1e5',X'81881c3cf64be34a9b5d02a773c35c5c',X'14162492d1088841abf789d3cbd3fa91')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'bb482b73cf1dc94e9c48affb707053c4',X'aad69d795561b24fbc9d50e300f07672',X'e284a2bb289f524b97e8f20fd1ccab7a')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'5e09740e79a76b4cac7ffd4222baaff1',X'56fa5172072fc64d963787a19dcf2ea1',X'cb5573aa5fde43419e01dfb8ae16c302')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'b28b4eb7f92cbd4e9c3ab26cfb4133c8',X'43b512a49432fc4c926dd3c252072849',X'60ddbd848deacb40ad90726a9e76e53b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'b4906f6de2ff5646bec2f327f849fb68',X'56fa5172072fc64d963787a19dcf2ea1',X'60ddbd848deacb40ad90726a9e76e53b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'c9c9b60a816c9b4abe34b549ab6d120f',X'7e296eec3debb04eac6b6ed94d067c61',X'50d477ed1fc83b4da67db81b15b8a4e5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'b5fc17554905414f879360dfcb0c062c',X'985e4bea0ef6a5439ccbd352d87eb030',X'53343dd283e2d349b54ee44ef9a7b70b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'908494a309c95d4fa42db6f66873e063',X'18170f1eec53d0419b06e9805a33c69e',X'c982a7a3b15b6e41864a266a05edb78c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'4d1e7cd6333224409fa20447faad2f54',X'29aaac621c76d445ae9ee5cf1adbef70',X'53343dd283e2d349b54ee44ef9a7b70b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'd6e8d11ff224214194dac6872368b63e',X'2927b98699db6645951e087c77f4d659',X'cb5573aa5fde43419e01dfb8ae16c302')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'e2cff8de7b27014093d6c5e9e67f9e6f',X'2018576194a1c84eb7ad8c3eba0443ad',X'6570c5f0bd49b948878ac638772d0223')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'fc781721f0a4f741aef0f5cfa40c1122',X'9659dbc46af1d24d9b547d284cc719fc',X'53343dd283e2d349b54ee44ef9a7b70b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'8e8eafcac172274c86446956adcdb566',X'56fa5172072fc64d963787a19dcf2ea1',X'53343dd283e2d349b54ee44ef9a7b70b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'77a02878a3d6304c8060ff8426ccd6b1',X'985e4bea0ef6a5439ccbd352d87eb030',X'2a14d867c958c140b698f02f8fefce26')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'ec214a26830e9446bfadd96cdfa96ed5',X'2018576194a1c84eb7ad8c3eba0443ad',X'0b6246ba2ec49f458b3d05fa013b1e31')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'c197d4f5d79046428dc3e2031bd3c0dd',X'29aaac621c76d445ae9ee5cf1adbef70',X'2a14d867c958c140b698f02f8fefce26')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'd5b1b0d4c986c64c9314033c4490b6a9',X'29aaac621c76d445ae9ee5cf1adbef70',X'2668dce266931a449e69ac150d1a62d5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'26756ccc64d3954b830fbd762bf6c117',X'159890d6237b114e8b07421e3f7783a2',X'0b6246ba2ec49f458b3d05fa013b1e31')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'f7b87f474da52d4f8191bed0ca073a80',X'aba4225d90089e47bb4b6332d0d827ce',X'e284a2bb289f524b97e8f20fd1ccab7a')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'61bf4c250c8edf47a7fa113e73be9966',X'2018576194a1c84eb7ad8c3eba0443ad',X'18486825e3f1634c8fca1542af3da5c4')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'6a83db5aefd9ce489536e2f12e8fb109',X'a5f8739f3d430141ae1cdd376486774b',X'2a14d867c958c140b698f02f8fefce26')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'84e2d005f237604d96c7c1fdb16c982d',X'159890d6237b114e8b07421e3f7783a2',X'2a14d867c958c140b698f02f8fefce26')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'b9a7bd0b295c8a4c97d4c3b2033a3ec6',X'18170f1eec53d0419b06e9805a33c69e',X'83d4cae4d79c5944947a7cf6bc71b427')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'd2a95f439bf6b2459a5ba2d3fedf0d40',X'56fa5172072fc64d963787a19dcf2ea1',X'2a14d867c958c140b698f02f8fefce26')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'e2195dab495e44488d68645a14b2bb97',X'3c35563703c94946ba38a9ab6956a850',X'18486825e3f1634c8fca1542af3da5c4')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'cdb1a0c0ece82c4c9854c777e3a8035d',X'aba4225d90089e47bb4b6332d0d827ce',X'c982a7a3b15b6e41864a266a05edb78c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'b8a93dc8cfabdb4181a89513548f0fce',X'29aaac621c76d445ae9ee5cf1adbef70',X'83d4cae4d79c5944947a7cf6bc71b427')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'd2d6df29de6e56468673c9f2e950d6a4',X'aad69d795561b24fbc9d50e300f07672',X'f11be11424abb84bb72257143a413c83')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'52820be6656d274ca26663065a7c452d',X'81881c3cf64be34a9b5d02a773c35c5c',X'cb5573aa5fde43419e01dfb8ae16c302')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'1a56169fc55f2d46a051ca9f8244093b',X'7e296eec3debb04eac6b6ed94d067c61',X'a153432ba081174da0074ccb6e439d48')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'5ee5105d0fe88f4780077ffec839519d',X'81881c3cf64be34a9b5d02a773c35c5c',X'60ddbd848deacb40ad90726a9e76e53b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'7362e4f635367c4980f3cb67f54adb45',X'aad69d795561b24fbc9d50e300f07672',X'53343dd283e2d349b54ee44ef9a7b70b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'cb9692e89d18ee42b3c6ced8b6c3e187',X'3c35563703c94946ba38a9ab6956a850',X'f11be11424abb84bb72257143a413c83')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'340e2a10de9224468b12cdaea6ea51ad',X'eb1242e25e9cf44e914e55abef40f781',X'18486825e3f1634c8fca1542af3da5c4')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'483c4a3acc2f5b4d83c6cdbac1f92dd1',X'7e296eec3debb04eac6b6ed94d067c61',X'6570c5f0bd49b948878ac638772d0223')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'af8af02156978f4fae3cc90d62bc4147',X'6c2ec0f699104a47b35bd08bec183295',X'53343dd283e2d349b54ee44ef9a7b70b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'aeddde6697d80a49a5aec0d1ca6abd39',X'2018576194a1c84eb7ad8c3eba0443ad',X'f11be11424abb84bb72257143a413c83')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'64f60ca2c9e9ef498db30bb5c3f24f5d',X'6c2ec0f699104a47b35bd08bec183295',X'2a14d867c958c140b698f02f8fefce26')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'e4ec2dcb2aacc44a976bcfdec19b66a3',X'18170f1eec53d0419b06e9805a33c69e',X'53343dd283e2d349b54ee44ef9a7b70b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'9bf9241075ba8d4ebfa7ddccc163b8bc',X'81881c3cf64be34a9b5d02a773c35c5c',X'53343dd283e2d349b54ee44ef9a7b70b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'8a2a078072533c4ea61540c49cd971b4',X'a5f8739f3d430141ae1cdd376486774b',X'2668dce266931a449e69ac150d1a62d5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'754f1494f796b646804aae40ea6fa419',X'29aaac621c76d445ae9ee5cf1adbef70',X'28e3716ce4d0664e9046061ce908bade')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'fd2f8dd6b0ccf64496e9d4c2578e4db6',X'159890d6237b114e8b07421e3f7783a2',X'c982a7a3b15b6e41864a266a05edb78c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'c19ddb26806a2947ba34d58f4005d75c',X'159890d6237b114e8b07421e3f7783a2',X'60ddbd848deacb40ad90726a9e76e53b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'3bb60ef5efa0914eb6a9303bca8339b2',X'9659dbc46af1d24d9b547d284cc719fc',X'2a14d867c958c140b698f02f8fefce26')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'7078e24e290c1d49a462d62170239f08',X'aad69d795561b24fbc9d50e300f07672',X'a1a3ff8fafe3ff47a54c5963a75646ef')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'cc529f8d6e82a541a853cf433d3317d8',X'3c35563703c94946ba38a9ab6956a850',X'14162492d1088841abf789d3cbd3fa91')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'9e57b9a5f157bf44bb01a01911155255',X'985e4bea0ef6a5439ccbd352d87eb030',X'2668dce266931a449e69ac150d1a62d5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'9f436017061d124ba94300b2ab363fde',X'985e4bea0ef6a5439ccbd352d87eb030',X'83d4cae4d79c5944947a7cf6bc71b427')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'1e4032171d567e44b8d7dd01a9b6c1fe',X'159890d6237b114e8b07421e3f7783a2',X'a1a3ff8fafe3ff47a54c5963a75646ef')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'29bc219144ef8c44b761e53d568f68e5',X'2927b98699db6645951e087c77f4d659',X'60ddbd848deacb40ad90726a9e76e53b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'461c7b916241e946abc6dd45cdbb813e',X'159890d6237b114e8b07421e3f7783a2',X'd03afef3543ccf4297eb0dbc8e2b5408')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'6055ea63396f3d408de8dda669ed9fd3',X'159890d6237b114e8b07421e3f7783a2',X'18486825e3f1634c8fca1542af3da5c4')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'e3d8f27911cd4f47b6f4bad7f1c50de8',X'56fa5172072fc64d963787a19dcf2ea1',X'2668dce266931a449e69ac150d1a62d5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'69c385b69b9c91459ac1ff3f16df57f5',X'81881c3cf64be34a9b5d02a773c35c5c',X'2a14d867c958c140b698f02f8fefce26')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'9aa99670fc12d340ad9b70da5b2b941f',X'6c2ec0f699104a47b35bd08bec183295',X'2668dce266931a449e69ac150d1a62d5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'191f88e3ecd61a479133dfa15e5a7908',X'aba4225d90089e47bb4b6332d0d827ce',X'18486825e3f1634c8fca1542af3da5c4')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'f8a7d343c7fb6e45ae34f0e0176167e7',X'a5f8739f3d430141ae1cdd376486774b',X'83d4cae4d79c5944947a7cf6bc71b427')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'1fc36706d716684cb2eae00614670a6d',X'aba4225d90089e47bb4b6332d0d827ce',X'2a14d867c958c140b698f02f8fefce26')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'9b30c375bf780d42bdcce0829a911d62',X'eb1242e25e9cf44e914e55abef40f781',X'60ddbd848deacb40ad90726a9e76e53b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'1ece94d7c8eeec4084473371ff896c08',X'a5f8739f3d430141ae1cdd376486774b',X'28e3716ce4d0664e9046061ce908bade')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'71a5cede5a0aad47b5c846af408e14ce',X'29aaac621c76d445ae9ee5cf1adbef70',X'2079c102f79f9a4a9a6c1c2005e6669c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'66a7625b885d0040900fe58cb5c5b568',X'7e296eec3debb04eac6b6ed94d067c61',X'd03afef3543ccf4297eb0dbc8e2b5408')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'32c4471ccb32cd4aaaf2cb16e4d09f46',X'2927b98699db6645951e087c77f4d659',X'53343dd283e2d349b54ee44ef9a7b70b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'78245830ce5ae449a19d1c0077201f57',X'2018576194a1c84eb7ad8c3eba0443ad',X'14162492d1088841abf789d3cbd3fa91')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'7c9d329ea7158e46b805e7179cdb615b',X'eb1242e25e9cf44e914e55abef40f781',X'f11be11424abb84bb72257143a413c83')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'2e8232264893714a85d3e75e1ec29a1a',X'159890d6237b114e8b07421e3f7783a2',X'a153432ba081174da0074ccb6e439d48')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'535ea243e3cdbd48b5c458124eee1937',X'3c35563703c94946ba38a9ab6956a850',X'cb5573aa5fde43419e01dfb8ae16c302')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'2f869e6ed619e14a8019592608a7d564',X'2927b98699db6645951e087c77f4d659',X'2a14d867c958c140b698f02f8fefce26')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'2b241781a6b2a442b1edc9e97984ab12',X'9659dbc46af1d24d9b547d284cc719fc',X'2668dce266931a449e69ac150d1a62d5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'87446f72260cbb4ab008c7eaf845bd77',X'9659dbc46af1d24d9b547d284cc719fc',X'83d4cae4d79c5944947a7cf6bc71b427')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'8d5ec30c7bdfa74bba9d9833f9a98621',X'81881c3cf64be34a9b5d02a773c35c5c',X'2668dce266931a449e69ac150d1a62d5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'd935d63c61e3cb4bb8adec3d3d8ed5e4',X'159890d6237b114e8b07421e3f7783a2',X'6570c5f0bd49b948878ac638772d0223')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'777811a8589f0043890e062ab89e67e2',X'2927b98699db6645951e087c77f4d659',X'2668dce266931a449e69ac150d1a62d5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'1b8c28effd02d34fa1e0a19014d6e288',X'2018576194a1c84eb7ad8c3eba0443ad',X'cb5573aa5fde43419e01dfb8ae16c302')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'13cd0c4af9d8bd42999c9ec3eae8d1ff',X'9659dbc46af1d24d9b547d284cc719fc',X'28e3716ce4d0664e9046061ce908bade')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'5215bfa02947e34eb128409d6233cd87',X'2927b98699db6645951e087c77f4d659',X'83d4cae4d79c5944947a7cf6bc71b427')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'cad745690ac5e14d84cd4fd4d92cf93b',X'56fa5172072fc64d963787a19dcf2ea1',X'83d4cae4d79c5944947a7cf6bc71b427')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'813a4865c8c3d6449081a924cadef28c',X'2018576194a1c84eb7ad8c3eba0443ad',X'60ddbd848deacb40ad90726a9e76e53b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'e2e3b3a4887a0941b822f00cb4a63c0f',X'aad69d795561b24fbc9d50e300f07672',X'60ddbd848deacb40ad90726a9e76e53b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'a03ed5124290b04e812bd67f63e6fe69',X'985e4bea0ef6a5439ccbd352d87eb030',X'28e3716ce4d0664e9046061ce908bade')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'43da5291b4e97e4abbe8a6554b0d363b',X'81881c3cf64be34a9b5d02a773c35c5c',X'83d4cae4d79c5944947a7cf6bc71b427')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'e5311a2d4923594488aaf289f4949f09',X'18170f1eec53d0419b06e9805a33c69e',X'2668dce266931a449e69ac150d1a62d5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'0cef302f2e34b7478a39f2fa39e80a47',X'7e296eec3debb04eac6b6ed94d067c61',X'14162492d1088841abf789d3cbd3fa91')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'3255e7c0cb16914cae76f40a9a3ab038',X'eb1242e25e9cf44e914e55abef40f781',X'e85dc48bbd4ef5489c65a8a250a3676c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'bcc1101b3c482b4492dff5550203348f',X'aad69d795561b24fbc9d50e300f07672',X'18486825e3f1634c8fca1542af3da5c4')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'9197c0047b3d4440a1bf421e157ea0cb',X'6c2ec0f699104a47b35bd08bec183295',X'83d4cae4d79c5944947a7cf6bc71b427')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'b371ca456316fa4db9d97f1f006143d5',X'9659dbc46af1d24d9b547d284cc719fc',X'2079c102f79f9a4a9a6c1c2005e6669c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'ce10d608d3bd4f4b8641f84c0f42e9a6',X'18170f1eec53d0419b06e9805a33c69e',X'a153432ba081174da0074ccb6e439d48')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'c6d95db0b6a01740a4b1ddcfce375079',X'56fa5172072fc64d963787a19dcf2ea1',X'28e3716ce4d0664e9046061ce908bade')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'fd9be63ee1e1ff46ad7ef997c7e5b926',X'aad69d795561b24fbc9d50e300f07672',X'2668dce266931a449e69ac150d1a62d5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'd825944eb19a3a4483d6fa8b76d75afd',X'7e296eec3debb04eac6b6ed94d067c61',X'2668dce266931a449e69ac150d1a62d5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'd0d2248fcec6f94fbdb64311bd7cef02',X'3c35563703c94946ba38a9ab6956a850',X'60ddbd848deacb40ad90726a9e76e53b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'dd24c42974c23d42b703fb322621d14c',X'aba4225d90089e47bb4b6332d0d827ce',X'd03afef3543ccf4297eb0dbc8e2b5408')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'25d838c95e3d6443923f78867dbc5f89',X'2927b98699db6645951e087c77f4d659',X'28e3716ce4d0664e9046061ce908bade')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'f4697cb59a023749a425f255c999fc66',X'56fa5172072fc64d963787a19dcf2ea1',X'2079c102f79f9a4a9a6c1c2005e6669c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'095834b67588f342bea6fc589dec17f3',X'7e296eec3debb04eac6b6ed94d067c61',X'28e3716ce4d0664e9046061ce908bade')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'e94c5677f7fbba47a1fbfd960c9836bc',X'18170f1eec53d0419b06e9805a33c69e',X'ba53499045b5fc4c9462f0f75de39b1d')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'd1674d433aa601478987e970f833d974',X'985e4bea0ef6a5439ccbd352d87eb030',X'31e850575317734d8247f6a9c93167eb')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'420571c26d74d34ca1b73f49180c62b4',X'2927b98699db6645951e087c77f4d659',X'31e850575317734d8247f6a9c93167eb')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'71b2cc17326572408790ca6534eeeaa2',X'6c2ec0f699104a47b35bd08bec183295',X'28e3716ce4d0664e9046061ce908bade')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'52551a2c9be96e43b972ab71d81c45bd',X'81881c3cf64be34a9b5d02a773c35c5c',X'28e3716ce4d0664e9046061ce908bade')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'7bec56ce103e284b92aeb546905637a1',X'6c2ec0f699104a47b35bd08bec183295',X'2079c102f79f9a4a9a6c1c2005e6669c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'afb003683dae3a4ebd62ffbf721e7201',X'c69f77ea1b1c6d46a35085d07ae75c3f',X'ba53499045b5fc4c9462f0f75de39b1d')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'984f6b41bb09e14d8863b13f9d34c93a',X'a5f8739f3d430141ae1cdd376486774b',X'31e850575317734d8247f6a9c93167eb')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'1331f266451d3040bd2ab197303d71be',X'81881c3cf64be34a9b5d02a773c35c5c',X'31e850575317734d8247f6a9c93167eb')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'f5376d37109ba64dafdd9d9616c43f4c',X'81881c3cf64be34a9b5d02a773c35c5c',X'c982a7a3b15b6e41864a266a05edb78c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'8b0b9ac04c4e274fad81fd85481ae07b',X'2927b98699db6645951e087c77f4d659',X'c982a7a3b15b6e41864a266a05edb78c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'a687ac1e9c3dc445a1edea837565b3ca',X'985e4bea0ef6a5439ccbd352d87eb030',X'c982a7a3b15b6e41864a266a05edb78c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'383f7ea5e0836644a69687873bfd7174',X'a5f8739f3d430141ae1cdd376486774b',X'c982a7a3b15b6e41864a266a05edb78c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'f8b21bc511c81244b03a84b22d1cb289',X'3c35563703c94946ba38a9ab6956a850',X'53343dd283e2d349b54ee44ef9a7b70b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'4dde00a0f16adc45b8fd37bfc929aba6',X'3c35563703c94946ba38a9ab6956a850',X'2a14d867c958c140b698f02f8fefce26')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'c7d986d9a08cb64593a2c2817e9c10fb',X'3c35563703c94946ba38a9ab6956a850',X'2668dce266931a449e69ac150d1a62d5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'6eaa4e72d4078a4991ed18e782920584',X'3c35563703c94946ba38a9ab6956a850',X'83d4cae4d79c5944947a7cf6bc71b427')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'29f4c59c9756f84bb24b82e9b5503f12',X'3c35563703c94946ba38a9ab6956a850',X'28e3716ce4d0664e9046061ce908bade')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'8e617e7dbc836b4a9737ece6e80b0c95',X'2018576194a1c84eb7ad8c3eba0443ad',X'2668dce266931a449e69ac150d1a62d5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'2d7d0b24f9588646a07e491548db5dfc',X'2018576194a1c84eb7ad8c3eba0443ad',X'83d4cae4d79c5944947a7cf6bc71b427')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'20d2574c8f57394fb02c765f8d6826d0',X'2018576194a1c84eb7ad8c3eba0443ad',X'28e3716ce4d0664e9046061ce908bade')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'27812382dc3c2246870d7a6d768ef8fe',X'2018576194a1c84eb7ad8c3eba0443ad',X'31e850575317734d8247f6a9c93167eb')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'1b24df5d642c1f4da6080ef5cfa0aa26',X'2018576194a1c84eb7ad8c3eba0443ad',X'c982a7a3b15b6e41864a266a05edb78c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'00f90688fb3eb548a4b578724eb07bf0',X'9659dbc46af1d24d9b547d284cc719fc',X'c982a7a3b15b6e41864a266a05edb78c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'16693f0d5307c64f80f31ccb518b5efa',X'6c2ec0f699104a47b35bd08bec183295',X'c982a7a3b15b6e41864a266a05edb78c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'a7c8a41369fce14596fb7756b249bc8f',X'29aaac621c76d445ae9ee5cf1adbef70',X'c982a7a3b15b6e41864a266a05edb78c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'2126fe183b53aa468d2fc4a4723891bd',X'56fa5172072fc64d963787a19dcf2ea1',X'c982a7a3b15b6e41864a266a05edb78c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'65f7f24a26b9cd4baa5aeeb3b7cf6424',X'631ac80d8f84bc42ba1d5c5d4c1671ed',X'ba53499045b5fc4c9462f0f75de39b1d')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'220d8de531ffc840be7f9c34771fbe42',X'631ac80d8f84bc42ba1d5c5d4c1671ed',X'd03afef3543ccf4297eb0dbc8e2b5408')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'561b9702c168fa4e90542521909d9ecd',X'631ac80d8f84bc42ba1d5c5d4c1671ed',X'a153432ba081174da0074ccb6e439d48')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'e9229324a5596d45aa72d51a651770e7',X'631ac80d8f84bc42ba1d5c5d4c1671ed',X'e284a2bb289f524b97e8f20fd1ccab7a')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'd0d024c473e47f4b96265d040adaf144',X'631ac80d8f84bc42ba1d5c5d4c1671ed',X'a1a3ff8fafe3ff47a54c5963a75646ef')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'2bc9b088c22d8e4f90ed06d1834e5dd3',X'631ac80d8f84bc42ba1d5c5d4c1671ed',X'e85dc48bbd4ef5489c65a8a250a3676c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'c781b0d765049040ab6e58287586e294',X'631ac80d8f84bc42ba1d5c5d4c1671ed',X'50d477ed1fc83b4da67db81b15b8a4e5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'62532da91898b8488cf0f63a9028b96d',X'631ac80d8f84bc42ba1d5c5d4c1671ed',X'6570c5f0bd49b948878ac638772d0223')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'2234d4f57070684ba93d4b17ca003922',X'631ac80d8f84bc42ba1d5c5d4c1671ed',X'0b6246ba2ec49f458b3d05fa013b1e31')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'81606bee9ea72a41a9b3f791b367275f',X'631ac80d8f84bc42ba1d5c5d4c1671ed',X'18486825e3f1634c8fca1542af3da5c4')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'902b5d76844f4343a7e9fc1aab832298',X'631ac80d8f84bc42ba1d5c5d4c1671ed',X'f11be11424abb84bb72257143a413c83')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'f53291d4a758d544816bdcfaa07d7a78',X'631ac80d8f84bc42ba1d5c5d4c1671ed',X'14162492d1088841abf789d3cbd3fa91')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'173d0f45f0c73646a99d2293b22b69bc',X'631ac80d8f84bc42ba1d5c5d4c1671ed',X'cb5573aa5fde43419e01dfb8ae16c302')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'92c9e81d2389514e8c7f4a1e979183bb',X'631ac80d8f84bc42ba1d5c5d4c1671ed',X'60ddbd848deacb40ad90726a9e76e53b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'877fe7f9ce49844493646447fe2bb72e',X'631ac80d8f84bc42ba1d5c5d4c1671ed',X'53343dd283e2d349b54ee44ef9a7b70b')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'bbdbde665dcfbd48afb090f509a8c48f',X'631ac80d8f84bc42ba1d5c5d4c1671ed',X'2a14d867c958c140b698f02f8fefce26')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'c57dfd14de08a9449bc22b3b91e7cc7e',X'631ac80d8f84bc42ba1d5c5d4c1671ed',X'2668dce266931a449e69ac150d1a62d5')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'5914e59140cecd49b5dc5f5e1d3dacc3',X'631ac80d8f84bc42ba1d5c5d4c1671ed',X'83d4cae4d79c5944947a7cf6bc71b427')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'776c9f600020f2438cfa8658924ecd12',X'631ac80d8f84bc42ba1d5c5d4c1671ed',X'28e3716ce4d0664e9046061ce908bade')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'f24f6b39c6b2114ca0d42c0350338d59',X'631ac80d8f84bc42ba1d5c5d4c1671ed',X'2079c102f79f9a4a9a6c1c2005e6669c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'84d19456f288444f894bca2d2f6bd4b2',X'631ac80d8f84bc42ba1d5c5d4c1671ed',X'c982a7a3b15b6e41864a266a05edb78c')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'cfe9687e65cb1b439fac2d2635f5d604',X'21e712eb060b6240adae26eaeafbf7a4',X'ba53499045b5fc4c9462f0f75de39b1d')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'3d5410813794bb4daad1b805f7263cf5',X'21e712eb060b6240adae26eaeafbf7a4',X'd03afef3543ccf4297eb0dbc8e2b5408')");
		lstSqls.add("Insert Into [BuildingTypeFacility] ([PKBuildingTypeFacility],[PKBuildingType],[PKFacility]) Values (X'428234133922b74d862af9cbd8ed2ade',X'21e712eb060b6240adae26eaeafbf7a4',X'a153432ba081174da0074ccb6e439d48')");
		return lstSqls;
	}
}
