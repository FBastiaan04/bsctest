package eu.hippix.bsctest.data.java;

import java.util.List;
import java.lang.Integer;
import java.lang.Double;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import eu.hippix.bsctest.SafeStringDeserializer;
import org.apache.fory.annotation.Nullable;

public class Wiki {
	@Nullable
	public Sitelinks sitelinks;
	@Nullable
	public Claims claims;
	@Nullable
	public String type;
	@Nullable
	public Labels labels;
	@Nullable
	public String id;
	@Nullable
	public Aliases aliases;
	@Nullable
	public Descriptions descriptions;
	@Nullable
	public String datatype;
	public static class ZhHant {
		@Nullable
		public String value;
		@Nullable
		public String language;
	}
	public static class Aliases {
		@Nullable
		public List<ZhHant> szl;
		@Nullable
		public List<ZhHant> qu;
		@Nullable
		public List<ZhHant> glk;
		@Nullable
		public List<ZhHant> fy;
		@Nullable
		public List<ZhHant> ckb;
		@SerializedName("zh-hant")
		@Nullable
		public List<ZhHant> zhHant;
		@Nullable
		public List<ZhHant> ksh;
		@Nullable
		public List<ZhHant> ts;
		@Nullable
		public List<ZhHant> be;
		@SerializedName("bbc-latn")
		@Nullable
		public List<ZhHant> bbcLatn;
		@Nullable
		public List<ZhHant> sg;
		@Nullable
		public List<ZhHant> lmo;
		@SerializedName("ku-latn")
		@Nullable
		public List<ZhHant> kuLatn;
		@Nullable
		public List<ZhHant> sah;
		@Nullable
		public List<ZhHant> sd;
		@Nullable
		public List<ZhHant> wo;
		@Nullable
		public List<ZhHant> pfl;
		@Nullable
		public List<ZhHant> hak;
		@Nullable
		public List<ZhHant> ay;
		@Nullable
		public List<ZhHant> so;
		@Nullable
		public List<ZhHant> nn;
		@Nullable
		public List<ZhHant> nrm;
		@Nullable
		public List<ZhHant> myv;
		@Nullable
		public List<ZhHant> ltg;
		@Nullable
		public List<ZhHant> sei;
		@Nullable
		public List<ZhHant> tt;
		@Nullable
		public List<ZhHant> ie;
		@SerializedName("sr-el")
		@Nullable
		public List<ZhHant> srEl;
		@Nullable
		public List<ZhHant> tl;
		@Nullable
		public List<ZhHant> yue;
		@Nullable
		public List<ZhHant> mg;
		@Nullable
		public List<ZhHant> lez;
		@Nullable
		public List<ZhHant> sm;
		@SerializedName("crh-latn")
		@Nullable
		public List<ZhHant> crhLatn;
		@Nullable
		public List<ZhHant> id;
		@Nullable
		public List<ZhHant> nov;
		@Nullable
		public List<ZhHant> hsb;
		@Nullable
		public List<ZhHant> ha;
		@Nullable
		public List<ZhHant> hr;
		@Nullable
		public List<ZhHant> ko;
		@Nullable
		public List<ZhHant> wa;
		@Nullable
		public List<ZhHant> ff;
		@Nullable
		public List<ZhHant> or;
		@Nullable
		public List<ZhHant> kg;
		@Nullable
		public List<ZhHant> gv;
		@Nullable
		public List<ZhHant> pap;
		@Nullable
		public List<ZhHant> vmf;
		@Nullable
		public List<ZhHant> frc;
		@Nullable
		public List<ZhHant> et;
		@Nullable
		public List<ZhHant> dv;
		@Nullable
		public List<ZhHant> kbd;
		@Nullable
		public List<ZhHant> sn;
		@Nullable
		public List<ZhHant> fa;
		@Nullable
		public List<ZhHant> yo;
		@Nullable
		public List<ZhHant> su;
		@Nullable
		public List<ZhHant> frr;
		@Nullable
		public List<ZhHant> am;
		@Nullable
		public List<ZhHant> sco;
		@Nullable
		public List<ZhHant> ig;
		@SerializedName("zh-my")
		@Nullable
		public List<ZhHant> zhMy;
		@SerializedName("be-tarask")
		@Nullable
		public List<ZhHant> beTarask;
		@Nullable
		public List<ZhHant> mrj;
		@Nullable
		public List<ZhHant> sk;
		@SerializedName("en-ca")
		@Nullable
		public List<ZhHant> enCa;
		@Nullable
		public List<ZhHant> cr;
		@SerializedName("kk-cyrl")
		@Nullable
		public List<ZhHant> kkCyrl;
		@Nullable
		public List<ZhHant> nds;
		@Nullable
		public List<ZhHant> el;
		@Nullable
		public List<ZhHant> arz;
		@SerializedName("cbk-zam")
		@Nullable
		public List<ZhHant> cbkZam;
		@SerializedName("zh-hk")
		@Nullable
		public List<ZhHant> zhHk;
		@SerializedName("de-formal")
		@Nullable
		public List<ZhHant> deFormal;
		@Nullable
		public List<ZhHant> kn;
		@Nullable
		public List<ZhHant> rw;
		@Nullable
		public List<ZhHant> ru;
		@Nullable
		public List<ZhHant> lzh;
		@Nullable
		public List<ZhHant> haw;
		@Nullable
		public List<ZhHant> rue;
		@Nullable
		public List<ZhHant> bar;
		@SerializedName("new")
		@Nullable
		public List<ZhHant> nuw;
		@Nullable
		public List<ZhHant> sma;
		@Nullable
		public List<ZhHant> rmy;
		@Nullable
		public List<ZhHant> th;
		@Nullable
		public List<ZhHant> tr;
		@Nullable
		public List<ZhHant> oc;
		@Nullable
		public List<ZhHant> cs;
		@Nullable
		public List<ZhHant> fj;
		@Nullable
		public List<ZhHant> srn;
		@Nullable
		public List<ZhHant> chy;
		@Nullable
		public List<ZhHant> dz;
		@Nullable
		public List<ZhHant> ilo;
		@Nullable
		public List<ZhHant> ug;
		@Nullable
		public List<ZhHant> gl;
		@Nullable
		public List<ZhHant> zu;
		@Nullable
		public List<ZhHant> my;
		@Nullable
		public List<ZhHant> vec;
		@Nullable
		public List<ZhHant> ve;
		@Nullable
		public List<ZhHant> hu;
		@Nullable
		public List<ZhHant> pt;
		@Nullable
		public List<ZhHant> als;
		@Nullable
		public List<ZhHant> hy;
		@Nullable
		public List<ZhHant> se;
		@Nullable
		public List<ZhHant> stq;
		@Nullable
		public List<ZhHant> mt;
		@Nullable
		public List<ZhHant> te;
		@Nullable
		public List<ZhHant> bug;
		@Nullable
		public List<ZhHant> bi;
		@Nullable
		public List<ZhHant> tg;
		@Nullable
		public List<ZhHant> yi;
		@Nullable
		public List<ZhHant> cy;
		@Nullable
		public List<ZhHant> war;
		@Nullable
		public List<ZhHant> sw;
		@Nullable
		public List<ZhHant> ms;
		@Nullable
		public List<ZhHant> mwl;
		@Nullable
		public List<ZhHant> vep;
		@Nullable
		public List<ZhHant> ace;
		@Nullable
		public List<ZhHant> tum;
		@Nullable
		public List<ZhHant> bxr;
		@Nullable
		public List<ZhHant> lb;
		@Nullable
		public List<ZhHant> ka;
		@Nullable
		public List<ZhHant> pag;
		@Nullable
		public List<ZhHant> wuu;
		@Nullable
		public List<ZhHant> lo;
		@Nullable
		public List<ZhHant> ur;
		@Nullable
		public List<ZhHant> ku;
		@Nullable
		public List<ZhHant> min;
		@Nullable
		public List<ZhHant> ar;
		@Nullable
		public List<ZhHant> jv;
		@Nullable
		public List<ZhHant> udm;
		@Nullable
		public List<ZhHant> nap;
		@Nullable
		public List<ZhHant> fur;
		@SerializedName("kk-latn")
		@Nullable
		public List<ZhHant> kkLatn;
		@Nullable
		public List<ZhHant> gu;
		@Nullable
		public List<ZhHant> mi;
		@Nullable
		public List<ZhHant> nl;
		@Nullable
		public List<ZhHant> vo;
		@Nullable
		public List<ZhHant> ne;
		@Nullable
		public List<ZhHant> bs;
		@Nullable
		public List<ZhHant> av;
		@Nullable
		public List<ZhHant> si;
		@Nullable
		public List<ZhHant> os;
		@Nullable
		public List<ZhHant> ml;
		@Nullable
		public List<ZhHant> mn;
		@Nullable
		public List<ZhHant> xmf;
		@Nullable
		public List<ZhHant> rn;
		@Nullable
		public List<ZhHant> ss;
		@Nullable
		public List<ZhHant> gd;
		@Nullable
		public List<ZhHant> vi;
		@SerializedName("pt-br")
		@Nullable
		public List<ZhHant> ptBr;
		@Nullable
		public List<ZhHant> eo;
		@Nullable
		public List<ZhHant> tk;
		@SerializedName("de-ch")
		@Nullable
		public List<ZhHant> deCh;
		@Nullable
		public List<ZhHant> pih;
		@Nullable
		public List<ZhHant> gn;
		@Nullable
		public List<ZhHant> cdo;
		@Nullable
		public List<ZhHant> kl;
		@Nullable
		public List<ZhHant> mr;
		@Nullable
		public List<ZhHant> mzn;
		@Nullable
		public List<ZhHant> rm;
		@Nullable
		public List<ZhHant> dsb;
		@Nullable
		public List<ZhHant> kw;
		@Nullable
		public List<ZhHant> es;
		@Nullable
		public List<ZhHant> ia;
		@Nullable
		public List<ZhHant> da;
		@Nullable
		public List<ZhHant> ps;
		@Nullable
		public List<ZhHant> tw;
		@Nullable
		public List<ZhHant> chr;
		@Nullable
		public List<ZhHant> ba;
		@SerializedName("kk-kz")
		@Nullable
		public List<ZhHant> kkKz;
		@Nullable
		public List<ZhHant> tet;
		@Nullable
		public List<ZhHant> an;
		@SerializedName("kk-tr")
		@Nullable
		public List<ZhHant> kkTr;
		@Nullable
		public List<ZhHant> ta;
		@Nullable
		public List<ZhHant> kaa;
		@Nullable
		public List<ZhHant> tokipona;
		@Nullable
		public List<ZhHant> uk;
		@Nullable
		public List<ZhHant> bcl;
		@Nullable
		public List<ZhHant> pl;
		@Nullable
		public List<ZhHant> ca;
		@Nullable
		public List<ZhHant> koi;
		@Nullable
		public List<ZhHant> nah;
		@Nullable
		public List<ZhHant> nan;
		@Nullable
		public List<ZhHant> gsw;
		@Nullable
		public List<ZhHant> ast;
		@Nullable
		public List<ZhHant> diq;
		@Nullable
		public List<ZhHant> hif;
		@Nullable
		public List<ZhHant> vls;
		@Nullable
		public List<ZhHant> tpi;
		@Nullable
		public List<ZhHant> tn;
		@SerializedName("de-at")
		@Nullable
		public List<ZhHant> deAt;
		@Nullable
		public List<ZhHant> br;
		@Nullable
		public List<ZhHant> bh;
		@SerializedName("zh-mo")
		@Nullable
		public List<ZhHant> zhMo;
		@Nullable
		public List<ZhHant> pdc;
		@SerializedName("zh-hans")
		@Nullable
		public List<ZhHant> zhHans;
		@Nullable
		public List<ZhHant> li;
		@Nullable
		public List<ZhHant> fr;
		@SerializedName("en-gb")
		@Nullable
		public List<ZhHant> enGb;
		@Nullable
		public List<ZhHant> jbo;
		@Nullable
		public List<ZhHant> zh;
		@Nullable
		public List<ZhHant> lad;
		@Nullable
		public List<ZhHant> sv;
		@Nullable
		public List<ZhHant> af;
		@SerializedName("zh-tw")
		@Nullable
		public List<ZhHant> zhTw;
		@Nullable
		public List<ZhHant> za;
		@Nullable
		public List<ZhHant> pa;
		@Nullable
		public List<ZhHant> sh;
		@Nullable
		public List<ZhHant> bg;
		@Nullable
		public List<ZhHant> hi;
		@Nullable
		public List<ZhHant> ky;
		@Nullable
		public List<ZhHant> st;
		@SerializedName("zh-cn")
		@Nullable
		public List<ZhHant> zhCn;
		@Nullable
		public List<ZhHant> got;
		@Nullable
		public List<ZhHant> gan;
		@Nullable
		public List<ZhHant> de;
		@Nullable
		public List<ZhHant> az;
		@Nullable
		public List<ZhHant> ja;
		@Nullable
		public List<ZhHant> is;
		@Nullable
		public List<ZhHant> ang;
		@Nullable
		public List<ZhHant> lt;
		@Nullable
		public List<ZhHant> rup;
		@Nullable
		public List<ZhHant> kk;
		@Nullable
		public List<ZhHant> uz;
		@Nullable
		public List<ZhHant> pnb;
		@Nullable
		public List<ZhHant> sr;
		@Nullable
		public List<ZhHant> la;
		@Nullable
		public List<ZhHant> as;
		@Nullable
		public List<ZhHant> no;
		@Nullable
		public List<ZhHant> ce;
		@Nullable
		public List<ZhHant> kv;
		@Nullable
		public List<ZhHant> pnt;
		@Nullable
		public List<ZhHant> eu;
		@Nullable
		public List<ZhHant> he;
		@Nullable
		public List<ZhHant> csb;
		@Nullable
		public List<ZhHant> frp;
		@Nullable
		public List<ZhHant> sc;
		@Nullable
		public List<ZhHant> mhr;
		@Nullable
		public List<ZhHant> ga;
		@Nullable
		public List<ZhHant> to;
		@Nullable
		public List<ZhHant> km;
		@SerializedName("map-bms")
		@Nullable
		public List<ZhHant> mapBms;
		@Nullable
		public List<ZhHant> na;
		@Nullable
		public List<ZhHant> ceb;
		@Nullable
		public List<ZhHant> cv;
		@Nullable
		public List<ZhHant> ln;
		@Nullable
		public List<ZhHant> sl;
		@Nullable
		public List<ZhHant> ik;
		@Nullable
		public List<ZhHant> arc;
		@SerializedName("roa-tara")
		@Nullable
		public List<ZhHant> roaTara;
		@Nullable
		public List<ZhHant> lij;
		@Nullable
		public List<ZhHant> krc;
		@Nullable
		public List<ZhHant> ks;
		@Nullable
		public List<ZhHant> cu;
		@Nullable
		public List<ZhHant> ti;
		@Nullable
		public List<ZhHant> io;
		@Nullable
		public List<ZhHant> xh;
		@Nullable
		public List<ZhHant> kab;
		@Nullable
		public List<ZhHant> nb;
		@Nullable
		public List<ZhHant> sgs;
		@Nullable
		public List<ZhHant> nso;
		@Nullable
		public List<ZhHant> ee;
		@Nullable
		public List<ZhHant> lv;
		@Nullable
		public List<ZhHant> grc;
		@Nullable
		public List<ZhHant> ht;
		@Nullable
		public List<ZhHant> pi;
		@Nullable
		public List<ZhHant> nv;
		@Nullable
		public List<ZhHant> bn;
		@Nullable
		public List<ZhHant> fo;
		@Nullable
		public List<ZhHant> eml;
		@Nullable
		public List<ZhHant> shi;
		@Nullable
		public List<ZhHant> bm;
		@Nullable
		public List<ZhHant> zea;
		@Nullable
		public List<ZhHant> ro;
		@Nullable
		public List<ZhHant> lg;
		@Nullable
		public List<ZhHant> it;
		@Nullable
		public List<ZhHant> pcd;
		@Nullable
		public List<ZhHant> sq;
		@Nullable
		public List<ZhHant> bpy;
		@Nullable
		public List<ZhHant> lbe;
		@Nullable
		public List<ZhHant> fi;
		@Nullable
		public List<ZhHant> mk;
		@Nullable
		public List<ZhHant> mdf;
		@Nullable
		public List<ZhHant> ny;
		@Nullable
		public List<ZhHant> arq;
		@Nullable
		public List<ZhHant> bo;
		@Nullable
		public List<ZhHant> co;
		@Nullable
		public List<ZhHant> iu;
		@SerializedName("sr-ec")
		@Nullable
		public List<ZhHant> srEc;
		@Nullable
		public List<ZhHant> pms;
		@Nullable
		public List<ZhHant> scn;
		@Nullable
		public List<ZhHant> bjn;
		@Nullable
		public List<ZhHant> ab;
		@Nullable
		public List<ZhHant> om;
		@Nullable
		public List<ZhHant> pam;
		@Nullable
		public List<ZhHant> ext;
		@SerializedName("zh-sg")
		@Nullable
		public List<ZhHant> zhSg;
		@Nullable
		public List<ZhHant> lfn;
		@SerializedName("nds-nl")
		@Nullable
		public List<ZhHant> ndsNl;
		@Nullable
		public List<ZhHant> sa;
		@Nullable
		public List<ZhHant> ty;
		@Nullable
		public List<ZhHant> xal;
		@Nullable
		public List<ZhHant> en;
		@Nullable
		public List<ZhHant> vro;
	}
	public static class Descriptions {
		@Nullable
		public ZhHant szl;
		@Nullable
		public ZhHant qu;
		@Nullable
		public ZhHant glk;
		@Nullable
		public ZhHant fy;
		@Nullable
		public ZhHant ckb;
		@SerializedName("zh-hant")
		@Nullable
		public ZhHant zhHant;
		@Nullable
		public ZhHant ksh;
		@Nullable
		public ZhHant ts;
		@Nullable
		public ZhHant be;
		@Nullable
		public ZhHant sg;
		@Nullable
		public ZhHant lmo;
		@SerializedName("ku-latn")
		@Nullable
		public ZhHant kuLatn;
		@Nullable
		public ZhHant sah;
		@Nullable
		public ZhHant sd;
		@Nullable
		public ZhHant wo;
		@Nullable
		public ZhHant hak;
		@Nullable
		public ZhHant ay;
		@Nullable
		public ZhHant so;
		@Nullable
		public ZhHant nn;
		@Nullable
		public ZhHant nrm;
		@Nullable
		public ZhHant myv;
		@Nullable
		public ZhHant ltg;
		@Nullable
		public ZhHant sei;
		@Nullable
		public ZhHant tt;
		@Nullable
		public ZhHant ie;
		@SerializedName("sr-el")
		@Nullable
		public ZhHant srEl;
		@Nullable
		public ZhHant tl;
		@Nullable
		public ZhHant yue;
		@Nullable
		public ZhHant mg;
		@Nullable
		public ZhHant lez;
		@SerializedName("crh-latn")
		@Nullable
		public ZhHant crhLatn;
		@Nullable
		public ZhHant id;
		@Nullable
		public ZhHant nov;
		@Nullable
		public ZhHant hsb;
		@Nullable
		public ZhHant ha;
		@Nullable
		public ZhHant hr;
		@SerializedName("tt-latn")
		@Nullable
		public ZhHant ttLatn;
		@Nullable
		public ZhHant ko;
		@Nullable
		public ZhHant wa;
		@Nullable
		public ZhHant ff;
		@Nullable
		public ZhHant or;
		@Nullable
		public ZhHant tcy;
		@Nullable
		public ZhHant kg;
		@Nullable
		public ZhHant gv;
		@Nullable
		public ZhHant pap;
		@Nullable
		public ZhHant vmf;
		@Nullable
		public ZhHant frc;
		@Nullable
		public ZhHant ch;
		@Nullable
		public ZhHant et;
		@Nullable
		public ZhHant dv;
		@Nullable
		public ZhHant kbd;
		@Nullable
		public ZhHant fa;
		@Nullable
		public ZhHant yo;
		@Nullable
		public ZhHant su;
		@Nullable
		public ZhHant frr;
		@Nullable
		public ZhHant am;
		@Nullable
		public ZhHant sco;
		@Nullable
		public ZhHant ig;
		@SerializedName("zh-my")
		@Nullable
		public ZhHant zhMy;
		@SerializedName("be-tarask")
		@Nullable
		public ZhHant beTarask;
		@Nullable
		public ZhHant sk;
		@SerializedName("en-ca")
		@Nullable
		public ZhHant enCa;
		@Nullable
		public ZhHant cr;
		@SerializedName("kk-cyrl")
		@Nullable
		public ZhHant kkCyrl;
		@Nullable
		public ZhHant nds;
		@Nullable
		public ZhHant el;
		@Nullable
		public ZhHant arz;
		@SerializedName("cbk-zam")
		@Nullable
		public ZhHant cbkZam;
		@SerializedName("zh-hk")
		@Nullable
		public ZhHant zhHk;
		@Nullable
		public ZhHant mo;
		@SerializedName("de-formal")
		@Nullable
		public ZhHant deFormal;
		@Nullable
		public ZhHant kn;
		@Nullable
		public ZhHant ru;
		@Nullable
		public ZhHant lzh;
		@Nullable
		public ZhHant rue;
		@Nullable
		public ZhHant haw;
		@Nullable
		public ZhHant bar;
		@SerializedName("new")
		@Nullable
		public ZhHant nuw;
		@Nullable
		public ZhHant rmy;
		@Nullable
		public ZhHant th;
		@Nullable
		public ZhHant tr;
		@Nullable
		public ZhHant oc;
		@Nullable
		public ZhHant tyv;
		@Nullable
		public ZhHant cs;
		@Nullable
		public ZhHant srn;
		@Nullable
		public ZhHant fj;
		@Nullable
		public ZhHant chy;
		@Nullable
		public ZhHant ilo;
		@Nullable
		public ZhHant ug;
		@Nullable
		public ZhHant gl;
		@Nullable
		public ZhHant zu;
		@Nullable
		public ZhHant my;
		@Nullable
		public ZhHant vec;
		@Nullable
		public ZhHant aln;
		@Nullable
		public ZhHant pt;
		@Nullable
		public ZhHant hu;
		@Nullable
		public ZhHant hy;
		@Nullable
		public ZhHant se;
		@Nullable
		public ZhHant stq;
		@Nullable
		public ZhHant mt;
		@Nullable
		public ZhHant te;
		@Nullable
		public ZhHant bug;
		@Nullable
		public ZhHant bi;
		@Nullable
		public ZhHant tg;
		@Nullable
		public ZhHant yi;
		@Nullable
		public ZhHant cy;
		@Nullable
		public ZhHant war;
		@Nullable
		public ZhHant sw;
		@Nullable
		public ZhHant ms;
		@Nullable
		public ZhHant ace;
		@Nullable
		public ZhHant vep;
		@Nullable
		public ZhHant mwl;
		@Nullable
		public ZhHant bxr;
		@Nullable
		public ZhHant lb;
		@Nullable
		public ZhHant ka;
		@Nullable
		public ZhHant pag;
		@Nullable
		public ZhHant lo;
		@Nullable
		public ZhHant wuu;
		@Nullable
		public ZhHant ur;
		@Nullable
		public ZhHant ku;
		@Nullable
		public ZhHant min;
		@Nullable
		public ZhHant ak;
		@Nullable
		public ZhHant ar;
		@Nullable
		public ZhHant jv;
		@Nullable
		public ZhHant fur;
		@Nullable
		public ZhHant nap;
		@Nullable
		public ZhHant aeb;
		@Nullable
		public ZhHant gu;
		@Nullable
		public ZhHant tru;
		@Nullable
		public ZhHant mi;
		@Nullable
		public ZhHant nl;
		@Nullable
		public ZhHant vo;
		@Nullable
		public ZhHant ne;
		@Nullable
		public ZhHant bs;
		@Nullable
		public ZhHant av;
		@Nullable
		public ZhHant si;
		@Nullable
		public ZhHant os;
		@Nullable
		public ZhHant ml;
		@Nullable
		public ZhHant mn;
		@Nullable
		public ZhHant xmf;
		@Nullable
		public ZhHant gag;
		@Nullable
		public ZhHant gd;
		@Nullable
		public ZhHant vi;
		@SerializedName("pt-br")
		@Nullable
		public ZhHant ptBr;
		@Nullable
		public ZhHant eo;
		@Nullable
		public ZhHant tk;
		@SerializedName("de-ch")
		@Nullable
		public ZhHant deCh;
		@Nullable
		public ZhHant cdo;
		@Nullable
		public ZhHant kl;
		@Nullable
		public ZhHant gn;
		@Nullable
		public ZhHant brh;
		@Nullable
		public ZhHant mr;
		@Nullable
		public ZhHant mzn;
		@Nullable
		public ZhHant rm;
		@Nullable
		public ZhHant dsb;
		@Nullable
		public ZhHant kw;
		@Nullable
		public ZhHant es;
		@Nullable
		public ZhHant ia;
		@Nullable
		public ZhHant da;
		@Nullable
		public ZhHant ps;
		@Nullable
		public ZhHant simple;
		@Nullable
		public ZhHant chr;
		@Nullable
		public ZhHant tw;
		@Nullable
		public ZhHant ba;
		@SerializedName("kk-cn")
		@Nullable
		public ZhHant kkCn;
		@SerializedName("kk-kz")
		@Nullable
		public ZhHant kkKz;
		@Nullable
		public ZhHant tet;
		@Nullable
		public ZhHant an;
		@Nullable
		public ZhHant ta;
		@Nullable
		public ZhHant kaa;
		@Nullable
		public ZhHant tokipona;
		@Nullable
		public ZhHant uk;
		@Nullable
		public ZhHant bcl;
		@Nullable
		public ZhHant pl;
		@Nullable
		public ZhHant ca;
		@Nullable
		public ZhHant koi;
		@Nullable
		public ZhHant nah;
		@Nullable
		public ZhHant nan;
		@Nullable
		public ZhHant gsw;
		@Nullable
		public ZhHant ast;
		@Nullable
		public ZhHant diq;
		@Nullable
		public ZhHant hif;
		@Nullable
		public ZhHant vls;
		@Nullable
		public ZhHant tn;
		@Nullable
		public ZhHant tpi;
		@SerializedName("de-at")
		@Nullable
		public ZhHant deAt;
		@Nullable
		public ZhHant br;
		@Nullable
		public ZhHant bh;
		@SerializedName("zh-mo")
		@Nullable
		public ZhHant zhMo;
		@Nullable
		public ZhHant dtp;
		@Nullable
		public ZhHant pdc;
		@SerializedName("zh-hans")
		@Nullable
		public ZhHant zhHans;
		@Nullable
		public ZhHant li;
		@Nullable
		public ZhHant fr;
		@SerializedName("en-gb")
		@Nullable
		public ZhHant enGb;
		@SerializedName("tg-cyrl")
		@Nullable
		public ZhHant tgCyrl;
		@Nullable
		public ZhHant jbo;
		@Nullable
		public ZhHant zh;
		@SerializedName("tg-latn")
		@Nullable
		public ZhHant tgLatn;
		@Nullable
		public ZhHant lad;
		@Nullable
		public ZhHant sv;
		@Nullable
		public ZhHant af;
		@SerializedName("zh-tw")
		@Nullable
		public ZhHant zhTw;
		@Nullable
		public ZhHant pa;
		@Nullable
		public ZhHant za;
		@Nullable
		public ZhHant sh;
		@Nullable
		public ZhHant bg;
		@SerializedName("tt-cyrl")
		@Nullable
		public ZhHant ttCyrl;
		@Nullable
		public ZhHant hi;
		@Nullable
		public ZhHant ky;
		@SerializedName("zh-cn")
		@Nullable
		public ZhHant zhCn;
		@Nullable
		public ZhHant got;
		@Nullable
		public ZhHant gan;
		@Nullable
		public ZhHant de;
		@Nullable
		public ZhHant az;
		@Nullable
		public ZhHant ja;
		@Nullable
		public ZhHant is;
		@Nullable
		public ZhHant ang;
		@Nullable
		public ZhHant lt;
		@Nullable
		public ZhHant rup;
		@Nullable
		public ZhHant kk;
		@Nullable
		public ZhHant uz;
		@Nullable
		public ZhHant pnb;
		@Nullable
		public ZhHant sr;
		@Nullable
		public ZhHant la;
		@Nullable
		public ZhHant as;
		@Nullable
		public ZhHant no;
		@Nullable
		public ZhHant ce;
		@Nullable
		public ZhHant kv;
		@Nullable
		public ZhHant pnt;
		@Nullable
		public ZhHant bcc;
		@Nullable
		public ZhHant eu;
		@Nullable
		public ZhHant he;
		@Nullable
		public ZhHant csb;
		@Nullable
		public ZhHant frp;
		@Nullable
		public ZhHant sc;
		@Nullable
		public ZhHant ga;
		@Nullable
		public ZhHant mhr;
		@Nullable
		public ZhHant ki;
		@Nullable
		public ZhHant km;
		@SerializedName("map-bms")
		@Nullable
		public ZhHant mapBms;
		@Nullable
		public ZhHant ceb;
		@Nullable
		public ZhHant cv;
		@Nullable
		public ZhHant ln;
		@Nullable
		public ZhHant sl;
		@Nullable
		public ZhHant arc;
		@SerializedName("roa-tara")
		@Nullable
		public ZhHant roaTara;
		@Nullable
		public ZhHant lij;
		@Nullable
		public ZhHant ks;
		@Nullable
		public ZhHant cu;
		@Nullable
		public ZhHant ti;
		@Nullable
		public ZhHant io;
		@Nullable
		public ZhHant xh;
		@Nullable
		public ZhHant kab;
		@Nullable
		public ZhHant nb;
		@Nullable
		public ZhHant sgs;
		@Nullable
		public ZhHant nso;
		@Nullable
		public ZhHant ee;
		@Nullable
		public ZhHant lv;
		@Nullable
		public ZhHant grc;
		@Nullable
		public ZhHant ht;
		@SerializedName("nl-informal")
		@Nullable
		public ZhHant nlInformal;
		@Nullable
		public ZhHant pi;
		@Nullable
		public ZhHant bn;
		@Nullable
		public ZhHant eml;
		@Nullable
		public ZhHant fo;
		@Nullable
		public ZhHant bm;
		@Nullable
		public ZhHant zea;
		@Nullable
		public ZhHant ro;
		@Nullable
		public ZhHant lg;
		@Nullable
		public ZhHant it;
		@Nullable
		public ZhHant pcd;
		@Nullable
		public ZhHant sq;
		@Nullable
		public ZhHant bpy;
		@Nullable
		public ZhHant fi;
		@Nullable
		public ZhHant mk;
		@Nullable
		public ZhHant mdf;
		@Nullable
		public ZhHant rif;
		@Nullable
		public ZhHant bo;
		@Nullable
		public ZhHant co;
		@SerializedName("sr-ec")
		@Nullable
		public ZhHant srEc;
		@Nullable
		public ZhHant pms;
		@Nullable
		public ZhHant scn;
		@Nullable
		public ZhHant bjn;
		@Nullable
		public ZhHant ab;
		@Nullable
		public ZhHant fit;
		@Nullable
		public ZhHant om;
		@Nullable
		public ZhHant pam;
		@Nullable
		public ZhHant ext;
		@SerializedName("zh-sg")
		@Nullable
		public ZhHant zhSg;
		@SerializedName("nds-nl")
		@Nullable
		public ZhHant ndsNl;
		@Nullable
		public ZhHant sa;
		@Nullable
		public ZhHant ty;
		@Nullable
		public ZhHant xal;
		@SerializedName("be-x-old")
		@Nullable
		public ZhHant beXOld;
		@Nullable
		public ZhHant en;
		@Nullable
		public ZhHant vro;
	}
	public static class Labels {
		@Nullable
		public ZhHant szl;
		@Nullable
		public ZhHant qu;
		@Nullable
		public ZhHant glk;
		@Nullable
		public ZhHant fy;
		@SerializedName("zh-hant")
		@Nullable
		public ZhHant zhHant;
		@Nullable
		public ZhHant ckb;
		@Nullable
		public ZhHant ksh;
		@Nullable
		public ZhHant ts;
		@Nullable
		public ZhHant be;
		@SerializedName("ug-arab")
		@Nullable
		public ZhHant ugArab;
		@Nullable
		public ZhHant lzz;
		@SerializedName("bbc-latn")
		@Nullable
		public ZhHant bbcLatn;
		@Nullable
		public ZhHant sg;
		@Nullable
		public ZhHant lmo;
		@SerializedName("ku-latn")
		@Nullable
		public ZhHant kuLatn;
		@Nullable
		public ZhHant avk;
		@Nullable
		public ZhHant sah;
		@Nullable
		public ZhHant sd;
		@Nullable
		public ZhHant wo;
		@Nullable
		public ZhHant hak;
		@Nullable
		public ZhHant pfl;
		@SerializedName("ku-arab")
		@Nullable
		public ZhHant kuArab;
		@SerializedName("ike-latn")
		@Nullable
		public ZhHant ikeLatn;
		@Nullable
		public ZhHant ay;
		@Nullable
		public ZhHant so;
		@Nullable
		public ZhHant nn;
		@Nullable
		public ZhHant nrm;
		@Nullable
		public ZhHant ltg;
		@Nullable
		public ZhHant myv;
		@Nullable
		public ZhHant sei;
		@Nullable
		public ZhHant tt;
		@Nullable
		public ZhHant vot;
		@Nullable
		public ZhHant ie;
		@SerializedName("sr-el")
		@Nullable
		public ZhHant srEl;
		@Nullable
		public ZhHant mg;
		@Nullable
		public ZhHant tl;
		@Nullable
		public ZhHant yue;
		@Nullable
		public ZhHant hil;
		@Nullable
		public ZhHant lez;
		@Nullable
		public ZhHant ary;
		@Nullable
		public ZhHant sm;
		@SerializedName("crh-latn")
		@Nullable
		public ZhHant crhLatn;
		@Nullable
		public ZhHant nov;
		@Nullable
		public ZhHant id;
		@Nullable
		public ZhHant hsb;
		@Nullable
		public ZhHant ha;
		@Nullable
		public ZhHant hr;
		@SerializedName("tt-latn")
		@Nullable
		public ZhHant ttLatn;
		@Nullable
		public ZhHant sdc;
		@Nullable
		public ZhHant ruq;
		@Nullable
		public ZhHant ko;
		@Nullable
		public ZhHant wa;
		@Nullable
		public ZhHant ff;
		@Nullable
		public ZhHant or;
		@Nullable
		public ZhHant tcy;
		@Nullable
		public ZhHant kg;
		@SerializedName("ug-latn")
		@Nullable
		public ZhHant ugLatn;
		@Nullable
		public ZhHant gv;
		@Nullable
		public ZhHant kri;
		@Nullable
		public ZhHant pap;
		@Nullable
		public ZhHant frc;
		@SerializedName("gan-hant")
		@Nullable
		public ZhHant ganHant;
		@Nullable
		public ZhHant vmf;
		@Nullable
		public ZhHant ch;
		@Nullable
		public ZhHant et;
		@Nullable
		public ZhHant dv;
		@Nullable
		public ZhHant kbd;
		@Nullable
		public ZhHant sn;
		@Nullable
		public ZhHant fa;
		@Nullable
		public ZhHant yo;
		@Nullable
		public ZhHant su;
		@Nullable
		public ZhHant frr;
		@Nullable
		public ZhHant am;
		@Nullable
		public ZhHant sco;
		@Nullable
		public ZhHant ig;
		@SerializedName("zh-my")
		@Nullable
		public ZhHant zhMy;
		@SerializedName("be-tarask")
		@Nullable
		public ZhHant beTarask;
		@Nullable
		public ZhHant mrj;
		@Nullable
		public ZhHant cr;
		@SerializedName("en-ca")
		@Nullable
		public ZhHant enCa;
		@Nullable
		public ZhHant sk;
		@Nullable
		public ZhHant azb;
		@SerializedName("kk-cyrl")
		@Nullable
		public ZhHant kkCyrl;
		@Nullable
		public ZhHant krj;
		@Nullable
		public ZhHant nds;
		@Nullable
		public ZhHant kr;
		@Nullable
		public ZhHant el;
		@Nullable
		public ZhHant arz;
		@SerializedName("cbk-zam")
		@Nullable
		public ZhHant cbkZam;
		@SerializedName("zh-hk")
		@Nullable
		public ZhHant zhHk;
		@Nullable
		public ZhHant mus;
		@Nullable
		public ZhHant pdt;
		@Nullable
		public ZhHant mo;
		@SerializedName("de-formal")
		@Nullable
		public ZhHant deFormal;
		@Nullable
		public ZhHant loz;
		@Nullable
		public ZhHant inh;
		@Nullable
		public ZhHant kn;
		@Nullable
		public ZhHant rw;
		@Nullable
		public ZhHant ru;
		@Nullable
		public ZhHant lzh;
		@Nullable
		public ZhHant rue;
		@Nullable
		public ZhHant haw;
		@Nullable
		public ZhHant bar;
		@SerializedName("new")
		@Nullable
		public ZhHant nuw;
		@Nullable
		public ZhHant sma;
		@Nullable
		public ZhHant mai;
		@Nullable
		public ZhHant cps;
		@Nullable
		public ZhHant rmy;
		@SerializedName("crh-cyrl")
		@Nullable
		public ZhHant crhCyrl;
		@Nullable
		public ZhHant th;
		@Nullable
		public ZhHant tr;
		@Nullable
		public ZhHant oc;
		@SerializedName("ks-arab")
		@Nullable
		public ZhHant ksArab;
		@Nullable
		public ZhHant hz;
		@Nullable
		public ZhHant tyv;
		@Nullable
		public ZhHant qug;
		@Nullable
		public ZhHant cs;
		@Nullable
		public ZhHant fj;
		@Nullable
		public ZhHant srn;
		@Nullable
		public ZhHant chy;
		@Nullable
		public ZhHant dz;
		@SerializedName("kk-arab")
		@Nullable
		public ZhHant kkArab;
		@Nullable
		public ZhHant ilo;
		@Nullable
		public ZhHant ug;
		@Nullable
		public ZhHant gl;
		@Nullable
		public ZhHant zu;
		@Nullable
		public ZhHant my;
		@Nullable
		public ZhHant vec;
		@Nullable
		public ZhHant ve;
		@Nullable
		public ZhHant aln;
		@Nullable
		public ZhHant ng;
		@Nullable
		public ZhHant hu;
		@Nullable
		public ZhHant pt;
		@Nullable
		public ZhHant als;
		@Nullable
		public ZhHant hy;
		@Nullable
		public ZhHant se;
		@Nullable
		public ZhHant stq;
		@Nullable
		public ZhHant mt;
		@Nullable
		public ZhHant te;
		@Nullable
		public ZhHant bug;
		@Nullable
		public ZhHant bi;
		@Nullable
		public ZhHant tg;
		@Nullable
		public ZhHant yi;
		@Nullable
		public ZhHant cy;
		@Nullable
		public ZhHant war;
		@Nullable
		public ZhHant sw;
		@Nullable
		public ZhHant arn;
		@Nullable
		public ZhHant ms;
		@Nullable
		public ZhHant vep;
		@Nullable
		public ZhHant mwl;
		@Nullable
		public ZhHant ace;
		@Nullable
		public ZhHant tum;
		@Nullable
		public ZhHant bxr;
		@Nullable
		public ZhHant lb;
		@SerializedName("ruq-latn")
		@Nullable
		public ZhHant ruqLatn;
		@Nullable
		public ZhHant ka;
		@Nullable
		public ZhHant wuu;
		@Nullable
		public ZhHant pag;
		@Nullable
		public ZhHant lo;
		@Nullable
		public ZhHant ur;
		@Nullable
		public ZhHant jut;
		@Nullable
		public ZhHant ku;
		@Nullable
		public ZhHant ak;
		@Nullable
		public ZhHant min;
		@Nullable
		public ZhHant ar;
		@Nullable
		public ZhHant jv;
		@Nullable
		public ZhHant udm;
		@Nullable
		public ZhHant fur;
		@Nullable
		public ZhHant aeb;
		@SerializedName("kk-latn")
		@Nullable
		public ZhHant kkLatn;
		@Nullable
		public ZhHant nap;
		@Nullable
		public ZhHant gu;
		@Nullable
		public ZhHant ii;
		@Nullable
		public ZhHant tru;
		@Nullable
		public ZhHant mi;
		@Nullable
		public ZhHant nl;
		@Nullable
		public ZhHant rwr;
		@Nullable
		public ZhHant vo;
		@Nullable
		public ZhHant ne;
		@Nullable
		public ZhHant bs;
		@Nullable
		public ZhHant niu;
		@Nullable
		public ZhHant av;
		@Nullable
		public ZhHant os;
		@Nullable
		public ZhHant si;
		@Nullable
		public ZhHant ml;
		@Nullable
		public ZhHant ota;
		@Nullable
		public ZhHant mn;
		@Nullable
		public ZhHant xmf;
		@Nullable
		public ZhHant rn;
		@Nullable
		public ZhHant ss;
		@Nullable
		public ZhHant gag;
		@Nullable
		public ZhHant gd;
		@Nullable
		public ZhHant vi;
		@Nullable
		public ZhHant eo;
		@SerializedName("pt-br")
		@Nullable
		public ZhHant ptBr;
		@Nullable
		public ZhHant cdo;
		@Nullable
		public ZhHant tk;
		@Nullable
		public ZhHant pih;
		@SerializedName("gan-hans")
		@Nullable
		public ZhHant ganHans;
		@SerializedName("de-ch")
		@Nullable
		public ZhHant deCh;
		@Nullable
		public ZhHant gn;
		@Nullable
		public ZhHant kl;
		@Nullable
		public ZhHant brh;
		@Nullable
		public ZhHant mr;
		@Nullable
		public ZhHant mzn;
		@Nullable
		public ZhHant rm;
		@Nullable
		public ZhHant prg;
		@Nullable
		public ZhHant dsb;
		@Nullable
		public ZhHant kw;
		@Nullable
		public ZhHant es;
		@Nullable
		public ZhHant ia;
		@Nullable
		public ZhHant da;
		@Nullable
		public ZhHant tly;
		@Nullable
		public ZhHant ps;
		@Nullable
		public ZhHant simple;
		@Nullable
		public ZhHant chr;
		@Nullable
		public ZhHant tw;
		@Nullable
		public ZhHant kiu;
		@Nullable
		public ZhHant ba;
		@SerializedName("kk-cn")
		@Nullable
		public ZhHant kkCn;
		@SerializedName("kk-kz")
		@Nullable
		public ZhHant kkKz;
		@Nullable
		public ZhHant tet;
		@Nullable
		public ZhHant an;
		@Nullable
		public ZhHant liv;
		@SerializedName("hif-latn")
		@Nullable
		public ZhHant hifLatn;
		@SerializedName("kk-tr")
		@Nullable
		public ZhHant kkTr;
		@Nullable
		public ZhHant ta;
		@Nullable
		public ZhHant kaa;
		@Nullable
		public ZhHant tokipona;
		@Nullable
		public ZhHant cho;
		@Nullable
		public ZhHant uk;
		@Nullable
		public ZhHant bcl;
		@Nullable
		public ZhHant pl;
		@Nullable
		public ZhHant ca;
		@Nullable
		public ZhHant koi;
		@Nullable
		public ZhHant nah;
		@Nullable
		public ZhHant nan;
		@Nullable
		public ZhHant gsw;
		@Nullable
		public ZhHant ast;
		@Nullable
		public ZhHant diq;
		@Nullable
		public ZhHant hif;
		@SerializedName("ks-deva")
		@Nullable
		public ZhHant ksDeva;
		@Nullable
		public ZhHant vls;
		@Nullable
		public ZhHant tpi;
		@Nullable
		public ZhHant anp;
		@Nullable
		public ZhHant tn;
		@SerializedName("de-at")
		@Nullable
		public ZhHant deAt;
		@Nullable
		public ZhHant br;
		@Nullable
		public ZhHant bh;
		@SerializedName("zh-mo")
		@Nullable
		public ZhHant zhMo;
		@Nullable
		public ZhHant dtp;
		@Nullable
		public ZhHant pdc;
		@SerializedName("zh-hans")
		@Nullable
		public ZhHant zhHans;
		@Nullable
		public ZhHant li;
		@Nullable
		public ZhHant fr;
		@SerializedName("tg-cyrl")
		@Nullable
		public ZhHant tgCyrl;
		@SerializedName("en-gb")
		@Nullable
		public ZhHant enGb;
		@Nullable
		public ZhHant jbo;
		@Nullable
		public ZhHant zh;
		@SerializedName("tg-latn")
		@Nullable
		public ZhHant tgLatn;
		@Nullable
		public ZhHant lad;
		@Nullable
		public ZhHant sv;
		@Nullable
		public ZhHant af;
		@SerializedName("zh-tw")
		@Nullable
		public ZhHant zhTw;
		@Nullable
		public ZhHant pa;
		@Nullable
		public ZhHant za;
		@Nullable
		public ZhHant sh;
		@Nullable
		public ZhHant bg;
		@SerializedName("tt-cyrl")
		@Nullable
		public ZhHant ttCyrl;
		@Nullable
		public ZhHant ky;
		@Nullable
		public ZhHant hi;
		@Nullable
		public ZhHant st;
		@Nullable
		public ZhHant lus;
		@SerializedName("zh-cn")
		@Nullable
		public ZhHant zhCn;
		@Nullable
		public ZhHant got;
		@Nullable
		public ZhHant gan;
		@SerializedName("ko-kp")
		@Nullable
		public ZhHant koKp;
		@Nullable
		public ZhHant de;
		@SerializedName("shi-tfng")
		@Nullable
		public ZhHant shiTfng;
		@Nullable
		public ZhHant az;
		@Nullable
		public ZhHant ja;
		@Nullable
		public ZhHant is;
		@Nullable
		public ZhHant ang;
		@Nullable
		public ZhHant egl;
		@Nullable
		public ZhHant lt;
		@Nullable
		public ZhHant rup;
		@SerializedName("ruq-cyrl")
		@Nullable
		public ZhHant ruqCyrl;
		@Nullable
		public ZhHant rgn;
		@Nullable
		public ZhHant kk;
		@Nullable
		public ZhHant uz;
		@Nullable
		public ZhHant pnb;
		@Nullable
		public ZhHant sr;
		@Nullable
		public ZhHant la;
		@Nullable
		public ZhHant as;
		@Nullable
		public ZhHant no;
		@Nullable
		public ZhHant ce;
		@Nullable
		public ZhHant kv;
		@Nullable
		public ZhHant pnt;
		@Nullable
		public ZhHant bcc;
		@Nullable
		public ZhHant eu;
		@Nullable
		public ZhHant he;
		@Nullable
		public ZhHant frp;
		@Nullable
		public ZhHant csb;
		@Nullable
		public ZhHant sc;
		@Nullable
		public ZhHant ga;
		@Nullable
		public ZhHant mhr;
		@Nullable
		public ZhHant to;
		@Nullable
		public ZhHant ki;
		@Nullable
		public ZhHant khw;
		@Nullable
		public ZhHant km;
		@SerializedName("map-bms")
		@Nullable
		public ZhHant mapBms;
		@Nullable
		public ZhHant na;
		@Nullable
		public ZhHant ceb;
		@Nullable
		public ZhHant cv;
		@Nullable
		public ZhHant ln;
		@Nullable
		public ZhHant ik;
		@Nullable
		public ZhHant sl;
		@Nullable
		public ZhHant arc;
		@Nullable
		public ZhHant aa;
		@SerializedName("roa-tara")
		@Nullable
		public ZhHant roaTara;
		@Nullable
		public ZhHant krc;
		@Nullable
		public ZhHant lij;
		@Nullable
		public ZhHant ks;
		@Nullable
		public ZhHant cu;
		@Nullable
		public ZhHant ti;
		@Nullable
		public ZhHant io;
		@Nullable
		public ZhHant xh;
		@Nullable
		public ZhHant kab;
		@Nullable
		public ZhHant nb;
		@Nullable
		public ZhHant mh;
		@Nullable
		public ZhHant nso;
		@Nullable
		public ZhHant sgs;
		@Nullable
		public ZhHant ee;
		@Nullable
		public ZhHant bqi;
		@Nullable
		public ZhHant lv;
		@Nullable
		public ZhHant grc;
		@SerializedName("nl-informal")
		@Nullable
		public ZhHant nlInformal;
		@Nullable
		public ZhHant ht;
		@SerializedName("kbd-cyrl")
		@Nullable
		public ZhHant kbdCyrl;
		@Nullable
		public ZhHant pi;
		@Nullable
		public ZhHant sat;
		@Nullable
		public ZhHant nv;
		@Nullable
		public ZhHant bn;
		@Nullable
		public ZhHant kj;
		@Nullable
		public ZhHant eml;
		@Nullable
		public ZhHant fo;
		@Nullable
		public ZhHant shi;
		@Nullable
		public ZhHant bm;
		@Nullable
		public ZhHant zea;
		@Nullable
		public ZhHant ro;
		@Nullable
		public ZhHant lg;
		@Nullable
		public ZhHant bho;
		@Nullable
		public ZhHant it;
		@Nullable
		public ZhHant pcd;
		@Nullable
		public ZhHant lbe;
		@Nullable
		public ZhHant sq;
		@Nullable
		public ZhHant bpy;
		@Nullable
		public ZhHant fi;
		@Nullable
		public ZhHant ho;
		@Nullable
		public ZhHant mk;
		@Nullable
		public ZhHant mdf;
		@Nullable
		public ZhHant rif;
		@SerializedName("shi-latn")
		@Nullable
		public ZhHant shiLatn;
		@Nullable
		public ZhHant ny;
		@Nullable
		public ZhHant hrx;
		@Nullable
		public ZhHant bo;
		@Nullable
		public ZhHant jam;
		@Nullable
		public ZhHant co;
		@Nullable
		public ZhHant iu;
		@SerializedName("sr-ec")
		@Nullable
		public ZhHant srEc;
		@Nullable
		public ZhHant sli;
		@Nullable
		public ZhHant pms;
		@SerializedName("ike-cans")
		@Nullable
		public ZhHant ikeCans;
		@Nullable
		public ZhHant scn;
		@Nullable
		public ZhHant bjn;
		@Nullable
		public ZhHant ab;
		@Nullable
		public ZhHant fit;
		@Nullable
		public ZhHant om;
		@Nullable
		public ZhHant pam;
		@Nullable
		public ZhHant ext;
		@SerializedName("zh-sg")
		@Nullable
		public ZhHant zhSg;
		@Nullable
		public ZhHant lfn;
		@SerializedName("nds-nl")
		@Nullable
		public ZhHant ndsNl;
		@Nullable
		public ZhHant sa;
		@Nullable
		public ZhHant ty;
		@Nullable
		public ZhHant xal;
		@SerializedName("be-x-old")
		@Nullable
		public ZhHant beXOld;
		@Nullable
		public ZhHant en;
		@Nullable
		public ZhHant vro;
	}
	public static class Datavalue {
		@Nullable
		public String type;
		@Nullable
		public String value;
	}
	public static class Mainsnak {
		@Nullable
		public Datavalue datavalue;
		@Nullable
		public String snaktype;
		@Nullable
		public String property;
		@Nullable
		public String datatype;
	}
	public static class P1245 {
		@Nullable
		public String type;
		@Nullable
		public String rank;
		@Nullable
		public String id;
		@Nullable
		public Mainsnak mainsnak;
	}
	public static class Value {
		@Nullable
		public String lowerBound;
		@Nullable
		public String calendarmodel;
		@Nullable
		public Double latitude;
		@Nullable
		public Double precision;
		@Nullable
		public Integer before;
		@Nullable
		public Double longitude;
		@Nullable
		public String time;
		@SerializedName("numeric-id")
		@Nullable
		public Integer numericId;
		@Nullable
		public Integer timezone;
		@Nullable
		public String unit;
		@SerializedName("entity-type")
		@Nullable
		public String entityType;
		@Nullable
		public String amount;
		@Nullable
		public String altitude; // Always null
		@Nullable
		public String globe;
		@Nullable
		public String text;
		@Nullable
		public Integer after;
		@Nullable
		public String upperBound;
		@Nullable
		public String language;
	}
	public static class Snaks {
		@SerializedName("P433")
		@Nullable
		public List<Mainsnak> p433;
		@SerializedName("P31")
		@Nullable
		public List<Mainsnak> p31;
		@SerializedName("P407")
		@Nullable
		public List<Mainsnak> p407;
		@SerializedName("P640")
		@Nullable
		public List<Mainsnak> p640;
		@SerializedName("P268")
		@Nullable
		public List<Mainsnak> p268;
		@SerializedName("P18")
		@Nullable
		public List<Mainsnak> p18;
		@SerializedName("P957")
		@Nullable
		public List<Mainsnak> p957;
		@SerializedName("P813")
		@Nullable
		public List<Mainsnak> p813;
		@SerializedName("P373")
		@Nullable
		public List<Mainsnak> p373;
		@SerializedName("P225")
		@Nullable
		public List<Mainsnak> p225;
		@SerializedName("P143")
		@Nullable
		public List<Mainsnak> p143;
		@SerializedName("P554")
		@Nullable
		public List<Mainsnak> p554;
		@SerializedName("P92")
		@Nullable
		public List<Mainsnak> p92;
		@SerializedName("P747")
		@Nullable
		public List<Mainsnak> p747;
		@SerializedName("P370")
		@Nullable
		public List<Mainsnak> p370;
		@SerializedName("P577")
		@Nullable
		public List<Mainsnak> p577;
		@SerializedName("P972")
		@Nullable
		public List<Mainsnak> p972;
		@SerializedName("P21")
		@Nullable
		public List<Mainsnak> p21;
		@SerializedName("P856")
		@Nullable
		public List<Mainsnak> p856;
		@SerializedName("P960")
		@Nullable
		public List<Mainsnak> p960;
		@SerializedName("P393")
		@Nullable
		public List<Mainsnak> p393;
		@SerializedName("P214")
		@Nullable
		public List<Mainsnak> p214;
		@SerializedName("P304")
		@Nullable
		public List<Mainsnak> p304;
		@SerializedName("P633")
		@Nullable
		public List<Mainsnak> p633;
		@SerializedName("P27")
		@Nullable
		public List<Mainsnak> p27;
		@SerializedName("P535")
		@Nullable
		public List<Mainsnak> p535;
		@SerializedName("P486")
		@Nullable
		public List<Mainsnak> p486;
		@SerializedName("P171")
		@Nullable
		public List<Mainsnak> p171;
		@SerializedName("P1683")
		@Nullable
		public List<Mainsnak> p1683;
		@SerializedName("P1045")
		@Nullable
		public List<Mainsnak> p1045;
		@SerializedName("P478")
		@Nullable
		public List<Mainsnak> p478;
		@SerializedName("P696")
		@Nullable
		public List<Mainsnak> p696;
		@SerializedName("P357")
		@Nullable
		public List<Mainsnak> p357;
		@SerializedName("P186")
		@Nullable
		public List<Mainsnak> p186;
		@SerializedName("P527")
		@Nullable
		public List<Mainsnak> p527;
		@SerializedName("P642")
		@Nullable
		public List<Mainsnak> p642;
		@SerializedName("P106")
		@Nullable
		public List<Mainsnak> p106;
		@SerializedName("P585")
		@Nullable
		public List<Mainsnak> p585;
		@SerializedName("P387")
		@Nullable
		public List<Mainsnak> p387;
		@SerializedName("P405")
		@Nullable
		public List<Mainsnak> p405;
		@SerializedName("P958")
		@Nullable
		public List<Mainsnak> p958;
		@SerializedName("P347")
		@Nullable
		public List<Mainsnak> p347;
		@SerializedName("P698")
		@Nullable
		public List<Mainsnak> p698;
		@SerializedName("P212")
		@Nullable
		public List<Mainsnak> p212;
		@SerializedName("P156")
		@Nullable
		public List<Mainsnak> p156;
		@SerializedName("P641")
		@Nullable
		public List<Mainsnak> p641;
		@SerializedName("P1433")
		@Nullable
		public List<Mainsnak> p1433;
		@SerializedName("P1014")
		@Nullable
		public List<Mainsnak> p1014;
		@SerializedName("P249")
		@Nullable
		public List<Mainsnak> p249;
		@SerializedName("P345")
		@Nullable
		public List<Mainsnak> p345;
		@SerializedName("P138")
		@Nullable
		public List<Mainsnak> p138;
		@SerializedName("P98")
		@Nullable
		public List<Mainsnak> p98;
		@SerializedName("P103")
		@Nullable
		public List<Mainsnak> p103;
		@SerializedName("P217")
		@Nullable
		public List<Mainsnak> p217;
		@SerializedName("P662")
		@Nullable
		public List<Mainsnak> p662;
		@SerializedName("P123")
		@Nullable
		public List<Mainsnak> p123;
		@SerializedName("P687")
		@Nullable
		public List<Mainsnak> p687;
		@SerializedName("P582")
		@Nullable
		public List<Mainsnak> p582;
		@SerializedName("P50")
		@Nullable
		public List<Mainsnak> p50;
		@SerializedName("P1065")
		@Nullable
		public List<Mainsnak> p1065;
		@SerializedName("P364")
		@Nullable
		public List<Mainsnak> p364;
		@SerializedName("P402")
		@Nullable
		public List<Mainsnak> p402;
		@SerializedName("P1476")
		@Nullable
		public List<Mainsnak> p1476;
		@SerializedName("P361")
		@Nullable
		public List<Mainsnak> p361;
		@SerializedName("P574")
		@Nullable
		public List<Mainsnak> p574;
		@SerializedName("P560")
		@Nullable
		public List<Mainsnak> p560;
		@SerializedName("P806")
		@Nullable
		public List<Mainsnak> p806;
		@SerializedName("P792")
		@Nullable
		public List<Mainsnak> p792;
		@SerializedName("P627")
		@Nullable
		public List<Mainsnak> p627;
		@SerializedName("P17")
		@Nullable
		public List<Mainsnak> p17;
		@SerializedName("P380")
		@Nullable
		public List<Mainsnak> p380;
		@SerializedName("P586")
		@Nullable
		public List<Mainsnak> p586;
		@SerializedName("P854")
		@Nullable
		public List<Mainsnak> p854;
		@SerializedName("P815")
		@Nullable
		public List<Mainsnak> p815;
		@SerializedName("P155")
		@Nullable
		public List<Mainsnak> p155;
		@SerializedName("P136")
		@Nullable
		public List<Mainsnak> p136;
		@SerializedName("P248")
		@Nullable
		public String p248;
		@SerializedName("P477")
		@Nullable
		public List<Mainsnak> p477;
		@SerializedName("P81")
		@Nullable
		public List<Mainsnak> p81;
		@SerializedName("P175")
		@Nullable
		public List<Mainsnak> p175;
		@SerializedName("P449")
		@Nullable
		public List<Mainsnak> p449;
		@SerializedName("P580")
		@Nullable
		public List<Mainsnak> p580;
		@SerializedName("P1001")
		@Nullable
		public List<Mainsnak> p1001;
		@SerializedName("P710")
		@Nullable
		public List<Mainsnak> p710;
	}
	public static class References {
		@Nullable
		public Snaks snaks;
		@Nullable
		public String hash;
		@SerializedName("snaks-order")
		@Nullable
		public List<String> snaksOrder;
	}
	public static class P508 {
		@Nullable
		public List<References> references;
		@Nullable
		public String rank;
		@Nullable
		public String type;
		@Nullable
		public String id;
		@Nullable
		public Mainsnak mainsnak;
	}
	public static class Claims {
		@SerializedName("P1029")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1029;
		@SerializedName("P31")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p31;
		@SerializedName("P1451")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1451;
		@SerializedName("P1103")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1103;
		@SerializedName("P812")
		@Nullable
		public List<P1245> p812;
		@SerializedName("P798")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p798;
		@SerializedName("P1134")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1134;
		@SerializedName("P1228")
		@Nullable
		public List<P508> p1228;
		@SerializedName("P272")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p272;
		@SerializedName("P1146")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1146;
		@SerializedName("P1621")
		@Nullable
		public List<P1245> p1621;
		@SerializedName("P355")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p355;
		@SerializedName("P1069")
		@Nullable
		public List<P1245> p1069;
		@SerializedName("P1549")
		@Nullable
		public List<P1245> p1549;
		@SerializedName("P1042")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1042;
		@SerializedName("P1214")
		@Nullable
		public List<P1245> p1214;
		@SerializedName("P1312")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1312;
		@SerializedName("P21")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p21;
		@SerializedName("P1265")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1265;
		@SerializedName("P162")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p162;
		@SerializedName("P303")
		@Nullable
		public List<P508> p303;
		@SerializedName("P1403")
		@Nullable
		public List<P1245> p1403;
		@SerializedName("P108")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p108;
		@SerializedName("P1463")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1463;
		@SerializedName("P281")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p281;
		@SerializedName("P458")
		@Nullable
		public List<P1245> p458;
		@SerializedName("P1430")
		@Nullable
		public List<P1245> p1430;
		@SerializedName("P995")
		@Nullable
		public List<P1245> p995;
		@SerializedName("P396")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p396;
		@SerializedName("P209")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p209;
		@SerializedName("P397")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p397;
		@SerializedName("P858")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p858;
		@SerializedName("P350")
		@Nullable
		public List<P1245> p350;
		@SerializedName("P392")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p392;
		@SerializedName("P114")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p114;
		@SerializedName("P27")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p27;
		@SerializedName("P657")
		@Nullable
		public List<P508> p657;
		@SerializedName("P1233")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1233;
		@SerializedName("P121")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p121;
		@SerializedName("P689")
		@Nullable
		public List<P1245> p689;
		@SerializedName("P1185")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1185;
		@SerializedName("P1002")
		@Nullable
		public List<P1245> p1002;
		@SerializedName("P1224")
		@Nullable
		public List<P1245> p1224;
		@SerializedName("P1417")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1417;
		@SerializedName("P161")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p161;
		@SerializedName("P1668")
		@Nullable
		public List<P1245> p1668;
		@SerializedName("P186")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p186;
		@SerializedName("P527")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p527;
		@SerializedName("P106")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p106;
		@SerializedName("P1085")
		@Nullable
		public List<P1245> p1085;
		@SerializedName("P7")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p7;
		@SerializedName("P1115")
		@Nullable
		public List<P1245> p1115;
		@SerializedName("P403")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p403;
		@SerializedName("P1646")
		@Nullable
		public List<P1245> p1646;
		@SerializedName("P768")
		@Nullable
		public List<P1245> p768;
		@SerializedName("P1053")
		@Nullable
		public List<P1245> p1053;
		@SerializedName("P1086")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1086;
		@SerializedName("P508")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p508;
		@SerializedName("P40")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p40;
		@SerializedName("P1087")
		@Nullable
		public List<P26> p1087;
		@SerializedName("P762")
		@Nullable
		public List<P508> p762;
		@SerializedName("P25")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p25;
		@SerializedName("P821")
		@Nullable
		public List<P1245> p821;
		@SerializedName("P300")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p300;
		@SerializedName("P1114")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1114;
		@SerializedName("P1192")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1192;
		@SerializedName("P469")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p469;
		@SerializedName("P832")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p832;
		@SerializedName("P1601")
		@Nullable
		public List<P1245> p1601;
		@SerializedName("P59")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p59;
		@SerializedName("P448")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p448;
		@SerializedName("P751")
		@Nullable
		public List<P1245> p751;
		@SerializedName("P1313")
		@Nullable
		public List<P1245> p1313;
		@SerializedName("P1557")
		@Nullable
		public List<P1245> p1557;
		@SerializedName("P1307")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1307;
		@SerializedName("P1003")
		@Nullable
		public List<P1245> p1003;
		@SerializedName("P242")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p242;
		@SerializedName("P246")
		@Nullable
		public List<P508> p246;
		@SerializedName("P804")
		@Nullable
		public List<P1245> p804;
		@SerializedName("P1315")
		@Nullable
		public List<P1245> p1315;
		@SerializedName("P1238")
		@Nullable
		public List<P1245> p1238;
		@SerializedName("P364")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p364;
		@SerializedName("P1330")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1330;
		@SerializedName("P344")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p344;
		@SerializedName("P1334")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1334;
		@SerializedName("P1456")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1456;
		@SerializedName("P1075")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1075;
		@SerializedName("P1015")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1015;
		@SerializedName("P53")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p53;
		@SerializedName("P236")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p236;
		@SerializedName("P377")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p377;
		@SerializedName("P1250")
		@Nullable
		public List<P508> p1250;
		@SerializedName("P1442")
		@Nullable
		public List<P1245> p1442;
		@SerializedName("P1236")
		@Nullable
		public List<P1245> p1236;
		@SerializedName("P850")
		@Nullable
		public List<P508> p850;
		@SerializedName("P1352")
		@Nullable
		public List<P26> p1352;
		@SerializedName("P1321")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1321;
		@SerializedName("P815")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p815;
		@SerializedName("P210")
		@Nullable
		public List<P1245> p210;
		@SerializedName("P1577")
		@Nullable
		public List<P1245> p1577;
		@SerializedName("P38")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p38;
		@SerializedName("P282")
		@Nullable
		public List<P1245> p282;
		@SerializedName("P551")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p551;
		@SerializedName("P1434")
		@Nullable
		public List<P1245> p1434;
		@SerializedName("P727")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p727;
		@SerializedName("P426")
		@Nullable
		public List<P1245> p426;
		@SerializedName("P1074")
		@Nullable
		public List<P1245> p1074;
		@SerializedName("P595")
		@Nullable
		public List<P1245> p595;
		@SerializedName("P942")
		@Nullable
		public List<P1245> p942;
		@SerializedName("P710")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p710;
		@SerializedName("P1567")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1567;
		@SerializedName("P1387")
		@Nullable
		public List<P1245> p1387;
		@SerializedName("P915")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p915;
		@SerializedName("P291")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p291;
		@SerializedName("P51")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p51;
		@SerializedName("P184")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p184;
		@SerializedName("P966")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p966;
		@SerializedName("P44")
		@Nullable
		public List<P1245> p44;
		@SerializedName("P840")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p840;
		@SerializedName("P775")
		@Nullable
		public List<P508> p775;
		@SerializedName("P1473")
		@Nullable
		public List<P1245> p1473;
		@SerializedName("P558")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p558;
		@SerializedName("P1532")
		@Nullable
		public List<P508> p1532;
		@SerializedName("P374")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p374;
		@SerializedName("P1050")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1050;
		@SerializedName("P705")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p705;
		@SerializedName("P743")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p743;
		@SerializedName("P883")
		@Nullable
		public List<P1245> p883;
		@SerializedName("P1168")
		@Nullable
		public List<P508> p1168;
		@SerializedName("P791")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p791;
		@SerializedName("P225")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p225;
		@SerializedName("P92")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p92;
		@SerializedName("P747")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p747;
		@SerializedName("P935")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p935;
		@SerializedName("P218")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p218;
		@SerializedName("P972")
		@Nullable
		public List<P1417> p972;
		@SerializedName("P912")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p912;
		@SerializedName("P159")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p159;
		@SerializedName("P54")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p54;
		@SerializedName("P706")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p706;
		@SerializedName("P1627")
		@Nullable
		public List<P1245> p1627;
		@SerializedName("P964")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p964;
		@SerializedName("P442")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p442;
		@SerializedName("P1038")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1038;
		@SerializedName("P455")
		@Nullable
		public List<P1245> p455;
		@SerializedName("P1076")
		@Nullable
		public List<P1245> p1076;
		@SerializedName("P960")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p960;
		@SerializedName("P1414")
		@Nullable
		public List<P1245> p1414;
		@SerializedName("P436")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p436;
		@SerializedName("P1066")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1066;
		@SerializedName("P952")
		@Nullable
		public List<P1245> p952;
		@SerializedName("P297")
		@Nullable
		public List<P1245> p297;
		@SerializedName("P85")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p85;
		@SerializedName("P1397")
		@Nullable
		public List<P1245> p1397;
		@SerializedName("P529")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p529;
		@SerializedName("P91")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p91;
		@SerializedName("P1613")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1613;
		@SerializedName("P1578")
		@Nullable
		public List<P1245> p1578;
		@SerializedName("P716")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p716;
		@SerializedName("P1043")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1043;
		@SerializedName("P219")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p219;
		@SerializedName("P411")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p411;
		@SerializedName("P1045")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1045;
		@SerializedName("P443")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p443;
		@SerializedName("P593")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p593;
		@SerializedName("P495")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p495;
		@SerializedName("P1464")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1464;
		@SerializedName("P1269")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1269;
		@SerializedName("P484")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p484;
		@SerializedName("P696")
		@Nullable
		public List<P508> p696;
		@SerializedName("P592")
		@Nullable
		public List<P508> p592;
		@SerializedName("P496")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p496;
		@SerializedName("P621")
		@Nullable
		public List<P1245> p621;
		@SerializedName("P946")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p946;
		@SerializedName("P1644")
		@Nullable
		public List<P1245> p1644;
		@SerializedName("P1196")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1196;
		@SerializedName("P1263")
		@Nullable
		public List<P1245> p1263;
		@SerializedName("P631")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p631;
		@SerializedName("P1333")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1333;
		@SerializedName("P1046")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1046;
		@SerializedName("P645")
		@Nullable
		public List<P508> p645;
		@SerializedName("P1017")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1017;
		@SerializedName("P924")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p924;
		@SerializedName("P275")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p275;
		@SerializedName("P239")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p239;
		@SerializedName("P993")
		@Nullable
		public List<P1245> p993;
		@SerializedName("P761")
		@Nullable
		public List<P1245> p761;
		@SerializedName("P1239")
		@Nullable
		public List<P1245> p1239;
		@SerializedName("P1420")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1420;
		@SerializedName("P113")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p113;
		@SerializedName("P1365")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1365;
		@SerializedName("P451")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p451;
		@SerializedName("P556")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p556;
		@SerializedName("P561")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p561;
		@SerializedName("P1204")
		@Nullable
		public List<P1245> p1204;
		@SerializedName("P1424")
		@Nullable
		public List<P1245> p1424;
		@SerializedName("P1694")
		@Nullable
		public List<P1245> p1694;
		@SerializedName("P799")
		@Nullable
		public List<P1245> p799;
		@SerializedName("P1421")
		@Nullable
		public List<P1245> p1421;
		@SerializedName("P1419")
		@Nullable
		public List<P1245> p1419;
		@SerializedName("P1367")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1367;
		@SerializedName("P688")
		@Nullable
		public List<P1245> p688;
		@SerializedName("P1083")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1083;
		@SerializedName("P1005")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1005;
		@SerializedName("P677")
		@Nullable
		public List<P1245> p677;
		@SerializedName("P644")
		@Nullable
		public List<P508> p644;
		@SerializedName("P1216")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1216;
		@SerializedName("P504")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p504;
		@SerializedName("P1350")
		@Nullable
		public List<P1245> p1350;
		@SerializedName("P1570")
		@Nullable
		public List<P1245> p1570;
		@SerializedName("P843")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p843;
		@SerializedName("P1477")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1477;
		@SerializedName("P17")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p17;
		@SerializedName("P1284")
		@Nullable
		public List<P1245> p1284;
		@SerializedName("P296")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p296;
		@SerializedName("P523")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p523;
		@SerializedName("P1582")
		@Nullable
		public List<P1245> p1582;
		@SerializedName("P1258")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1258;
		@SerializedName("P516")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p516;
		@SerializedName("P1672")
		@Nullable
		public List<P1245> p1672;
		@SerializedName("P782")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p782;
		@SerializedName("P830")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p830;
		@SerializedName("P764")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p764;
		@SerializedName("P570")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p570;
		@SerializedName("P465")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p465;
		@SerializedName("P765")
		@Nullable
		public List<P1245> p765;
		@SerializedName("P490")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p490;
		@SerializedName("P1696")
		@Nullable
		public List<P1245> p1696;
		@SerializedName("P483")
		@Nullable
		public List<P1245> p483;
		@SerializedName("P684")
		@Nullable
		public List<P508> p684;
		@SerializedName("P853")
		@Nullable
		public List<P508> p853;
		@SerializedName("P94")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p94;
		@SerializedName("P449")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p449;
		@SerializedName("P468")
		@Nullable
		public List<P1245> p468;
		@SerializedName("P1441")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1441;
		@SerializedName("P1026")
		@Nullable
		public List<P1245> p1026;
		@SerializedName("P1606")
		@Nullable
		public List<P1245> p1606;
		@SerializedName("P35")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p35;
		@SerializedName("P1574")
		@Nullable
		public List<P1245> p1574;
		@SerializedName("P107")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p107;
		@SerializedName("P1427")
		@Nullable
		public List<P1245> p1427;
		@SerializedName("P268")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p268;
		@SerializedName("P841")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p841;
		@SerializedName("P1344")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1344;
		@SerializedName("P134")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p134;
		@SerializedName("P1028")
		@Nullable
		public List<P1245> p1028;
		@SerializedName("P1336")
		@Nullable
		public List<P1245> p1336;
		@SerializedName("P243")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p243;
		@SerializedName("P1100")
		@Nullable
		public List<P1245> p1100;
		@SerializedName("P1662")
		@Nullable
		public List<P1245> p1662;
		@SerializedName("P1389")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1389;
		@SerializedName("P488")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p488;
		@SerializedName("P143")
		@Nullable
		public List<P1417> p143;
		@SerializedName("P898")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p898;
		@SerializedName("P729")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p729;
		@SerializedName("P352")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p352;
		@SerializedName("P1276")
		@Nullable
		public List<P1245> p1276;
		@SerializedName("P1479")
		@Nullable
		public List<P1245> p1479;
		@SerializedName("P1256")
		@Nullable
		public List<P1245> p1256;
		@SerializedName("P1370")
		@Nullable
		public List<P1245> p1370;
		@SerializedName("P424")
		@Nullable
		public List<P1245> p424;
		@SerializedName("P943")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p943;
		@SerializedName("P835")
		@Nullable
		public List<P1245> p835;
		@SerializedName("P1612")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1612;
		@SerializedName("P1394")
		@Nullable
		public List<P1245> p1394;
		@SerializedName("P802")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p802;
		@SerializedName("P172")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p172;
		@SerializedName("P205")
		@Nullable
		public List<P1245> p205;
		@SerializedName("P650")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p650;
		@SerializedName("P1429")
		@Nullable
		public List<P1245> p1429;
		@SerializedName("P486")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p486;
		@SerializedName("P1401")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1401;
		@SerializedName("P88")
		@Nullable
		public List<P1245> p88;
		@SerializedName("P1472")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1472;
		@SerializedName("P417")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p417;
		@SerializedName("P619")
		@Nullable
		public List<P508> p619;
		@SerializedName("P607")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p607;
		@SerializedName("P543")
		@Nullable
		public List<P1245> p543;
		@SerializedName("P86")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p86;
		@SerializedName("P480")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p480;
		@SerializedName("P738")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p738;
		@SerializedName("P555")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p555;
		@SerializedName("P773")
		@Nullable
		public List<P1245> p773;
		@SerializedName("P663")
		@Nullable
		public List<P1245> p663;
		@SerializedName("P1383")
		@Nullable
		public List<P1245> p1383;
		@SerializedName("P1157")
		@Nullable
		public List<P1245> p1157;
		@SerializedName("P487")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p487;
		@SerializedName("P1186")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1186;
		@SerializedName("P1581")
		@Nullable
		public List<P1245> p1581;
		@SerializedName("P686")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p686;
		@SerializedName("P511")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p511;
		@SerializedName("P667")
		@Nullable
		public List<P508> p667;
		@SerializedName("P664")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p664;
		@SerializedName("P509")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p509;
		@SerializedName("P1304")
		@Nullable
		public List<P1245> p1304;
		@SerializedName("P1059")
		@Nullable
		public List<P1245> p1059;
		@SerializedName("P1622")
		@Nullable
		public List<P1245> p1622;
		@SerializedName("P690")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p690;
		@SerializedName("P769")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p769;
		@SerializedName("P351")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p351;
		@SerializedName("P1198")
		@Nullable
		public List<P26> p1198;
		@SerializedName("P102")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p102;
		@SerializedName("P1240")
		@Nullable
		public List<P508> p1240;
		@SerializedName("P599")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p599;
		@SerializedName("P594")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p594;
		@SerializedName("P298")
		@Nullable
		public List<P1245> p298;
		@SerializedName("P636")
		@Nullable
		public List<P1245> p636;
		@SerializedName("P1641")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1641;
		@SerializedName("P1096")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1096;
		@SerializedName("P1101")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1101;
		@SerializedName("P1369")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1369;
		@SerializedName("P206")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p206;
		@SerializedName("P1047")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1047;
		@SerializedName("P539")
		@Nullable
		public List<P1245> p539;
		@SerializedName("P1396")
		@Nullable
		public List<P1245> p1396;
		@SerializedName("P58")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p58;
		@SerializedName("P418")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p418;
		@SerializedName("P582")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p582;
		@SerializedName("P50")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p50;
		@SerializedName("P149")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p149;
		@SerializedName("P1454")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1454;
		@SerializedName("P628")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p628;
		@SerializedName("P110")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p110;
		@SerializedName("P1558")
		@Nullable
		public List<P1245> p1558;
		@SerializedName("P837")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p837;
		@SerializedName("P1478")
		@Nullable
		public List<P1245> p1478;
		@SerializedName("P1529")
		@Nullable
		public List<P1245> p1529;
		@SerializedName("P691")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p691;
		@SerializedName("P822")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p822;
		@SerializedName("P638")
		@Nullable
		public List<P508> p638;
		@SerializedName("P1322")
		@Nullable
		public List<P1245> p1322;
		@SerializedName("P1035")
		@Nullable
		public List<P1245> p1035;
		@SerializedName("P1614")
		@Nullable
		public List<P1245> p1614;
		@SerializedName("P19")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p19;
		@SerializedName("P931")
		@Nullable
		public List<P1245> p931;
		@SerializedName("P409")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p409;
		@SerializedName("P1329")
		@Nullable
		public List<P1245> p1329;
		@SerializedName("P1144")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1144;
		@SerializedName("P1392")
		@Nullable
		public List<P1245> p1392;
		@SerializedName("P575")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p575;
		@SerializedName("P1695")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1695;
		@SerializedName("P1291")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1291;
		@SerializedName("P1289")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1289;
		@SerializedName("P65")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p65;
		@SerializedName("P1125")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1125;
		@SerializedName("P454")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p454;
		@SerializedName("P166")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p166;
		@SerializedName("P625")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p625;
		@SerializedName("P1556")
		@Nullable
		public List<P1245> p1556;
		@SerializedName("P1018")
		@Nullable
		public List<P1245> p1018;
		@SerializedName("P1058")
		@Nullable
		public List<P508> p1058;
		@SerializedName("P1070")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1070;
		@SerializedName("P1001")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1001;
		@SerializedName("P237")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p237;
		@SerializedName("P622")
		@Nullable
		public List<P1245> p622;
		@SerializedName("P907")
		@Nullable
		public List<P1245> p907;
		@SerializedName("P604")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p604;
		@SerializedName("P868")
		@Nullable
		public List<P508> p868;
		@SerializedName("P1469")
		@Nullable
		public List<P508> p1469;
		@SerializedName("P886")
		@Nullable
		public List<P1245> p886;
		@SerializedName("P201")
		@Nullable
		public List<P1245> p201;
		@SerializedName("P112")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p112;
		@SerializedName("P1698")
		@Nullable
		public List<P508> p1698;
		@SerializedName("P26")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p26;
		@SerializedName("P1647")
		@Nullable
		public List<P1245> p1647;
		@SerializedName("P901")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p901;
		@SerializedName("P382")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p382;
		@SerializedName("P748")
		@Nullable
		public List<P508> p748;
		@SerializedName("P1071")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1071;
		@SerializedName("P117")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p117;
		@SerializedName("P844")
		@Nullable
		public List<P1245> p844;
		@SerializedName("P963")
		@Nullable
		public List<P1245> p963;
		@SerializedName("P668")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p668;
		@SerializedName("P1027")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1027;
		@SerializedName("P20")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p20;
		@SerializedName("P1288")
		@Nullable
		public List<P1245> p1288;
		@SerializedName("P1602")
		@Nullable
		public List<P1245> p1602;
		@SerializedName("P479")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p479;
		@SerializedName("P720")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p720;
		@SerializedName("P1088")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1088;
		@SerializedName("P373")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p373;
		@SerializedName("P1189")
		@Nullable
		public List<P1245> p1189;
		@SerializedName("P1090")
		@Nullable
		public List<P508> p1090;
		@SerializedName("P652")
		@Nullable
		public List<P1245> p652;
		@SerializedName("P826")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p826;
		@SerializedName("P800")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p800;
		@SerializedName("P1375")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1375;
		@SerializedName("P274")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p274;
		@SerializedName("P163")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p163;
		@SerializedName("P1399")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1399;
		@SerializedName("P547")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p547;
		@SerializedName("P577")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p577;
		@SerializedName("P1235")
		@Nullable
		public List<P1245> p1235;
		@SerializedName("P856")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p856;
		@SerializedName("P348")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p348;
		@SerializedName("P1072")
		@Nullable
		public List<P1245> p1072;
		@SerializedName("P910")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p910;
		@SerializedName("P1648")
		@Nullable
		public List<P1245> p1648;
		@SerializedName("P597")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p597;
		@SerializedName("P158")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p158;
		@SerializedName("P1561")
		@Nullable
		public List<P1245> p1561;
		@SerializedName("P66")
		@Nullable
		public List<P1245> p66;
		@SerializedName("P1255")
		@Nullable
		public List<P1245> p1255;
		@SerializedName("P269")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p269;
		@SerializedName("P247")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p247;
		@SerializedName("P704")
		@Nullable
		public List<P508> p704;
		@SerializedName("P497")
		@Nullable
		public List<P1245> p497;
		@SerializedName("P277")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p277;
		@SerializedName("P1347")
		@Nullable
		public List<P1245> p1347;
		@SerializedName("P214")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p214;
		@SerializedName("P1110")
		@Nullable
		public List<P1245> p1110;
		@SerializedName("P685")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p685;
		@SerializedName("P535")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p535;
		@SerializedName("P1579")
		@Nullable
		public List<P1245> p1579;
		@SerializedName("P1332")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1332;
		@SerializedName("P545")
		@Nullable
		public List<P1245> p545;
		@SerializedName("P721")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p721;
		@SerializedName("P1123")
		@Nullable
		public List<P1245> p1123;
		@SerializedName("P1159")
		@Nullable
		public List<P508> p1159;
		@SerializedName("P1122")
		@Nullable
		public List<P1245> p1122;
		@SerializedName("P647")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p647;
		@SerializedName("P87")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p87;
		@SerializedName("P1604")
		@Nullable
		public List<P1245> p1604;
		@SerializedName("P126")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p126;
		@SerializedName("P1563")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1563;
		@SerializedName("P866")
		@Nullable
		public List<P1245> p866;
		@SerializedName("P399")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p399;
		@SerializedName("P1283")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1283;
		@SerializedName("P1670")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1670;
		@SerializedName("P1200")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1200;
		@SerializedName("P1423")
		@Nullable
		public List<P1245> p1423;
		@SerializedName("P190")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p190;
		@SerializedName("P1278")
		@Nullable
		public List<P1245> p1278;
		@SerializedName("P532")
		@Nullable
		public List<P1245> p532;
		@SerializedName("P1049")
		@Nullable
		public List<P1245> p1049;
		@SerializedName("P231")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p231;
		@SerializedName("P1098")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1098;
		@SerializedName("P611")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p611;
		@SerializedName("P485")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p485;
		@SerializedName("P676")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p676;
		@SerializedName("P709")
		@Nullable
		public List<P1245> p709;
		@SerializedName("P701")
		@Nullable
		public List<P1245> p701;
		@SerializedName("P1104")
		@Nullable
		public List<P1245> p1104;
		@SerializedName("P1136")
		@Nullable
		public List<P1417> p1136;
		@SerializedName("P1150")
		@Nullable
		public List<P1245> p1150;
		@SerializedName("P1229")
		@Nullable
		public List<P508> p1229;
		@SerializedName("P672")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p672;
		@SerializedName("P1444")
		@Nullable
		public List<P1245> p1444;
		@SerializedName("P1132")
		@Nullable
		public List<P1245> p1132;
		@SerializedName("P135")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p135;
		@SerializedName("P450")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p450;
		@SerializedName("P1287")
		@Nullable
		public List<P1245> p1287;
		@SerializedName("P612")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p612;
		@SerializedName("P1317")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1317;
		@SerializedName("P1081")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1081;
		@SerializedName("P699")
		@Nullable
		public List<P508> p699;
		@SerializedName("P1014")
		@Nullable
		public List<P1245> p1014;
		@SerializedName("P414")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p414;
		@SerializedName("P1436")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1436;
		@SerializedName("P345")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p345;
		@SerializedName("P1116")
		@Nullable
		public List<P1245> p1116;
		@SerializedName("P138")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p138;
		@SerializedName("P630")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p630;
		@SerializedName("P427")
		@Nullable
		public List<P1245> p427;
		@SerializedName("P838")
		@Nullable
		public List<P1245> p838;
		@SerializedName("P103")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p103;
		@SerializedName("P982")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p982;
		@SerializedName("P1158")
		@Nullable
		public List<P1245> p1158;
		@SerializedName("P353")
		@Nullable
		public List<P508> p353;
		@SerializedName("P157")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p157;
		@SerializedName("P634")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p634;
		@SerializedName("P123")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p123;
		@SerializedName("P233")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p233;
		@SerializedName("P1470")
		@Nullable
		public List<P1245> p1470;
		@SerializedName("P1465")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1465;
		@SerializedName("P406")
		@Nullable
		public List<P1245> p406;
		@SerializedName("P437")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p437;
		@SerializedName("P127")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p127;
		@SerializedName("P703")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p703;
		@SerializedName("P1308")
		@Nullable
		public List<P1245> p1308;
		@SerializedName("P402")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p402;
		@SerializedName("P1618")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1618;
		@SerializedName("P1248")
		@Nullable
		public List<P508> p1248;
		@SerializedName("P36")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p36;
		@SerializedName("P1044")
		@Nullable
		public List<P1245> p1044;
		@SerializedName("P1195")
		@Nullable
		public List<P1245> p1195;
		@SerializedName("P119")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p119;
		@SerializedName("P913")
		@Nullable
		public List<P1245> p913;
		@SerializedName("P770")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p770;
		@SerializedName("P513")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p513;
		@SerializedName("P241")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p241;
		@SerializedName("P1569")
		@Nullable
		public List<P1245> p1569;
		@SerializedName("P708")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p708;
		@SerializedName("P278")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p278;
		@SerializedName("P176")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p176;
		@SerializedName("P854")
		@Nullable
		public List<P1245> p854;
		@SerializedName("P1377")
		@Nullable
		public List<P1245> p1377;
		@SerializedName("P1631")
		@Nullable
		public List<P1245> p1631;
		@SerializedName("P43")
		@Nullable
		public List<P1245> p43;
		@SerializedName("P911")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p911;
		@SerializedName("P712")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p712;
		@SerializedName("P564")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p564;
		@SerializedName("P429")
		@Nullable
		public List<P1245> p429;
		@SerializedName("P1360")
		@Nullable
		public List<P1245> p1360;
		@SerializedName("P1254")
		@Nullable
		public List<P1245> p1254;
		@SerializedName("P137")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p137;
		@SerializedName("P248")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p248;
		@SerializedName("P538")
		@Nullable
		public List<P1245> p538;
		@SerializedName("P520")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p520;
		@SerializedName("P408")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p408;
		@SerializedName("P1165")
		@Nullable
		public List<P1245> p1165;
		@SerializedName("P1638")
		@Nullable
		public List<P1245> p1638;
		@SerializedName("P1253")
		@Nullable
		public List<P508> p1253;
		@SerializedName("P694")
		@Nullable
		public List<P1245> p694;
		@SerializedName("P959")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p959;
		@SerializedName("P1624")
		@Nullable
		public List<P1245> p1624;
		@SerializedName("P289")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p289;
		@SerializedName("P734")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p734;
		@SerializedName("P941")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p941;
		@SerializedName("P569")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p569;
		@SerializedName("P639")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p639;
		@SerializedName("P1237")
		@Nullable
		public List<P1245> p1237;
		@SerializedName("P715")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p715;
		@SerializedName("P724")
		@Nullable
		public List<P1245> p724;
		@SerializedName("P22")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p22;
		@SerializedName("P884")
		@Nullable
		public List<P508> p884;
		@SerializedName("P867")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p867;
		@SerializedName("P1280")
		@Nullable
		public List<P1245> p1280;
		@SerializedName("P97")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p97;
		@SerializedName("P356")
		@Nullable
		public List<P1245> p356;
		@SerializedName("P1273")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1273;
		@SerializedName("P741")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p741;
		@SerializedName("P1067")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1067;
		@SerializedName("P1139")
		@Nullable
		public List<P508> p1139;
		@SerializedName("P1412")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1412;
		@SerializedName("P435")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p435;
		@SerializedName("P461")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p461;
		@SerializedName("P16")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p16;
		@SerializedName("P301")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p301;
		@SerializedName("P524")
		@Nullable
		public List<P1245> p524;
		@SerializedName("P1447")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1447;
		@SerializedName("P1092")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1092;
		@SerializedName("P542")
		@Nullable
		public List<P1245> p542;
		@SerializedName("P1324")
		@Nullable
		public List<P1245> p1324;
		@SerializedName("P917")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p917;
		@SerializedName("P588")
		@Nullable
		public List<P1245> p588;
		@SerializedName("P1108")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1108;
		@SerializedName("P1542")
		@Nullable
		public List<P1245> p1542;
		@SerializedName("P287")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p287;
		@SerializedName("P1212")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1212;
		@SerializedName("P1119")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1119;
		@SerializedName("P57")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p57;
		@SerializedName("P286")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p286;
		@SerializedName("P711")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p711;
		@SerializedName("P404")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p404;
		@SerializedName("P1057")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1057;
		@SerializedName("P693")
		@Nullable
		public List<P1417> p693;
		@SerializedName("P1012")
		@Nullable
		public List<P1245> p1012;
		@SerializedName("P1267")
		@Nullable
		public List<P1245> p1267;
		@SerializedName("P991")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p991;
		@SerializedName("P1560")
		@Nullable
		public List<P1245> p1560;
		@SerializedName("P171")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p171;
		@SerializedName("P1188")
		@Nullable
		public List<P1245> p1188;
		@SerializedName("P15")
		@Nullable
		public List<P1245> p15;
		@SerializedName("P1282")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1282;
		@SerializedName("P537")
		@Nullable
		public List<P1245> p537;
		@SerializedName("P357")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p357;
		@SerializedName("P37")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p37;
		@SerializedName("P498")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p498;
		@SerializedName("P635")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p635;
		@SerializedName("P215")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p215;
		@SerializedName("P195")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p195;
		@SerializedName("P726")
		@Nullable
		public List<P1245> p726;
		@SerializedName("P579")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p579;
		@SerializedName("P629")
		@Nullable
		public List<P1245> p629;
		@SerializedName("P1183")
		@Nullable
		public List<P508> p1183;
		@SerializedName("P1340")
		@Nullable
		public List<P1245> p1340;
		@SerializedName("P1064")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1064;
		@SerializedName("P178")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p178;
		@SerializedName("P702")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p702;
		@SerializedName("P156")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p156;
		@SerializedName("P212")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p212;
		@SerializedName("P641")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p641;
		@SerializedName("P559")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p559;
		@SerializedName("P546")
		@Nullable
		public List<P1245> p546;
		@SerializedName("P421")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p421;
		@SerializedName("P1068")
		@Nullable
		public List<P1245> p1068;
		@SerializedName("P882")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p882;
		@SerializedName("P662")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p662;
		@SerializedName("P742")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p742;
		@SerializedName("P1148")
		@Nullable
		public List<P1245> p1148;
		@SerializedName("P996")
		@Nullable
		public List<P508> p996;
		@SerializedName("P1246")
		@Nullable
		public List<P1245> p1246;
		@SerializedName("P553")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p553;
		@SerializedName("P687")
		@Nullable
		public List<P1245> p687;
		@SerializedName("P1431")
		@Nullable
		public List<P1245> p1431;
		@SerializedName("P648")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p648;
		@SerializedName("P969")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p969;
		@SerializedName("P695")
		@Nullable
		public List<P508> p695;
		@SerializedName("P1476")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1476;
		@SerializedName("P361")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p361;
		@SerializedName("P620")
		@Nullable
		public List<P1245> p620;
		@SerializedName("P541")
		@Nullable
		public List<P1245> p541;
		@SerializedName("P1297")
		@Nullable
		public List<P1245> p1297;
		@SerializedName("P905")
		@Nullable
		public List<P1245> p905;
		@SerializedName("P998")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p998;
		@SerializedName("P1598")
		@Nullable
		public List<P1245> p1598;
		@SerializedName("P880")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p880;
		@SerializedName("P1266")
		@Nullable
		public List<P1245> p1266;
		@SerializedName("P525")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p525;
		@SerializedName("P576")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p576;
		@SerializedName("P1438")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1438;
		@SerializedName("P270")
		@Nullable
		public List<P1245> p270;
		@SerializedName("P359")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p359;
		@SerializedName("P39")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p39;
		@SerializedName("P1710")
		@Nullable
		public List<P508> p1710;
		@SerializedName("P452")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p452;
		@SerializedName("P669")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p669;
		@SerializedName("P354")
		@Nullable
		public List<P508> p354;
		@SerializedName("P155")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p155;
		@SerializedName("P1455")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1455;
		@SerializedName("P758")
		@Nullable
		public List<P508> p758;
		@SerializedName("P175")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p175;
		@SerializedName("P605")
		@Nullable
		public List<P1245> p605;
		@SerializedName("P580")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p580;
		@SerializedName("P347")
		@Nullable
		public List<P1245> p347;
		@SerializedName("P1433")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1433;
		@SerializedName("P1040")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1040;
		@SerializedName("P981")
		@Nullable
		public List<P1245> p981;
		@SerializedName("P407")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p407;
		@SerializedName("P737")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p737;
		@SerializedName("P474")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p474;
		@SerializedName("P825")
		@Nullable
		public List<P1245> p825;
		@SerializedName("P1149")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1149;
		@SerializedName("P914")
		@Nullable
		public List<P508> p914;
		@SerializedName("P18")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p18;
		@SerializedName("P512")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p512;
		@SerializedName("P1296")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1296;
		@SerializedName("P1113")
		@Nullable
		public List<P1245> p1113;
		@SerializedName("P833")
		@Nullable
		public List<P1245> p833;
		@SerializedName("P861")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p861;
		@SerializedName("P989")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p989;
		@SerializedName("P534")
		@Nullable
		public List<P1245> p534;
		@SerializedName("P1368")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1368;
		@SerializedName("P994")
		@Nullable
		public List<P1245> p994;
		@SerializedName("P1251")
		@Nullable
		public List<P1245> p1251;
		@SerializedName("P1120")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1120;
		@SerializedName("P1118")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1118;
		@SerializedName("P1422")
		@Nullable
		public List<P1245> p1422;
		@SerializedName("P493")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p493;
		@SerializedName("P1343")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1343;
		@SerializedName("P1082")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1082;
		@SerializedName("P1483")
		@Nullable
		public List<P508> p1483;
		@SerializedName("P892")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p892;
		@SerializedName("P1073")
		@Nullable
		public List<P1245> p1073;
		@SerializedName("P167")
		@Nullable
		public List<P1245> p167;
		@SerializedName("P1562")
		@Nullable
		public List<P508> p1562;
		@SerializedName("P181")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p181;
		@SerializedName("P624")
		@Nullable
		public List<P1245> p624;
		@SerializedName("P974")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p974;
		@SerializedName("P122")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p122;
		@SerializedName("P170")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p170;
		@SerializedName("P432")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p432;
		@SerializedName("P1339")
		@Nullable
		public List<P508> p1339;
		@SerializedName("P220")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p220;
		@SerializedName("P781")
		@Nullable
		public List<P508> p781;
		@SerializedName("P234")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p234;
		@SerializedName("P1680")
		@Nullable
		public List<P1245> p1680;
		@SerializedName("P467")
		@Nullable
		public List<P1245> p467;
		@SerializedName("P757")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p757;
		@SerializedName("P460")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p460;
		@SerializedName("P453")
		@Nullable
		public List<P1245> p453;
		@SerializedName("P1630")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1630;
		@SerializedName("P945")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p945;
		@SerializedName("P109")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p109;
		@SerializedName("P1531")
		@Nullable
		public List<P508> p1531;
		@SerializedName("P200")
		@Nullable
		public List<P1245> p200;
		@SerializedName("P189")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p189;
		@SerializedName("P1156")
		@Nullable
		public List<P508> p1156;
		@SerializedName("P1346")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1346;
		@SerializedName("P223")
		@Nullable
		public List<P508> p223;
		@SerializedName("P750")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p750;
		@SerializedName("P1565")
		@Nullable
		public List<P1245> p1565;
		@SerializedName("P937")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p937;
		@SerializedName("P730")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p730;
		@SerializedName("P1323")
		@Nullable
		public List<P1245> p1323;
		@SerializedName("P589")
		@Nullable
		public List<P1245> p589;
		@SerializedName("P587")
		@Nullable
		public List<P1245> p587;
		@SerializedName("P197")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p197;
		@SerializedName("P847")
		@Nullable
		public List<P1245> p847;
		@SerializedName("P1597")
		@Nullable
		public List<P1245> p1597;
		@SerializedName("P185")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p185;
		@SerializedName("P232")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p232;
		@SerializedName("P1385")
		@Nullable
		public List<P1245> p1385;
		@SerializedName("P598")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p598;
		@SerializedName("P940")
		@Nullable
		public List<P1245> p940;
		@SerializedName("P1402")
		@Nullable
		public List<P1245> p1402;
		@SerializedName("P144")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p144;
		@SerializedName("P836")
		@Nullable
		public List<P1245> p836;
		@SerializedName("P244")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p244;
		@SerializedName("P376")
		@Nullable
		public List<P1245> p376;
		@SerializedName("P1128")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1128;
		@SerializedName("P1299")
		@Nullable
		public List<P1245> p1299;
		@SerializedName("P683")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p683;
		@SerializedName("P1587")
		@Nullable
		public List<P1245> p1587;
		@SerializedName("P381")
		@Nullable
		public List<P1245> p381;
		@SerializedName("P1482")
		@Nullable
		public List<P1245> p1482;
		@SerializedName("P463")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p463;
		@SerializedName("P41")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p41;
		@SerializedName("P1181")
		@Nullable
		public List<P1245> p1181;
		@SerializedName("P1207")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1207;
		@SerializedName("P505")
		@Nullable
		public List<P1417> p505;
		@SerializedName("P193")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p193;
		@SerializedName("P279")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p279;
		@SerializedName("P118")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p118;
		@SerializedName("P229")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p229;
		@SerializedName("P47")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p47;
		@SerializedName("P806")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p806;
		@SerializedName("P531")
		@Nullable
		public List<P26> p531;
		@SerializedName("P1566")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1566;
		@SerializedName("P349")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p349;
		@SerializedName("P9")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p9;
		@SerializedName("P908")
		@Nullable
		public List<P508> p908;
		@SerializedName("P380")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p380;
		@SerializedName("P395")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p395;
		@SerializedName("P230")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p230;
		@SerializedName("P1611")
		@Nullable
		public List<P1245> p1611;
		@SerializedName("P518")
		@Nullable
		public List<P1245> p518;
		@SerializedName("P1201")
		@Nullable
		public List<P508> p1201;
		@SerializedName("P533")
		@Nullable
		public List<P1245> p533;
		@SerializedName("P1117")
		@Nullable
		public List<P1245> p1117;
		@SerializedName("P714")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p714;
		@SerializedName("P1533")
		@Nullable
		public List<P1245> p1533;
		@SerializedName("P115")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p115;
		@SerializedName("P1382")
		@Nullable
		public List<P1245> p1382;
		@SerializedName("P494")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p494;
		@SerializedName("P954")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p954;
		@SerializedName("P227")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p227;
		@SerializedName("P462")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p462;
		@SerializedName("P358")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p358;
		@SerializedName("P680")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p680;
		@SerializedName("P984")
		@Nullable
		public List<P508> p984;
		@SerializedName("P749")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p749;
		@SerializedName("P846")
		@Nullable
		public List<P1245> p846;
		@SerializedName("P6")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p6;
		@SerializedName("P947")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p947;
		@SerializedName("P136")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p136;
		@SerializedName("P681")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p681;
		@SerializedName("P1133")
		@Nullable
		public List<P1245> p1133;
		@SerializedName("P1439")
		@Nullable
		public List<P508> p1439;
		@SerializedName("P1391")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1391;
		@SerializedName("P457")
		@Nullable
		public List<P1245> p457;
		@SerializedName("P771")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p771;
		@SerializedName("P477")
		@Nullable
		public List<P1245> p477;
		@SerializedName("P235")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p235;
		@SerializedName("P617")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p617;
		@SerializedName("P961")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p961;
		@SerializedName("P501")
		@Nullable
		public List<P1245> p501;
		@SerializedName("P776")
		@Nullable
		public List<P1245> p776;
		@SerializedName("P1545")
		@Nullable
		public List<P1245> p1545;
		@SerializedName("P827")
		@Nullable
		public List<P1245> p827;
		@SerializedName("P949")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p949;
		@SerializedName("P735")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p735;
		@SerializedName("P805")
		@Nullable
		public List<P1245> p805;
		@SerializedName("P30")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p30;
		@SerializedName("P473")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p473;
		@SerializedName("P1553")
		@Nullable
		public List<P1245> p1553;
		@SerializedName("P1301")
		@Nullable
		public List<P1245> p1301;
		@SerializedName("P177")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p177;
		@SerializedName("P1371")
		@Nullable
		public List<P1245> p1371;
		@SerializedName("P1395")
		@Nullable
		public List<P508> p1395;
		@SerializedName("P767")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p767;
		@SerializedName("P1364")
		@Nullable
		public List<P1245> p1364;
		@SerializedName("P723")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p723;
		@SerializedName("P921")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p921;
		@SerializedName("P412")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p412;
		@SerializedName("P438")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p438;
		@SerializedName("P780")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p780;
		@SerializedName("P305")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p305;
		@SerializedName("P1285")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1285;
		@SerializedName("P366")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p366;
		@SerializedName("P1413")
		@Nullable
		public List<P1245> p1413;
		@SerializedName("P939")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p939;
		@SerializedName("P1281")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1281;
		@SerializedName("P444")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p444;
		@SerializedName("P878")
		@Nullable
		public List<P1245> p878;
		@SerializedName("P400")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p400;
		@SerializedName("P658")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p658;
		@SerializedName("P740")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p740;
		@SerializedName("P651")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p651;
		@SerializedName("P571")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p571;
		@SerializedName("P1077")
		@Nullable
		public List<P508> p1077;
		@SerializedName("P1325")
		@Nullable
		public List<P1417> p1325;
		@SerializedName("P196")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p196;
		@SerializedName("P609")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p609;
		@SerializedName("P563")
		@Nullable
		public List<P508> p563;
		@SerializedName("P1245")
		@Nullable
		public List<P1245> p1245;
		@SerializedName("P428")
		@Nullable
		public List<P508> p428;
		@SerializedName("P1140")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1140;
		@SerializedName("P814")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p814;
		@SerializedName("P1220")
		@Nullable
		public List<P1245> p1220;
		@SerializedName("P642")
		@Nullable
		public List<P1245> p642;
		@SerializedName("P566")
		@Nullable
		public List<P1245> p566;
		@SerializedName("P610")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p610;
		@SerializedName("P585")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p585;
		@SerializedName("P1628")
		@Nullable
		public List<P1245> p1628;
		@SerializedName("P500")
		@Nullable
		public List<P1245> p500;
		@SerializedName("P1060")
		@Nullable
		public List<P1245> p1060;
		@SerializedName("P1190")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1190;
		@SerializedName("P398")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p398;
		@SerializedName("P1705")
		@Nullable
		public List<P1245> p1705;
		@SerializedName("P906")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p906;
		@SerializedName("P154")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p154;
		@SerializedName("P263")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p263;
		@SerializedName("P530")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p530;
		@SerializedName("P1552")
		@Nullable
		public List<P1245> p1552;
		@SerializedName("P413")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p413;
		@SerializedName("P839")
		@Nullable
		public List<P1245> p839;
		@SerializedName("P772")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p772;
		@SerializedName("P713")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p713;
		@SerializedName("P859")
		@Nullable
		public List<P1245> p859;
		@SerializedName("P829")
		@Nullable
		public List<P1245> p829;
		@SerializedName("P1138")
		@Nullable
		public List<P508> p1138;
		@SerializedName("P948")
		@Nullable
		public List<P1245> p948;
		@SerializedName("P466")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p466;
		@SerializedName("P1249")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1249;
		@SerializedName("P98")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p98;
		@SerializedName("P240")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p240;
		@SerializedName("P1056")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1056;
		@SerializedName("P682")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p682;
		@SerializedName("P674")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p674;
		@SerializedName("P267")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p267;
		@SerializedName("P1657")
		@Nullable
		public List<P1245> p1657;
		@SerializedName("P1331")
		@Nullable
		public List<P1245> p1331;
		@SerializedName("P416")
		@Nullable
		public List<P1245> p416;
		@SerializedName("P213")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p213;
		@SerializedName("P793")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p793;
		@SerializedName("P1650")
		@Nullable
		public List<P508> p1650;
		@SerializedName("P881")
		@Nullable
		public List<P1245> p881;
		@SerializedName("P1294")
		@Nullable
		public List<P1245> p1294;
		@SerializedName("P470")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p470;
		@SerializedName("P1408")
		@Nullable
		public List<P1245> p1408;
		@SerializedName("P14")
		@Nullable
		public List<P1245> p14;
		@SerializedName("P1203")
		@Nullable
		public List<P508> p1203;
		@SerializedName("P549")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p549;
		@SerializedName("P560")
		@Nullable
		public List<P1417> p560;
		@SerializedName("P522")
		@Nullable
		public List<P1245> p522;
		@SerializedName("P141")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p141;
		@SerializedName("P208")
		@Nullable
		public List<P1245> p208;
		@SerializedName("P944")
		@Nullable
		public List<P1245> p944;
		@SerializedName("P179")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p179;
		@SerializedName("P1037")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1037;
		@SerializedName("P1366")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1366;
		@SerializedName("P1302")
		@Nullable
		public List<P1245> p1302;
		@SerializedName("P1415")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1415;
		@SerializedName("P1142")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1142;
		@SerializedName("P105")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p105;
		@SerializedName("P299")
		@Nullable
		public List<P1245> p299;
		@SerializedName("P736")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p736;
		@SerializedName("P169")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p169;
		@SerializedName("P81")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p81;
		@SerializedName("P744")
		@Nullable
		public List<P1245> p744;
		@SerializedName("P1191")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1191;
		@SerializedName("P1589")
		@Nullable
		public List<P1245> p1589;
		@SerializedName("P194")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p194;
		@SerializedName("P375")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p375;
		@SerializedName("P1659")
		@Nullable
		public List<P1245> p1659;
		@SerializedName("P1305")
		@Nullable
		public List<P1245> p1305;
		@SerializedName("P434")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p434;
		@SerializedName("P1576")
		@Nullable
		public List<P1245> p1576;
		@SerializedName("P1667")
		@Nullable
		public List<P1245> p1667;
		@SerializedName("P101")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p101;
		@SerializedName("P640")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p640;
		@SerializedName("P69")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p69;
		@SerializedName("P739")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p739;
		@SerializedName("P1440")
		@Nullable
		public List<P508> p1440;
		@SerializedName("P1241")
		@Nullable
		public List<P1245> p1241;
		@SerializedName("P725")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p725;
		@SerializedName("P1034")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1034;
		@SerializedName("P600")
		@Nullable
		public List<P1245> p600;
		@SerializedName("P503")
		@Nullable
		public List<P1245> p503;
		@SerializedName("P183")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p183;
		@SerializedName("P271")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p271;
		@SerializedName("P1048")
		@Nullable
		public List<P1245> p1048;
		@SerializedName("P410")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p410;
		@SerializedName("P957")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p957;
		@SerializedName("P1416")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1416;
		@SerializedName("P1687")
		@Nullable
		public List<P1245> p1687;
		@SerializedName("P1535")
		@Nullable
		public List<P1245> p1535;
		@SerializedName("P879")
		@Nullable
		public List<P1245> p879;
		@SerializedName("P84")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p84;
		@SerializedName("P370")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p370;
		@SerializedName("P492")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p492;
		@SerializedName("P951")
		@Nullable
		public List<P1245> p951;
		@SerializedName("P506")
		@Nullable
		public List<P1245> p506;
		@SerializedName("P1080")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1080;
		@SerializedName("P536")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p536;
		@SerializedName("P774")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p774;
		@SerializedName("P1311")
		@Nullable
		public List<P1245> p1311;
		@SerializedName("P367")
		@Nullable
		public List<P508> p367;
		@SerializedName("P238")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p238;
		@SerializedName("P489")
		@Nullable
		public List<P1245> p489;
		@SerializedName("P1376")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1376;
		@SerializedName("P393")
		@Nullable
		public List<P1245> p393;
		@SerializedName("P1335")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1335;
		@SerializedName("P1286")
		@Nullable
		public List<P1245> p1286;
		@SerializedName("P633")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p633;
		@SerializedName("P439")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p439;
		@SerializedName("P1222")
		@Nullable
		public List<P1245> p1222;
		@SerializedName("P746")
		@Nullable
		public List<P1245> p746;
		@SerializedName("P842")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p842;
		@SerializedName("P1121")
		@Nullable
		public List<P508> p1121;
		@SerializedName("P180")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p180;
		@SerializedName("P608")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p608;
		@SerializedName("P1599")
		@Nullable
		public List<P1245> p1599;
		@SerializedName("P1320")
		@Nullable
		public List<P1245> p1320;
		@SerializedName("P1309")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1309;
		@SerializedName("P1617")
		@Nullable
		public List<P1245> p1617;
		@SerializedName("P150")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p150;
		@SerializedName("P1448")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1448;
		@SerializedName("P1362")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1362;
		@SerializedName("P661")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p661;
		@SerializedName("P1215")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1215;
		@SerializedName("P962")
		@Nullable
		public List<P1245> p962;
		@SerializedName("P673")
		@Nullable
		public List<P508> p673;
		@SerializedName("P10")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p10;
		@SerializedName("P1449")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1449;
		@SerializedName("P140")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p140;
		@SerializedName("P655")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p655;
		@SerializedName("P885")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p885;
		@SerializedName("P613")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p613;
		@SerializedName("P1615")
		@Nullable
		public List<P1245> p1615;
		@SerializedName("P1006")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1006;
		@SerializedName("P111")
		@Nullable
		public List<P1245> p111;
		@SerializedName("P1036")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1036;
		@SerializedName("P606")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p606;
		@SerializedName("P1551")
		@Nullable
		public List<P1245> p1551;
		@SerializedName("P425")
		@Nullable
		public List<P1245> p425;
		@SerializedName("P862")
		@Nullable
		public List<P1245> p862;
		@SerializedName("P371")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p371;
		@SerializedName("P971")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p971;
		@SerializedName("P276")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p276;
		@SerializedName("P590")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p590;
		@SerializedName("P973")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p973;
		@SerializedName("P950")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p950;
		@SerializedName("P1559")
		@Nullable
		public List<P1245> p1559;
		@SerializedName("P1318")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1318;
		@SerializedName("P517")
		@Nullable
		public List<P1245> p517;
		@SerializedName("P1145")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1145;
		@SerializedName("P199")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p199;
		@SerializedName("P1351")
		@Nullable
		public List<P1245> p1351;
		@SerializedName("P528")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p528;
		@SerializedName("P249")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p249;
		@SerializedName("P360")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p360;
		@SerializedName("P902")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p902;
		@SerializedName("P1290")
		@Nullable
		public List<P1245> p1290;
		@SerializedName("P217")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p217;
		@SerializedName("P728")
		@Nullable
		public List<P1245> p728;
		@SerializedName("P1303")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1303;
		@SerializedName("P1636")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1636;
		@SerializedName("P1435")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1435;
		@SerializedName("P1546")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1546;
		@SerializedName("P1361")
		@Nullable
		public List<P1245> p1361;
		@SerializedName("P646")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p646;
		@SerializedName("P665")
		@Nullable
		public List<P508> p665;
		@SerializedName("P1462")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1462;
		@SerializedName("P618")
		@Nullable
		public List<P1245> p618;
		@SerializedName("P1461")
		@Nullable
		public List<P508> p1461;
		@SerializedName("P809")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p809;
		@SerializedName("P245")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p245;
		@SerializedName("P264")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p264;
		@SerializedName("P828")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p828;
		@SerializedName("P722")
		@Nullable
		public List<P508> p722;
		@SerializedName("P1163")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1163;
		@SerializedName("P78")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p78;
		@SerializedName("P1019")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1019;
		@SerializedName("P990")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p990;
		@SerializedName("P865")
		@Nullable
		public List<P1245> p865;
		@SerializedName("P1004")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1004;
		@SerializedName("P1174")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p1174;
		@SerializedName("P591")
		@Nullable
		public List<P1245> p591;
		@SerializedName("P1151")
		@Nullable
		public List<P1245> p1151;
		@SerializedName("P649")
		@Nullable
		public List<P1245> p649;
		@SerializedName("P1187")
		@Nullable
		public List<P1245> p1187;
		@SerializedName("P306")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p306;
		@SerializedName("P745")
		@Nullable
		public List<P1245> p745;
		@SerializedName("P562")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p562;
		@SerializedName("P131")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p131;
		@SerializedName("P557")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p557;
		@SerializedName("P852")
		@Nullable
		public List<P508> p852;
		@SerializedName("P637")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p637;
		@SerializedName("P507")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p507;
		@SerializedName("P552")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p552;
		@SerializedName("P1629")
		@Nullable
		public List<P1245> p1629;
		@SerializedName("P440")
		@Nullable
		public List<P508> p440;
		@SerializedName("P1033")
		@Nullable
		public List<P508> p1033;
		@SerializedName("P1342")
		@Nullable
		public List<P1245> p1342;
		@SerializedName("P61")
		@Nullable
		@JsonAdapter(SafeStringDeserializer.class)
		public String p61;
	}
	public static class Enwiki {
		@Nullable
		public List<String> badges;
		@Nullable
		public String title;
		@Nullable
		public String site;
	}
	public static class Sitelinks {
		@Nullable
		public Enwiki nlwiki;
		@Nullable
		public Enwiki kswiki;
		@Nullable
		public Enwiki pawiki;
		@Nullable
		public Enwiki elwikiquote;
		@Nullable
		public Enwiki bewiki;
		@Nullable
		public Enwiki tawikisource;
		@SerializedName("bat_smgwiki")
		@Nullable
		public Enwiki batSmgwiki;
		@Nullable
		public Enwiki pntwiki;
		@Nullable
		public Enwiki rwwiki;
		@Nullable
		public Enwiki kawiki;
		@Nullable
		public Enwiki szlwiki;
		@Nullable
		public Enwiki cswikisource;
		@Nullable
		public Enwiki tawikinews;
		@Nullable
		public Enwiki ngwiki;
		@Nullable
		public Enwiki lgwiki;
		@Nullable
		public Enwiki afwikiquote;
		@Nullable
		public Enwiki zhwikinews;
		@Nullable
		public Enwiki mrjwiki;
		@Nullable
		public Enwiki hywikisource;
		@Nullable
		public Enwiki angwikiquote;
		@Nullable
		public Enwiki sqwiki;
		@Nullable
		public Enwiki tyvwiki;
		@Nullable
		public Enwiki iuwiki;
		@Nullable
		public Enwiki dzwiki;
		@Nullable
		public Enwiki sqwikinews;
		@Nullable
		public Enwiki zhwikisource;
		@Nullable
		public Enwiki bgwiki;
		@Nullable
		public Enwiki cdowiki;
		@Nullable
		public Enwiki ganwiki;
		@Nullable
		public Enwiki fawikinews;
		@Nullable
		public Enwiki nlwikivoyage;
		@Nullable
		public Enwiki bgwikinews;
		@Nullable
		public Enwiki eswikiquote;
		@Nullable
		public Enwiki mlwikisource;
		@Nullable
		public Enwiki lbewiki;
		@Nullable
		public Enwiki napwiki;
		@Nullable
		public Enwiki eowiki;
		@Nullable
		public Enwiki glwiki;
		@Nullable
		public Enwiki arwikinews;
		@Nullable
		public Enwiki ukwikivoyage;
		@Nullable
		public Enwiki sswiki;
		@Nullable
		public Enwiki srnwiki;
		@Nullable
		public Enwiki bxrwiki;
		@Nullable
		public Enwiki sdwiki;
		@Nullable
		public Enwiki arwiki;
		@Nullable
		public Enwiki nywiki;
		@Nullable
		public Enwiki zhwikiquote;
		@Nullable
		public Enwiki quwiki;
		@Nullable
		public Enwiki dvwiki;
		@Nullable
		public Enwiki vecwiki;
		@Nullable
		public Enwiki pswiki;
		@Nullable
		public Enwiki nowikinews;
		@Nullable
		public Enwiki scwiki;
		@Nullable
		public Enwiki xhwiki;
		@Nullable
		public Enwiki bugwiki;
		@Nullable
		public Enwiki liwikiquote;
		@Nullable
		public Enwiki fawiki;
		@Nullable
		public Enwiki cebwiki;
		@Nullable
		public Enwiki mlwikiquote;
		@Nullable
		public Enwiki lnwiki;
		@Nullable
		public Enwiki kowikisource;
		@SerializedName("nds_nlwiki")
		@Nullable
		public Enwiki ndsNlwiki;
		@Nullable
		public Enwiki ruwiki;
		@Nullable
		public Enwiki ladwiki;
		@Nullable
		public Enwiki htwiki;
		@Nullable
		public Enwiki ikwiki;
		@Nullable
		public Enwiki hrwikiquote;
		@Nullable
		public Enwiki trwikisource;
		@Nullable
		public Enwiki bswikiquote;
		@Nullable
		public Enwiki viwiki;
		@Nullable
		public Enwiki hawiki;
		@Nullable
		public Enwiki aswiki;
		@Nullable
		public Enwiki vepwiki;
		@Nullable
		public Enwiki frwikivoyage;
		@Nullable
		public Enwiki mgwiki;
		@Nullable
		public Enwiki kywikiquote;
		@Nullable
		public Enwiki nlwikisource;
		@Nullable
		public Enwiki fawikiquote;
		@Nullable
		public Enwiki lawikiquote;
		@Nullable
		public Enwiki huwikiquote;
		@Nullable
		public Enwiki fiwiki;
		@Nullable
		public Enwiki mtwiki;
		@Nullable
		public Enwiki simplewikiquote;
		@Nullable
		public Enwiki ukwikiquote;
		@Nullable
		public Enwiki rnwiki;
		@Nullable
		public Enwiki sowiki;
		@Nullable
		public Enwiki kowikiquote;
		@Nullable
		public Enwiki krcwiki;
		@Nullable
		public Enwiki kywiki;
		@SerializedName("roa_rupwiki")
		@Nullable
		public Enwiki roaRupwiki;
		@Nullable
		public Enwiki enwikivoyage;
		@Nullable
		public Enwiki itwikivoyage;
		@Nullable
		public Enwiki ukwikisource;
		@Nullable
		public Enwiki tetwiki;
		@Nullable
		public Enwiki plwikisource;
		@Nullable
		public Enwiki bswikisource;
		@Nullable
		public Enwiki itwiki;
		@Nullable
		public Enwiki fywiki;
		@Nullable
		public Enwiki kmwiki;
		@Nullable
		public Enwiki kaawiki;
		@Nullable
		public Enwiki lawiki;
		@Nullable
		public Enwiki pagwiki;
		@Nullable
		public Enwiki bnwiki;
		@Nullable
		public Enwiki bnwikisource;
		@Nullable
		public Enwiki chowiki;
		@Nullable
		public Enwiki srwikiquote;
		@Nullable
		public Enwiki eswikinews;
		@Nullable
		public Enwiki dawikisource;
		@Nullable
		public Enwiki mdfwiki;
		@Nullable
		public Enwiki hrwikisource;
		@Nullable
		public Enwiki gnwiki;
		@Nullable
		public Enwiki scnwiki;
		@Nullable
		public Enwiki csbwiki;
		@Nullable
		public Enwiki pcdwiki;
		@Nullable
		public Enwiki mrwikiquote;
		@Nullable
		public Enwiki amwiki;
		@Nullable
		public Enwiki newiki;
		@Nullable
		public Enwiki trwiki;
		@Nullable
		public Enwiki nlwikiquote;
		@Nullable
		public Enwiki cuwiki;
		@Nullable
		public Enwiki dewikiquote;
		@Nullable
		public Enwiki plwikivoyage;
		@Nullable
		public Enwiki sahwiki;
		@Nullable
		public Enwiki bawiki;
		@Nullable
		public Enwiki guwikisource;
		@Nullable
		public Enwiki alswiki;
		@Nullable
		public Enwiki warwiki;
		@Nullable
		public Enwiki commonswiki;
		@Nullable
		public Enwiki aywiki;
		@Nullable
		public Enwiki eswikivoyage;
		@Nullable
		public Enwiki tiwiki;
		@Nullable
		public Enwiki bgwikiquote;
		@SerializedName("be_x_oldwiki")
		@Nullable
		public Enwiki beXOldwiki;
		@Nullable
		public Enwiki rmwiki;
		@Nullable
		public Enwiki xmfwiki;
		@Nullable
		public Enwiki iowiki;
		@Nullable
		public Enwiki elwikivoyage;
		@Nullable
		public Enwiki yowiki;
		@Nullable
		public Enwiki kuwikiquote;
		@Nullable
		public Enwiki bewikiquote;
		@Nullable
		public Enwiki pdcwiki;
		@Nullable
		public Enwiki ukwiki;
		@Nullable
		public Enwiki papwiki;
		@Nullable
		public Enwiki zhwiki;
		@Nullable
		public Enwiki enwikiquote;
		@Nullable
		public Enwiki crhwiki;
		@Nullable
		public Enwiki plwikinews;
		@Nullable
		public Enwiki dewiki;
		@Nullable
		public Enwiki slwikisource;
		@Nullable
		public Enwiki tywiki;
		@Nullable
		public Enwiki ltwikisource;
		@Nullable
		public Enwiki cawikiquote;
		@Nullable
		public Enwiki ruwikiquote;
		@Nullable
		public Enwiki nrmwiki;
		@Nullable
		public Enwiki gvwiki;
		@Nullable
		public Enwiki viwikivoyage;
		@Nullable
		public Enwiki slwikiquote;
		@Nullable
		public Enwiki tlwiki;
		@Nullable
		public Enwiki oswiki;
		@Nullable
		public Enwiki sawikisource;
		@Nullable
		public Enwiki arwikiquote;
		@Nullable
		public Enwiki hsbwiki;
		@Nullable
		public Enwiki enwiki;
		@Nullable
		public Enwiki cawiki;
		@Nullable
		public Enwiki vewiki;
		@Nullable
		public Enwiki pamwiki;
		@Nullable
		public Enwiki nlwikinews;
		@Nullable
		public Enwiki igwiki;
		@Nullable
		public Enwiki jawikiquote;
		@Nullable
		public Enwiki zawiki;
		@Nullable
		public Enwiki kkwiki;
		@Nullable
		public Enwiki hawwiki;
		@Nullable
		public Enwiki angwiki;
		@Nullable
		public Enwiki iiwiki;
		@Nullable
		public Enwiki bpywiki;
		@Nullable
		public Enwiki viwikiquote;
		@Nullable
		public Enwiki omwiki;
		@Nullable
		public Enwiki orwiki;
		@Nullable
		public Enwiki kwwiki;
		@Nullable
		public Enwiki mnwiki;
		@Nullable
		public Enwiki bswiki;
		@Nullable
		public Enwiki cswiki;
		@Nullable
		public Enwiki azwiki;
		@Nullable
		public Enwiki sgwiki;
		@Nullable
		public Enwiki dawikiquote;
		@Nullable
		public Enwiki etwiki;
		@Nullable
		public Enwiki pnbwiki;
		@Nullable
		public Enwiki huwikinews;
		@Nullable
		public Enwiki arzwiki;
		@Nullable
		public Enwiki liwiki;
		@Nullable
		public Enwiki ptwiki;
		@Nullable
		public Enwiki tawikiquote;
		@Nullable
		public Enwiki tgwiki;
		@Nullable
		public Enwiki crwiki;
		@Nullable
		public Enwiki tnwiki;
		@Nullable
		public Enwiki ltwiki;
		@Nullable
		public Enwiki itwikiquote;
		@Nullable
		public Enwiki fawikivoyage;
		@Nullable
		public Enwiki dawiki;
		@Nullable
		public Enwiki ruewiki;
		@Nullable
		public Enwiki astwiki;
		@Nullable
		public Enwiki hewikivoyage;
		@Nullable
		public Enwiki enwikisource;
		@Nullable
		public Enwiki mkwikisource;
		@Nullable
		public Enwiki cswikinews;
		@Nullable
		public Enwiki gagwiki;
		@Nullable
		public Enwiki tswiki;
		@Nullable
		public Enwiki ilowiki;
		@Nullable
		public Enwiki uzwikiquote;
		@Nullable
		public Enwiki extwiki;
		@Nullable
		public Enwiki dewikinews;
		@Nullable
		public Enwiki mswiki;
		@Nullable
		public Enwiki bjnwiki;
		@Nullable
		public Enwiki diqwiki;
		@Nullable
		public Enwiki hywiki;
		@Nullable
		public Enwiki nahwiki;
		@Nullable
		public Enwiki frwikisource;
		@Nullable
		public Enwiki hakwiki;
		@SerializedName("zh_min_nanwikisource")
		@Nullable
		public Enwiki zhMinNanwikisource;
		@Nullable
		public Enwiki vlswiki;
		@Nullable
		public Enwiki gotwiki;
		@Nullable
		public Enwiki kuwiki;
		@Nullable
		public Enwiki wowiki;
		@SerializedName("zh_yuewiki")
		@Nullable
		public Enwiki zhYuewiki;
		@Nullable
		public Enwiki afwiki;
		@SerializedName("roa_tarawiki")
		@Nullable
		public Enwiki roaTarawiki;
		@SerializedName("cbk_zamwiki")
		@Nullable
		public Enwiki cbkZamwiki;
		@Nullable
		public Enwiki smwiki;
		@Nullable
		public Enwiki rowikisource;
		@Nullable
		public Enwiki iawiki;
		@Nullable
		public Enwiki iswikiquote;
		@Nullable
		public Enwiki rowikivoyage;
		@Nullable
		public Enwiki tewikiquote;
		@SerializedName("zh_classicalwiki")
		@Nullable
		public Enwiki zhClassicalwiki;
		@Nullable
		public Enwiki urwiki;
		@Nullable
		public Enwiki novwiki;
		@Nullable
		public Enwiki mrwiki;
		@Nullable
		public Enwiki lezwiki;
		@Nullable
		public Enwiki gawiki;
		@Nullable
		public Enwiki iewiki;
		@Nullable
		public Enwiki bgwikisource;
		@Nullable
		public Enwiki hiwiki;
		@Nullable
		public Enwiki fiwikiquote;
		@Nullable
		public Enwiki ndswiki;
		@Nullable
		public Enwiki skwikisource;
		@Nullable
		public Enwiki tpiwiki;
		@Nullable
		public Enwiki ltwikiquote;
		@Nullable
		public Enwiki emlwiki;
		@Nullable
		public Enwiki fiwikinews;
		@Nullable
		public Enwiki idwikiquote;
		@Nullable
		public Enwiki frwiki;
		@Nullable
		public Enwiki kbdwiki;
		@Nullable
		public Enwiki uzwiki;
		@Nullable
		public Enwiki fjwiki;
		@Nullable
		public Enwiki guwikiquote;
		@Nullable
		public Enwiki viwikisource;
		@Nullable
		public Enwiki hiwikiquote;
		@Nullable
		public Enwiki skwiki;
		@Nullable
		public Enwiki trwikiquote;
		@Nullable
		public Enwiki vecwikisource;
		@Nullable
		public Enwiki sqwikiquote;
		@Nullable
		public Enwiki plwiki;
		@Nullable
		public Enwiki jvwiki;
		@Nullable
		public Enwiki arcwiki;
		@Nullable
		public Enwiki etwikisource;
		@Nullable
		public Enwiki sahwikisource;
		@Nullable
		public Enwiki zeawiki;
		@Nullable
		public Enwiki chywiki;
		@Nullable
		public Enwiki twwiki;
		@Nullable
		public Enwiki mwlwiki;
		@Nullable
		public Enwiki hywikiquote;
		@Nullable
		public Enwiki kowiki;
		@Nullable
		public Enwiki yiwikisource;
		@Nullable
		public Enwiki itwikisource;
		@Nullable
		public Enwiki mhwiki;
		@Nullable
		public Enwiki fowiki;
		@Nullable
		public Enwiki xalwiki;
		@Nullable
		public Enwiki biwiki;
		@Nullable
		public Enwiki cowiki;
		@Nullable
		public Enwiki hewikinews;
		@Nullable
		public Enwiki slwiki;
		@Nullable
		public Enwiki fiwikisource;
		@Nullable
		public Enwiki azwikisource;
		@Nullable
		public Enwiki piwiki;
		@Nullable
		public Enwiki svwikivoyage;
		@Nullable
		public Enwiki arwikisource;
		@Nullable
		public Enwiki urwikiquote;
		@Nullable
		public Enwiki mowiki;
		@Nullable
		public Enwiki cewiki;
		@Nullable
		public Enwiki nowiki;
		@Nullable
		public Enwiki hewikisource;
		@Nullable
		public Enwiki scowiki;
		@Nullable
		public Enwiki ckbwiki;
		@Nullable
		public Enwiki klwiki;
		@Nullable
		public Enwiki frwikiquote;
		@Nullable
		public Enwiki jawikisource;
		@Nullable
		public Enwiki rowiki;
		@Nullable
		public Enwiki ltgwiki;
		@Nullable
		public Enwiki vowiki;
		@Nullable
		public Enwiki frwikinews;
		@Nullable
		public Enwiki hewiki;
		@Nullable
		public Enwiki wuuwiki;
		@Nullable
		public Enwiki akwiki;
		@Nullable
		public Enwiki nowikisource;
		@Nullable
		public Enwiki newwiki;
		@Nullable
		public Enwiki wowikiquote;
		@Nullable
		public Enwiki rowikiquote;
		@Nullable
		public Enwiki bewikisource;
		@Nullable
		public Enwiki elwikinews;
		@Nullable
		public Enwiki sawikiquote;
		@Nullable
		public Enwiki rmywiki;
		@Nullable
		public Enwiki kowikinews;
		@Nullable
		public Enwiki bclwiki;
		@Nullable
		public Enwiki frpwiki;
		@Nullable
		public Enwiki skwikiquote;
		@Nullable
		public Enwiki pflwiki;
		@Nullable
		public Enwiki ruwikisource;
		@Nullable
		public Enwiki kshwiki;
		@Nullable
		public Enwiki srwikisource;
		@Nullable
		public Enwiki srwikinews;
		@Nullable
		public Enwiki mlwiki;
		@Nullable
		public Enwiki ocwiki;
		@Nullable
		public Enwiki dewikisource;
		@Nullable
		public Enwiki knwiki;
		@Nullable
		public Enwiki brwikisource;
		@Nullable
		public Enwiki furwiki;
		@Nullable
		public Enwiki mznwiki;
		@Nullable
		public Enwiki nsowiki;
		@Nullable
		public Enwiki glwikisource;
		@Nullable
		public Enwiki cswikiquote;
		@Nullable
		public Enwiki svwikisource;
		@Nullable
		public Enwiki thwikiquote;
		@Nullable
		public Enwiki srwiki;
		@Nullable
		public Enwiki zhwikivoyage;
		@Nullable
		public Enwiki euwiki;
		@Nullable
		public Enwiki nawiki;
		@Nullable
		public Enwiki udmwiki;
		@Nullable
		public Enwiki eowikiquote;
		@Nullable
		public Enwiki tawiki;
		@Nullable
		public Enwiki thwiki;
		@Nullable
		public Enwiki bmwiki;
		@Nullable
		public Enwiki elwiki;
		@Nullable
		public Enwiki cawikinews;
		@Nullable
		public Enwiki stwiki;
		@Nullable
		public Enwiki nowikiquote;
		@Nullable
		public Enwiki sawiki;
		@Nullable
		public Enwiki ruwikivoyage;
		@Nullable
		public Enwiki maiwiki;
		@Nullable
		public Enwiki brwiki;
		@Nullable
		public Enwiki simplewiki;
		@Nullable
		public Enwiki jbowiki;
		@Nullable
		public Enwiki lowiki;
		@Nullable
		public Enwiki abwiki;
		@SerializedName("fiu_vrowiki")
		@Nullable
		public Enwiki fiuVrowiki;
		@Nullable
		public Enwiki siwiki;
		@Nullable
		public Enwiki towiki;
		@Nullable
		public Enwiki pmswiki;
		@Nullable
		public Enwiki yiwiki;
		@Nullable
		public Enwiki ptwikivoyage;
		@Nullable
		public Enwiki koiwiki;
		@Nullable
		public Enwiki eswikisource;
		@Nullable
		public Enwiki chrwiki;
		@Nullable
		public Enwiki glwikiquote;
		@Nullable
		public Enwiki myvwiki;
		@Nullable
		public Enwiki zuwiki;
		@Nullable
		public Enwiki mhrwiki;
		@Nullable
		public Enwiki nvwiki;
		@Nullable
		public Enwiki itwikinews;
		@Nullable
		public Enwiki tewiki;
		@Nullable
		public Enwiki ugwiki;
		@Nullable
		public Enwiki liwikisource;
		@Nullable
		public Enwiki suwiki;
		@Nullable
		public Enwiki mkwiki;
		@Nullable
		public Enwiki ptwikinews;
		@Nullable
		public Enwiki kabwiki;
		@Nullable
		public Enwiki frrwiki;
		@Nullable
		public Enwiki rowikinews;
		@Nullable
		public Enwiki eowikinews;
		@Nullable
		public Enwiki enwikinews;
		@Nullable
		public Enwiki miwiki;
		@Nullable
		public Enwiki guwiki;
		@Nullable
		public Enwiki ptwikiquote;
		@Nullable
		public Enwiki bhwiki;
		@Nullable
		public Enwiki kvwiki;
		@SerializedName("zh_min_nanwikiquote")
		@Nullable
		public Enwiki zhMinNanwikiquote;
		@Nullable
		public Enwiki hifwiki;
		@Nullable
		public Enwiki mywiki;
		@Nullable
		public Enwiki avwiki;
		@Nullable
		public Enwiki cawikisource;
		@Nullable
		public Enwiki knwikiquote;
		@Nullable
		public Enwiki lmowiki;
		@Nullable
		public Enwiki eswiki;
		@SerializedName("map_bmswiki")
		@Nullable
		public Enwiki mapBmswiki;
		@Nullable
		public Enwiki svwikinews;
		@Nullable
		public Enwiki sewiki;
		@Nullable
		public Enwiki huwikisource;
		@Nullable
		public Enwiki fawikisource;
		@Nullable
		public Enwiki minwiki;
		@SerializedName("zh_min_nanwiki")
		@Nullable
		public Enwiki zhMinNanwiki;
		@Nullable
		public Enwiki cvwiki;
		@Nullable
		public Enwiki gdwiki;
		@Nullable
		public Enwiki eewiki;
		@Nullable
		public Enwiki azwikiquote;
		@Nullable
		public Enwiki iswikisource;
		@Nullable
		public Enwiki cywikisource;
		@Nullable
		public Enwiki plwikiquote;
		@Nullable
		public Enwiki glkwiki;
		@Nullable
		public Enwiki tkwiki;
		@Nullable
		public Enwiki idwiki;
		@Nullable
		public Enwiki ttwiki;
		@Nullable
		public Enwiki ruwikinews;
		@Nullable
		public Enwiki lvwiki;
		@Nullable
		public Enwiki shwiki;
		@Nullable
		public Enwiki dsbwiki;
		@Nullable
		public Enwiki ukwikinews;
		@Nullable
		public Enwiki snwiki;
		@Nullable
		public Enwiki dewikivoyage;
		@Nullable
		public Enwiki huwiki;
		@Nullable
		public Enwiki etwikiquote;
		@Nullable
		public Enwiki tumwiki;
		@Nullable
		public Enwiki brwikiquote;
		@Nullable
		public Enwiki nnwikiquote;
		@Nullable
		public Enwiki tewikisource;
		@Nullable
		public Enwiki wikidatawiki;
		@Nullable
		public Enwiki chwiki;
		@Nullable
		public Enwiki barwiki;
		@Nullable
		public Enwiki jawiki;
		@Nullable
		public Enwiki pihwiki;
		@Nullable
		public Enwiki svwiki;
		@Nullable
		public Enwiki thwikisource;
		@Nullable
		public Enwiki swwiki;
		@Nullable
		public Enwiki nnwiki;
		@Nullable
		public Enwiki idwikisource;
		@Nullable
		public Enwiki lbwikiquote;
		@Nullable
		public Enwiki acewiki;
		@Nullable
		public Enwiki kgwiki;
		@Nullable
		public Enwiki cywikiquote;
		@Nullable
		public Enwiki hewikiquote;
		@Nullable
		public Enwiki euwikiquote;
		@Nullable
		public Enwiki ptwikisource;
		@Nullable
		public Enwiki lawikisource;
		@Nullable
		public Enwiki kawikiquote;
		@Nullable
		public Enwiki bswikinews;
		@Nullable
		public Enwiki eowikisource;
		@Nullable
		public Enwiki iswiki;
		@Nullable
		public Enwiki wawiki;
		@Nullable
		public Enwiki lijwiki;
		@Nullable
		public Enwiki bowiki;
		@Nullable
		public Enwiki elwikisource;
		@Nullable
		public Enwiki svwikiquote;
		@Nullable
		public Enwiki stqwiki;
		@Nullable
		public Enwiki lbwiki;
		@Nullable
		public Enwiki cywiki;
		@Nullable
		public Enwiki jawikinews;
		@Nullable
		public Enwiki hrwiki;
		@Nullable
		public Enwiki anwiki;
		@Nullable
		public Enwiki fowikisource;
		@Nullable
		public Enwiki trwikinews;
		@Nullable
		public Enwiki ffwiki;
		@Nullable
		public Enwiki kiwiki;
	}
	public static class P580 {
		@SerializedName("qualifiers-order")
		@Nullable
		public List<String> qualifiersOrder;
		@Nullable
		public Datavalue datavalue;
		@Nullable
		public String snaktype;
		@Nullable
		public String type;
		@Nullable
		public String id;
		@Nullable
		public Mainsnak mainsnak;
		@Nullable
		public Qualifiers qualifiers;
		@Nullable
		public String rank;
		@Nullable
		public String hash;
		@Nullable
		public String property;
		@Nullable
		public String datatype;
	}
	public static class Qualifiers {
		@SerializedName("P1026")
		@Nullable
		public List<P580> p1026;
		@SerializedName("P31")
		@Nullable
		public String p31;
		@SerializedName("P1545")
		@Nullable
		public String p1545;
		@SerializedName("P827")
		@Nullable
		public List<P407> p827;
		@SerializedName("P734")
		@Nullable
		public List<P407> p734;
		@SerializedName("P569")
		@Nullable
		public String p569;
		@SerializedName("P1706")
		@Nullable
		public String p1706;
		@SerializedName("P670")
		@Nullable
		public String p670;
		@SerializedName("P548")
		@Nullable
		public String p548;
		@SerializedName("P812")
		@Nullable
		public String p812;
		@SerializedName("P735")
		@Nullable
		public List<P407> p735;
		@SerializedName("P805")
		@Nullable
		public String p805;
		@SerializedName("P134")
		@Nullable
		public List<P407> p134;
		@SerializedName("P798")
		@Nullable
		public List<P407> p798;
		@SerializedName("P22")
		@Nullable
		public List<P407> p22;
		@SerializedName("P965")
		@Nullable
		public String p965;
		@SerializedName("P813")
		@Nullable
		public String p813;
		@SerializedName("P488")
		@Nullable
		public String p488;
		@SerializedName("P1013")
		@Nullable
		public String p1013;
		@SerializedName("P143")
		@Nullable
		public String p143;
		@SerializedName("P554")
		@Nullable
		public String p554;
		@SerializedName("P729")
		@Nullable
		public List<P407> p729;
		@SerializedName("P1358")
		@Nullable
		public List<P407> p1358;
		@SerializedName("P1129")
		@Nullable
		public List<P407> p1129;
		@SerializedName("P366")
		@Nullable
		public List<P407> p366;
		@SerializedName("P108")
		@Nullable
		public String p108;
		@SerializedName("P281")
		@Nullable
		public List<P407> p281;
		@SerializedName("P400")
		@Nullable
		public String p400;
		@SerializedName("P424")
		@Nullable
		public List<P407> p424;
		@SerializedName("P1542")
		@Nullable
		public List<P407> p1542;
		@SerializedName("P397")
		@Nullable
		public List<P580> p397;
		@SerializedName("P1353")
		@Nullable
		public List<P407> p1353;
		@SerializedName("P693")
		@Nullable
		public List<P580> p693;
		@SerializedName("P1012")
		@Nullable
		public List<P407> p1012;
		@SerializedName("P571")
		@Nullable
		public String p571;
		@SerializedName("P689")
		@Nullable
		public List<P407> p689;
		@SerializedName("P1319")
		@Nullable
		public String p1319;
		@SerializedName("P619")
		@Nullable
		public List<P580> p619;
		@SerializedName("P357")
		@Nullable
		public String p357;
		@SerializedName("P186")
		@Nullable
		public String p186;
		@SerializedName("P527")
		@Nullable
		public List<P580> p527;
		@SerializedName("P642")
		@Nullable
		public String p642;
		@SerializedName("P106")
		@Nullable
		public String p106;
		@SerializedName("P195")
		@Nullable
		public String p195;
		@SerializedName("P585")
		@Nullable
		public String p585;
		@SerializedName("P1596")
		@Nullable
		public List<P580> p1596;
		@SerializedName("P579")
		@Nullable
		public String p579;
		@SerializedName("P768")
		@Nullable
		public String p768;
		@SerializedName("P156")
		@Nullable
		public String p156;
		@SerializedName("P25")
		@Nullable
		public String p25;
		@SerializedName("P641")
		@Nullable
		public String p641;
		@SerializedName("P212")
		@Nullable
		public List<P407> p212;
		@SerializedName("P559")
		@Nullable
		public List<P407> p559;
		@SerializedName("P1326")
		@Nullable
		public String p1326;
		@SerializedName("P1114")
		@Nullable
		public String p1114;
		@SerializedName("P1192")
		@Nullable
		public List<P407> p1192;
		@SerializedName("P1345")
		@Nullable
		public List<P580> p1345;
		@SerializedName("P1249")
		@Nullable
		public List<P407> p1249;
		@SerializedName("P102")
		@Nullable
		public String p102;
		@SerializedName("P742")
		@Nullable
		public String p742;
		@SerializedName("P793")
		@Nullable
		public String p793;
		@SerializedName("P418")
		@Nullable
		public List<P580> p418;
		@SerializedName("P1016")
		@Nullable
		public List<P407> p1016;
		@SerializedName("P242")
		@Nullable
		public List<P407> p242;
		@SerializedName("P794")
		@Nullable
		public String p794;
		@SerializedName("P582")
		@Nullable
		public String p582;
		@SerializedName("P50")
		@Nullable
		public String p50;
		@SerializedName("P969")
		@Nullable
		public String p969;
		@SerializedName("P447")
		@Nullable
		public String p447;
		@SerializedName("P1476")
		@Nullable
		public String p1476;
		@SerializedName("P361")
		@Nullable
		public String p361;
		@SerializedName("P1227")
		@Nullable
		public List<P580> p1227;
		@SerializedName("P574")
		@Nullable
		public String p574;
		@SerializedName("P560")
		@Nullable
		public String p560;
		@SerializedName("P19")
		@Nullable
		public List<P407> p19;
		@SerializedName("P576")
		@Nullable
		public List<P407> p576;
		@SerializedName("P1366")
		@Nullable
		public String p1366;
		@SerializedName("P1037")
		@Nullable
		public List<P407> p1037;
		@SerializedName("P39")
		@Nullable
		public String p39;
		@SerializedName("P179")
		@Nullable
		public List<P407> p179;
		@SerializedName("P575")
		@Nullable
		public List<P580> p575;
		@SerializedName("P452")
		@Nullable
		public List<P407> p452;
		@SerializedName("P654")
		@Nullable
		public String p654;
		@SerializedName("P669")
		@Nullable
		public List<P407> p669;
		@SerializedName("P155")
		@Nullable
		public String p155;
		@SerializedName("P459")
		@Nullable
		public String p459;
		@SerializedName("P166")
		@Nullable
		public List<P407> p166;
		@SerializedName("P426")
		@Nullable
		public List<P407> p426;
		@SerializedName("P81")
		@Nullable
		public String p81;
		@SerializedName("P625")
		@Nullable
		public String p625;
		@SerializedName("P175")
		@Nullable
		public List<P407> p175;
		@SerializedName("P580")
		@Nullable
		public List<P580> p580;
		@SerializedName("P1001")
		@Nullable
		public List<P407> p1001;
		@SerializedName("P710")
		@Nullable
		public List<P407> p710;
		@SerializedName("P1433")
		@Nullable
		public List<P407> p1433;
		@SerializedName("P915")
		@Nullable
		public List<P407> p915;
		@SerializedName("P291")
		@Nullable
		public String p291;
		@SerializedName("P184")
		@Nullable
		public List<P580> p184;
		@SerializedName("P112")
		@Nullable
		public List<P407> p112;
		@SerializedName("P407")
		@Nullable
		public String p407;
		@SerializedName("P101")
		@Nullable
		public String p101;
		@SerializedName("P69")
		@Nullable
		public List<P580> p69;
		@SerializedName("P26")
		@Nullable
		public List<P580> p26;
		@SerializedName("P382")
		@Nullable
		public String p382;
		@SerializedName("P725")
		@Nullable
		public List<P580> p725;
		@SerializedName("P1354")
		@Nullable
		public List<P580> p1354;
		@SerializedName("P790")
		@Nullable
		public String p790;
		@SerializedName("P18")
		@Nullable
		public List<P580> p18;
		@SerializedName("P1027")
		@Nullable
		public String p1027;
		@SerializedName("P512")
		@Nullable
		public String p512;
		@SerializedName("P410")
		@Nullable
		public String p410;
		@SerializedName("P743")
		@Nullable
		public List<P407> p743;
		@SerializedName("P1039")
		@Nullable
		public String p1039;
		@SerializedName("P373")
		@Nullable
		public String p373;
		@SerializedName("P1686")
		@Nullable
		public String p1686;
		@SerializedName("P747")
		@Nullable
		public String p747;
		@SerializedName("P811")
		@Nullable
		public List<P580> p811;
		@SerializedName("P577")
		@Nullable
		public String p577;
		@SerializedName("P218")
		@Nullable
		public List<P580> p218;
		@SerializedName("P972")
		@Nullable
		public String p972;
		@SerializedName("P678")
		@Nullable
		public String p678;
		@SerializedName("P1120")
		@Nullable
		public List<P580> p1120;
		@SerializedName("P159")
		@Nullable
		public List<P407> p159;
		@SerializedName("P706")
		@Nullable
		public List<P407> p706;
		@SerializedName("P1080")
		@Nullable
		public List<P407> p1080;
		@SerializedName("P1343")
		@Nullable
		public List<P580> p1343;
		@SerializedName("P1038")
		@Nullable
		public List<P407> p1038;
		@SerializedName("P1107")
		@Nullable
		public String p1107;
		@SerializedName("P393")
		@Nullable
		public List<P407> p393;
		@SerializedName("P170")
		@Nullable
		public List<P407> p170;
		@SerializedName("P304")
		@Nullable
		public String p304;
		@SerializedName("P439")
		@Nullable
		public List<P580> p439;
		@SerializedName("P478")
		@Nullable
		public String p478;
		@SerializedName("P495")
		@Nullable
		public List<P407> p495;
		@SerializedName("P453")
		@Nullable
		public String p453;
		@SerializedName("P484")
		@Nullable
		public List<P407> p484;
		@SerializedName("P140")
		@Nullable
		public String p140;
		@SerializedName("P387")
		@Nullable
		public List<P407> p387;
		@SerializedName("P1480")
		@Nullable
		public String p1480;
		@SerializedName("P730")
		@Nullable
		public String p730;
		@SerializedName("P405")
		@Nullable
		public String p405;
		@SerializedName("P958")
		@Nullable
		public String p958;
		@SerializedName("P197")
		@Nullable
		public String p197;
		@SerializedName("P425")
		@Nullable
		public List<P407> p425;
		@SerializedName("P1444")
		@Nullable
		public List<P580> p1444;
		@SerializedName("P1011")
		@Nullable
		public List<P580> p1011;
		@SerializedName("P276")
		@Nullable
		public String p276;
		@SerializedName("P1351")
		@Nullable
		public List<P407> p1351;
		@SerializedName("P414")
		@Nullable
		public List<P580> p414;
		@SerializedName("P249")
		@Nullable
		public String p249;
		@SerializedName("P528")
		@Nullable
		public String p528;
		@SerializedName("P138")
		@Nullable
		public String p138;
		@SerializedName("P1164")
		@Nullable
		public List<P580> p1164;
		@SerializedName("P1365")
		@Nullable
		public String p1365;
		@SerializedName("P217")
		@Nullable
		public String p217;
		@SerializedName("P157")
		@Nullable
		public String p157;
		@SerializedName("P123")
		@Nullable
		public List<P407> p123;
		@SerializedName("P1264")
		@Nullable
		public List<P580> p1264;
		@SerializedName("P1419")
		@Nullable
		public List<P407> p1419;
		@SerializedName("P463")
		@Nullable
		public String p463;
		@SerializedName("P127")
		@Nullable
		public String p127;
		@SerializedName("P1350")
		@Nullable
		public List<P407> p1350;
		@SerializedName("P505")
		@Nullable
		public List<P407> p505;
		@SerializedName("P531")
		@Nullable
		public List<P580> p531;
		@SerializedName("P17")
		@Nullable
		public String p17;
		@SerializedName("P241")
		@Nullable
		public List<P407> p241;
		@SerializedName("P518")
		@Nullable
		public String p518;
		@SerializedName("P708")
		@Nullable
		public List<P407> p708;
		@SerializedName("P854")
		@Nullable
		public String p854;
		@SerializedName("P306")
		@Nullable
		public List<P580> p306;
		@SerializedName("P697")
		@Nullable
		public String p697;
		@SerializedName("P494")
		@Nullable
		public List<P580> p494;
		@SerializedName("P570")
		@Nullable
		public List<P580> p570;
		@SerializedName("P462")
		@Nullable
		public String p462;
		@SerializedName("P131")
		@Nullable
		public String p131;
		@SerializedName("P137")
		@Nullable
		public String p137;
		@SerializedName("P248")
		@Nullable
		public String p248;
		@SerializedName("P136")
		@Nullable
		public List<P407> p136;
		@SerializedName("P6")
		@Nullable
		public List<P407> p6;
		@SerializedName("P457")
		@Nullable
		public List<P580> p457;
		@SerializedName("P35")
		@Nullable
		public List<P407> p35;
	}
	public static class P26 {
		@Nullable
		public Qualifiers qualifiers;
		@SerializedName("qualifiers-order")
		@Nullable
		public List<String> qualifiersOrder;
		@Nullable
		public List<References> references;
		@Nullable
		public String rank;
		@Nullable
		public String type;
		@Nullable
		public String id;
		@Nullable
		public Mainsnak mainsnak;
	}
	public static class P155 {
		@SerializedName("qualifiers-order")
		@Nullable
		public List<String> qualifiersOrder;
		@Nullable
		public String type;
		@Nullable
		public String snaktype;
		@Nullable
		public Datavalue datavalue;
		@Nullable
		public String id;
		@Nullable
		public Mainsnak mainsnak;
		@Nullable
		public Qualifiers qualifiers;
		@Nullable
		public String rank;
		@Nullable
		public String hash;
		@Nullable
		public String property;
		@Nullable
		public String datatype;
	}
	public static class P39 {
		@SerializedName("qualifiers-order")
		@Nullable
		public List<String> qualifiersOrder;
		@Nullable
		public List<References> references;
		@Nullable
		public Datavalue datavalue;
		@Nullable
		public String snaktype;
		@Nullable
		public String type;
		@Nullable
		public String id;
		@Nullable
		public Mainsnak mainsnak;
		@Nullable
		public Qualifiers qualifiers;
		@Nullable
		public String rank;
		@Nullable
		public String hash;
		@Nullable
		public String property;
		@Nullable
		public String datatype;
	}
	public static class P1417 {
		@Nullable
		public Qualifiers qualifiers;
		@SerializedName("qualifiers-order")
		@Nullable
		public List<String> qualifiersOrder;
		@Nullable
		public String rank;
		@Nullable
		public String type;
		@Nullable
		public String id;
		@Nullable
		public Mainsnak mainsnak;
	}
	public static class P407 {
		@Nullable
		public String hash;
		@Nullable
		public Datavalue datavalue;
		@Nullable
		public String snaktype;
		@Nullable
		public String property;
		@Nullable
		public String datatype;
	}
	public static class P248 {
		@Nullable
		public String snaktype;
		@Nullable
		public String property;
	}
	public static class P17 {
		@Nullable
		public String hash;
		@Nullable
		public Datavalue datavalue;
		@Nullable
		public String snaktype;
		@Nullable
		public String property;
		@Nullable
		public String datatype;
	}
	public static class P582 {
		@Nullable
		public String hash;
		@Nullable
		public String snaktype;
		@Nullable
		public String property;
	}
}
