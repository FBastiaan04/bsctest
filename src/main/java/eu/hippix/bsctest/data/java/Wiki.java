package eu.hippix.bsctest.data.java;

import java.util.List;
import java.lang.Integer;
import java.lang.Double;
import com.google.gson.annotations.SerializedName;
import org.apache.fory.annotation.Nullable;

public class Wiki {
	@Nullable
	public String id;
	public String getId() { return id; }
	public void setId(String id){ this.id = id; }
	@Nullable
	public Descriptions descriptions;
	public Descriptions getDescriptions() { return descriptions; }
	public void setDescriptions(Descriptions descriptions){ this.descriptions = descriptions; }
	@Nullable
	public Labels labels;
	public Labels getLabels() { return labels; }
	public void setLabels(Labels labels){ this.labels = labels; }
	@Nullable
	public String type;
	public String getType() { return type; }
	public void setType(String type){ this.type = type; }
	@Nullable
	public Claims claims;
	public Claims getClaims() { return claims; }
	public void setClaims(Claims claims){ this.claims = claims; }
	@Nullable
	public Aliases aliases;
	public Aliases getAliases() { return aliases; }
	public void setAliases(Aliases aliases){ this.aliases = aliases; }
	@Nullable
	public Sitelinks sitelinks;
	public Sitelinks getSitelinks() { return sitelinks; }
	public void setSitelinks(Sitelinks sitelinks){ this.sitelinks = sitelinks; }
	@Nullable
	public String datatype;
	public String getDatatype() { return datatype; }
	public void setDatatype(String datatype){ this.datatype = datatype; }
	public static class ZhHant {
	@Nullable
	public String value;
	public String getValue() { return value; }
	public void setValue(String value){ this.value = value; }
	@Nullable
	public String language;
	public String getLanguage() { return language; }
	public void setLanguage(String language){ this.language = language; }
	}
	public static class Aliases {
	@Nullable
	public List<ZhHant> yi;
	public List<ZhHant> getYi() { return yi; }
	public void setYi(List<ZhHant> yi){ this.yi = yi; }
	@Nullable
	public List<ZhHant> ne;
	public List<ZhHant> getNe() { return ne; }
	public void setNe(List<ZhHant> ne){ this.ne = ne; }
	@Nullable
	public List<ZhHant> kn;
	public List<ZhHant> getKn() { return kn; }
	public void setKn(List<ZhHant> kn){ this.kn = kn; }
	@Nullable
	public List<ZhHant> es;
	public List<ZhHant> getEs() { return es; }
	public void setEs(List<ZhHant> es){ this.es = es; }
	@Nullable
	public List<ZhHant> haw;
	public List<ZhHant> getHaw() { return haw; }
	public void setHaw(List<ZhHant> haw){ this.haw = haw; }
	@Nullable
	public List<ZhHant> ext;
	public List<ZhHant> getExt() { return ext; }
	public void setExt(List<ZhHant> ext){ this.ext = ext; }
	@Nullable
	public List<ZhHant> nl;
	public List<ZhHant> getNl() { return nl; }
	public void setNl(List<ZhHant> nl){ this.nl = nl; }
	@Nullable
	public List<ZhHant> as;
	public List<ZhHant> getAs() { return as; }
	public void setAs(List<ZhHant> as){ this.as = as; }
	@Nullable
	public List<ZhHant> mg;
	public List<ZhHant> getMg() { return mg; }
	public void setMg(List<ZhHant> mg){ this.mg = mg; }
	@Nullable
	public List<ZhHant> mi;
	public List<ZhHant> getMi() { return mi; }
	public void setMi(List<ZhHant> mi){ this.mi = mi; }
	@Nullable
	public List<ZhHant> sr;
	public List<ZhHant> getSr() { return sr; }
	public void setSr(List<ZhHant> sr){ this.sr = sr; }
	@Nullable
	public List<ZhHant> arc;
	public List<ZhHant> getArc() { return arc; }
	public void setArc(List<ZhHant> arc){ this.arc = arc; }
	@Nullable
	public List<ZhHant> lg;
	public List<ZhHant> getLg() { return lg; }
	public void setLg(List<ZhHant> lg){ this.lg = lg; }
	@Nullable
	public List<ZhHant> ky;
	public List<ZhHant> getKy() { return ky; }
	public void setKy(List<ZhHant> ky){ this.ky = ky; }
	@Nullable
	public List<ZhHant> la;
	public List<ZhHant> getLa() { return la; }
	public void setLa(List<ZhHant> la){ this.la = la; }
	@Nullable
	public List<ZhHant> als;
	public List<ZhHant> getAls() { return als; }
	public void setAls(List<ZhHant> als){ this.als = als; }
	@SerializedName("kk-cyrl")
	@Nullable
	public List<ZhHant> kkCyrl;
	public List<ZhHant> getKkCyrl() { return kkCyrl; }
	public void setKkCyrl(List<ZhHant> kkCyrl){ this.kkCyrl = kkCyrl; }
	@Nullable
	public List<ZhHant> ss;
	public List<ZhHant> getSs() { return ss; }
	public void setSs(List<ZhHant> ss){ this.ss = ss; }
	@Nullable
	public List<ZhHant> xh;
	public List<ZhHant> getXh() { return xh; }
	public void setXh(List<ZhHant> xh){ this.xh = xh; }
	@Nullable
	public List<ZhHant> hr;
	public List<ZhHant> getHr() { return hr; }
	public void setHr(List<ZhHant> hr){ this.hr = hr; }
	@Nullable
	public List<ZhHant> pms;
	public List<ZhHant> getPms() { return pms; }
	public void setPms(List<ZhHant> pms){ this.pms = pms; }
	@Nullable
	public List<ZhHant> vep;
	public List<ZhHant> getVep() { return vep; }
	public void setVep(List<ZhHant> vep){ this.vep = vep; }
	@Nullable
	public List<ZhHant> sco;
	public List<ZhHant> getSco() { return sco; }
	public void setSco(List<ZhHant> sco){ this.sco = sco; }
	@Nullable
	public List<ZhHant> ur;
	public List<ZhHant> getUr() { return ur; }
	public void setUr(List<ZhHant> ur){ this.ur = ur; }
	@Nullable
	public List<ZhHant> sl;
	public List<ZhHant> getSl() { return sl; }
	public void setSl(List<ZhHant> sl){ this.sl = sl; }
	@SerializedName("de-at")
	@Nullable
	public List<ZhHant> deAt;
	public List<ZhHant> getDeAt() { return deAt; }
	public void setDeAt(List<ZhHant> deAt){ this.deAt = deAt; }
	@Nullable
	public List<ZhHant> lbe;
	public List<ZhHant> getLbe() { return lbe; }
	public void setLbe(List<ZhHant> lbe){ this.lbe = lbe; }
	@Nullable
	public List<ZhHant> fi;
	public List<ZhHant> getFi() { return fi; }
	public void setFi(List<ZhHant> fi){ this.fi = fi; }
	@Nullable
	public List<ZhHant> sg;
	public List<ZhHant> getSg() { return sg; }
	public void setSg(List<ZhHant> sg){ this.sg = sg; }
	@Nullable
	public List<ZhHant> arq;
	public List<ZhHant> getArq() { return arq; }
	public void setArq(List<ZhHant> arq){ this.arq = arq; }
	@Nullable
	public List<ZhHant> el;
	public List<ZhHant> getEl() { return el; }
	public void setEl(List<ZhHant> el){ this.el = el; }
	@Nullable
	public List<ZhHant> av;
	public List<ZhHant> getAv() { return av; }
	public void setAv(List<ZhHant> av){ this.av = av; }
	@SerializedName("new")
	@Nullable
	public List<ZhHant> nuw;
	public List<ZhHant> getNuw() { return nuw; }
	public void setNuw(List<ZhHant> nuw){ this.nuw = nuw; }
	@Nullable
	public List<ZhHant> cdo;
	public List<ZhHant> getCdo() { return cdo; }
	public void setCdo(List<ZhHant> cdo){ this.cdo = cdo; }
	@Nullable
	public List<ZhHant> gan;
	public List<ZhHant> getGan() { return gan; }
	public void setGan(List<ZhHant> gan){ this.gan = gan; }
	@Nullable
	public List<ZhHant> li;
	public List<ZhHant> getLi() { return li; }
	public void setLi(List<ZhHant> li){ this.li = li; }
	@Nullable
	public List<ZhHant> pnb;
	public List<ZhHant> getPnb() { return pnb; }
	public void setPnb(List<ZhHant> pnb){ this.pnb = pnb; }
	@Nullable
	public List<ZhHant> tpi;
	public List<ZhHant> getTpi() { return tpi; }
	public void setTpi(List<ZhHant> tpi){ this.tpi = tpi; }
	@Nullable
	public List<ZhHant> th;
	public List<ZhHant> getTh() { return th; }
	public void setTh(List<ZhHant> th){ this.th = th; }
	@Nullable
	public List<ZhHant> ve;
	public List<ZhHant> getVe() { return ve; }
	public void setVe(List<ZhHant> ve){ this.ve = ve; }
	@Nullable
	public List<ZhHant> sa;
	public List<ZhHant> getSa() { return sa; }
	public void setSa(List<ZhHant> sa){ this.sa = sa; }
	@Nullable
	public List<ZhHant> kbd;
	public List<ZhHant> getKbd() { return kbd; }
	public void setKbd(List<ZhHant> kbd){ this.kbd = kbd; }
	@Nullable
	public List<ZhHant> sc;
	public List<ZhHant> getSc() { return sc; }
	public void setSc(List<ZhHant> sc){ this.sc = sc; }
	@Nullable
	public List<ZhHant> bh;
	public List<ZhHant> getBh() { return bh; }
	public void setBh(List<ZhHant> bh){ this.bh = bh; }
	@SerializedName("bbc-latn")
	@Nullable
	public List<ZhHant> bbcLatn;
	public List<ZhHant> getBbcLatn() { return bbcLatn; }
	public void setBbcLatn(List<ZhHant> bbcLatn){ this.bbcLatn = bbcLatn; }
	@Nullable
	public List<ZhHant> be;
	public List<ZhHant> getBe() { return be; }
	public void setBe(List<ZhHant> be){ this.be = be; }
	@Nullable
	public List<ZhHant> co;
	public List<ZhHant> getCo() { return co; }
	public void setCo(List<ZhHant> co){ this.co = co; }
	@Nullable
	public List<ZhHant> tw;
	public List<ZhHant> getTw() { return tw; }
	public void setTw(List<ZhHant> tw){ this.tw = tw; }
	@Nullable
	public List<ZhHant> pi;
	public List<ZhHant> getPi() { return pi; }
	public void setPi(List<ZhHant> pi){ this.pi = pi; }
	@Nullable
	public List<ZhHant> lij;
	public List<ZhHant> getLij() { return lij; }
	public void setLij(List<ZhHant> lij){ this.lij = lij; }
	@Nullable
	public List<ZhHant> tr;
	public List<ZhHant> getTr() { return tr; }
	public void setTr(List<ZhHant> tr){ this.tr = tr; }
	@Nullable
	public List<ZhHant> pag;
	public List<ZhHant> getPag() { return pag; }
	public void setPag(List<ZhHant> pag){ this.pag = pag; }
	@SerializedName("zh-hant")
	@Nullable
	public List<ZhHant> zhHant;
	public List<ZhHant> getZhHant() { return zhHant; }
	public void setZhHant(List<ZhHant> zhHant){ this.zhHant = zhHant; }
	@Nullable
	public List<ZhHant> zea;
	public List<ZhHant> getZea() { return zea; }
	public void setZea(List<ZhHant> zea){ this.zea = zea; }
	@Nullable
	public List<ZhHant> glk;
	public List<ZhHant> getGlk() { return glk; }
	public void setGlk(List<ZhHant> glk){ this.glk = glk; }
	@Nullable
	public List<ZhHant> yue;
	public List<ZhHant> getYue() { return yue; }
	public void setYue(List<ZhHant> yue){ this.yue = yue; }
	@Nullable
	public List<ZhHant> ksh;
	public List<ZhHant> getKsh() { return ksh; }
	public void setKsh(List<ZhHant> ksh){ this.ksh = ksh; }
	@Nullable
	public List<ZhHant> arz;
	public List<ZhHant> getArz() { return arz; }
	public void setArz(List<ZhHant> arz){ this.arz = arz; }
	@Nullable
	public List<ZhHant> rn;
	public List<ZhHant> getRn() { return rn; }
	public void setRn(List<ZhHant> rn){ this.rn = rn; }
	@Nullable
	public List<ZhHant> af;
	public List<ZhHant> getAf() { return af; }
	public void setAf(List<ZhHant> af){ this.af = af; }
	@Nullable
	public List<ZhHant> ar;
	public List<ZhHant> getAr() { return ar; }
	public void setAr(List<ZhHant> ar){ this.ar = ar; }
	@Nullable
	public List<ZhHant> bo;
	public List<ZhHant> getBo() { return bo; }
	public void setBo(List<ZhHant> bo){ this.bo = bo; }
	@Nullable
	public List<ZhHant> sd;
	public List<ZhHant> getSd() { return sd; }
	public void setSd(List<ZhHant> sd){ this.sd = sd; }
	@Nullable
	public List<ZhHant> vi;
	public List<ZhHant> getVi() { return vi; }
	public void setVi(List<ZhHant> vi){ this.vi = vi; }
	@SerializedName("be-tarask")
	@Nullable
	public List<ZhHant> beTarask;
	public List<ZhHant> getBeTarask() { return beTarask; }
	public void setBeTarask(List<ZhHant> beTarask){ this.beTarask = beTarask; }
	@Nullable
	public List<ZhHant> kab;
	public List<ZhHant> getKab() { return kab; }
	public void setKab(List<ZhHant> kab){ this.kab = kab; }
	@Nullable
	public List<ZhHant> vec;
	public List<ZhHant> getVec() { return vec; }
	public void setVec(List<ZhHant> vec){ this.vec = vec; }
	@Nullable
	public List<ZhHant> ti;
	public List<ZhHant> getTi() { return ti; }
	public void setTi(List<ZhHant> ti){ this.ti = ti; }
	@Nullable
	public List<ZhHant> na;
	public List<ZhHant> getNa() { return na; }
	public void setNa(List<ZhHant> na){ this.na = na; }
	@Nullable
	public List<ZhHant> tt;
	public List<ZhHant> getTt() { return tt; }
	public void setTt(List<ZhHant> tt){ this.tt = tt; }
	@Nullable
	public List<ZhHant> tokipona;
	public List<ZhHant> getTokipona() { return tokipona; }
	public void setTokipona(List<ZhHant> tokipona){ this.tokipona = tokipona; }
	@Nullable
	public List<ZhHant> st;
	public List<ZhHant> getSt() { return st; }
	public void setSt(List<ZhHant> st){ this.st = st; }
	@Nullable
	public List<ZhHant> sm;
	public List<ZhHant> getSm() { return sm; }
	public void setSm(List<ZhHant> sm){ this.sm = sm; }
	@SerializedName("en-ca")
	@Nullable
	public List<ZhHant> enCa;
	public List<ZhHant> getEnCa() { return enCa; }
	public void setEnCa(List<ZhHant> enCa){ this.enCa = enCa; }
	@Nullable
	public List<ZhHant> id;
	public List<ZhHant> getId() { return id; }
	public void setId(List<ZhHant> id){ this.id = id; }
	@Nullable
	public List<ZhHant> ie;
	public List<ZhHant> getIe() { return ie; }
	public void setIe(List<ZhHant> ie){ this.ie = ie; }
	@Nullable
	public List<ZhHant> de;
	public List<ZhHant> getDe() { return de; }
	public void setDe(List<ZhHant> de){ this.de = de; }
	@SerializedName("zh-tw")
	@Nullable
	public List<ZhHant> zhTw;
	public List<ZhHant> getZhTw() { return zhTw; }
	public void setZhTw(List<ZhHant> zhTw){ this.zhTw = zhTw; }
	@Nullable
	public List<ZhHant> ug;
	public List<ZhHant> getUg() { return ug; }
	public void setUg(List<ZhHant> ug){ this.ug = ug; }
	@Nullable
	public List<ZhHant> oc;
	public List<ZhHant> getOc() { return oc; }
	public void setOc(List<ZhHant> oc){ this.oc = oc; }
	@Nullable
	public List<ZhHant> pih;
	public List<ZhHant> getPih() { return pih; }
	public void setPih(List<ZhHant> pih){ this.pih = pih; }
	@Nullable
	public List<ZhHant> nv;
	public List<ZhHant> getNv() { return nv; }
	public void setNv(List<ZhHant> nv){ this.nv = nv; }
	@Nullable
	public List<ZhHant> sh;
	public List<ZhHant> getSh() { return sh; }
	public void setSh(List<ZhHant> sh){ this.sh = sh; }
	@Nullable
	public List<ZhHant> no;
	public List<ZhHant> getNo() { return no; }
	public void setNo(List<ZhHant> no){ this.no = no; }
	@Nullable
	public List<ZhHant> ast;
	public List<ZhHant> getAst() { return ast; }
	public void setAst(List<ZhHant> ast){ this.ast = ast; }
	@Nullable
	public List<ZhHant> tum;
	public List<ZhHant> getTum() { return tum; }
	public void setTum(List<ZhHant> tum){ this.tum = tum; }
	@Nullable
	public List<ZhHant> vo;
	public List<ZhHant> getVo() { return vo; }
	public void setVo(List<ZhHant> vo){ this.vo = vo; }
	@Nullable
	public List<ZhHant> rue;
	public List<ZhHant> getRue() { return rue; }
	public void setRue(List<ZhHant> rue){ this.rue = rue; }
	@SerializedName("crh-latn")
	@Nullable
	public List<ZhHant> crhLatn;
	public List<ZhHant> getCrhLatn() { return crhLatn; }
	public void setCrhLatn(List<ZhHant> crhLatn){ this.crhLatn = crhLatn; }
	@Nullable
	public List<ZhHant> ay;
	public List<ZhHant> getAy() { return ay; }
	public void setAy(List<ZhHant> ay){ this.ay = ay; }
	@Nullable
	public List<ZhHant> rw;
	public List<ZhHant> getRw() { return rw; }
	public void setRw(List<ZhHant> rw){ this.rw = rw; }
	@Nullable
	public List<ZhHant> pcd;
	public List<ZhHant> getPcd() { return pcd; }
	public void setPcd(List<ZhHant> pcd){ this.pcd = pcd; }
	@Nullable
	public List<ZhHant> nb;
	public List<ZhHant> getNb() { return nb; }
	public void setNb(List<ZhHant> nb){ this.nb = nb; }
	@Nullable
	public List<ZhHant> mhr;
	public List<ZhHant> getMhr() { return mhr; }
	public void setMhr(List<ZhHant> mhr){ this.mhr = mhr; }
	@Nullable
	public List<ZhHant> my;
	public List<ZhHant> getMy() { return my; }
	public void setMy(List<ZhHant> my){ this.my = my; }
	@Nullable
	public List<ZhHant> ks;
	public List<ZhHant> getKs() { return ks; }
	public void setKs(List<ZhHant> ks){ this.ks = ks; }
	@Nullable
	public List<ZhHant> sq;
	public List<ZhHant> getSq() { return sq; }
	public void setSq(List<ZhHant> sq){ this.sq = sq; }
	@Nullable
	public List<ZhHant> xal;
	public List<ZhHant> getXal() { return xal; }
	public void setXal(List<ZhHant> xal){ this.xal = xal; }
	@Nullable
	public List<ZhHant> tet;
	public List<ZhHant> getTet() { return tet; }
	public void setTet(List<ZhHant> tet){ this.tet = tet; }
	@Nullable
	public List<ZhHant> sv;
	public List<ZhHant> getSv() { return sv; }
	public void setSv(List<ZhHant> sv){ this.sv = sv; }
	@SerializedName("kk-kz")
	@Nullable
	public List<ZhHant> kkKz;
	public List<ZhHant> getKkKz() { return kkKz; }
	public void setKkKz(List<ZhHant> kkKz){ this.kkKz = kkKz; }
	@Nullable
	public List<ZhHant> uz;
	public List<ZhHant> getUz() { return uz; }
	public void setUz(List<ZhHant> uz){ this.uz = uz; }
	@Nullable
	public List<ZhHant> hak;
	public List<ZhHant> getHak() { return hak; }
	public void setHak(List<ZhHant> hak){ this.hak = hak; }
	@Nullable
	public List<ZhHant> ga;
	public List<ZhHant> getGa() { return ga; }
	public void setGa(List<ZhHant> ga){ this.ga = ga; }
	@Nullable
	public List<ZhHant> lv;
	public List<ZhHant> getLv() { return lv; }
	public void setLv(List<ZhHant> lv){ this.lv = lv; }
	@Nullable
	public List<ZhHant> mrj;
	public List<ZhHant> getMrj() { return mrj; }
	public void setMrj(List<ZhHant> mrj){ this.mrj = mrj; }
	@Nullable
	public List<ZhHant> fj;
	public List<ZhHant> getFj() { return fj; }
	public void setFj(List<ZhHant> fj){ this.fj = fj; }
	@SerializedName("en-gb")
	@Nullable
	public List<ZhHant> enGb;
	public List<ZhHant> getEnGb() { return enGb; }
	public void setEnGb(List<ZhHant> enGb){ this.enGb = enGb; }
	@Nullable
	public List<ZhHant> grc;
	public List<ZhHant> getGrc() { return grc; }
	public void setGrc(List<ZhHant> grc){ this.grc = grc; }
	@Nullable
	public List<ZhHant> ltg;
	public List<ZhHant> getLtg() { return ltg; }
	public void setLtg(List<ZhHant> ltg){ this.ltg = ltg; }
	@Nullable
	public List<ZhHant> kg;
	public List<ZhHant> getKg() { return kg; }
	public void setKg(List<ZhHant> kg){ this.kg = kg; }
	@Nullable
	public List<ZhHant> gsw;
	public List<ZhHant> getGsw() { return gsw; }
	public void setGsw(List<ZhHant> gsw){ this.gsw = gsw; }
	@Nullable
	public List<ZhHant> fy;
	public List<ZhHant> getFy() { return fy; }
	public void setFy(List<ZhHant> fy){ this.fy = fy; }
	@Nullable
	public List<ZhHant> diq;
	public List<ZhHant> getDiq() { return diq; }
	public void setDiq(List<ZhHant> diq){ this.diq = diq; }
	@Nullable
	public List<ZhHant> ig;
	public List<ZhHant> getIg() { return ig; }
	public void setIg(List<ZhHant> ig){ this.ig = ig; }
	@Nullable
	public List<ZhHant> bjn;
	public List<ZhHant> getBjn() { return bjn; }
	public void setBjn(List<ZhHant> bjn){ this.bjn = bjn; }
	@Nullable
	public List<ZhHant> bar;
	public List<ZhHant> getBar() { return bar; }
	public void setBar(List<ZhHant> bar){ this.bar = bar; }
	@Nullable
	public List<ZhHant> tl;
	public List<ZhHant> getTl() { return tl; }
	public void setTl(List<ZhHant> tl){ this.tl = tl; }
	@Nullable
	public List<ZhHant> bpy;
	public List<ZhHant> getBpy() { return bpy; }
	public void setBpy(List<ZhHant> bpy){ this.bpy = bpy; }
	@Nullable
	public List<ZhHant> war;
	public List<ZhHant> getWar() { return war; }
	public void setWar(List<ZhHant> war){ this.war = war; }
	@Nullable
	public List<ZhHant> kl;
	public List<ZhHant> getKl() { return kl; }
	public void setKl(List<ZhHant> kl){ this.kl = kl; }
	@Nullable
	public List<ZhHant> ml;
	public List<ZhHant> getMl() { return ml; }
	public void setMl(List<ZhHant> ml){ this.ml = ml; }
	@Nullable
	public List<ZhHant> lo;
	public List<ZhHant> getLo() { return lo; }
	public void setLo(List<ZhHant> lo){ this.lo = lo; }
	@Nullable
	public List<ZhHant> az;
	public List<ZhHant> getAz() { return az; }
	public void setAz(List<ZhHant> az){ this.az = az; }
	@Nullable
	public List<ZhHant> ka;
	public List<ZhHant> getKa() { return ka; }
	public void setKa(List<ZhHant> ka){ this.ka = ka; }
	@Nullable
	public List<ZhHant> cu;
	public List<ZhHant> getCu() { return cu; }
	public void setCu(List<ZhHant> cu){ this.cu = cu; }
	@SerializedName("zh-my")
	@Nullable
	public List<ZhHant> zhMy;
	public List<ZhHant> getZhMy() { return zhMy; }
	public void setZhMy(List<ZhHant> zhMy){ this.zhMy = zhMy; }
	@Nullable
	public List<ZhHant> gu;
	public List<ZhHant> getGu() { return gu; }
	public void setGu(List<ZhHant> gu){ this.gu = gu; }
	@Nullable
	public List<ZhHant> kw;
	public List<ZhHant> getKw() { return kw; }
	public void setKw(List<ZhHant> kw){ this.kw = kw; }
	@Nullable
	public List<ZhHant> cs;
	public List<ZhHant> getCs() { return cs; }
	public void setCs(List<ZhHant> cs){ this.cs = cs; }
	@Nullable
	public List<ZhHant> ht;
	public List<ZhHant> getHt() { return ht; }
	public void setHt(List<ZhHant> ht){ this.ht = ht; }
	@Nullable
	public List<ZhHant> rup;
	public List<ZhHant> getRup() { return rup; }
	public void setRup(List<ZhHant> rup){ this.rup = rup; }
	@Nullable
	public List<ZhHant> ace;
	public List<ZhHant> getAce() { return ace; }
	public void setAce(List<ZhHant> ace){ this.ace = ace; }
	@Nullable
	public List<ZhHant> krc;
	public List<ZhHant> getKrc() { return krc; }
	public void setKrc(List<ZhHant> krc){ this.krc = krc; }
	@SerializedName("zh-mo")
	@Nullable
	public List<ZhHant> zhMo;
	public List<ZhHant> getZhMo() { return zhMo; }
	public void setZhMo(List<ZhHant> zhMo){ this.zhMo = zhMo; }
	@Nullable
	public List<ZhHant> ny;
	public List<ZhHant> getNy() { return ny; }
	public void setNy(List<ZhHant> ny){ this.ny = ny; }
	@SerializedName("zh-hk")
	@Nullable
	public List<ZhHant> zhHk;
	public List<ZhHant> getZhHk() { return zhHk; }
	public void setZhHk(List<ZhHant> zhHk){ this.zhHk = zhHk; }
	@Nullable
	public List<ZhHant> ln;
	public List<ZhHant> getLn() { return ln; }
	public void setLn(List<ZhHant> ln){ this.ln = ln; }
	@Nullable
	public List<ZhHant> kaa;
	public List<ZhHant> getKaa() { return kaa; }
	public void setKaa(List<ZhHant> kaa){ this.kaa = kaa; }
	@Nullable
	public List<ZhHant> nso;
	public List<ZhHant> getNso() { return nso; }
	public void setNso(List<ZhHant> nso){ this.nso = nso; }
	@Nullable
	public List<ZhHant> ceb;
	public List<ZhHant> getCeb() { return ceb; }
	public void setCeb(List<ZhHant> ceb){ this.ceb = ceb; }
	@Nullable
	public List<ZhHant> nan;
	public List<ZhHant> getNan() { return nan; }
	public void setNan(List<ZhHant> nan){ this.nan = nan; }
	@Nullable
	public List<ZhHant> pam;
	public List<ZhHant> getPam() { return pam; }
	public void setPam(List<ZhHant> pam){ this.pam = pam; }
	@SerializedName("zh-cn")
	@Nullable
	public List<ZhHant> zhCn;
	public List<ZhHant> getZhCn() { return zhCn; }
	public void setZhCn(List<ZhHant> zhCn){ this.zhCn = zhCn; }
	@Nullable
	public List<ZhHant> tn;
	public List<ZhHant> getTn() { return tn; }
	public void setTn(List<ZhHant> tn){ this.tn = tn; }
	@Nullable
	public List<ZhHant> mwl;
	public List<ZhHant> getMwl() { return mwl; }
	public void setMwl(List<ZhHant> mwl){ this.mwl = mwl; }
	@Nullable
	public List<ZhHant> pap;
	public List<ZhHant> getPap() { return pap; }
	public void setPap(List<ZhHant> pap){ this.pap = pap; }
	@Nullable
	public List<ZhHant> szl;
	public List<ZhHant> getSzl() { return szl; }
	public void setSzl(List<ZhHant> szl){ this.szl = szl; }
	@Nullable
	public List<ZhHant> pdc;
	public List<ZhHant> getPdc() { return pdc; }
	public void setPdc(List<ZhHant> pdc){ this.pdc = pdc; }
	@Nullable
	public List<ZhHant> srn;
	public List<ZhHant> getSrn() { return srn; }
	public void setSrn(List<ZhHant> srn){ this.srn = srn; }
	@Nullable
	public List<ZhHant> pa;
	public List<ZhHant> getPa() { return pa; }
	public void setPa(List<ZhHant> pa){ this.pa = pa; }
	@Nullable
	public List<ZhHant> gn;
	public List<ZhHant> getGn() { return gn; }
	public void setGn(List<ZhHant> gn){ this.gn = gn; }
	@Nullable
	public List<ZhHant> nds;
	public List<ZhHant> getNds() { return nds; }
	public void setNds(List<ZhHant> nds){ this.nds = nds; }
	@Nullable
	public List<ZhHant> hsb;
	public List<ZhHant> getHsb() { return hsb; }
	public void setHsb(List<ZhHant> hsb){ this.hsb = hsb; }
	@Nullable
	public List<ZhHant> se;
	public List<ZhHant> getSe() { return se; }
	public void setSe(List<ZhHant> se){ this.se = se; }
	@Nullable
	public List<ZhHant> ko;
	public List<ZhHant> getKo() { return ko; }
	public void setKo(List<ZhHant> ko){ this.ko = ko; }
	@Nullable
	public List<ZhHant> wuu;
	public List<ZhHant> getWuu() { return wuu; }
	public void setWuu(List<ZhHant> wuu){ this.wuu = wuu; }
	@Nullable
	public List<ZhHant> cv;
	public List<ZhHant> getCv() { return cv; }
	public void setCv(List<ZhHant> cv){ this.cv = cv; }
	@Nullable
	public List<ZhHant> chy;
	public List<ZhHant> getChy() { return chy; }
	public void setChy(List<ZhHant> chy){ this.chy = chy; }
	@SerializedName("zh-hans")
	@Nullable
	public List<ZhHant> zhHans;
	public List<ZhHant> getZhHans() { return zhHans; }
	public void setZhHans(List<ZhHant> zhHans){ this.zhHans = zhHans; }
	@SerializedName("de-ch")
	@Nullable
	public List<ZhHant> deCh;
	public List<ZhHant> getDeCh() { return deCh; }
	public void setDeCh(List<ZhHant> deCh){ this.deCh = deCh; }
	@Nullable
	public List<ZhHant> hu;
	public List<ZhHant> getHu() { return hu; }
	public void setHu(List<ZhHant> hu){ this.hu = hu; }
	@Nullable
	public List<ZhHant> gl;
	public List<ZhHant> getGl() { return gl; }
	public void setGl(List<ZhHant> gl){ this.gl = gl; }
	@Nullable
	public List<ZhHant> bn;
	public List<ZhHant> getBn() { return bn; }
	public void setBn(List<ZhHant> bn){ this.bn = bn; }
	@Nullable
	public List<ZhHant> mt;
	public List<ZhHant> getMt() { return mt; }
	public void setMt(List<ZhHant> mt){ this.mt = mt; }
	@Nullable
	public List<ZhHant> ms;
	public List<ZhHant> getMs() { return ms; }
	public void setMs(List<ZhHant> ms){ this.ms = ms; }
	@Nullable
	public List<ZhHant> frp;
	public List<ZhHant> getFrp() { return frp; }
	public void setFrp(List<ZhHant> frp){ this.frp = frp; }
	@Nullable
	public List<ZhHant> hi;
	public List<ZhHant> getHi() { return hi; }
	public void setHi(List<ZhHant> hi){ this.hi = hi; }
	@Nullable
	public List<ZhHant> gd;
	public List<ZhHant> getGd() { return gd; }
	public void setGd(List<ZhHant> gd){ this.gd = gd; }
	@Nullable
	public List<ZhHant> mr;
	public List<ZhHant> getMr() { return mr; }
	public void setMr(List<ZhHant> mr){ this.mr = mr; }
	@SerializedName("nds-nl")
	@Nullable
	public List<ZhHant> ndsNl;
	public List<ZhHant> getNdsNl() { return ndsNl; }
	public void setNdsNl(List<ZhHant> ndsNl){ this.ndsNl = ndsNl; }
	@Nullable
	public List<ZhHant> ha;
	public List<ZhHant> getHa() { return ha; }
	public void setHa(List<ZhHant> ha){ this.ha = ha; }
	@Nullable
	public List<ZhHant> bm;
	public List<ZhHant> getBm() { return bm; }
	public void setBm(List<ZhHant> bm){ this.bm = bm; }
	@Nullable
	public List<ZhHant> frc;
	public List<ZhHant> getFrc() { return frc; }
	public void setFrc(List<ZhHant> frc){ this.frc = frc; }
	@Nullable
	public List<ZhHant> mzn;
	public List<ZhHant> getMzn() { return mzn; }
	public void setMzn(List<ZhHant> mzn){ this.mzn = mzn; }
	@Nullable
	public List<ZhHant> ro;
	public List<ZhHant> getRo() { return ro; }
	public void setRo(List<ZhHant> ro){ this.ro = ro; }
	@Nullable
	public List<ZhHant> zu;
	public List<ZhHant> getZu() { return zu; }
	public void setZu(List<ZhHant> zu){ this.zu = zu; }
	@Nullable
	public List<ZhHant> ee;
	public List<ZhHant> getEe() { return ee; }
	public void setEe(List<ZhHant> ee){ this.ee = ee; }
	@Nullable
	public List<ZhHant> bug;
	public List<ZhHant> getBug() { return bug; }
	public void setBug(List<ZhHant> bug){ this.bug = bug; }
	@Nullable
	public List<ZhHant> dsb;
	public List<ZhHant> getDsb() { return dsb; }
	public void setDsb(List<ZhHant> dsb){ this.dsb = dsb; }
	@Nullable
	public List<ZhHant> ta;
	public List<ZhHant> getTa() { return ta; }
	public void setTa(List<ZhHant> ta){ this.ta = ta; }
	@Nullable
	public List<ZhHant> za;
	public List<ZhHant> getZa() { return za; }
	public void setZa(List<ZhHant> za){ this.za = za; }
	@Nullable
	public List<ZhHant> wa;
	public List<ZhHant> getWa() { return wa; }
	public void setWa(List<ZhHant> wa){ this.wa = wa; }
	@Nullable
	public List<ZhHant> myv;
	public List<ZhHant> getMyv() { return myv; }
	public void setMyv(List<ZhHant> myv){ this.myv = myv; }
	@Nullable
	public List<ZhHant> pl;
	public List<ZhHant> getPl() { return pl; }
	public void setPl(List<ZhHant> pl){ this.pl = pl; }
	@Nullable
	public List<ZhHant> hy;
	public List<ZhHant> getHy() { return hy; }
	public void setHy(List<ZhHant> hy){ this.hy = hy; }
	@Nullable
	public List<ZhHant> lad;
	public List<ZhHant> getLad() { return lad; }
	public void setLad(List<ZhHant> lad){ this.lad = lad; }
	@Nullable
	public List<ZhHant> lzh;
	public List<ZhHant> getLzh() { return lzh; }
	public void setLzh(List<ZhHant> lzh){ this.lzh = lzh; }
	@Nullable
	public List<ZhHant> nov;
	public List<ZhHant> getNov() { return nov; }
	public void setNov(List<ZhHant> nov){ this.nov = nov; }
	@Nullable
	public List<ZhHant> an;
	public List<ZhHant> getAn() { return an; }
	public void setAn(List<ZhHant> an){ this.an = an; }
	@Nullable
	public List<ZhHant> is;
	public List<ZhHant> getIs() { return is; }
	public void setIs(List<ZhHant> is){ this.is = is; }
	@Nullable
	public List<ZhHant> cy;
	public List<ZhHant> getCy() { return cy; }
	public void setCy(List<ZhHant> cy){ this.cy = cy; }
	@SerializedName("kk-latn")
	@Nullable
	public List<ZhHant> kkLatn;
	public List<ZhHant> getKkLatn() { return kkLatn; }
	public void setKkLatn(List<ZhHant> kkLatn){ this.kkLatn = kkLatn; }
	@Nullable
	public List<ZhHant> ab;
	public List<ZhHant> getAb() { return ab; }
	public void setAb(List<ZhHant> ab){ this.ab = ab; }
	@Nullable
	public List<ZhHant> stq;
	public List<ZhHant> getStq() { return stq; }
	public void setStq(List<ZhHant> stq){ this.stq = stq; }
	@Nullable
	public List<ZhHant> ia;
	public List<ZhHant> getIa() { return ia; }
	public void setIa(List<ZhHant> ia){ this.ia = ia; }
	@Nullable
	public List<ZhHant> udm;
	public List<ZhHant> getUdm() { return udm; }
	public void setUdm(List<ZhHant> udm){ this.udm = udm; }
	@Nullable
	public List<ZhHant> tk;
	public List<ZhHant> getTk() { return tk; }
	public void setTk(List<ZhHant> tk){ this.tk = tk; }
	@Nullable
	public List<ZhHant> mn;
	public List<ZhHant> getMn() { return mn; }
	public void setMn(List<ZhHant> mn){ this.mn = mn; }
	@Nullable
	public List<ZhHant> kk;
	public List<ZhHant> getKk() { return kk; }
	public void setKk(List<ZhHant> kk){ this.kk = kk; }
	@Nullable
	public List<ZhHant> vro;
	public List<ZhHant> getVro() { return vro; }
	public void setVro(List<ZhHant> vro){ this.vro = vro; }
	@Nullable
	public List<ZhHant> sma;
	public List<ZhHant> getSma() { return sma; }
	public void setSma(List<ZhHant> sma){ this.sma = sma; }
	@Nullable
	public List<ZhHant> su;
	public List<ZhHant> getSu() { return su; }
	public void setSu(List<ZhHant> su){ this.su = su; }
	@Nullable
	public List<ZhHant> ps;
	public List<ZhHant> getPs() { return ps; }
	public void setPs(List<ZhHant> ps){ this.ps = ps; }
	@Nullable
	public List<ZhHant> qu;
	public List<ZhHant> getQu() { return qu; }
	public void setQu(List<ZhHant> qu){ this.qu = qu; }
	@Nullable
	public List<ZhHant> lmo;
	public List<ZhHant> getLmo() { return lmo; }
	public void setLmo(List<ZhHant> lmo){ this.lmo = lmo; }
	@Nullable
	public List<ZhHant> or;
	public List<ZhHant> getOr() { return or; }
	public void setOr(List<ZhHant> or){ this.or = or; }
	@Nullable
	public List<ZhHant> bs;
	public List<ZhHant> getBs() { return bs; }
	public void setBs(List<ZhHant> bs){ this.bs = bs; }
	@Nullable
	public List<ZhHant> io;
	public List<ZhHant> getIo() { return io; }
	public void setIo(List<ZhHant> io){ this.io = io; }
	@Nullable
	public List<ZhHant> pt;
	public List<ZhHant> getPt() { return pt; }
	public void setPt(List<ZhHant> pt){ this.pt = pt; }
	@Nullable
	public List<ZhHant> rmy;
	public List<ZhHant> getRmy() { return rmy; }
	public void setRmy(List<ZhHant> rmy){ this.rmy = rmy; }
	@Nullable
	public List<ZhHant> nn;
	public List<ZhHant> getNn() { return nn; }
	public void setNn(List<ZhHant> nn){ this.nn = nn; }
	@Nullable
	public List<ZhHant> ts;
	public List<ZhHant> getTs() { return ts; }
	public void setTs(List<ZhHant> ts){ this.ts = ts; }
	@Nullable
	public List<ZhHant> lt;
	public List<ZhHant> getLt() { return lt; }
	public void setLt(List<ZhHant> lt){ this.lt = lt; }
	@SerializedName("sr-el")
	@Nullable
	public List<ZhHant> srEl;
	public List<ZhHant> getSrEl() { return srEl; }
	public void setSrEl(List<ZhHant> srEl){ this.srEl = srEl; }
	@Nullable
	public List<ZhHant> nap;
	public List<ZhHant> getNap() { return nap; }
	public void setNap(List<ZhHant> nap){ this.nap = nap; }
	@Nullable
	public List<ZhHant> tg;
	public List<ZhHant> getTg() { return tg; }
	public void setTg(List<ZhHant> tg){ this.tg = tg; }
	@Nullable
	public List<ZhHant> xmf;
	public List<ZhHant> getXmf() { return xmf; }
	public void setXmf(List<ZhHant> xmf){ this.xmf = xmf; }
	@Nullable
	public List<ZhHant> fr;
	public List<ZhHant> getFr() { return fr; }
	public void setFr(List<ZhHant> fr){ this.fr = fr; }
	@Nullable
	public List<ZhHant> sn;
	public List<ZhHant> getSn() { return sn; }
	public void setSn(List<ZhHant> sn){ this.sn = sn; }
	@SerializedName("cbk-zam")
	@Nullable
	public List<ZhHant> cbkZam;
	public List<ZhHant> getCbkZam() { return cbkZam; }
	public void setCbkZam(List<ZhHant> cbkZam){ this.cbkZam = cbkZam; }
	@Nullable
	public List<ZhHant> dv;
	public List<ZhHant> getDv() { return dv; }
	public void setDv(List<ZhHant> dv){ this.dv = dv; }
	@Nullable
	public List<ZhHant> mk;
	public List<ZhHant> getMk() { return mk; }
	public void setMk(List<ZhHant> mk){ this.mk = mk; }
	@Nullable
	public List<ZhHant> ilo;
	public List<ZhHant> getIlo() { return ilo; }
	public void setIlo(List<ZhHant> ilo){ this.ilo = ilo; }
	@Nullable
	public List<ZhHant> so;
	public List<ZhHant> getSo() { return so; }
	public void setSo(List<ZhHant> so){ this.so = so; }
	@Nullable
	public List<ZhHant> om;
	public List<ZhHant> getOm() { return om; }
	public void setOm(List<ZhHant> om){ this.om = om; }
	@Nullable
	public List<ZhHant> wo;
	public List<ZhHant> getWo() { return wo; }
	public void setWo(List<ZhHant> wo){ this.wo = wo; }
	@Nullable
	public List<ZhHant> ty;
	public List<ZhHant> getTy() { return ty; }
	public void setTy(List<ZhHant> ty){ this.ty = ty; }
	@Nullable
	public List<ZhHant> fa;
	public List<ZhHant> getFa() { return fa; }
	public void setFa(List<ZhHant> fa){ this.fa = fa; }
	@Nullable
	public List<ZhHant> ku;
	public List<ZhHant> getKu() { return ku; }
	public void setKu(List<ZhHant> ku){ this.ku = ku; }
	@SerializedName("zh-sg")
	@Nullable
	public List<ZhHant> zhSg;
	public List<ZhHant> getZhSg() { return zhSg; }
	public void setZhSg(List<ZhHant> zhSg){ this.zhSg = zhSg; }
	@SerializedName("kk-tr")
	@Nullable
	public List<ZhHant> kkTr;
	public List<ZhHant> getKkTr() { return kkTr; }
	public void setKkTr(List<ZhHant> kkTr){ this.kkTr = kkTr; }
	@Nullable
	public List<ZhHant> cr;
	public List<ZhHant> getCr() { return cr; }
	public void setCr(List<ZhHant> cr){ this.cr = cr; }
	@Nullable
	public List<ZhHant> fur;
	public List<ZhHant> getFur() { return fur; }
	public void setFur(List<ZhHant> fur){ this.fur = fur; }
	@Nullable
	public List<ZhHant> nrm;
	public List<ZhHant> getNrm() { return nrm; }
	public void setNrm(List<ZhHant> nrm){ this.nrm = nrm; }
	@Nullable
	public List<ZhHant> am;
	public List<ZhHant> getAm() { return am; }
	public void setAm(List<ZhHant> am){ this.am = am; }
	@Nullable
	public List<ZhHant> bi;
	public List<ZhHant> getBi() { return bi; }
	public void setBi(List<ZhHant> bi){ this.bi = bi; }
	@Nullable
	public List<ZhHant> sah;
	public List<ZhHant> getSah() { return sah; }
	public void setSah(List<ZhHant> sah){ this.sah = sah; }
	@Nullable
	public List<ZhHant> ca;
	public List<ZhHant> getCa() { return ca; }
	public void setCa(List<ZhHant> ca){ this.ca = ca; }
	@Nullable
	public List<ZhHant> got;
	public List<ZhHant> getGot() { return got; }
	public void setGot(List<ZhHant> got){ this.got = got; }
	@Nullable
	public List<ZhHant> eu;
	public List<ZhHant> getEu() { return eu; }
	public void setEu(List<ZhHant> eu){ this.eu = eu; }
	@Nullable
	public List<ZhHant> nah;
	public List<ZhHant> getNah() { return nah; }
	public void setNah(List<ZhHant> nah){ this.nah = nah; }
	@Nullable
	public List<ZhHant> et;
	public List<ZhHant> getEt() { return et; }
	public void setEt(List<ZhHant> et){ this.et = et; }
	@Nullable
	public List<ZhHant> scn;
	public List<ZhHant> getScn() { return scn; }
	public void setScn(List<ZhHant> scn){ this.scn = scn; }
	@Nullable
	public List<ZhHant> vmf;
	public List<ZhHant> getVmf() { return vmf; }
	public void setVmf(List<ZhHant> vmf){ this.vmf = vmf; }
	@Nullable
	public List<ZhHant> ja;
	public List<ZhHant> getJa() { return ja; }
	public void setJa(List<ZhHant> ja){ this.ja = ja; }
	@Nullable
	public List<ZhHant> hif;
	public List<ZhHant> getHif() { return hif; }
	public void setHif(List<ZhHant> hif){ this.hif = hif; }
	@Nullable
	public List<ZhHant> gv;
	public List<ZhHant> getGv() { return gv; }
	public void setGv(List<ZhHant> gv){ this.gv = gv; }
	@Nullable
	public List<ZhHant> ce;
	public List<ZhHant> getCe() { return ce; }
	public void setCe(List<ZhHant> ce){ this.ce = ce; }
	@Nullable
	public List<ZhHant> yo;
	public List<ZhHant> getYo() { return yo; }
	public void setYo(List<ZhHant> yo){ this.yo = yo; }
	@Nullable
	public List<ZhHant> csb;
	public List<ZhHant> getCsb() { return csb; }
	public void setCsb(List<ZhHant> csb){ this.csb = csb; }
	@Nullable
	public List<ZhHant> kv;
	public List<ZhHant> getKv() { return kv; }
	public void setKv(List<ZhHant> kv){ this.kv = kv; }
	@SerializedName("pt-br")
	@Nullable
	public List<ZhHant> ptBr;
	public List<ZhHant> getPtBr() { return ptBr; }
	public void setPtBr(List<ZhHant> ptBr){ this.ptBr = ptBr; }
	@Nullable
	public List<ZhHant> mdf;
	public List<ZhHant> getMdf() { return mdf; }
	public void setMdf(List<ZhHant> mdf){ this.mdf = mdf; }
	@Nullable
	public List<ZhHant> ang;
	public List<ZhHant> getAng() { return ang; }
	public void setAng(List<ZhHant> ang){ this.ang = ang; }
	@SerializedName("ku-latn")
	@Nullable
	public List<ZhHant> kuLatn;
	public List<ZhHant> getKuLatn() { return kuLatn; }
	public void setKuLatn(List<ZhHant> kuLatn){ this.kuLatn = kuLatn; }
	@Nullable
	public List<ZhHant> ckb;
	public List<ZhHant> getCkb() { return ckb; }
	public void setCkb(List<ZhHant> ckb){ this.ckb = ckb; }
	@Nullable
	public List<ZhHant> en;
	public List<ZhHant> getEn() { return en; }
	public void setEn(List<ZhHant> en){ this.en = en; }
	@Nullable
	public List<ZhHant> sgs;
	public List<ZhHant> getSgs() { return sgs; }
	public void setSgs(List<ZhHant> sgs){ this.sgs = sgs; }
	@Nullable
	public List<ZhHant> lez;
	public List<ZhHant> getLez() { return lez; }
	public void setLez(List<ZhHant> lez){ this.lez = lez; }
	@SerializedName("roa-tara")
	@Nullable
	public List<ZhHant> roaTara;
	public List<ZhHant> getRoaTara() { return roaTara; }
	public void setRoaTara(List<ZhHant> roaTara){ this.roaTara = roaTara; }
	@Nullable
	public List<ZhHant> br;
	public List<ZhHant> getBr() { return br; }
	public void setBr(List<ZhHant> br){ this.br = br; }
	@Nullable
	public List<ZhHant> lb;
	public List<ZhHant> getLb() { return lb; }
	public void setLb(List<ZhHant> lb){ this.lb = lb; }
	@Nullable
	public List<ZhHant> koi;
	public List<ZhHant> getKoi() { return koi; }
	public void setKoi(List<ZhHant> koi){ this.koi = koi; }
	@Nullable
	public List<ZhHant> uk;
	public List<ZhHant> getUk() { return uk; }
	public void setUk(List<ZhHant> uk){ this.uk = uk; }
	@Nullable
	public List<ZhHant> eo;
	public List<ZhHant> getEo() { return eo; }
	public void setEo(List<ZhHant> eo){ this.eo = eo; }
	@Nullable
	public List<ZhHant> eml;
	public List<ZhHant> getEml() { return eml; }
	public void setEml(List<ZhHant> eml){ this.eml = eml; }
	@Nullable
	public List<ZhHant> os;
	public List<ZhHant> getOs() { return os; }
	public void setOs(List<ZhHant> os){ this.os = os; }
	@Nullable
	public List<ZhHant> bcl;
	public List<ZhHant> getBcl() { return bcl; }
	public void setBcl(List<ZhHant> bcl){ this.bcl = bcl; }
	@Nullable
	public List<ZhHant> pfl;
	public List<ZhHant> getPfl() { return pfl; }
	public void setPfl(List<ZhHant> pfl){ this.pfl = pfl; }
	@Nullable
	public List<ZhHant> lfn;
	public List<ZhHant> getLfn() { return lfn; }
	public void setLfn(List<ZhHant> lfn){ this.lfn = lfn; }
	@Nullable
	public List<ZhHant> min;
	public List<ZhHant> getMin() { return min; }
	public void setMin(List<ZhHant> min){ this.min = min; }
	@Nullable
	public List<ZhHant> te;
	public List<ZhHant> getTe() { return te; }
	public void setTe(List<ZhHant> te){ this.te = te; }
	@Nullable
	public List<ZhHant> km;
	public List<ZhHant> getKm() { return km; }
	public void setKm(List<ZhHant> km){ this.km = km; }
	@Nullable
	public List<ZhHant> to;
	public List<ZhHant> getTo() { return to; }
	public void setTo(List<ZhHant> to){ this.to = to; }
	@Nullable
	public List<ZhHant> dz;
	public List<ZhHant> getDz() { return dz; }
	public void setDz(List<ZhHant> dz){ this.dz = dz; }
	@Nullable
	public List<ZhHant> pnt;
	public List<ZhHant> getPnt() { return pnt; }
	public void setPnt(List<ZhHant> pnt){ this.pnt = pnt; }
	@Nullable
	public List<ZhHant> chr;
	public List<ZhHant> getChr() { return chr; }
	public void setChr(List<ZhHant> chr){ this.chr = chr; }
	@Nullable
	public List<ZhHant> it;
	public List<ZhHant> getIt() { return it; }
	public void setIt(List<ZhHant> it){ this.it = it; }
	@Nullable
	public List<ZhHant> bxr;
	public List<ZhHant> getBxr() { return bxr; }
	public void setBxr(List<ZhHant> bxr){ this.bxr = bxr; }
	@Nullable
	public List<ZhHant> vls;
	public List<ZhHant> getVls() { return vls; }
	public void setVls(List<ZhHant> vls){ this.vls = vls; }
	@Nullable
	public List<ZhHant> ik;
	public List<ZhHant> getIk() { return ik; }
	public void setIk(List<ZhHant> ik){ this.ik = ik; }
	@Nullable
	public List<ZhHant> frr;
	public List<ZhHant> getFrr() { return frr; }
	public void setFrr(List<ZhHant> frr){ this.frr = frr; }
	@Nullable
	public List<ZhHant> bg;
	public List<ZhHant> getBg() { return bg; }
	public void setBg(List<ZhHant> bg){ this.bg = bg; }
	@SerializedName("map-bms")
	@Nullable
	public List<ZhHant> mapBms;
	public List<ZhHant> getMapBms() { return mapBms; }
	public void setMapBms(List<ZhHant> mapBms){ this.mapBms = mapBms; }
	@Nullable
	public List<ZhHant> zh;
	public List<ZhHant> getZh() { return zh; }
	public void setZh(List<ZhHant> zh){ this.zh = zh; }
	@Nullable
	public List<ZhHant> he;
	public List<ZhHant> getHe() { return he; }
	public void setHe(List<ZhHant> he){ this.he = he; }
	@Nullable
	public List<ZhHant> jbo;
	public List<ZhHant> getJbo() { return jbo; }
	public void setJbo(List<ZhHant> jbo){ this.jbo = jbo; }
	@Nullable
	public List<ZhHant> da;
	public List<ZhHant> getDa() { return da; }
	public void setDa(List<ZhHant> da){ this.da = da; }
	@Nullable
	public List<ZhHant> sei;
	public List<ZhHant> getSei() { return sei; }
	public void setSei(List<ZhHant> sei){ this.sei = sei; }
	@Nullable
	public List<ZhHant> ba;
	public List<ZhHant> getBa() { return ba; }
	public void setBa(List<ZhHant> ba){ this.ba = ba; }
	@Nullable
	public List<ZhHant> shi;
	public List<ZhHant> getShi() { return shi; }
	public void setShi(List<ZhHant> shi){ this.shi = shi; }
	@Nullable
	public List<ZhHant> iu;
	public List<ZhHant> getIu() { return iu; }
	public void setIu(List<ZhHant> iu){ this.iu = iu; }
	@SerializedName("de-formal")
	@Nullable
	public List<ZhHant> deFormal;
	public List<ZhHant> getDeFormal() { return deFormal; }
	public void setDeFormal(List<ZhHant> deFormal){ this.deFormal = deFormal; }
	@Nullable
	public List<ZhHant> sk;
	public List<ZhHant> getSk() { return sk; }
	public void setSk(List<ZhHant> sk){ this.sk = sk; }
	@Nullable
	public List<ZhHant> sw;
	public List<ZhHant> getSw() { return sw; }
	public void setSw(List<ZhHant> sw){ this.sw = sw; }
	@Nullable
	public List<ZhHant> fo;
	public List<ZhHant> getFo() { return fo; }
	public void setFo(List<ZhHant> fo){ this.fo = fo; }
	@Nullable
	public List<ZhHant> ff;
	public List<ZhHant> getFf() { return ff; }
	public void setFf(List<ZhHant> ff){ this.ff = ff; }
	@Nullable
	public List<ZhHant> ru;
	public List<ZhHant> getRu() { return ru; }
	public void setRu(List<ZhHant> ru){ this.ru = ru; }
	@Nullable
	public List<ZhHant> si;
	public List<ZhHant> getSi() { return si; }
	public void setSi(List<ZhHant> si){ this.si = si; }
	@Nullable
	public List<ZhHant> rm;
	public List<ZhHant> getRm() { return rm; }
	public void setRm(List<ZhHant> rm){ this.rm = rm; }
	@SerializedName("sr-ec")
	@Nullable
	public List<ZhHant> srEc;
	public List<ZhHant> getSrEc() { return srEc; }
	public void setSrEc(List<ZhHant> srEc){ this.srEc = srEc; }
	@Nullable
	public List<ZhHant> jv;
	public List<ZhHant> getJv() { return jv; }
	public void setJv(List<ZhHant> jv){ this.jv = jv; }
	}
	public static class Descriptions {
	@Nullable
	public ZhHant yi;
	public ZhHant getYi() { return yi; }
	public void setYi(ZhHant yi){ this.yi = yi; }
	@Nullable
	public ZhHant ne;
	public ZhHant getNe() { return ne; }
	public void setNe(ZhHant ne){ this.ne = ne; }
	@Nullable
	public ZhHant kn;
	public ZhHant getKn() { return kn; }
	public void setKn(ZhHant kn){ this.kn = kn; }
	@Nullable
	public ZhHant rif;
	public ZhHant getRif() { return rif; }
	public void setRif(ZhHant rif){ this.rif = rif; }
	@Nullable
	public ZhHant es;
	public ZhHant getEs() { return es; }
	public void setEs(ZhHant es){ this.es = es; }
	@Nullable
	public ZhHant haw;
	public ZhHant getHaw() { return haw; }
	public void setHaw(ZhHant haw){ this.haw = haw; }
	@Nullable
	public ZhHant nl;
	public ZhHant getNl() { return nl; }
	public void setNl(ZhHant nl){ this.nl = nl; }
	@Nullable
	public ZhHant ext;
	public ZhHant getExt() { return ext; }
	public void setExt(ZhHant ext){ this.ext = ext; }
	@Nullable
	public ZhHant as;
	public ZhHant getAs() { return as; }
	public void setAs(ZhHant as){ this.as = as; }
	@Nullable
	public ZhHant mg;
	public ZhHant getMg() { return mg; }
	public void setMg(ZhHant mg){ this.mg = mg; }
	@Nullable
	public ZhHant mi;
	public ZhHant getMi() { return mi; }
	public void setMi(ZhHant mi){ this.mi = mi; }
	@Nullable
	public ZhHant sr;
	public ZhHant getSr() { return sr; }
	public void setSr(ZhHant sr){ this.sr = sr; }
	@Nullable
	public ZhHant bcc;
	public ZhHant getBcc() { return bcc; }
	public void setBcc(ZhHant bcc){ this.bcc = bcc; }
	@Nullable
	public ZhHant lg;
	public ZhHant getLg() { return lg; }
	public void setLg(ZhHant lg){ this.lg = lg; }
	@Nullable
	public ZhHant arc;
	public ZhHant getArc() { return arc; }
	public void setArc(ZhHant arc){ this.arc = arc; }
	@Nullable
	public ZhHant ky;
	public ZhHant getKy() { return ky; }
	public void setKy(ZhHant ky){ this.ky = ky; }
	@Nullable
	public ZhHant la;
	public ZhHant getLa() { return la; }
	public void setLa(ZhHant la){ this.la = la; }
	@SerializedName("kk-cyrl")
	@Nullable
	public ZhHant kkCyrl;
	public ZhHant getKkCyrl() { return kkCyrl; }
	public void setKkCyrl(ZhHant kkCyrl){ this.kkCyrl = kkCyrl; }
	@Nullable
	public ZhHant ak;
	public ZhHant getAk() { return ak; }
	public void setAk(ZhHant ak){ this.ak = ak; }
	@Nullable
	public ZhHant xh;
	public ZhHant getXh() { return xh; }
	public void setXh(ZhHant xh){ this.xh = xh; }
	@Nullable
	public ZhHant hr;
	public ZhHant getHr() { return hr; }
	public void setHr(ZhHant hr){ this.hr = hr; }
	@Nullable
	public ZhHant pms;
	public ZhHant getPms() { return pms; }
	public void setPms(ZhHant pms){ this.pms = pms; }
	@Nullable
	public ZhHant vep;
	public ZhHant getVep() { return vep; }
	public void setVep(ZhHant vep){ this.vep = vep; }
	@SerializedName("tg-latn")
	@Nullable
	public ZhHant tgLatn;
	public ZhHant getTgLatn() { return tgLatn; }
	public void setTgLatn(ZhHant tgLatn){ this.tgLatn = tgLatn; }
	@Nullable
	public ZhHant sco;
	public ZhHant getSco() { return sco; }
	public void setSco(ZhHant sco){ this.sco = sco; }
	@Nullable
	public ZhHant ur;
	public ZhHant getUr() { return ur; }
	public void setUr(ZhHant ur){ this.ur = ur; }
	@Nullable
	public ZhHant sl;
	public ZhHant getSl() { return sl; }
	public void setSl(ZhHant sl){ this.sl = sl; }
	@SerializedName("de-at")
	@Nullable
	public ZhHant deAt;
	public ZhHant getDeAt() { return deAt; }
	public void setDeAt(ZhHant deAt){ this.deAt = deAt; }
	@SerializedName("tg-cyrl")
	@Nullable
	public ZhHant tgCyrl;
	public ZhHant getTgCyrl() { return tgCyrl; }
	public void setTgCyrl(ZhHant tgCyrl){ this.tgCyrl = tgCyrl; }
	@Nullable
	public ZhHant fi;
	public ZhHant getFi() { return fi; }
	public void setFi(ZhHant fi){ this.fi = fi; }
	@Nullable
	public ZhHant fit;
	public ZhHant getFit() { return fit; }
	public void setFit(ZhHant fit){ this.fit = fit; }
	@Nullable
	public ZhHant sg;
	public ZhHant getSg() { return sg; }
	public void setSg(ZhHant sg){ this.sg = sg; }
	@Nullable
	public ZhHant el;
	public ZhHant getEl() { return el; }
	public void setEl(ZhHant el){ this.el = el; }
	@Nullable
	public ZhHant av;
	public ZhHant getAv() { return av; }
	public void setAv(ZhHant av){ this.av = av; }
	@SerializedName("new")
	@Nullable
	public ZhHant nuw;
	public ZhHant getNuw() { return nuw; }
	public void setNuw(ZhHant nuw){ this.nuw = nuw; }
	@Nullable
	public ZhHant cdo;
	public ZhHant getCdo() { return cdo; }
	public void setCdo(ZhHant cdo){ this.cdo = cdo; }
	@Nullable
	public ZhHant gan;
	public ZhHant getGan() { return gan; }
	public void setGan(ZhHant gan){ this.gan = gan; }
	@Nullable
	public ZhHant li;
	public ZhHant getLi() { return li; }
	public void setLi(ZhHant li){ this.li = li; }
	@Nullable
	public ZhHant pnb;
	public ZhHant getPnb() { return pnb; }
	public void setPnb(ZhHant pnb){ this.pnb = pnb; }
	@Nullable
	public ZhHant tpi;
	public ZhHant getTpi() { return tpi; }
	public void setTpi(ZhHant tpi){ this.tpi = tpi; }
	@Nullable
	public ZhHant th;
	public ZhHant getTh() { return th; }
	public void setTh(ZhHant th){ this.th = th; }
	@Nullable
	public ZhHant sa;
	public ZhHant getSa() { return sa; }
	public void setSa(ZhHant sa){ this.sa = sa; }
	@Nullable
	public ZhHant kbd;
	public ZhHant getKbd() { return kbd; }
	public void setKbd(ZhHant kbd){ this.kbd = kbd; }
	@Nullable
	public ZhHant sc;
	public ZhHant getSc() { return sc; }
	public void setSc(ZhHant sc){ this.sc = sc; }
	@Nullable
	public ZhHant aln;
	public ZhHant getAln() { return aln; }
	public void setAln(ZhHant aln){ this.aln = aln; }
	@Nullable
	public ZhHant bh;
	public ZhHant getBh() { return bh; }
	public void setBh(ZhHant bh){ this.bh = bh; }
	@Nullable
	public ZhHant co;
	public ZhHant getCo() { return co; }
	public void setCo(ZhHant co){ this.co = co; }
	@Nullable
	public ZhHant be;
	public ZhHant getBe() { return be; }
	public void setBe(ZhHant be){ this.be = be; }
	@Nullable
	public ZhHant tw;
	public ZhHant getTw() { return tw; }
	public void setTw(ZhHant tw){ this.tw = tw; }
	@Nullable
	public ZhHant pi;
	public ZhHant getPi() { return pi; }
	public void setPi(ZhHant pi){ this.pi = pi; }
	@Nullable
	public ZhHant lij;
	public ZhHant getLij() { return lij; }
	public void setLij(ZhHant lij){ this.lij = lij; }
	@Nullable
	public ZhHant tr;
	public ZhHant getTr() { return tr; }
	public void setTr(ZhHant tr){ this.tr = tr; }
	@Nullable
	public ZhHant pag;
	public ZhHant getPag() { return pag; }
	public void setPag(ZhHant pag){ this.pag = pag; }
	@SerializedName("zh-hant")
	@Nullable
	public ZhHant zhHant;
	public ZhHant getZhHant() { return zhHant; }
	public void setZhHant(ZhHant zhHant){ this.zhHant = zhHant; }
	@Nullable
	public ZhHant zea;
	public ZhHant getZea() { return zea; }
	public void setZea(ZhHant zea){ this.zea = zea; }
	@Nullable
	public ZhHant glk;
	public ZhHant getGlk() { return glk; }
	public void setGlk(ZhHant glk){ this.glk = glk; }
	@Nullable
	public ZhHant yue;
	public ZhHant getYue() { return yue; }
	public void setYue(ZhHant yue){ this.yue = yue; }
	@Nullable
	public ZhHant ksh;
	public ZhHant getKsh() { return ksh; }
	public void setKsh(ZhHant ksh){ this.ksh = ksh; }
	@Nullable
	public ZhHant arz;
	public ZhHant getArz() { return arz; }
	public void setArz(ZhHant arz){ this.arz = arz; }
	@Nullable
	public ZhHant af;
	public ZhHant getAf() { return af; }
	public void setAf(ZhHant af){ this.af = af; }
	@Nullable
	public ZhHant ar;
	public ZhHant getAr() { return ar; }
	public void setAr(ZhHant ar){ this.ar = ar; }
	@Nullable
	public ZhHant bo;
	public ZhHant getBo() { return bo; }
	public void setBo(ZhHant bo){ this.bo = bo; }
	@Nullable
	public ZhHant sd;
	public ZhHant getSd() { return sd; }
	public void setSd(ZhHant sd){ this.sd = sd; }
	@Nullable
	public ZhHant vi;
	public ZhHant getVi() { return vi; }
	public void setVi(ZhHant vi){ this.vi = vi; }
	@SerializedName("be-tarask")
	@Nullable
	public ZhHant beTarask;
	public ZhHant getBeTarask() { return beTarask; }
	public void setBeTarask(ZhHant beTarask){ this.beTarask = beTarask; }
	@Nullable
	public ZhHant kab;
	public ZhHant getKab() { return kab; }
	public void setKab(ZhHant kab){ this.kab = kab; }
	@Nullable
	public ZhHant vec;
	public ZhHant getVec() { return vec; }
	public void setVec(ZhHant vec){ this.vec = vec; }
	@Nullable
	public ZhHant ti;
	public ZhHant getTi() { return ti; }
	public void setTi(ZhHant ti){ this.ti = ti; }
	@Nullable
	public ZhHant gag;
	public ZhHant getGag() { return gag; }
	public void setGag(ZhHant gag){ this.gag = gag; }
	@Nullable
	public ZhHant tt;
	public ZhHant getTt() { return tt; }
	public void setTt(ZhHant tt){ this.tt = tt; }
	@Nullable
	public ZhHant tokipona;
	public ZhHant getTokipona() { return tokipona; }
	public void setTokipona(ZhHant tokipona){ this.tokipona = tokipona; }
	@SerializedName("tt-latn")
	@Nullable
	public ZhHant ttLatn;
	public ZhHant getTtLatn() { return ttLatn; }
	public void setTtLatn(ZhHant ttLatn){ this.ttLatn = ttLatn; }
	@SerializedName("en-ca")
	@Nullable
	public ZhHant enCa;
	public ZhHant getEnCa() { return enCa; }
	public void setEnCa(ZhHant enCa){ this.enCa = enCa; }
	@Nullable
	public ZhHant id;
	public ZhHant getId() { return id; }
	public void setId(ZhHant id){ this.id = id; }
	@Nullable
	public ZhHant ie;
	public ZhHant getIe() { return ie; }
	public void setIe(ZhHant ie){ this.ie = ie; }
	@Nullable
	public ZhHant de;
	public ZhHant getDe() { return de; }
	public void setDe(ZhHant de){ this.de = de; }
	@SerializedName("zh-tw")
	@Nullable
	public ZhHant zhTw;
	public ZhHant getZhTw() { return zhTw; }
	public void setZhTw(ZhHant zhTw){ this.zhTw = zhTw; }
	@Nullable
	public ZhHant ug;
	public ZhHant getUg() { return ug; }
	public void setUg(ZhHant ug){ this.ug = ug; }
	@Nullable
	public ZhHant oc;
	public ZhHant getOc() { return oc; }
	public void setOc(ZhHant oc){ this.oc = oc; }
	@Nullable
	public ZhHant sh;
	public ZhHant getSh() { return sh; }
	public void setSh(ZhHant sh){ this.sh = sh; }
	@Nullable
	public ZhHant no;
	public ZhHant getNo() { return no; }
	public void setNo(ZhHant no){ this.no = no; }
	@Nullable
	public ZhHant ast;
	public ZhHant getAst() { return ast; }
	public void setAst(ZhHant ast){ this.ast = ast; }
	@Nullable
	public ZhHant vo;
	public ZhHant getVo() { return vo; }
	public void setVo(ZhHant vo){ this.vo = vo; }
	@Nullable
	public ZhHant aeb;
	public ZhHant getAeb() { return aeb; }
	public void setAeb(ZhHant aeb){ this.aeb = aeb; }
	@Nullable
	public ZhHant rue;
	public ZhHant getRue() { return rue; }
	public void setRue(ZhHant rue){ this.rue = rue; }
	@SerializedName("crh-latn")
	@Nullable
	public ZhHant crhLatn;
	public ZhHant getCrhLatn() { return crhLatn; }
	public void setCrhLatn(ZhHant crhLatn){ this.crhLatn = crhLatn; }
	@Nullable
	public ZhHant ay;
	public ZhHant getAy() { return ay; }
	public void setAy(ZhHant ay){ this.ay = ay; }
	@Nullable
	public ZhHant pcd;
	public ZhHant getPcd() { return pcd; }
	public void setPcd(ZhHant pcd){ this.pcd = pcd; }
	@Nullable
	public ZhHant nb;
	public ZhHant getNb() { return nb; }
	public void setNb(ZhHant nb){ this.nb = nb; }
	@Nullable
	public ZhHant mhr;
	public ZhHant getMhr() { return mhr; }
	public void setMhr(ZhHant mhr){ this.mhr = mhr; }
	@Nullable
	public ZhHant my;
	public ZhHant getMy() { return my; }
	public void setMy(ZhHant my){ this.my = my; }
	@Nullable
	public ZhHant ks;
	public ZhHant getKs() { return ks; }
	public void setKs(ZhHant ks){ this.ks = ks; }
	@Nullable
	public ZhHant sq;
	public ZhHant getSq() { return sq; }
	public void setSq(ZhHant sq){ this.sq = sq; }
	@Nullable
	public ZhHant xal;
	public ZhHant getXal() { return xal; }
	public void setXal(ZhHant xal){ this.xal = xal; }
	@Nullable
	public ZhHant tet;
	public ZhHant getTet() { return tet; }
	public void setTet(ZhHant tet){ this.tet = tet; }
	@Nullable
	public ZhHant sv;
	public ZhHant getSv() { return sv; }
	public void setSv(ZhHant sv){ this.sv = sv; }
	@SerializedName("kk-kz")
	@Nullable
	public ZhHant kkKz;
	public ZhHant getKkKz() { return kkKz; }
	public void setKkKz(ZhHant kkKz){ this.kkKz = kkKz; }
	@Nullable
	public ZhHant uz;
	public ZhHant getUz() { return uz; }
	public void setUz(ZhHant uz){ this.uz = uz; }
	@Nullable
	public ZhHant hak;
	public ZhHant getHak() { return hak; }
	public void setHak(ZhHant hak){ this.hak = hak; }
	@Nullable
	public ZhHant ga;
	public ZhHant getGa() { return ga; }
	public void setGa(ZhHant ga){ this.ga = ga; }
	@Nullable
	public ZhHant lv;
	public ZhHant getLv() { return lv; }
	public void setLv(ZhHant lv){ this.lv = lv; }
	@Nullable
	public ZhHant fj;
	public ZhHant getFj() { return fj; }
	public void setFj(ZhHant fj){ this.fj = fj; }
	@SerializedName("en-gb")
	@Nullable
	public ZhHant enGb;
	public ZhHant getEnGb() { return enGb; }
	public void setEnGb(ZhHant enGb){ this.enGb = enGb; }
	@Nullable
	public ZhHant grc;
	public ZhHant getGrc() { return grc; }
	public void setGrc(ZhHant grc){ this.grc = grc; }
	@Nullable
	public ZhHant ltg;
	public ZhHant getLtg() { return ltg; }
	public void setLtg(ZhHant ltg){ this.ltg = ltg; }
	@Nullable
	public ZhHant kg;
	public ZhHant getKg() { return kg; }
	public void setKg(ZhHant kg){ this.kg = kg; }
	@Nullable
	public ZhHant fy;
	public ZhHant getFy() { return fy; }
	public void setFy(ZhHant fy){ this.fy = fy; }
	@Nullable
	public ZhHant gsw;
	public ZhHant getGsw() { return gsw; }
	public void setGsw(ZhHant gsw){ this.gsw = gsw; }
	@Nullable
	public ZhHant diq;
	public ZhHant getDiq() { return diq; }
	public void setDiq(ZhHant diq){ this.diq = diq; }
	@Nullable
	public ZhHant ig;
	public ZhHant getIg() { return ig; }
	public void setIg(ZhHant ig){ this.ig = ig; }
	@Nullable
	public ZhHant bjn;
	public ZhHant getBjn() { return bjn; }
	public void setBjn(ZhHant bjn){ this.bjn = bjn; }
	@Nullable
	public ZhHant bar;
	public ZhHant getBar() { return bar; }
	public void setBar(ZhHant bar){ this.bar = bar; }
	@Nullable
	public ZhHant tl;
	public ZhHant getTl() { return tl; }
	public void setTl(ZhHant tl){ this.tl = tl; }
	@Nullable
	public ZhHant bpy;
	public ZhHant getBpy() { return bpy; }
	public void setBpy(ZhHant bpy){ this.bpy = bpy; }
	@Nullable
	public ZhHant war;
	public ZhHant getWar() { return war; }
	public void setWar(ZhHant war){ this.war = war; }
	@Nullable
	public ZhHant kl;
	public ZhHant getKl() { return kl; }
	public void setKl(ZhHant kl){ this.kl = kl; }
	@Nullable
	public ZhHant ml;
	public ZhHant getMl() { return ml; }
	public void setMl(ZhHant ml){ this.ml = ml; }
	@Nullable
	public ZhHant lo;
	public ZhHant getLo() { return lo; }
	public void setLo(ZhHant lo){ this.lo = lo; }
	@Nullable
	public ZhHant az;
	public ZhHant getAz() { return az; }
	public void setAz(ZhHant az){ this.az = az; }
	@Nullable
	public ZhHant brh;
	public ZhHant getBrh() { return brh; }
	public void setBrh(ZhHant brh){ this.brh = brh; }
	@Nullable
	public ZhHant ka;
	public ZhHant getKa() { return ka; }
	public void setKa(ZhHant ka){ this.ka = ka; }
	@Nullable
	public ZhHant cu;
	public ZhHant getCu() { return cu; }
	public void setCu(ZhHant cu){ this.cu = cu; }
	@SerializedName("zh-my")
	@Nullable
	public ZhHant zhMy;
	public ZhHant getZhMy() { return zhMy; }
	public void setZhMy(ZhHant zhMy){ this.zhMy = zhMy; }
	@Nullable
	public ZhHant gu;
	public ZhHant getGu() { return gu; }
	public void setGu(ZhHant gu){ this.gu = gu; }
	@Nullable
	public ZhHant kw;
	public ZhHant getKw() { return kw; }
	public void setKw(ZhHant kw){ this.kw = kw; }
	@Nullable
	public ZhHant cs;
	public ZhHant getCs() { return cs; }
	public void setCs(ZhHant cs){ this.cs = cs; }
	@Nullable
	public ZhHant ht;
	public ZhHant getHt() { return ht; }
	public void setHt(ZhHant ht){ this.ht = ht; }
	@Nullable
	public ZhHant ace;
	public ZhHant getAce() { return ace; }
	public void setAce(ZhHant ace){ this.ace = ace; }
	@Nullable
	public ZhHant rup;
	public ZhHant getRup() { return rup; }
	public void setRup(ZhHant rup){ this.rup = rup; }
	@SerializedName("zh-mo")
	@Nullable
	public ZhHant zhMo;
	public ZhHant getZhMo() { return zhMo; }
	public void setZhMo(ZhHant zhMo){ this.zhMo = zhMo; }
	@SerializedName("zh-hk")
	@Nullable
	public ZhHant zhHk;
	public ZhHant getZhHk() { return zhHk; }
	public void setZhHk(ZhHant zhHk){ this.zhHk = zhHk; }
	@Nullable
	public ZhHant ln;
	public ZhHant getLn() { return ln; }
	public void setLn(ZhHant ln){ this.ln = ln; }
	@Nullable
	public ZhHant kaa;
	public ZhHant getKaa() { return kaa; }
	public void setKaa(ZhHant kaa){ this.kaa = kaa; }
	@Nullable
	public ZhHant nso;
	public ZhHant getNso() { return nso; }
	public void setNso(ZhHant nso){ this.nso = nso; }
	@Nullable
	public ZhHant ceb;
	public ZhHant getCeb() { return ceb; }
	public void setCeb(ZhHant ceb){ this.ceb = ceb; }
	@Nullable
	public ZhHant nan;
	public ZhHant getNan() { return nan; }
	public void setNan(ZhHant nan){ this.nan = nan; }
	@Nullable
	public ZhHant pam;
	public ZhHant getPam() { return pam; }
	public void setPam(ZhHant pam){ this.pam = pam; }
	@SerializedName("zh-cn")
	@Nullable
	public ZhHant zhCn;
	public ZhHant getZhCn() { return zhCn; }
	public void setZhCn(ZhHant zhCn){ this.zhCn = zhCn; }
	@Nullable
	public ZhHant tn;
	public ZhHant getTn() { return tn; }
	public void setTn(ZhHant tn){ this.tn = tn; }
	@Nullable
	public ZhHant mwl;
	public ZhHant getMwl() { return mwl; }
	public void setMwl(ZhHant mwl){ this.mwl = mwl; }
	@Nullable
	public ZhHant pap;
	public ZhHant getPap() { return pap; }
	public void setPap(ZhHant pap){ this.pap = pap; }
	@Nullable
	public ZhHant szl;
	public ZhHant getSzl() { return szl; }
	public void setSzl(ZhHant szl){ this.szl = szl; }
	@Nullable
	public ZhHant pdc;
	public ZhHant getPdc() { return pdc; }
	public void setPdc(ZhHant pdc){ this.pdc = pdc; }
	@Nullable
	public ZhHant srn;
	public ZhHant getSrn() { return srn; }
	public void setSrn(ZhHant srn){ this.srn = srn; }
	@Nullable
	public ZhHant pa;
	public ZhHant getPa() { return pa; }
	public void setPa(ZhHant pa){ this.pa = pa; }
	@Nullable
	public ZhHant gn;
	public ZhHant getGn() { return gn; }
	public void setGn(ZhHant gn){ this.gn = gn; }
	@Nullable
	public ZhHant nds;
	public ZhHant getNds() { return nds; }
	public void setNds(ZhHant nds){ this.nds = nds; }
	@Nullable
	public ZhHant hsb;
	public ZhHant getHsb() { return hsb; }
	public void setHsb(ZhHant hsb){ this.hsb = hsb; }
	@SerializedName("kk-cn")
	@Nullable
	public ZhHant kkCn;
	public ZhHant getKkCn() { return kkCn; }
	public void setKkCn(ZhHant kkCn){ this.kkCn = kkCn; }
	@Nullable
	public ZhHant se;
	public ZhHant getSe() { return se; }
	public void setSe(ZhHant se){ this.se = se; }
	@Nullable
	public ZhHant ko;
	public ZhHant getKo() { return ko; }
	public void setKo(ZhHant ko){ this.ko = ko; }
	@Nullable
	public ZhHant cv;
	public ZhHant getCv() { return cv; }
	public void setCv(ZhHant cv){ this.cv = cv; }
	@Nullable
	public ZhHant wuu;
	public ZhHant getWuu() { return wuu; }
	public void setWuu(ZhHant wuu){ this.wuu = wuu; }
	@Nullable
	public ZhHant chy;
	public ZhHant getChy() { return chy; }
	public void setChy(ZhHant chy){ this.chy = chy; }
	@SerializedName("zh-hans")
	@Nullable
	public ZhHant zhHans;
	public ZhHant getZhHans() { return zhHans; }
	public void setZhHans(ZhHant zhHans){ this.zhHans = zhHans; }
	@SerializedName("de-ch")
	@Nullable
	public ZhHant deCh;
	public ZhHant getDeCh() { return deCh; }
	public void setDeCh(ZhHant deCh){ this.deCh = deCh; }
	@Nullable
	public ZhHant hu;
	public ZhHant getHu() { return hu; }
	public void setHu(ZhHant hu){ this.hu = hu; }
	@Nullable
	public ZhHant gl;
	public ZhHant getGl() { return gl; }
	public void setGl(ZhHant gl){ this.gl = gl; }
	@Nullable
	public ZhHant bn;
	public ZhHant getBn() { return bn; }
	public void setBn(ZhHant bn){ this.bn = bn; }
	@Nullable
	public ZhHant mt;
	public ZhHant getMt() { return mt; }
	public void setMt(ZhHant mt){ this.mt = mt; }
	@Nullable
	public ZhHant ms;
	public ZhHant getMs() { return ms; }
	public void setMs(ZhHant ms){ this.ms = ms; }
	@Nullable
	public ZhHant frp;
	public ZhHant getFrp() { return frp; }
	public void setFrp(ZhHant frp){ this.frp = frp; }
	@Nullable
	public ZhHant hi;
	public ZhHant getHi() { return hi; }
	public void setHi(ZhHant hi){ this.hi = hi; }
	@Nullable
	public ZhHant gd;
	public ZhHant getGd() { return gd; }
	public void setGd(ZhHant gd){ this.gd = gd; }
	@Nullable
	public ZhHant mr;
	public ZhHant getMr() { return mr; }
	public void setMr(ZhHant mr){ this.mr = mr; }
	@SerializedName("nds-nl")
	@Nullable
	public ZhHant ndsNl;
	public ZhHant getNdsNl() { return ndsNl; }
	public void setNdsNl(ZhHant ndsNl){ this.ndsNl = ndsNl; }
	@Nullable
	public ZhHant ha;
	public ZhHant getHa() { return ha; }
	public void setHa(ZhHant ha){ this.ha = ha; }
	@Nullable
	public ZhHant bm;
	public ZhHant getBm() { return bm; }
	public void setBm(ZhHant bm){ this.bm = bm; }
	@Nullable
	public ZhHant frc;
	public ZhHant getFrc() { return frc; }
	public void setFrc(ZhHant frc){ this.frc = frc; }
	@Nullable
	public ZhHant mzn;
	public ZhHant getMzn() { return mzn; }
	public void setMzn(ZhHant mzn){ this.mzn = mzn; }
	@Nullable
	public ZhHant ro;
	public ZhHant getRo() { return ro; }
	public void setRo(ZhHant ro){ this.ro = ro; }
	@Nullable
	public ZhHant zu;
	public ZhHant getZu() { return zu; }
	public void setZu(ZhHant zu){ this.zu = zu; }
	@Nullable
	public ZhHant ee;
	public ZhHant getEe() { return ee; }
	public void setEe(ZhHant ee){ this.ee = ee; }
	@Nullable
	public ZhHant tcy;
	public ZhHant getTcy() { return tcy; }
	public void setTcy(ZhHant tcy){ this.tcy = tcy; }
	@Nullable
	public ZhHant bug;
	public ZhHant getBug() { return bug; }
	public void setBug(ZhHant bug){ this.bug = bug; }
	@Nullable
	public ZhHant dsb;
	public ZhHant getDsb() { return dsb; }
	public void setDsb(ZhHant dsb){ this.dsb = dsb; }
	@Nullable
	public ZhHant ta;
	public ZhHant getTa() { return ta; }
	public void setTa(ZhHant ta){ this.ta = ta; }
	@Nullable
	public ZhHant za;
	public ZhHant getZa() { return za; }
	public void setZa(ZhHant za){ this.za = za; }
	@Nullable
	public ZhHant wa;
	public ZhHant getWa() { return wa; }
	public void setWa(ZhHant wa){ this.wa = wa; }
	@Nullable
	public ZhHant myv;
	public ZhHant getMyv() { return myv; }
	public void setMyv(ZhHant myv){ this.myv = myv; }
	@Nullable
	public ZhHant pl;
	public ZhHant getPl() { return pl; }
	public void setPl(ZhHant pl){ this.pl = pl; }
	@Nullable
	public ZhHant dtp;
	public ZhHant getDtp() { return dtp; }
	public void setDtp(ZhHant dtp){ this.dtp = dtp; }
	@Nullable
	public ZhHant hy;
	public ZhHant getHy() { return hy; }
	public void setHy(ZhHant hy){ this.hy = hy; }
	@Nullable
	public ZhHant lad;
	public ZhHant getLad() { return lad; }
	public void setLad(ZhHant lad){ this.lad = lad; }
	@Nullable
	public ZhHant lzh;
	public ZhHant getLzh() { return lzh; }
	public void setLzh(ZhHant lzh){ this.lzh = lzh; }
	@Nullable
	public ZhHant nov;
	public ZhHant getNov() { return nov; }
	public void setNov(ZhHant nov){ this.nov = nov; }
	@Nullable
	public ZhHant an;
	public ZhHant getAn() { return an; }
	public void setAn(ZhHant an){ this.an = an; }
	@Nullable
	public ZhHant is;
	public ZhHant getIs() { return is; }
	public void setIs(ZhHant is){ this.is = is; }
	@Nullable
	public ZhHant cy;
	public ZhHant getCy() { return cy; }
	public void setCy(ZhHant cy){ this.cy = cy; }
	@Nullable
	public ZhHant ab;
	public ZhHant getAb() { return ab; }
	public void setAb(ZhHant ab){ this.ab = ab; }
	@Nullable
	public ZhHant stq;
	public ZhHant getStq() { return stq; }
	public void setStq(ZhHant stq){ this.stq = stq; }
	@Nullable
	public ZhHant ia;
	public ZhHant getIa() { return ia; }
	public void setIa(ZhHant ia){ this.ia = ia; }
	@Nullable
	public ZhHant tk;
	public ZhHant getTk() { return tk; }
	public void setTk(ZhHant tk){ this.tk = tk; }
	@Nullable
	public ZhHant mn;
	public ZhHant getMn() { return mn; }
	public void setMn(ZhHant mn){ this.mn = mn; }
	@Nullable
	public ZhHant kk;
	public ZhHant getKk() { return kk; }
	public void setKk(ZhHant kk){ this.kk = kk; }
	@Nullable
	public ZhHant vro;
	public ZhHant getVro() { return vro; }
	public void setVro(ZhHant vro){ this.vro = vro; }
	@Nullable
	public ZhHant su;
	public ZhHant getSu() { return su; }
	public void setSu(ZhHant su){ this.su = su; }
	@Nullable
	public ZhHant ps;
	public ZhHant getPs() { return ps; }
	public void setPs(ZhHant ps){ this.ps = ps; }
	@Nullable
	public ZhHant qu;
	public ZhHant getQu() { return qu; }
	public void setQu(ZhHant qu){ this.qu = qu; }
	@Nullable
	public ZhHant lmo;
	public ZhHant getLmo() { return lmo; }
	public void setLmo(ZhHant lmo){ this.lmo = lmo; }
	@Nullable
	public ZhHant or;
	public ZhHant getOr() { return or; }
	public void setOr(ZhHant or){ this.or = or; }
	@Nullable
	public ZhHant bs;
	public ZhHant getBs() { return bs; }
	public void setBs(ZhHant bs){ this.bs = bs; }
	@Nullable
	public ZhHant io;
	public ZhHant getIo() { return io; }
	public void setIo(ZhHant io){ this.io = io; }
	@Nullable
	public ZhHant pt;
	public ZhHant getPt() { return pt; }
	public void setPt(ZhHant pt){ this.pt = pt; }
	@Nullable
	public ZhHant rmy;
	public ZhHant getRmy() { return rmy; }
	public void setRmy(ZhHant rmy){ this.rmy = rmy; }
	@Nullable
	public ZhHant nn;
	public ZhHant getNn() { return nn; }
	public void setNn(ZhHant nn){ this.nn = nn; }
	@Nullable
	public ZhHant ts;
	public ZhHant getTs() { return ts; }
	public void setTs(ZhHant ts){ this.ts = ts; }
	@Nullable
	public ZhHant lt;
	public ZhHant getLt() { return lt; }
	public void setLt(ZhHant lt){ this.lt = lt; }
	@SerializedName("sr-el")
	@Nullable
	public ZhHant srEl;
	public ZhHant getSrEl() { return srEl; }
	public void setSrEl(ZhHant srEl){ this.srEl = srEl; }
	@Nullable
	public ZhHant nap;
	public ZhHant getNap() { return nap; }
	public void setNap(ZhHant nap){ this.nap = nap; }
	@Nullable
	public ZhHant tg;
	public ZhHant getTg() { return tg; }
	public void setTg(ZhHant tg){ this.tg = tg; }
	@SerializedName("cbk-zam")
	@Nullable
	public ZhHant cbkZam;
	public ZhHant getCbkZam() { return cbkZam; }
	public void setCbkZam(ZhHant cbkZam){ this.cbkZam = cbkZam; }
	@Nullable
	public ZhHant fr;
	public ZhHant getFr() { return fr; }
	public void setFr(ZhHant fr){ this.fr = fr; }
	@Nullable
	public ZhHant xmf;
	public ZhHant getXmf() { return xmf; }
	public void setXmf(ZhHant xmf){ this.xmf = xmf; }
	@Nullable
	public ZhHant dv;
	public ZhHant getDv() { return dv; }
	public void setDv(ZhHant dv){ this.dv = dv; }
	@Nullable
	public ZhHant mk;
	public ZhHant getMk() { return mk; }
	public void setMk(ZhHant mk){ this.mk = mk; }
	@Nullable
	public ZhHant ilo;
	public ZhHant getIlo() { return ilo; }
	public void setIlo(ZhHant ilo){ this.ilo = ilo; }
	@Nullable
	public ZhHant so;
	public ZhHant getSo() { return so; }
	public void setSo(ZhHant so){ this.so = so; }
	@Nullable
	public ZhHant om;
	public ZhHant getOm() { return om; }
	public void setOm(ZhHant om){ this.om = om; }
	@Nullable
	public ZhHant ty;
	public ZhHant getTy() { return ty; }
	public void setTy(ZhHant ty){ this.ty = ty; }
	@Nullable
	public ZhHant wo;
	public ZhHant getWo() { return wo; }
	public void setWo(ZhHant wo){ this.wo = wo; }
	@Nullable
	public ZhHant fa;
	public ZhHant getFa() { return fa; }
	public void setFa(ZhHant fa){ this.fa = fa; }
	@Nullable
	public ZhHant ku;
	public ZhHant getKu() { return ku; }
	public void setKu(ZhHant ku){ this.ku = ku; }
	@SerializedName("zh-sg")
	@Nullable
	public ZhHant zhSg;
	public ZhHant getZhSg() { return zhSg; }
	public void setZhSg(ZhHant zhSg){ this.zhSg = zhSg; }
	@Nullable
	public ZhHant fur;
	public ZhHant getFur() { return fur; }
	public void setFur(ZhHant fur){ this.fur = fur; }
	@Nullable
	public ZhHant cr;
	public ZhHant getCr() { return cr; }
	public void setCr(ZhHant cr){ this.cr = cr; }
	@Nullable
	public ZhHant nrm;
	public ZhHant getNrm() { return nrm; }
	public void setNrm(ZhHant nrm){ this.nrm = nrm; }
	@Nullable
	public ZhHant am;
	public ZhHant getAm() { return am; }
	public void setAm(ZhHant am){ this.am = am; }
	@Nullable
	public ZhHant bi;
	public ZhHant getBi() { return bi; }
	public void setBi(ZhHant bi){ this.bi = bi; }
	@Nullable
	public ZhHant sah;
	public ZhHant getSah() { return sah; }
	public void setSah(ZhHant sah){ this.sah = sah; }
	@Nullable
	public ZhHant ca;
	public ZhHant getCa() { return ca; }
	public void setCa(ZhHant ca){ this.ca = ca; }
	@Nullable
	public ZhHant got;
	public ZhHant getGot() { return got; }
	public void setGot(ZhHant got){ this.got = got; }
	@Nullable
	public ZhHant eu;
	public ZhHant getEu() { return eu; }
	public void setEu(ZhHant eu){ this.eu = eu; }
	@Nullable
	public ZhHant nah;
	public ZhHant getNah() { return nah; }
	public void setNah(ZhHant nah){ this.nah = nah; }
	@Nullable
	public ZhHant et;
	public ZhHant getEt() { return et; }
	public void setEt(ZhHant et){ this.et = et; }
	@Nullable
	public ZhHant scn;
	public ZhHant getScn() { return scn; }
	public void setScn(ZhHant scn){ this.scn = scn; }
	@Nullable
	public ZhHant vmf;
	public ZhHant getVmf() { return vmf; }
	public void setVmf(ZhHant vmf){ this.vmf = vmf; }
	@Nullable
	public ZhHant ja;
	public ZhHant getJa() { return ja; }
	public void setJa(ZhHant ja){ this.ja = ja; }
	@Nullable
	public ZhHant hif;
	public ZhHant getHif() { return hif; }
	public void setHif(ZhHant hif){ this.hif = hif; }
	@Nullable
	public ZhHant gv;
	public ZhHant getGv() { return gv; }
	public void setGv(ZhHant gv){ this.gv = gv; }
	@Nullable
	public ZhHant ce;
	public ZhHant getCe() { return ce; }
	public void setCe(ZhHant ce){ this.ce = ce; }
	@Nullable
	public ZhHant yo;
	public ZhHant getYo() { return yo; }
	public void setYo(ZhHant yo){ this.yo = yo; }
	@Nullable
	public ZhHant csb;
	public ZhHant getCsb() { return csb; }
	public void setCsb(ZhHant csb){ this.csb = csb; }
	@Nullable
	public ZhHant kv;
	public ZhHant getKv() { return kv; }
	public void setKv(ZhHant kv){ this.kv = kv; }
	@Nullable
	public ZhHant mo;
	public ZhHant getMo() { return mo; }
	public void setMo(ZhHant mo){ this.mo = mo; }
	@SerializedName("tt-cyrl")
	@Nullable
	public ZhHant ttCyrl;
	public ZhHant getTtCyrl() { return ttCyrl; }
	public void setTtCyrl(ZhHant ttCyrl){ this.ttCyrl = ttCyrl; }
	@SerializedName("pt-br")
	@Nullable
	public ZhHant ptBr;
	public ZhHant getPtBr() { return ptBr; }
	public void setPtBr(ZhHant ptBr){ this.ptBr = ptBr; }
	@Nullable
	public ZhHant mdf;
	public ZhHant getMdf() { return mdf; }
	public void setMdf(ZhHant mdf){ this.mdf = mdf; }
	@Nullable
	public ZhHant tyv;
	public ZhHant getTyv() { return tyv; }
	public void setTyv(ZhHant tyv){ this.tyv = tyv; }
	@Nullable
	public ZhHant ang;
	public ZhHant getAng() { return ang; }
	public void setAng(ZhHant ang){ this.ang = ang; }
	@SerializedName("ku-latn")
	@Nullable
	public ZhHant kuLatn;
	public ZhHant getKuLatn() { return kuLatn; }
	public void setKuLatn(ZhHant kuLatn){ this.kuLatn = kuLatn; }
	@SerializedName("be-x-old")
	@Nullable
	public ZhHant beXOld;
	public ZhHant getBeXOld() { return beXOld; }
	public void setBeXOld(ZhHant beXOld){ this.beXOld = beXOld; }
	@Nullable
	public ZhHant ckb;
	public ZhHant getCkb() { return ckb; }
	public void setCkb(ZhHant ckb){ this.ckb = ckb; }
	@Nullable
	public ZhHant en;
	public ZhHant getEn() { return en; }
	public void setEn(ZhHant en){ this.en = en; }
	@Nullable
	public ZhHant sgs;
	public ZhHant getSgs() { return sgs; }
	public void setSgs(ZhHant sgs){ this.sgs = sgs; }
	@SerializedName("nl-informal")
	@Nullable
	public ZhHant nlInformal;
	public ZhHant getNlInformal() { return nlInformal; }
	public void setNlInformal(ZhHant nlInformal){ this.nlInformal = nlInformal; }
	@Nullable
	public ZhHant lez;
	public ZhHant getLez() { return lez; }
	public void setLez(ZhHant lez){ this.lez = lez; }
	@Nullable
	public ZhHant br;
	public ZhHant getBr() { return br; }
	public void setBr(ZhHant br){ this.br = br; }
	@SerializedName("roa-tara")
	@Nullable
	public ZhHant roaTara;
	public ZhHant getRoaTara() { return roaTara; }
	public void setRoaTara(ZhHant roaTara){ this.roaTara = roaTara; }
	@Nullable
	public ZhHant lb;
	public ZhHant getLb() { return lb; }
	public void setLb(ZhHant lb){ this.lb = lb; }
	@Nullable
	public ZhHant koi;
	public ZhHant getKoi() { return koi; }
	public void setKoi(ZhHant koi){ this.koi = koi; }
	@Nullable
	public ZhHant uk;
	public ZhHant getUk() { return uk; }
	public void setUk(ZhHant uk){ this.uk = uk; }
	@Nullable
	public ZhHant eo;
	public ZhHant getEo() { return eo; }
	public void setEo(ZhHant eo){ this.eo = eo; }
	@Nullable
	public ZhHant eml;
	public ZhHant getEml() { return eml; }
	public void setEml(ZhHant eml){ this.eml = eml; }
	@Nullable
	public ZhHant os;
	public ZhHant getOs() { return os; }
	public void setOs(ZhHant os){ this.os = os; }
	@Nullable
	public ZhHant bcl;
	public ZhHant getBcl() { return bcl; }
	public void setBcl(ZhHant bcl){ this.bcl = bcl; }
	@Nullable
	public ZhHant min;
	public ZhHant getMin() { return min; }
	public void setMin(ZhHant min){ this.min = min; }
	@Nullable
	public ZhHant te;
	public ZhHant getTe() { return te; }
	public void setTe(ZhHant te){ this.te = te; }
	@Nullable
	public ZhHant simple;
	public ZhHant getSimple() { return simple; }
	public void setSimple(ZhHant simple){ this.simple = simple; }
	@Nullable
	public ZhHant km;
	public ZhHant getKm() { return km; }
	public void setKm(ZhHant km){ this.km = km; }
	@Nullable
	public ZhHant ch;
	public ZhHant getCh() { return ch; }
	public void setCh(ZhHant ch){ this.ch = ch; }
	@Nullable
	public ZhHant pnt;
	public ZhHant getPnt() { return pnt; }
	public void setPnt(ZhHant pnt){ this.pnt = pnt; }
	@Nullable
	public ZhHant chr;
	public ZhHant getChr() { return chr; }
	public void setChr(ZhHant chr){ this.chr = chr; }
	@Nullable
	public ZhHant it;
	public ZhHant getIt() { return it; }
	public void setIt(ZhHant it){ this.it = it; }
	@Nullable
	public ZhHant bxr;
	public ZhHant getBxr() { return bxr; }
	public void setBxr(ZhHant bxr){ this.bxr = bxr; }
	@Nullable
	public ZhHant tru;
	public ZhHant getTru() { return tru; }
	public void setTru(ZhHant tru){ this.tru = tru; }
	@Nullable
	public ZhHant vls;
	public ZhHant getVls() { return vls; }
	public void setVls(ZhHant vls){ this.vls = vls; }
	@Nullable
	public ZhHant frr;
	public ZhHant getFrr() { return frr; }
	public void setFrr(ZhHant frr){ this.frr = frr; }
	@Nullable
	public ZhHant bg;
	public ZhHant getBg() { return bg; }
	public void setBg(ZhHant bg){ this.bg = bg; }
	@SerializedName("map-bms")
	@Nullable
	public ZhHant mapBms;
	public ZhHant getMapBms() { return mapBms; }
	public void setMapBms(ZhHant mapBms){ this.mapBms = mapBms; }
	@Nullable
	public ZhHant zh;
	public ZhHant getZh() { return zh; }
	public void setZh(ZhHant zh){ this.zh = zh; }
	@Nullable
	public ZhHant he;
	public ZhHant getHe() { return he; }
	public void setHe(ZhHant he){ this.he = he; }
	@Nullable
	public ZhHant jbo;
	public ZhHant getJbo() { return jbo; }
	public void setJbo(ZhHant jbo){ this.jbo = jbo; }
	@Nullable
	public ZhHant da;
	public ZhHant getDa() { return da; }
	public void setDa(ZhHant da){ this.da = da; }
	@Nullable
	public ZhHant sei;
	public ZhHant getSei() { return sei; }
	public void setSei(ZhHant sei){ this.sei = sei; }
	@Nullable
	public ZhHant ba;
	public ZhHant getBa() { return ba; }
	public void setBa(ZhHant ba){ this.ba = ba; }
	@SerializedName("de-formal")
	@Nullable
	public ZhHant deFormal;
	public ZhHant getDeFormal() { return deFormal; }
	public void setDeFormal(ZhHant deFormal){ this.deFormal = deFormal; }
	@Nullable
	public ZhHant sk;
	public ZhHant getSk() { return sk; }
	public void setSk(ZhHant sk){ this.sk = sk; }
	@Nullable
	public ZhHant sw;
	public ZhHant getSw() { return sw; }
	public void setSw(ZhHant sw){ this.sw = sw; }
	@Nullable
	public ZhHant fo;
	public ZhHant getFo() { return fo; }
	public void setFo(ZhHant fo){ this.fo = fo; }
	@Nullable
	public ZhHant ff;
	public ZhHant getFf() { return ff; }
	public void setFf(ZhHant ff){ this.ff = ff; }
	@Nullable
	public ZhHant ru;
	public ZhHant getRu() { return ru; }
	public void setRu(ZhHant ru){ this.ru = ru; }
	@Nullable
	public ZhHant si;
	public ZhHant getSi() { return si; }
	public void setSi(ZhHant si){ this.si = si; }
	@Nullable
	public ZhHant rm;
	public ZhHant getRm() { return rm; }
	public void setRm(ZhHant rm){ this.rm = rm; }
	@Nullable
	public ZhHant ki;
	public ZhHant getKi() { return ki; }
	public void setKi(ZhHant ki){ this.ki = ki; }
	@SerializedName("sr-ec")
	@Nullable
	public ZhHant srEc;
	public ZhHant getSrEc() { return srEc; }
	public void setSrEc(ZhHant srEc){ this.srEc = srEc; }
	@Nullable
	public ZhHant jv;
	public ZhHant getJv() { return jv; }
	public void setJv(ZhHant jv){ this.jv = jv; }
	}
	public static class Labels {
	@Nullable
	public ZhHant yi;
	public ZhHant getYi() { return yi; }
	public void setYi(ZhHant yi){ this.yi = yi; }
	@Nullable
	public ZhHant ne;
	public ZhHant getNe() { return ne; }
	public void setNe(ZhHant ne){ this.ne = ne; }
	@Nullable
	public ZhHant kn;
	public ZhHant getKn() { return kn; }
	public void setKn(ZhHant kn){ this.kn = kn; }
	@Nullable
	public ZhHant rif;
	public ZhHant getRif() { return rif; }
	public void setRif(ZhHant rif){ this.rif = rif; }
	@SerializedName("ug-arab")
	@Nullable
	public ZhHant ugArab;
	public ZhHant getUgArab() { return ugArab; }
	public void setUgArab(ZhHant ugArab){ this.ugArab = ugArab; }
	@Nullable
	public ZhHant es;
	public ZhHant getEs() { return es; }
	public void setEs(ZhHant es){ this.es = es; }
	@Nullable
	public ZhHant haw;
	public ZhHant getHaw() { return haw; }
	public void setHaw(ZhHant haw){ this.haw = haw; }
	@Nullable
	public ZhHant nl;
	public ZhHant getNl() { return nl; }
	public void setNl(ZhHant nl){ this.nl = nl; }
	@Nullable
	public ZhHant ext;
	public ZhHant getExt() { return ext; }
	public void setExt(ZhHant ext){ this.ext = ext; }
	@Nullable
	public ZhHant as;
	public ZhHant getAs() { return as; }
	public void setAs(ZhHant as){ this.as = as; }
	@Nullable
	public ZhHant mg;
	public ZhHant getMg() { return mg; }
	public void setMg(ZhHant mg){ this.mg = mg; }
	@Nullable
	public ZhHant mi;
	public ZhHant getMi() { return mi; }
	public void setMi(ZhHant mi){ this.mi = mi; }
	@Nullable
	public ZhHant sr;
	public ZhHant getSr() { return sr; }
	public void setSr(ZhHant sr){ this.sr = sr; }
	@Nullable
	public ZhHant arc;
	public ZhHant getArc() { return arc; }
	public void setArc(ZhHant arc){ this.arc = arc; }
	@Nullable
	public ZhHant lg;
	public ZhHant getLg() { return lg; }
	public void setLg(ZhHant lg){ this.lg = lg; }
	@Nullable
	public ZhHant bcc;
	public ZhHant getBcc() { return bcc; }
	public void setBcc(ZhHant bcc){ this.bcc = bcc; }
	@Nullable
	public ZhHant ky;
	public ZhHant getKy() { return ky; }
	public void setKy(ZhHant ky){ this.ky = ky; }
	@Nullable
	public ZhHant la;
	public ZhHant getLa() { return la; }
	public void setLa(ZhHant la){ this.la = la; }
	@Nullable
	public ZhHant als;
	public ZhHant getAls() { return als; }
	public void setAls(ZhHant als){ this.als = als; }
	@Nullable
	public ZhHant ak;
	public ZhHant getAk() { return ak; }
	public void setAk(ZhHant ak){ this.ak = ak; }
	@Nullable
	public ZhHant ss;
	public ZhHant getSs() { return ss; }
	public void setSs(ZhHant ss){ this.ss = ss; }
	@Nullable
	public ZhHant xh;
	public ZhHant getXh() { return xh; }
	public void setXh(ZhHant xh){ this.xh = xh; }
	@SerializedName("kk-cyrl")
	@Nullable
	public ZhHant kkCyrl;
	public ZhHant getKkCyrl() { return kkCyrl; }
	public void setKkCyrl(ZhHant kkCyrl){ this.kkCyrl = kkCyrl; }
	@Nullable
	public ZhHant hr;
	public ZhHant getHr() { return hr; }
	public void setHr(ZhHant hr){ this.hr = hr; }
	@Nullable
	public ZhHant pms;
	public ZhHant getPms() { return pms; }
	public void setPms(ZhHant pms){ this.pms = pms; }
	@Nullable
	public ZhHant vep;
	public ZhHant getVep() { return vep; }
	public void setVep(ZhHant vep){ this.vep = vep; }
	@SerializedName("tg-latn")
	@Nullable
	public ZhHant tgLatn;
	public ZhHant getTgLatn() { return tgLatn; }
	public void setTgLatn(ZhHant tgLatn){ this.tgLatn = tgLatn; }
	@Nullable
	public ZhHant sco;
	public ZhHant getSco() { return sco; }
	public void setSco(ZhHant sco){ this.sco = sco; }
	@Nullable
	public ZhHant ur;
	public ZhHant getUr() { return ur; }
	public void setUr(ZhHant ur){ this.ur = ur; }
	@Nullable
	public ZhHant sl;
	public ZhHant getSl() { return sl; }
	public void setSl(ZhHant sl){ this.sl = sl; }
	@Nullable
	public ZhHant arn;
	public ZhHant getArn() { return arn; }
	public void setArn(ZhHant arn){ this.arn = arn; }
	@Nullable
	public ZhHant ota;
	public ZhHant getOta() { return ota; }
	public void setOta(ZhHant ota){ this.ota = ota; }
	@Nullable
	public ZhHant prg;
	public ZhHant getPrg() { return prg; }
	public void setPrg(ZhHant prg){ this.prg = prg; }
	@SerializedName("de-at")
	@Nullable
	public ZhHant deAt;
	public ZhHant getDeAt() { return deAt; }
	public void setDeAt(ZhHant deAt){ this.deAt = deAt; }
	@Nullable
	public ZhHant pdt;
	public ZhHant getPdt() { return pdt; }
	public void setPdt(ZhHant pdt){ this.pdt = pdt; }
	@SerializedName("tg-cyrl")
	@Nullable
	public ZhHant tgCyrl;
	public ZhHant getTgCyrl() { return tgCyrl; }
	public void setTgCyrl(ZhHant tgCyrl){ this.tgCyrl = tgCyrl; }
	@Nullable
	public ZhHant lbe;
	public ZhHant getLbe() { return lbe; }
	public void setLbe(ZhHant lbe){ this.lbe = lbe; }
	@Nullable
	public ZhHant fi;
	public ZhHant getFi() { return fi; }
	public void setFi(ZhHant fi){ this.fi = fi; }
	@Nullable
	public ZhHant fit;
	public ZhHant getFit() { return fit; }
	public void setFit(ZhHant fit){ this.fit = fit; }
	@Nullable
	public ZhHant sg;
	public ZhHant getSg() { return sg; }
	public void setSg(ZhHant sg){ this.sg = sg; }
	@Nullable
	public ZhHant qug;
	public ZhHant getQug() { return qug; }
	public void setQug(ZhHant qug){ this.qug = qug; }
	@Nullable
	public ZhHant el;
	public ZhHant getEl() { return el; }
	public void setEl(ZhHant el){ this.el = el; }
	@Nullable
	public ZhHant av;
	public ZhHant getAv() { return av; }
	public void setAv(ZhHant av){ this.av = av; }
	@SerializedName("new")
	@Nullable
	public ZhHant nuw;
	public ZhHant getNuw() { return nuw; }
	public void setNuw(ZhHant nuw){ this.nuw = nuw; }
	@Nullable
	public ZhHant cdo;
	public ZhHant getCdo() { return cdo; }
	public void setCdo(ZhHant cdo){ this.cdo = cdo; }
	@Nullable
	public ZhHant gan;
	public ZhHant getGan() { return gan; }
	public void setGan(ZhHant gan){ this.gan = gan; }
	@Nullable
	public ZhHant li;
	public ZhHant getLi() { return li; }
	public void setLi(ZhHant li){ this.li = li; }
	@Nullable
	public ZhHant pnb;
	public ZhHant getPnb() { return pnb; }
	public void setPnb(ZhHant pnb){ this.pnb = pnb; }
	@SerializedName("sr-ec")
	@Nullable
	public ZhHant srEc;
	public ZhHant getSrEc() { return srEc; }
	public void setSrEc(ZhHant srEc){ this.srEc = srEc; }
	@SerializedName("gan-hant")
	@Nullable
	public ZhHant ganHant;
	public ZhHant getGanHant() { return ganHant; }
	public void setGanHant(ZhHant ganHant){ this.ganHant = ganHant; }
	@Nullable
	public ZhHant tpi;
	public ZhHant getTpi() { return tpi; }
	public void setTpi(ZhHant tpi){ this.tpi = tpi; }
	@Nullable
	public ZhHant th;
	public ZhHant getTh() { return th; }
	public void setTh(ZhHant th){ this.th = th; }
	@Nullable
	public ZhHant ve;
	public ZhHant getVe() { return ve; }
	public void setVe(ZhHant ve){ this.ve = ve; }
	@Nullable
	public ZhHant sa;
	public ZhHant getSa() { return sa; }
	public void setSa(ZhHant sa){ this.sa = sa; }
	@Nullable
	public ZhHant kbd;
	public ZhHant getKbd() { return kbd; }
	public void setKbd(ZhHant kbd){ this.kbd = kbd; }
	@Nullable
	public ZhHant sc;
	public ZhHant getSc() { return sc; }
	public void setSc(ZhHant sc){ this.sc = sc; }
	@Nullable
	public ZhHant bh;
	public ZhHant getBh() { return bh; }
	public void setBh(ZhHant bh){ this.bh = bh; }
	@Nullable
	public ZhHant aln;
	public ZhHant getAln() { return aln; }
	public void setAln(ZhHant aln){ this.aln = aln; }
	@Nullable
	public ZhHant co;
	public ZhHant getCo() { return co; }
	public void setCo(ZhHant co){ this.co = co; }
	@SerializedName("bbc-latn")
	@Nullable
	public ZhHant bbcLatn;
	public ZhHant getBbcLatn() { return bbcLatn; }
	public void setBbcLatn(ZhHant bbcLatn){ this.bbcLatn = bbcLatn; }
	@Nullable
	public ZhHant be;
	public ZhHant getBe() { return be; }
	public void setBe(ZhHant be){ this.be = be; }
	@Nullable
	public ZhHant vot;
	public ZhHant getVot() { return vot; }
	public void setVot(ZhHant vot){ this.vot = vot; }
	@Nullable
	public ZhHant tw;
	public ZhHant getTw() { return tw; }
	public void setTw(ZhHant tw){ this.tw = tw; }
	@Nullable
	public ZhHant pi;
	public ZhHant getPi() { return pi; }
	public void setPi(ZhHant pi){ this.pi = pi; }
	@Nullable
	public ZhHant lij;
	public ZhHant getLij() { return lij; }
	public void setLij(ZhHant lij){ this.lij = lij; }
	@Nullable
	public ZhHant tr;
	public ZhHant getTr() { return tr; }
	public void setTr(ZhHant tr){ this.tr = tr; }
	@Nullable
	public ZhHant pag;
	public ZhHant getPag() { return pag; }
	public void setPag(ZhHant pag){ this.pag = pag; }
	@SerializedName("zh-hant")
	@Nullable
	public ZhHant zhHant;
	public ZhHant getZhHant() { return zhHant; }
	public void setZhHant(ZhHant zhHant){ this.zhHant = zhHant; }
	@Nullable
	public ZhHant zea;
	public ZhHant getZea() { return zea; }
	public void setZea(ZhHant zea){ this.zea = zea; }
	@Nullable
	public ZhHant glk;
	public ZhHant getGlk() { return glk; }
	public void setGlk(ZhHant glk){ this.glk = glk; }
	@Nullable
	public ZhHant yue;
	public ZhHant getYue() { return yue; }
	public void setYue(ZhHant yue){ this.yue = yue; }
	@Nullable
	public ZhHant ksh;
	public ZhHant getKsh() { return ksh; }
	public void setKsh(ZhHant ksh){ this.ksh = ksh; }
	@Nullable
	public ZhHant arz;
	public ZhHant getArz() { return arz; }
	public void setArz(ZhHant arz){ this.arz = arz; }
	@Nullable
	public ZhHant rn;
	public ZhHant getRn() { return rn; }
	public void setRn(ZhHant rn){ this.rn = rn; }
	@Nullable
	public ZhHant inh;
	public ZhHant getInh() { return inh; }
	public void setInh(ZhHant inh){ this.inh = inh; }
	@Nullable
	public ZhHant af;
	public ZhHant getAf() { return af; }
	public void setAf(ZhHant af){ this.af = af; }
	@Nullable
	public ZhHant ar;
	public ZhHant getAr() { return ar; }
	public void setAr(ZhHant ar){ this.ar = ar; }
	@Nullable
	public ZhHant bo;
	public ZhHant getBo() { return bo; }
	public void setBo(ZhHant bo){ this.bo = bo; }
	@Nullable
	public ZhHant sd;
	public ZhHant getSd() { return sd; }
	public void setSd(ZhHant sd){ this.sd = sd; }
	@Nullable
	public ZhHant vi;
	public ZhHant getVi() { return vi; }
	public void setVi(ZhHant vi){ this.vi = vi; }
	@Nullable
	public ZhHant mai;
	public ZhHant getMai() { return mai; }
	public void setMai(ZhHant mai){ this.mai = mai; }
	@SerializedName("be-tarask")
	@Nullable
	public ZhHant beTarask;
	public ZhHant getBeTarask() { return beTarask; }
	public void setBeTarask(ZhHant beTarask){ this.beTarask = beTarask; }
	@Nullable
	public ZhHant kab;
	public ZhHant getKab() { return kab; }
	public void setKab(ZhHant kab){ this.kab = kab; }
	@Nullable
	public ZhHant vec;
	public ZhHant getVec() { return vec; }
	public void setVec(ZhHant vec){ this.vec = vec; }
	@Nullable
	public ZhHant ti;
	public ZhHant getTi() { return ti; }
	public void setTi(ZhHant ti){ this.ti = ti; }
	@Nullable
	public ZhHant hrx;
	public ZhHant getHrx() { return hrx; }
	public void setHrx(ZhHant hrx){ this.hrx = hrx; }
	@Nullable
	public ZhHant na;
	public ZhHant getNa() { return na; }
	public void setNa(ZhHant na){ this.na = na; }
	@Nullable
	public ZhHant gag;
	public ZhHant getGag() { return gag; }
	public void setGag(ZhHant gag){ this.gag = gag; }
	@Nullable
	public ZhHant tt;
	public ZhHant getTt() { return tt; }
	public void setTt(ZhHant tt){ this.tt = tt; }
	@Nullable
	public ZhHant tokipona;
	public ZhHant getTokipona() { return tokipona; }
	public void setTokipona(ZhHant tokipona){ this.tokipona = tokipona; }
	@SerializedName("tt-latn")
	@Nullable
	public ZhHant ttLatn;
	public ZhHant getTtLatn() { return ttLatn; }
	public void setTtLatn(ZhHant ttLatn){ this.ttLatn = ttLatn; }
	@Nullable
	public ZhHant st;
	public ZhHant getSt() { return st; }
	public void setSt(ZhHant st){ this.st = st; }
	@SerializedName("ko-kp")
	@Nullable
	public ZhHant koKp;
	public ZhHant getKoKp() { return koKp; }
	public void setKoKp(ZhHant koKp){ this.koKp = koKp; }
	@Nullable
	public ZhHant sm;
	public ZhHant getSm() { return sm; }
	public void setSm(ZhHant sm){ this.sm = sm; }
	@SerializedName("en-ca")
	@Nullable
	public ZhHant enCa;
	public ZhHant getEnCa() { return enCa; }
	public void setEnCa(ZhHant enCa){ this.enCa = enCa; }
	@Nullable
	public ZhHant id;
	public ZhHant getId() { return id; }
	public void setId(ZhHant id){ this.id = id; }
	@Nullable
	public ZhHant ie;
	public ZhHant getIe() { return ie; }
	public void setIe(ZhHant ie){ this.ie = ie; }
	@Nullable
	public ZhHant de;
	public ZhHant getDe() { return de; }
	public void setDe(ZhHant de){ this.de = de; }
	@SerializedName("zh-tw")
	@Nullable
	public ZhHant zhTw;
	public ZhHant getZhTw() { return zhTw; }
	public void setZhTw(ZhHant zhTw){ this.zhTw = zhTw; }
	@Nullable
	public ZhHant ug;
	public ZhHant getUg() { return ug; }
	public void setUg(ZhHant ug){ this.ug = ug; }
	@Nullable
	public ZhHant oc;
	public ZhHant getOc() { return oc; }
	public void setOc(ZhHant oc){ this.oc = oc; }
	@Nullable
	public ZhHant ho;
	public ZhHant getHo() { return ho; }
	public void setHo(ZhHant ho){ this.ho = ho; }
	@Nullable
	public ZhHant pih;
	public ZhHant getPih() { return pih; }
	public void setPih(ZhHant pih){ this.pih = pih; }
	@Nullable
	public ZhHant nv;
	public ZhHant getNv() { return nv; }
	public void setNv(ZhHant nv){ this.nv = nv; }
	@SerializedName("shi-latn")
	@Nullable
	public ZhHant shiLatn;
	public ZhHant getShiLatn() { return shiLatn; }
	public void setShiLatn(ZhHant shiLatn){ this.shiLatn = shiLatn; }
	@Nullable
	public ZhHant sh;
	public ZhHant getSh() { return sh; }
	public void setSh(ZhHant sh){ this.sh = sh; }
	@Nullable
	public ZhHant no;
	public ZhHant getNo() { return no; }
	public void setNo(ZhHant no){ this.no = no; }
	@Nullable
	public ZhHant ast;
	public ZhHant getAst() { return ast; }
	public void setAst(ZhHant ast){ this.ast = ast; }
	@Nullable
	public ZhHant tum;
	public ZhHant getTum() { return tum; }
	public void setTum(ZhHant tum){ this.tum = tum; }
	@Nullable
	public ZhHant vo;
	public ZhHant getVo() { return vo; }
	public void setVo(ZhHant vo){ this.vo = vo; }
	@Nullable
	public ZhHant aeb;
	public ZhHant getAeb() { return aeb; }
	public void setAeb(ZhHant aeb){ this.aeb = aeb; }
	@Nullable
	public ZhHant rue;
	public ZhHant getRue() { return rue; }
	public void setRue(ZhHant rue){ this.rue = rue; }
	@SerializedName("crh-latn")
	@Nullable
	public ZhHant crhLatn;
	public ZhHant getCrhLatn() { return crhLatn; }
	public void setCrhLatn(ZhHant crhLatn){ this.crhLatn = crhLatn; }
	@Nullable
	public ZhHant ay;
	public ZhHant getAy() { return ay; }
	public void setAy(ZhHant ay){ this.ay = ay; }
	@Nullable
	public ZhHant rw;
	public ZhHant getRw() { return rw; }
	public void setRw(ZhHant rw){ this.rw = rw; }
	@Nullable
	public ZhHant pcd;
	public ZhHant getPcd() { return pcd; }
	public void setPcd(ZhHant pcd){ this.pcd = pcd; }
	@Nullable
	public ZhHant nb;
	public ZhHant getNb() { return nb; }
	public void setNb(ZhHant nb){ this.nb = nb; }
	@Nullable
	public ZhHant mhr;
	public ZhHant getMhr() { return mhr; }
	public void setMhr(ZhHant mhr){ this.mhr = mhr; }
	@Nullable
	public ZhHant niu;
	public ZhHant getNiu() { return niu; }
	public void setNiu(ZhHant niu){ this.niu = niu; }
	@Nullable
	public ZhHant my;
	public ZhHant getMy() { return my; }
	public void setMy(ZhHant my){ this.my = my; }
	@Nullable
	public ZhHant ks;
	public ZhHant getKs() { return ks; }
	public void setKs(ZhHant ks){ this.ks = ks; }
	@Nullable
	public ZhHant sq;
	public ZhHant getSq() { return sq; }
	public void setSq(ZhHant sq){ this.sq = sq; }
	@Nullable
	public ZhHant xal;
	public ZhHant getXal() { return xal; }
	public void setXal(ZhHant xal){ this.xal = xal; }
	@Nullable
	public ZhHant tet;
	public ZhHant getTet() { return tet; }
	public void setTet(ZhHant tet){ this.tet = tet; }
	@Nullable
	public ZhHant sv;
	public ZhHant getSv() { return sv; }
	public void setSv(ZhHant sv){ this.sv = sv; }
	@SerializedName("kk-kz")
	@Nullable
	public ZhHant kkKz;
	public ZhHant getKkKz() { return kkKz; }
	public void setKkKz(ZhHant kkKz){ this.kkKz = kkKz; }
	@Nullable
	public ZhHant uz;
	public ZhHant getUz() { return uz; }
	public void setUz(ZhHant uz){ this.uz = uz; }
	@Nullable
	public ZhHant hak;
	public ZhHant getHak() { return hak; }
	public void setHak(ZhHant hak){ this.hak = hak; }
	@Nullable
	public ZhHant ga;
	public ZhHant getGa() { return ga; }
	public void setGa(ZhHant ga){ this.ga = ga; }
	@Nullable
	public ZhHant lv;
	public ZhHant getLv() { return lv; }
	public void setLv(ZhHant lv){ this.lv = lv; }
	@Nullable
	public ZhHant mrj;
	public ZhHant getMrj() { return mrj; }
	public void setMrj(ZhHant mrj){ this.mrj = mrj; }
	@Nullable
	public ZhHant fj;
	public ZhHant getFj() { return fj; }
	public void setFj(ZhHant fj){ this.fj = fj; }
	@Nullable
	public ZhHant grc;
	public ZhHant getGrc() { return grc; }
	public void setGrc(ZhHant grc){ this.grc = grc; }
	@SerializedName("en-gb")
	@Nullable
	public ZhHant enGb;
	public ZhHant getEnGb() { return enGb; }
	public void setEnGb(ZhHant enGb){ this.enGb = enGb; }
	@Nullable
	public ZhHant ltg;
	public ZhHant getLtg() { return ltg; }
	public void setLtg(ZhHant ltg){ this.ltg = ltg; }
	@Nullable
	public ZhHant sdc;
	public ZhHant getSdc() { return sdc; }
	public void setSdc(ZhHant sdc){ this.sdc = sdc; }
	@Nullable
	public ZhHant kg;
	public ZhHant getKg() { return kg; }
	public void setKg(ZhHant kg){ this.kg = kg; }
	@SerializedName("gan-hans")
	@Nullable
	public ZhHant ganHans;
	public ZhHant getGanHans() { return ganHans; }
	public void setGanHans(ZhHant ganHans){ this.ganHans = ganHans; }
	@Nullable
	public ZhHant fy;
	public ZhHant getFy() { return fy; }
	public void setFy(ZhHant fy){ this.fy = fy; }
	@Nullable
	public ZhHant diq;
	public ZhHant getDiq() { return diq; }
	public void setDiq(ZhHant diq){ this.diq = diq; }
	@Nullable
	public ZhHant gsw;
	public ZhHant getGsw() { return gsw; }
	public void setGsw(ZhHant gsw){ this.gsw = gsw; }
	@Nullable
	public ZhHant ig;
	public ZhHant getIg() { return ig; }
	public void setIg(ZhHant ig){ this.ig = ig; }
	@Nullable
	public ZhHant bjn;
	public ZhHant getBjn() { return bjn; }
	public void setBjn(ZhHant bjn){ this.bjn = bjn; }
	@Nullable
	public ZhHant bar;
	public ZhHant getBar() { return bar; }
	public void setBar(ZhHant bar){ this.bar = bar; }
	@Nullable
	public ZhHant tl;
	public ZhHant getTl() { return tl; }
	public void setTl(ZhHant tl){ this.tl = tl; }
	@Nullable
	public ZhHant bpy;
	public ZhHant getBpy() { return bpy; }
	public void setBpy(ZhHant bpy){ this.bpy = bpy; }
	@Nullable
	public ZhHant war;
	public ZhHant getWar() { return war; }
	public void setWar(ZhHant war){ this.war = war; }
	@Nullable
	public ZhHant kl;
	public ZhHant getKl() { return kl; }
	public void setKl(ZhHant kl){ this.kl = kl; }
	@Nullable
	public ZhHant ml;
	public ZhHant getMl() { return ml; }
	public void setMl(ZhHant ml){ this.ml = ml; }
	@Nullable
	public ZhHant lo;
	public ZhHant getLo() { return lo; }
	public void setLo(ZhHant lo){ this.lo = lo; }
	@Nullable
	public ZhHant az;
	public ZhHant getAz() { return az; }
	public void setAz(ZhHant az){ this.az = az; }
	@Nullable
	public ZhHant brh;
	public ZhHant getBrh() { return brh; }
	public void setBrh(ZhHant brh){ this.brh = brh; }
	@Nullable
	public ZhHant ka;
	public ZhHant getKa() { return ka; }
	public void setKa(ZhHant ka){ this.ka = ka; }
	@Nullable
	public ZhHant cu;
	public ZhHant getCu() { return cu; }
	public void setCu(ZhHant cu){ this.cu = cu; }
	@SerializedName("zh-my")
	@Nullable
	public ZhHant zhMy;
	public ZhHant getZhMy() { return zhMy; }
	public void setZhMy(ZhHant zhMy){ this.zhMy = zhMy; }
	@Nullable
	public ZhHant gu;
	public ZhHant getGu() { return gu; }
	public void setGu(ZhHant gu){ this.gu = gu; }
	@Nullable
	public ZhHant kw;
	public ZhHant getKw() { return kw; }
	public void setKw(ZhHant kw){ this.kw = kw; }
	@Nullable
	public ZhHant cs;
	public ZhHant getCs() { return cs; }
	public void setCs(ZhHant cs){ this.cs = cs; }
	@Nullable
	public ZhHant ht;
	public ZhHant getHt() { return ht; }
	public void setHt(ZhHant ht){ this.ht = ht; }
	@Nullable
	public ZhHant rup;
	public ZhHant getRup() { return rup; }
	public void setRup(ZhHant rup){ this.rup = rup; }
	@Nullable
	public ZhHant ace;
	public ZhHant getAce() { return ace; }
	public void setAce(ZhHant ace){ this.ace = ace; }
	@Nullable
	public ZhHant krc;
	public ZhHant getKrc() { return krc; }
	public void setKrc(ZhHant krc){ this.krc = krc; }
	@SerializedName("zh-mo")
	@Nullable
	public ZhHant zhMo;
	public ZhHant getZhMo() { return zhMo; }
	public void setZhMo(ZhHant zhMo){ this.zhMo = zhMo; }
	@Nullable
	public ZhHant ny;
	public ZhHant getNy() { return ny; }
	public void setNy(ZhHant ny){ this.ny = ny; }
	@Nullable
	public ZhHant loz;
	public ZhHant getLoz() { return loz; }
	public void setLoz(ZhHant loz){ this.loz = loz; }
	@SerializedName("zh-hk")
	@Nullable
	public ZhHant zhHk;
	public ZhHant getZhHk() { return zhHk; }
	public void setZhHk(ZhHant zhHk){ this.zhHk = zhHk; }
	@SerializedName("kbd-cyrl")
	@Nullable
	public ZhHant kbdCyrl;
	public ZhHant getKbdCyrl() { return kbdCyrl; }
	public void setKbdCyrl(ZhHant kbdCyrl){ this.kbdCyrl = kbdCyrl; }
	@Nullable
	public ZhHant ln;
	public ZhHant getLn() { return ln; }
	public void setLn(ZhHant ln){ this.ln = ln; }
	@Nullable
	public ZhHant kaa;
	public ZhHant getKaa() { return kaa; }
	public void setKaa(ZhHant kaa){ this.kaa = kaa; }
	@Nullable
	public ZhHant cho;
	public ZhHant getCho() { return cho; }
	public void setCho(ZhHant cho){ this.cho = cho; }
	@Nullable
	public ZhHant nso;
	public ZhHant getNso() { return nso; }
	public void setNso(ZhHant nso){ this.nso = nso; }
	@Nullable
	public ZhHant ceb;
	public ZhHant getCeb() { return ceb; }
	public void setCeb(ZhHant ceb){ this.ceb = ceb; }
	@Nullable
	public ZhHant nan;
	public ZhHant getNan() { return nan; }
	public void setNan(ZhHant nan){ this.nan = nan; }
	@Nullable
	public ZhHant pam;
	public ZhHant getPam() { return pam; }
	public void setPam(ZhHant pam){ this.pam = pam; }
	@Nullable
	public ZhHant tn;
	public ZhHant getTn() { return tn; }
	public void setTn(ZhHant tn){ this.tn = tn; }
	@SerializedName("zh-cn")
	@Nullable
	public ZhHant zhCn;
	public ZhHant getZhCn() { return zhCn; }
	public void setZhCn(ZhHant zhCn){ this.zhCn = zhCn; }
	@Nullable
	public ZhHant mwl;
	public ZhHant getMwl() { return mwl; }
	public void setMwl(ZhHant mwl){ this.mwl = mwl; }
	@Nullable
	public ZhHant pap;
	public ZhHant getPap() { return pap; }
	public void setPap(ZhHant pap){ this.pap = pap; }
	@Nullable
	public ZhHant szl;
	public ZhHant getSzl() { return szl; }
	public void setSzl(ZhHant szl){ this.szl = szl; }
	@Nullable
	public ZhHant pdc;
	public ZhHant getPdc() { return pdc; }
	public void setPdc(ZhHant pdc){ this.pdc = pdc; }
	@Nullable
	public ZhHant azb;
	public ZhHant getAzb() { return azb; }
	public void setAzb(ZhHant azb){ this.azb = azb; }
	@Nullable
	public ZhHant srn;
	public ZhHant getSrn() { return srn; }
	public void setSrn(ZhHant srn){ this.srn = srn; }
	@Nullable
	public ZhHant kr;
	public ZhHant getKr() { return kr; }
	public void setKr(ZhHant kr){ this.kr = kr; }
	@Nullable
	public ZhHant pa;
	public ZhHant getPa() { return pa; }
	public void setPa(ZhHant pa){ this.pa = pa; }
	@Nullable
	public ZhHant gn;
	public ZhHant getGn() { return gn; }
	public void setGn(ZhHant gn){ this.gn = gn; }
	@Nullable
	public ZhHant nds;
	public ZhHant getNds() { return nds; }
	public void setNds(ZhHant nds){ this.nds = nds; }
	@Nullable
	public ZhHant hsb;
	public ZhHant getHsb() { return hsb; }
	public void setHsb(ZhHant hsb){ this.hsb = hsb; }
	@Nullable
	public ZhHant krj;
	public ZhHant getKrj() { return krj; }
	public void setKrj(ZhHant krj){ this.krj = krj; }
	@SerializedName("kk-cn")
	@Nullable
	public ZhHant kkCn;
	public ZhHant getKkCn() { return kkCn; }
	public void setKkCn(ZhHant kkCn){ this.kkCn = kkCn; }
	@Nullable
	public ZhHant se;
	public ZhHant getSe() { return se; }
	public void setSe(ZhHant se){ this.se = se; }
	@Nullable
	public ZhHant ko;
	public ZhHant getKo() { return ko; }
	public void setKo(ZhHant ko){ this.ko = ko; }
	@Nullable
	public ZhHant wuu;
	public ZhHant getWuu() { return wuu; }
	public void setWuu(ZhHant wuu){ this.wuu = wuu; }
	@Nullable
	public ZhHant cv;
	public ZhHant getCv() { return cv; }
	public void setCv(ZhHant cv){ this.cv = cv; }
	@Nullable
	public ZhHant tly;
	public ZhHant getTly() { return tly; }
	public void setTly(ZhHant tly){ this.tly = tly; }
	@Nullable
	public ZhHant chy;
	public ZhHant getChy() { return chy; }
	public void setChy(ZhHant chy){ this.chy = chy; }
	@SerializedName("zh-hans")
	@Nullable
	public ZhHant zhHans;
	public ZhHant getZhHans() { return zhHans; }
	public void setZhHans(ZhHant zhHans){ this.zhHans = zhHans; }
	@SerializedName("de-ch")
	@Nullable
	public ZhHant deCh;
	public ZhHant getDeCh() { return deCh; }
	public void setDeCh(ZhHant deCh){ this.deCh = deCh; }
	@Nullable
	public ZhHant hu;
	public ZhHant getHu() { return hu; }
	public void setHu(ZhHant hu){ this.hu = hu; }
	@Nullable
	public ZhHant rgn;
	public ZhHant getRgn() { return rgn; }
	public void setRgn(ZhHant rgn){ this.rgn = rgn; }
	@Nullable
	public ZhHant bn;
	public ZhHant getBn() { return bn; }
	public void setBn(ZhHant bn){ this.bn = bn; }
	@Nullable
	public ZhHant gl;
	public ZhHant getGl() { return gl; }
	public void setGl(ZhHant gl){ this.gl = gl; }
	@Nullable
	public ZhHant mt;
	public ZhHant getMt() { return mt; }
	public void setMt(ZhHant mt){ this.mt = mt; }
	@Nullable
	public ZhHant hz;
	public ZhHant getHz() { return hz; }
	public void setHz(ZhHant hz){ this.hz = hz; }
	@Nullable
	public ZhHant ms;
	public ZhHant getMs() { return ms; }
	public void setMs(ZhHant ms){ this.ms = ms; }
	@Nullable
	public ZhHant frp;
	public ZhHant getFrp() { return frp; }
	public void setFrp(ZhHant frp){ this.frp = frp; }
	@Nullable
	public ZhHant hil;
	public ZhHant getHil() { return hil; }
	public void setHil(ZhHant hil){ this.hil = hil; }
	@Nullable
	public ZhHant hi;
	public ZhHant getHi() { return hi; }
	public void setHi(ZhHant hi){ this.hi = hi; }
	@Nullable
	public ZhHant gd;
	public ZhHant getGd() { return gd; }
	public void setGd(ZhHant gd){ this.gd = gd; }
	@Nullable
	public ZhHant mr;
	public ZhHant getMr() { return mr; }
	public void setMr(ZhHant mr){ this.mr = mr; }
	@SerializedName("nds-nl")
	@Nullable
	public ZhHant ndsNl;
	public ZhHant getNdsNl() { return ndsNl; }
	public void setNdsNl(ZhHant ndsNl){ this.ndsNl = ndsNl; }
	@SerializedName("ug-latn")
	@Nullable
	public ZhHant ugLatn;
	public ZhHant getUgLatn() { return ugLatn; }
	public void setUgLatn(ZhHant ugLatn){ this.ugLatn = ugLatn; }
	@Nullable
	public ZhHant ha;
	public ZhHant getHa() { return ha; }
	public void setHa(ZhHant ha){ this.ha = ha; }
	@Nullable
	public ZhHant sat;
	public ZhHant getSat() { return sat; }
	public void setSat(ZhHant sat){ this.sat = sat; }
	@Nullable
	public ZhHant bm;
	public ZhHant getBm() { return bm; }
	public void setBm(ZhHant bm){ this.bm = bm; }
	@Nullable
	public ZhHant frc;
	public ZhHant getFrc() { return frc; }
	public void setFrc(ZhHant frc){ this.frc = frc; }
	@Nullable
	public ZhHant mzn;
	public ZhHant getMzn() { return mzn; }
	public void setMzn(ZhHant mzn){ this.mzn = mzn; }
	@Nullable
	public ZhHant ro;
	public ZhHant getRo() { return ro; }
	public void setRo(ZhHant ro){ this.ro = ro; }
	@Nullable
	public ZhHant zu;
	public ZhHant getZu() { return zu; }
	public void setZu(ZhHant zu){ this.zu = zu; }
	@Nullable
	public ZhHant tcy;
	public ZhHant getTcy() { return tcy; }
	public void setTcy(ZhHant tcy){ this.tcy = tcy; }
	@Nullable
	public ZhHant ee;
	public ZhHant getEe() { return ee; }
	public void setEe(ZhHant ee){ this.ee = ee; }
	@Nullable
	public ZhHant dsb;
	public ZhHant getDsb() { return dsb; }
	public void setDsb(ZhHant dsb){ this.dsb = dsb; }
	@Nullable
	public ZhHant ta;
	public ZhHant getTa() { return ta; }
	public void setTa(ZhHant ta){ this.ta = ta; }
	@Nullable
	public ZhHant za;
	public ZhHant getZa() { return za; }
	public void setZa(ZhHant za){ this.za = za; }
	@Nullable
	public ZhHant wa;
	public ZhHant getWa() { return wa; }
	public void setWa(ZhHant wa){ this.wa = wa; }
	@Nullable
	public ZhHant myv;
	public ZhHant getMyv() { return myv; }
	public void setMyv(ZhHant myv){ this.myv = myv; }
	@Nullable
	public ZhHant pl;
	public ZhHant getPl() { return pl; }
	public void setPl(ZhHant pl){ this.pl = pl; }
	@Nullable
	public ZhHant dtp;
	public ZhHant getDtp() { return dtp; }
	public void setDtp(ZhHant dtp){ this.dtp = dtp; }
	@Nullable
	public ZhHant hy;
	public ZhHant getHy() { return hy; }
	public void setHy(ZhHant hy){ this.hy = hy; }
	@SerializedName("shi-tfng")
	@Nullable
	public ZhHant shiTfng;
	public ZhHant getShiTfng() { return shiTfng; }
	public void setShiTfng(ZhHant shiTfng){ this.shiTfng = shiTfng; }
	@Nullable
	public ZhHant lad;
	public ZhHant getLad() { return lad; }
	public void setLad(ZhHant lad){ this.lad = lad; }
	@Nullable
	public ZhHant nov;
	public ZhHant getNov() { return nov; }
	public void setNov(ZhHant nov){ this.nov = nov; }
	@Nullable
	public ZhHant lzh;
	public ZhHant getLzh() { return lzh; }
	public void setLzh(ZhHant lzh){ this.lzh = lzh; }
	@Nullable
	public ZhHant bho;
	public ZhHant getBho() { return bho; }
	public void setBho(ZhHant bho){ this.bho = bho; }
	@Nullable
	public ZhHant an;
	public ZhHant getAn() { return an; }
	public void setAn(ZhHant an){ this.an = an; }
	@Nullable
	public ZhHant mh;
	public ZhHant getMh() { return mh; }
	public void setMh(ZhHant mh){ this.mh = mh; }
	@Nullable
	public ZhHant is;
	public ZhHant getIs() { return is; }
	public void setIs(ZhHant is){ this.is = is; }
	@Nullable
	public ZhHant cy;
	public ZhHant getCy() { return cy; }
	public void setCy(ZhHant cy){ this.cy = cy; }
	@SerializedName("kk-latn")
	@Nullable
	public ZhHant kkLatn;
	public ZhHant getKkLatn() { return kkLatn; }
	public void setKkLatn(ZhHant kkLatn){ this.kkLatn = kkLatn; }
	@Nullable
	public ZhHant ab;
	public ZhHant getAb() { return ab; }
	public void setAb(ZhHant ab){ this.ab = ab; }
	@Nullable
	public ZhHant stq;
	public ZhHant getStq() { return stq; }
	public void setStq(ZhHant stq){ this.stq = stq; }
	@Nullable
	public ZhHant ia;
	public ZhHant getIa() { return ia; }
	public void setIa(ZhHant ia){ this.ia = ia; }
	@Nullable
	public ZhHant udm;
	public ZhHant getUdm() { return udm; }
	public void setUdm(ZhHant udm){ this.udm = udm; }
	@Nullable
	public ZhHant tk;
	public ZhHant getTk() { return tk; }
	public void setTk(ZhHant tk){ this.tk = tk; }
	@Nullable
	public ZhHant mn;
	public ZhHant getMn() { return mn; }
	public void setMn(ZhHant mn){ this.mn = mn; }
	@Nullable
	public ZhHant kk;
	public ZhHant getKk() { return kk; }
	public void setKk(ZhHant kk){ this.kk = kk; }
	@Nullable
	public ZhHant vro;
	public ZhHant getVro() { return vro; }
	public void setVro(ZhHant vro){ this.vro = vro; }
	@Nullable
	public ZhHant sma;
	public ZhHant getSma() { return sma; }
	public void setSma(ZhHant sma){ this.sma = sma; }
	@Nullable
	public ZhHant ps;
	public ZhHant getPs() { return ps; }
	public void setPs(ZhHant ps){ this.ps = ps; }
	@Nullable
	public ZhHant su;
	public ZhHant getSu() { return su; }
	public void setSu(ZhHant su){ this.su = su; }
	@Nullable
	public ZhHant qu;
	public ZhHant getQu() { return qu; }
	public void setQu(ZhHant qu){ this.qu = qu; }
	@Nullable
	public ZhHant lmo;
	public ZhHant getLmo() { return lmo; }
	public void setLmo(ZhHant lmo){ this.lmo = lmo; }
	@Nullable
	public ZhHant or;
	public ZhHant getOr() { return or; }
	public void setOr(ZhHant or){ this.or = or; }
	@SerializedName("ks-arab")
	@Nullable
	public ZhHant ksArab;
	public ZhHant getKsArab() { return ksArab; }
	public void setKsArab(ZhHant ksArab){ this.ksArab = ksArab; }
	@Nullable
	public ZhHant bs;
	public ZhHant getBs() { return bs; }
	public void setBs(ZhHant bs){ this.bs = bs; }
	@Nullable
	public ZhHant lus;
	public ZhHant getLus() { return lus; }
	public void setLus(ZhHant lus){ this.lus = lus; }
	@Nullable
	public ZhHant ary;
	public ZhHant getAry() { return ary; }
	public void setAry(ZhHant ary){ this.ary = ary; }
	@Nullable
	public ZhHant io;
	public ZhHant getIo() { return io; }
	public void setIo(ZhHant io){ this.io = io; }
	@Nullable
	public ZhHant pt;
	public ZhHant getPt() { return pt; }
	public void setPt(ZhHant pt){ this.pt = pt; }
	@Nullable
	public ZhHant rmy;
	public ZhHant getRmy() { return rmy; }
	public void setRmy(ZhHant rmy){ this.rmy = rmy; }
	@Nullable
	public ZhHant jam;
	public ZhHant getJam() { return jam; }
	public void setJam(ZhHant jam){ this.jam = jam; }
	@Nullable
	public ZhHant nn;
	public ZhHant getNn() { return nn; }
	public void setNn(ZhHant nn){ this.nn = nn; }
	@Nullable
	public ZhHant ts;
	public ZhHant getTs() { return ts; }
	public void setTs(ZhHant ts){ this.ts = ts; }
	@Nullable
	public ZhHant lt;
	public ZhHant getLt() { return lt; }
	public void setLt(ZhHant lt){ this.lt = lt; }
	@SerializedName("sr-el")
	@Nullable
	public ZhHant srEl;
	public ZhHant getSrEl() { return srEl; }
	public void setSrEl(ZhHant srEl){ this.srEl = srEl; }
	@Nullable
	public ZhHant nap;
	public ZhHant getNap() { return nap; }
	public void setNap(ZhHant nap){ this.nap = nap; }
	@SerializedName("ike-cans")
	@Nullable
	public ZhHant ikeCans;
	public ZhHant getIkeCans() { return ikeCans; }
	public void setIkeCans(ZhHant ikeCans){ this.ikeCans = ikeCans; }
	@Nullable
	public ZhHant xmf;
	public ZhHant getXmf() { return xmf; }
	public void setXmf(ZhHant xmf){ this.xmf = xmf; }
	@SerializedName("cbk-zam")
	@Nullable
	public ZhHant cbkZam;
	public ZhHant getCbkZam() { return cbkZam; }
	public void setCbkZam(ZhHant cbkZam){ this.cbkZam = cbkZam; }
	@Nullable
	public ZhHant sn;
	public ZhHant getSn() { return sn; }
	public void setSn(ZhHant sn){ this.sn = sn; }
	@Nullable
	public ZhHant tg;
	public ZhHant getTg() { return tg; }
	public void setTg(ZhHant tg){ this.tg = tg; }
	@Nullable
	public ZhHant fr;
	public ZhHant getFr() { return fr; }
	public void setFr(ZhHant fr){ this.fr = fr; }
	@Nullable
	public ZhHant dv;
	public ZhHant getDv() { return dv; }
	public void setDv(ZhHant dv){ this.dv = dv; }
	@Nullable
	public ZhHant mk;
	public ZhHant getMk() { return mk; }
	public void setMk(ZhHant mk){ this.mk = mk; }
	@Nullable
	public ZhHant aa;
	public ZhHant getAa() { return aa; }
	public void setAa(ZhHant aa){ this.aa = aa; }
	@Nullable
	public ZhHant ilo;
	public ZhHant getIlo() { return ilo; }
	public void setIlo(ZhHant ilo){ this.ilo = ilo; }
	@Nullable
	public ZhHant so;
	public ZhHant getSo() { return so; }
	public void setSo(ZhHant so){ this.so = so; }
	@Nullable
	public ZhHant om;
	public ZhHant getOm() { return om; }
	public void setOm(ZhHant om){ this.om = om; }
	@Nullable
	public ZhHant wo;
	public ZhHant getWo() { return wo; }
	public void setWo(ZhHant wo){ this.wo = wo; }
	@Nullable
	public ZhHant ty;
	public ZhHant getTy() { return ty; }
	public void setTy(ZhHant ty){ this.ty = ty; }
	@Nullable
	public ZhHant fa;
	public ZhHant getFa() { return fa; }
	public void setFa(ZhHant fa){ this.fa = fa; }
	@Nullable
	public ZhHant ku;
	public ZhHant getKu() { return ku; }
	public void setKu(ZhHant ku){ this.ku = ku; }
	@SerializedName("zh-sg")
	@Nullable
	public ZhHant zhSg;
	public ZhHant getZhSg() { return zhSg; }
	public void setZhSg(ZhHant zhSg){ this.zhSg = zhSg; }
	@Nullable
	public ZhHant cps;
	public ZhHant getCps() { return cps; }
	public void setCps(ZhHant cps){ this.cps = cps; }
	@SerializedName("kk-tr")
	@Nullable
	public ZhHant kkTr;
	public ZhHant getKkTr() { return kkTr; }
	public void setKkTr(ZhHant kkTr){ this.kkTr = kkTr; }
	@Nullable
	public ZhHant fur;
	public ZhHant getFur() { return fur; }
	public void setFur(ZhHant fur){ this.fur = fur; }
	@Nullable
	public ZhHant cr;
	public ZhHant getCr() { return cr; }
	public void setCr(ZhHant cr){ this.cr = cr; }
	@Nullable
	public ZhHant egl;
	public ZhHant getEgl() { return egl; }
	public void setEgl(ZhHant egl){ this.egl = egl; }
	@Nullable
	public ZhHant kj;
	public ZhHant getKj() { return kj; }
	public void setKj(ZhHant kj){ this.kj = kj; }
	@Nullable
	public ZhHant nrm;
	public ZhHant getNrm() { return nrm; }
	public void setNrm(ZhHant nrm){ this.nrm = nrm; }
	@Nullable
	public ZhHant am;
	public ZhHant getAm() { return am; }
	public void setAm(ZhHant am){ this.am = am; }
	@Nullable
	public ZhHant bi;
	public ZhHant getBi() { return bi; }
	public void setBi(ZhHant bi){ this.bi = bi; }
	@Nullable
	public ZhHant sah;
	public ZhHant getSah() { return sah; }
	public void setSah(ZhHant sah){ this.sah = sah; }
	@SerializedName("crh-cyrl")
	@Nullable
	public ZhHant crhCyrl;
	public ZhHant getCrhCyrl() { return crhCyrl; }
	public void setCrhCyrl(ZhHant crhCyrl){ this.crhCyrl = crhCyrl; }
	@Nullable
	public ZhHant kiu;
	public ZhHant getKiu() { return kiu; }
	public void setKiu(ZhHant kiu){ this.kiu = kiu; }
	@Nullable
	public ZhHant ca;
	public ZhHant getCa() { return ca; }
	public void setCa(ZhHant ca){ this.ca = ca; }
	@Nullable
	public ZhHant got;
	public ZhHant getGot() { return got; }
	public void setGot(ZhHant got){ this.got = got; }
	@SerializedName("ike-latn")
	@Nullable
	public ZhHant ikeLatn;
	public ZhHant getIkeLatn() { return ikeLatn; }
	public void setIkeLatn(ZhHant ikeLatn){ this.ikeLatn = ikeLatn; }
	@Nullable
	public ZhHant lzz;
	public ZhHant getLzz() { return lzz; }
	public void setLzz(ZhHant lzz){ this.lzz = lzz; }
	@Nullable
	public ZhHant eu;
	public ZhHant getEu() { return eu; }
	public void setEu(ZhHant eu){ this.eu = eu; }
	@Nullable
	public ZhHant nah;
	public ZhHant getNah() { return nah; }
	public void setNah(ZhHant nah){ this.nah = nah; }
	@Nullable
	public ZhHant et;
	public ZhHant getEt() { return et; }
	public void setEt(ZhHant et){ this.et = et; }
	@Nullable
	public ZhHant scn;
	public ZhHant getScn() { return scn; }
	public void setScn(ZhHant scn){ this.scn = scn; }
	@Nullable
	public ZhHant vmf;
	public ZhHant getVmf() { return vmf; }
	public void setVmf(ZhHant vmf){ this.vmf = vmf; }
	@Nullable
	public ZhHant ja;
	public ZhHant getJa() { return ja; }
	public void setJa(ZhHant ja){ this.ja = ja; }
	@Nullable
	public ZhHant hif;
	public ZhHant getHif() { return hif; }
	public void setHif(ZhHant hif){ this.hif = hif; }
	@SerializedName("kk-arab")
	@Nullable
	public ZhHant kkArab;
	public ZhHant getKkArab() { return kkArab; }
	public void setKkArab(ZhHant kkArab){ this.kkArab = kkArab; }
	@Nullable
	public ZhHant gv;
	public ZhHant getGv() { return gv; }
	public void setGv(ZhHant gv){ this.gv = gv; }
	@Nullable
	public ZhHant ce;
	public ZhHant getCe() { return ce; }
	public void setCe(ZhHant ce){ this.ce = ce; }
	@Nullable
	public ZhHant yo;
	public ZhHant getYo() { return yo; }
	public void setYo(ZhHant yo){ this.yo = yo; }
	@Nullable
	public ZhHant csb;
	public ZhHant getCsb() { return csb; }
	public void setCsb(ZhHant csb){ this.csb = csb; }
	@Nullable
	public ZhHant kv;
	public ZhHant getKv() { return kv; }
	public void setKv(ZhHant kv){ this.kv = kv; }
	@Nullable
	public ZhHant mo;
	public ZhHant getMo() { return mo; }
	public void setMo(ZhHant mo){ this.mo = mo; }
	@SerializedName("tt-cyrl")
	@Nullable
	public ZhHant ttCyrl;
	public ZhHant getTtCyrl() { return ttCyrl; }
	public void setTtCyrl(ZhHant ttCyrl){ this.ttCyrl = ttCyrl; }
	@SerializedName("pt-br")
	@Nullable
	public ZhHant ptBr;
	public ZhHant getPtBr() { return ptBr; }
	public void setPtBr(ZhHant ptBr){ this.ptBr = ptBr; }
	@Nullable
	public ZhHant mdf;
	public ZhHant getMdf() { return mdf; }
	public void setMdf(ZhHant mdf){ this.mdf = mdf; }
	@Nullable
	public ZhHant tyv;
	public ZhHant getTyv() { return tyv; }
	public void setTyv(ZhHant tyv){ this.tyv = tyv; }
	@Nullable
	public ZhHant ang;
	public ZhHant getAng() { return ang; }
	public void setAng(ZhHant ang){ this.ang = ang; }
	@SerializedName("ku-latn")
	@Nullable
	public ZhHant kuLatn;
	public ZhHant getKuLatn() { return kuLatn; }
	public void setKuLatn(ZhHant kuLatn){ this.kuLatn = kuLatn; }
	@SerializedName("be-x-old")
	@Nullable
	public ZhHant beXOld;
	public ZhHant getBeXOld() { return beXOld; }
	public void setBeXOld(ZhHant beXOld){ this.beXOld = beXOld; }
	@Nullable
	public ZhHant ckb;
	public ZhHant getCkb() { return ckb; }
	public void setCkb(ZhHant ckb){ this.ckb = ckb; }
	@Nullable
	public ZhHant en;
	public ZhHant getEn() { return en; }
	public void setEn(ZhHant en){ this.en = en; }
	@Nullable
	public ZhHant sgs;
	public ZhHant getSgs() { return sgs; }
	public void setSgs(ZhHant sgs){ this.sgs = sgs; }
	@SerializedName("nl-informal")
	@Nullable
	public ZhHant nlInformal;
	public ZhHant getNlInformal() { return nlInformal; }
	public void setNlInformal(ZhHant nlInformal){ this.nlInformal = nlInformal; }
	@Nullable
	public ZhHant lez;
	public ZhHant getLez() { return lez; }
	public void setLez(ZhHant lez){ this.lez = lez; }
	@Nullable
	public ZhHant br;
	public ZhHant getBr() { return br; }
	public void setBr(ZhHant br){ this.br = br; }
	@SerializedName("roa-tara")
	@Nullable
	public ZhHant roaTara;
	public ZhHant getRoaTara() { return roaTara; }
	public void setRoaTara(ZhHant roaTara){ this.roaTara = roaTara; }
	@Nullable
	public ZhHant lb;
	public ZhHant getLb() { return lb; }
	public void setLb(ZhHant lb){ this.lb = lb; }
	@Nullable
	public ZhHant koi;
	public ZhHant getKoi() { return koi; }
	public void setKoi(ZhHant koi){ this.koi = koi; }
	@Nullable
	public ZhHant mus;
	public ZhHant getMus() { return mus; }
	public void setMus(ZhHant mus){ this.mus = mus; }
	@Nullable
	public ZhHant uk;
	public ZhHant getUk() { return uk; }
	public void setUk(ZhHant uk){ this.uk = uk; }
	@Nullable
	public ZhHant eo;
	public ZhHant getEo() { return eo; }
	public void setEo(ZhHant eo){ this.eo = eo; }
	@Nullable
	public ZhHant eml;
	public ZhHant getEml() { return eml; }
	public void setEml(ZhHant eml){ this.eml = eml; }
	@Nullable
	public ZhHant os;
	public ZhHant getOs() { return os; }
	public void setOs(ZhHant os){ this.os = os; }
	@Nullable
	public ZhHant bcl;
	public ZhHant getBcl() { return bcl; }
	public void setBcl(ZhHant bcl){ this.bcl = bcl; }
	@Nullable
	public ZhHant pfl;
	public ZhHant getPfl() { return pfl; }
	public void setPfl(ZhHant pfl){ this.pfl = pfl; }
	@SerializedName("ks-deva")
	@Nullable
	public ZhHant ksDeva;
	public ZhHant getKsDeva() { return ksDeva; }
	public void setKsDeva(ZhHant ksDeva){ this.ksDeva = ksDeva; }
	@SerializedName("ruq-cyrl")
	@Nullable
	public ZhHant ruqCyrl;
	public ZhHant getRuqCyrl() { return ruqCyrl; }
	public void setRuqCyrl(ZhHant ruqCyrl){ this.ruqCyrl = ruqCyrl; }
	@Nullable
	public ZhHant lfn;
	public ZhHant getLfn() { return lfn; }
	public void setLfn(ZhHant lfn){ this.lfn = lfn; }
	@Nullable
	public ZhHant min;
	public ZhHant getMin() { return min; }
	public void setMin(ZhHant min){ this.min = min; }
	@Nullable
	public ZhHant avk;
	public ZhHant getAvk() { return avk; }
	public void setAvk(ZhHant avk){ this.avk = avk; }
	@Nullable
	public ZhHant te;
	public ZhHant getTe() { return te; }
	public void setTe(ZhHant te){ this.te = te; }
	@Nullable
	public ZhHant simple;
	public ZhHant getSimple() { return simple; }
	public void setSimple(ZhHant simple){ this.simple = simple; }
	@Nullable
	public ZhHant ruq;
	public ZhHant getRuq() { return ruq; }
	public void setRuq(ZhHant ruq){ this.ruq = ruq; }
	@SerializedName("hif-latn")
	@Nullable
	public ZhHant hifLatn;
	public ZhHant getHifLatn() { return hifLatn; }
	public void setHifLatn(ZhHant hifLatn){ this.hifLatn = hifLatn; }
	@Nullable
	public ZhHant km;
	public ZhHant getKm() { return km; }
	public void setKm(ZhHant km){ this.km = km; }
	@Nullable
	public ZhHant dz;
	public ZhHant getDz() { return dz; }
	public void setDz(ZhHant dz){ this.dz = dz; }
	@Nullable
	public ZhHant to;
	public ZhHant getTo() { return to; }
	public void setTo(ZhHant to){ this.to = to; }
	@Nullable
	public ZhHant ch;
	public ZhHant getCh() { return ch; }
	public void setCh(ZhHant ch){ this.ch = ch; }
	@Nullable
	public ZhHant pnt;
	public ZhHant getPnt() { return pnt; }
	public void setPnt(ZhHant pnt){ this.pnt = pnt; }
	@Nullable
	public ZhHant ii;
	public ZhHant getIi() { return ii; }
	public void setIi(ZhHant ii){ this.ii = ii; }
	@Nullable
	public ZhHant chr;
	public ZhHant getChr() { return chr; }
	public void setChr(ZhHant chr){ this.chr = chr; }
	@Nullable
	public ZhHant it;
	public ZhHant getIt() { return it; }
	public void setIt(ZhHant it){ this.it = it; }
	@SerializedName("ku-arab")
	@Nullable
	public ZhHant kuArab;
	public ZhHant getKuArab() { return kuArab; }
	public void setKuArab(ZhHant kuArab){ this.kuArab = kuArab; }
	@Nullable
	public ZhHant bxr;
	public ZhHant getBxr() { return bxr; }
	public void setBxr(ZhHant bxr){ this.bxr = bxr; }
	@Nullable
	public ZhHant tru;
	public ZhHant getTru() { return tru; }
	public void setTru(ZhHant tru){ this.tru = tru; }
	@Nullable
	public ZhHant sli;
	public ZhHant getSli() { return sli; }
	public void setSli(ZhHant sli){ this.sli = sli; }
	@SerializedName("ruq-latn")
	@Nullable
	public ZhHant ruqLatn;
	public ZhHant getRuqLatn() { return ruqLatn; }
	public void setRuqLatn(ZhHant ruqLatn){ this.ruqLatn = ruqLatn; }
	@Nullable
	public ZhHant vls;
	public ZhHant getVls() { return vls; }
	public void setVls(ZhHant vls){ this.vls = vls; }
	@Nullable
	public ZhHant ik;
	public ZhHant getIk() { return ik; }
	public void setIk(ZhHant ik){ this.ik = ik; }
	@Nullable
	public ZhHant frr;
	public ZhHant getFrr() { return frr; }
	public void setFrr(ZhHant frr){ this.frr = frr; }
	@Nullable
	public ZhHant bg;
	public ZhHant getBg() { return bg; }
	public void setBg(ZhHant bg){ this.bg = bg; }
	@SerializedName("map-bms")
	@Nullable
	public ZhHant mapBms;
	public ZhHant getMapBms() { return mapBms; }
	public void setMapBms(ZhHant mapBms){ this.mapBms = mapBms; }
	@Nullable
	public ZhHant kri;
	public ZhHant getKri() { return kri; }
	public void setKri(ZhHant kri){ this.kri = kri; }
	@Nullable
	public ZhHant zh;
	public ZhHant getZh() { return zh; }
	public void setZh(ZhHant zh){ this.zh = zh; }
	@Nullable
	public ZhHant he;
	public ZhHant getHe() { return he; }
	public void setHe(ZhHant he){ this.he = he; }
	@Nullable
	public ZhHant jbo;
	public ZhHant getJbo() { return jbo; }
	public void setJbo(ZhHant jbo){ this.jbo = jbo; }
	@Nullable
	public ZhHant da;
	public ZhHant getDa() { return da; }
	public void setDa(ZhHant da){ this.da = da; }
	@Nullable
	public ZhHant bqi;
	public ZhHant getBqi() { return bqi; }
	public void setBqi(ZhHant bqi){ this.bqi = bqi; }
	@Nullable
	public ZhHant jut;
	public ZhHant getJut() { return jut; }
	public void setJut(ZhHant jut){ this.jut = jut; }
	@Nullable
	public ZhHant khw;
	public ZhHant getKhw() { return khw; }
	public void setKhw(ZhHant khw){ this.khw = khw; }
	@Nullable
	public ZhHant sei;
	public ZhHant getSei() { return sei; }
	public void setSei(ZhHant sei){ this.sei = sei; }
	@Nullable
	public ZhHant ba;
	public ZhHant getBa() { return ba; }
	public void setBa(ZhHant ba){ this.ba = ba; }
	@Nullable
	public ZhHant shi;
	public ZhHant getShi() { return shi; }
	public void setShi(ZhHant shi){ this.shi = shi; }
	@Nullable
	public ZhHant ng;
	public ZhHant getNg() { return ng; }
	public void setNg(ZhHant ng){ this.ng = ng; }
	@Nullable
	public ZhHant iu;
	public ZhHant getIu() { return iu; }
	public void setIu(ZhHant iu){ this.iu = iu; }
	@Nullable
	public ZhHant rwr;
	public ZhHant getRwr() { return rwr; }
	public void setRwr(ZhHant rwr){ this.rwr = rwr; }
	@Nullable
	public ZhHant sk;
	public ZhHant getSk() { return sk; }
	public void setSk(ZhHant sk){ this.sk = sk; }
	@SerializedName("de-formal")
	@Nullable
	public ZhHant deFormal;
	public ZhHant getDeFormal() { return deFormal; }
	public void setDeFormal(ZhHant deFormal){ this.deFormal = deFormal; }
	@Nullable
	public ZhHant sw;
	public ZhHant getSw() { return sw; }
	public void setSw(ZhHant sw){ this.sw = sw; }
	@Nullable
	public ZhHant liv;
	public ZhHant getLiv() { return liv; }
	public void setLiv(ZhHant liv){ this.liv = liv; }
	@Nullable
	public ZhHant fo;
	public ZhHant getFo() { return fo; }
	public void setFo(ZhHant fo){ this.fo = fo; }
	@Nullable
	public ZhHant ff;
	public ZhHant getFf() { return ff; }
	public void setFf(ZhHant ff){ this.ff = ff; }
	@Nullable
	public ZhHant ru;
	public ZhHant getRu() { return ru; }
	public void setRu(ZhHant ru){ this.ru = ru; }
	@Nullable
	public ZhHant si;
	public ZhHant getSi() { return si; }
	public void setSi(ZhHant si){ this.si = si; }
	@Nullable
	public ZhHant rm;
	public ZhHant getRm() { return rm; }
	public void setRm(ZhHant rm){ this.rm = rm; }
	@Nullable
	public ZhHant ki;
	public ZhHant getKi() { return ki; }
	public void setKi(ZhHant ki){ this.ki = ki; }
	@Nullable
	public ZhHant bug;
	public ZhHant getBug() { return bug; }
	public void setBug(ZhHant bug){ this.bug = bug; }
	@Nullable
	public ZhHant jv;
	public ZhHant getJv() { return jv; }
	public void setJv(ZhHant jv){ this.jv = jv; }
	@Nullable
	public ZhHant anp;
	public ZhHant getAnp() { return anp; }
	public void setAnp(ZhHant anp){ this.anp = anp; }
	}
	public static class Datavalue {
	@Nullable
	public String value;
	public String getValue() { return value; }
	public void setValue(String value){ this.value = value; }
	@Nullable
	public String type;
	public String getType() { return type; }
	public void setType(String type){ this.type = type; }
	}
	public static class Mainsnak {
	@Nullable
	public Datavalue datavalue;
	public Datavalue getDatavalue() { return datavalue; }
	public void setDatavalue(Datavalue datavalue){ this.datavalue = datavalue; }
	@Nullable
	public String snaktype;
	public String getSnaktype() { return snaktype; }
	public void setSnaktype(String snaktype){ this.snaktype = snaktype; }
	@Nullable
	public String datatype;
	public String getDatatype() { return datatype; }
	public void setDatatype(String datatype){ this.datatype = datatype; }
	@Nullable
	public String property;
	public String getProperty() { return property; }
	public void setProperty(String property){ this.property = property; }
	}
	public static class P1245 {
	@Nullable
	public String type;
	public String getType() { return type; }
	public void setType(String type){ this.type = type; }
	@Nullable
	public String rank;
	public String getRank() { return rank; }
	public void setRank(String rank){ this.rank = rank; }
	@Nullable
	public Mainsnak mainsnak;
	public Mainsnak getMainsnak() { return mainsnak; }
	public void setMainsnak(Mainsnak mainsnak){ this.mainsnak = mainsnak; }
	@Nullable
	public String id;
	public String getId() { return id; }
	public void setId(String id){ this.id = id; }
	}
	public static class Value {
	@Nullable
	public String unit;
	public String getUnit() { return unit; }
	public void setUnit(String unit){ this.unit = unit; }
	@Nullable
	public String calendarmodel;
	public String getCalendarmodel() { return calendarmodel; }
	public void setCalendarmodel(String calendarmodel){ this.calendarmodel = calendarmodel; }
	@Nullable
	public Integer before;
	public Integer getBefore() { return before; }
	public void setBefore(Integer before){ this.before = before; }
	@Nullable
	public Double precision;
	public Double getPrecision() { return precision; }
	public void setPrecision(Double precision){ this.precision = precision; }
	@Nullable
	public Integer timezone;
	public Integer getTimezone() { return timezone; }
	public void setTimezone(Integer timezone){ this.timezone = timezone; }
	@SerializedName("numeric-id")
	@Nullable
	public Integer numericId;
	public Integer getNumericId() { return numericId; }
	public void setNumericId(Integer numericId){ this.numericId = numericId; }
	@Nullable
	public String time;
	public String getTime() { return time; }
	public void setTime(String time){ this.time = time; }
	@Nullable
	public Double longitude;
	public Double getLongitude() { return longitude; }
	public void setLongitude(Double longitude){ this.longitude = longitude; }
	@SerializedName("entity-type")
	@Nullable
	public String entityType;
	public String getEntityType() { return entityType; }
	public void setEntityType(String entityType){ this.entityType = entityType; }
	@Nullable
	public String language;
	public String getLanguage() { return language; }
	public void setLanguage(String language){ this.language = language; }
	@Nullable
	public String amount;
	public String getAmount() { return amount; }
	public void setAmount(String amount){ this.amount = amount; }
	@Nullable
	public Integer after;
	public Integer getAfter() { return after; }
	public void setAfter(Integer after){ this.after = after; }
	@Nullable
	public String lowerBound;
	public String getLowerBound() { return lowerBound; }
	public void setLowerBound(String lowerBound){ this.lowerBound = lowerBound; }
	@Nullable
	public String globe;
	public String getGlobe() { return globe; }
	public void setGlobe(String globe){ this.globe = globe; }
	@Nullable
	public Double latitude;
	public Double getLatitude() { return latitude; }
	public void setLatitude(Double latitude){ this.latitude = latitude; }
	@Nullable
	public String upperBound;
	public String getUpperBound() { return upperBound; }
	public void setUpperBound(String upperBound){ this.upperBound = upperBound; }
	@Nullable
	public String text;
	public String getText() { return text; }
	public void setText(String text){ this.text = text; }
	@Nullable
	public String altitude;
	public String getAltitude() { return altitude; }
	public void setAltitude(String altitude){ this.altitude = altitude; }
	}
	public static class Snaks {
	@SerializedName("P393")
	@Nullable
	public List<Mainsnak> p393;
	public List<Mainsnak> getP393() { return p393; }
	public void setP393(List<Mainsnak> p393){ this.p393 = p393; }
	@SerializedName("P747")
	@Nullable
	public List<Mainsnak> p747;
	public List<Mainsnak> getP747() { return p747; }
	public void setP747(List<Mainsnak> p747){ this.p747 = p747; }
	@SerializedName("P698")
	@Nullable
	public List<Mainsnak> p698;
	public List<Mainsnak> getP698() { return p698; }
	public void setP698(List<Mainsnak> p698){ this.p698 = p698; }
	@SerializedName("P554")
	@Nullable
	public List<Mainsnak> p554;
	public List<Mainsnak> getP554() { return p554; }
	public void setP554(List<Mainsnak> p554){ this.p554 = p554; }
	@SerializedName("P449")
	@Nullable
	public List<Mainsnak> p449;
	public List<Mainsnak> getP449() { return p449; }
	public void setP449(List<Mainsnak> p449){ this.p449 = p449; }
	@SerializedName("P31")
	@Nullable
	public List<Mainsnak> p31;
	public List<Mainsnak> getP31() { return p31; }
	public void setP31(List<Mainsnak> p31){ this.p31 = p31; }
	@SerializedName("P357")
	@Nullable
	public List<Mainsnak> p357;
	public List<Mainsnak> getP357() { return p357; }
	public void setP357(List<Mainsnak> p357){ this.p357 = p357; }
	@SerializedName("P806")
	@Nullable
	public List<Mainsnak> p806;
	public List<Mainsnak> getP806() { return p806; }
	public void setP806(List<Mainsnak> p806){ this.p806 = p806; }
	@SerializedName("P186")
	@Nullable
	public List<Mainsnak> p186;
	public List<Mainsnak> getP186() { return p186; }
	public void setP186(List<Mainsnak> p186){ this.p186 = p186; }
	@SerializedName("P641")
	@Nullable
	public List<Mainsnak> p641;
	public List<Mainsnak> getP641() { return p641; }
	public void setP641(List<Mainsnak> p641){ this.p641 = p641; }
	@SerializedName("P535")
	@Nullable
	public List<Mainsnak> p535;
	public List<Mainsnak> getP535() { return p535; }
	public void setP535(List<Mainsnak> p535){ this.p535 = p535; }
	@SerializedName("P815")
	@Nullable
	public List<Mainsnak> p815;
	public List<Mainsnak> getP815() { return p815; }
	public void setP815(List<Mainsnak> p815){ this.p815 = p815; }
	@SerializedName("P304")
	@Nullable
	public List<Mainsnak> p304;
	public List<Mainsnak> getP304() { return p304; }
	public void setP304(List<Mainsnak> p304){ this.p304 = p304; }
	@SerializedName("P662")
	@Nullable
	public List<Mainsnak> p662;
	public List<Mainsnak> getP662() { return p662; }
	public void setP662(List<Mainsnak> p662){ this.p662 = p662; }
	@SerializedName("P103")
	@Nullable
	public List<Mainsnak> p103;
	public List<Mainsnak> getP103() { return p103; }
	public void setP103(List<Mainsnak> p103){ this.p103 = p103; }
	@SerializedName("P380")
	@Nullable
	public List<Mainsnak> p380;
	public List<Mainsnak> getP380() { return p380; }
	public void setP380(List<Mainsnak> p380){ this.p380 = p380; }
	@SerializedName("P854")
	@Nullable
	public List<Mainsnak> p854;
	public List<Mainsnak> getP854() { return p854; }
	public void setP854(List<Mainsnak> p854){ this.p854 = p854; }
	@SerializedName("P1683")
	@Nullable
	public List<Mainsnak> p1683;
	public List<Mainsnak> getP1683() { return p1683; }
	public void setP1683(List<Mainsnak> p1683){ this.p1683 = p1683; }
	@SerializedName("P370")
	@Nullable
	public List<Mainsnak> p370;
	public List<Mainsnak> getP370() { return p370; }
	public void setP370(List<Mainsnak> p370){ this.p370 = p370; }
	@SerializedName("P268")
	@Nullable
	public List<Mainsnak> p268;
	public List<Mainsnak> getP268() { return p268; }
	public void setP268(List<Mainsnak> p268){ this.p268 = p268; }
	@SerializedName("P813")
	@Nullable
	public List<Mainsnak> p813;
	public List<Mainsnak> getP813() { return p813; }
	public void setP813(List<Mainsnak> p813){ this.p813 = p813; }
	@SerializedName("P405")
	@Nullable
	public List<Mainsnak> p405;
	public List<Mainsnak> getP405() { return p405; }
	public void setP405(List<Mainsnak> p405){ this.p405 = p405; }
	@SerializedName("P477")
	@Nullable
	public List<Mainsnak> p477;
	public List<Mainsnak> getP477() { return p477; }
	public void setP477(List<Mainsnak> p477){ this.p477 = p477; }
	@SerializedName("P98")
	@Nullable
	public List<Mainsnak> p98;
	public List<Mainsnak> getP98() { return p98; }
	public void setP98(List<Mainsnak> p98){ this.p98 = p98; }
	@SerializedName("P212")
	@Nullable
	public List<Mainsnak> p212;
	public List<Mainsnak> getP212() { return p212; }
	public void setP212(List<Mainsnak> p212){ this.p212 = p212; }
	@SerializedName("P18")
	@Nullable
	public List<Mainsnak> p18;
	public List<Mainsnak> getP18() { return p18; }
	public void setP18(List<Mainsnak> p18){ this.p18 = p18; }
	@SerializedName("P50")
	@Nullable
	public List<Mainsnak> p50;
	public List<Mainsnak> getP50() { return p50; }
	public void setP50(List<Mainsnak> p50){ this.p50 = p50; }
	@SerializedName("P433")
	@Nullable
	public List<Mainsnak> p433;
	public List<Mainsnak> getP433() { return p433; }
	public void setP433(List<Mainsnak> p433){ this.p433 = p433; }
	@SerializedName("P1476")
	@Nullable
	public List<Mainsnak> p1476;
	public List<Mainsnak> getP1476() { return p1476; }
	public void setP1476(List<Mainsnak> p1476){ this.p1476 = p1476; }
	@SerializedName("P586")
	@Nullable
	public List<Mainsnak> p586;
	public List<Mainsnak> getP586() { return p586; }
	public void setP586(List<Mainsnak> p586){ this.p586 = p586; }
	@SerializedName("P957")
	@Nullable
	public List<Mainsnak> p957;
	public List<Mainsnak> getP957() { return p957; }
	public void setP957(List<Mainsnak> p957){ this.p957 = p957; }
	@SerializedName("P143")
	@Nullable
	public List<Mainsnak> p143;
	public List<Mainsnak> getP143() { return p143; }
	public void setP143(List<Mainsnak> p143){ this.p143 = p143; }
	@SerializedName("P249")
	@Nullable
	public List<Mainsnak> p249;
	public List<Mainsnak> getP249() { return p249; }
	public void setP249(List<Mainsnak> p249){ this.p249 = p249; }
	@SerializedName("P155")
	@Nullable
	public List<Mainsnak> p155;
	public List<Mainsnak> getP155() { return p155; }
	public void setP155(List<Mainsnak> p155){ this.p155 = p155; }
	@SerializedName("P478")
	@Nullable
	public List<Mainsnak> p478;
	public List<Mainsnak> getP478() { return p478; }
	public void setP478(List<Mainsnak> p478){ this.p478 = p478; }
	@SerializedName("P1045")
	@Nullable
	public List<Mainsnak> p1045;
	public List<Mainsnak> getP1045() { return p1045; }
	public void setP1045(List<Mainsnak> p1045){ this.p1045 = p1045; }
	@SerializedName("P580")
	@Nullable
	public List<Mainsnak> p580;
	public List<Mainsnak> getP580() { return p580; }
	public void setP580(List<Mainsnak> p580){ this.p580 = p580; }
	@SerializedName("P560")
	@Nullable
	public List<Mainsnak> p560;
	public List<Mainsnak> getP560() { return p560; }
	public void setP560(List<Mainsnak> p560){ this.p560 = p560; }
	@SerializedName("P1065")
	@Nullable
	public List<Mainsnak> p1065;
	public List<Mainsnak> getP1065() { return p1065; }
	public void setP1065(List<Mainsnak> p1065){ this.p1065 = p1065; }
	@SerializedName("P214")
	@Nullable
	public List<Mainsnak> p214;
	public List<Mainsnak> getP214() { return p214; }
	public void setP214(List<Mainsnak> p214){ this.p214 = p214; }
	@SerializedName("P574")
	@Nullable
	public List<Mainsnak> p574;
	public List<Mainsnak> getP574() { return p574; }
	public void setP574(List<Mainsnak> p574){ this.p574 = p574; }
	@SerializedName("P486")
	@Nullable
	public List<Mainsnak> p486;
	public List<Mainsnak> getP486() { return p486; }
	public void setP486(List<Mainsnak> p486){ this.p486 = p486; }
	@SerializedName("P156")
	@Nullable
	public List<Mainsnak> p156;
	public List<Mainsnak> getP156() { return p156; }
	public void setP156(List<Mainsnak> p156){ this.p156 = p156; }
	@SerializedName("P136")
	@Nullable
	public List<Mainsnak> p136;
	public List<Mainsnak> getP136() { return p136; }
	public void setP136(List<Mainsnak> p136){ this.p136 = p136; }
	@SerializedName("P856")
	@Nullable
	public List<Mainsnak> p856;
	public List<Mainsnak> getP856() { return p856; }
	public void setP856(List<Mainsnak> p856){ this.p856 = p856; }
	@SerializedName("P123")
	@Nullable
	public List<Mainsnak> p123;
	public List<Mainsnak> getP123() { return p123; }
	public void setP123(List<Mainsnak> p123){ this.p123 = p123; }
	@SerializedName("P577")
	@Nullable
	public List<Mainsnak> p577;
	public List<Mainsnak> getP577() { return p577; }
	public void setP577(List<Mainsnak> p577){ this.p577 = p577; }
	@SerializedName("P710")
	@Nullable
	public List<Mainsnak> p710;
	public List<Mainsnak> getP710() { return p710; }
	public void setP710(List<Mainsnak> p710){ this.p710 = p710; }
	@SerializedName("P17")
	@Nullable
	public List<Mainsnak> p17;
	public List<Mainsnak> getP17() { return p17; }
	public void setP17(List<Mainsnak> p17){ this.p17 = p17; }
	@SerializedName("P138")
	@Nullable
	public List<Mainsnak> p138;
	public List<Mainsnak> getP138() { return p138; }
	public void setP138(List<Mainsnak> p138){ this.p138 = p138; }
	@SerializedName("P696")
	@Nullable
	public List<Mainsnak> p696;
	public List<Mainsnak> getP696() { return p696; }
	public void setP696(List<Mainsnak> p696){ this.p696 = p696; }
	@SerializedName("P361")
	@Nullable
	public List<Mainsnak> p361;
	public List<Mainsnak> getP361() { return p361; }
	public void setP361(List<Mainsnak> p361){ this.p361 = p361; }
	@SerializedName("P407")
	@Nullable
	public List<Mainsnak> p407;
	public List<Mainsnak> getP407() { return p407; }
	public void setP407(List<Mainsnak> p407){ this.p407 = p407; }
	@SerializedName("P92")
	@Nullable
	public List<Mainsnak> p92;
	public List<Mainsnak> getP92() { return p92; }
	public void setP92(List<Mainsnak> p92){ this.p92 = p92; }
	@SerializedName("P1433")
	@Nullable
	public List<Mainsnak> p1433;
	public List<Mainsnak> getP1433() { return p1433; }
	public void setP1433(List<Mainsnak> p1433){ this.p1433 = p1433; }
	@SerializedName("P373")
	@Nullable
	public List<Mainsnak> p373;
	public List<Mainsnak> getP373() { return p373; }
	public void setP373(List<Mainsnak> p373){ this.p373 = p373; }
	@SerializedName("P958")
	@Nullable
	public List<Mainsnak> p958;
	public List<Mainsnak> getP958() { return p958; }
	public void setP958(List<Mainsnak> p958){ this.p958 = p958; }
	@SerializedName("P81")
	@Nullable
	public List<Mainsnak> p81;
	public List<Mainsnak> getP81() { return p81; }
	public void setP81(List<Mainsnak> p81){ this.p81 = p81; }
	@SerializedName("P106")
	@Nullable
	public List<Mainsnak> p106;
	public List<Mainsnak> getP106() { return p106; }
	public void setP106(List<Mainsnak> p106){ this.p106 = p106; }
	@SerializedName("P1014")
	@Nullable
	public List<Mainsnak> p1014;
	public List<Mainsnak> getP1014() { return p1014; }
	public void setP1014(List<Mainsnak> p1014){ this.p1014 = p1014; }
	@SerializedName("P642")
	@Nullable
	public List<Mainsnak> p642;
	public List<Mainsnak> getP642() { return p642; }
	public void setP642(List<Mainsnak> p642){ this.p642 = p642; }
	@SerializedName("P21")
	@Nullable
	public List<Mainsnak> p21;
	public List<Mainsnak> getP21() { return p21; }
	public void setP21(List<Mainsnak> p21){ this.p21 = p21; }
	@SerializedName("P217")
	@Nullable
	public List<Mainsnak> p217;
	public List<Mainsnak> getP217() { return p217; }
	public void setP217(List<Mainsnak> p217){ this.p217 = p217; }
	@SerializedName("P175")
	@Nullable
	public List<Mainsnak> p175;
	public List<Mainsnak> getP175() { return p175; }
	public void setP175(List<Mainsnak> p175){ this.p175 = p175; }
	@SerializedName("P345")
	@Nullable
	public List<Mainsnak> p345;
	public List<Mainsnak> getP345() { return p345; }
	public void setP345(List<Mainsnak> p345){ this.p345 = p345; }
	@SerializedName("P364")
	@Nullable
	public List<Mainsnak> p364;
	public List<Mainsnak> getP364() { return p364; }
	public void setP364(List<Mainsnak> p364){ this.p364 = p364; }
	@SerializedName("P171")
	@Nullable
	public List<Mainsnak> p171;
	public List<Mainsnak> getP171() { return p171; }
	public void setP171(List<Mainsnak> p171){ this.p171 = p171; }
	@SerializedName("P972")
	@Nullable
	public List<Mainsnak> p972;
	public List<Mainsnak> getP972() { return p972; }
	public void setP972(List<Mainsnak> p972){ this.p972 = p972; }
	@SerializedName("P527")
	@Nullable
	public List<Mainsnak> p527;
	public List<Mainsnak> getP527() { return p527; }
	public void setP527(List<Mainsnak> p527){ this.p527 = p527; }
	@SerializedName("P582")
	@Nullable
	public List<Mainsnak> p582;
	public List<Mainsnak> getP582() { return p582; }
	public void setP582(List<Mainsnak> p582){ this.p582 = p582; }
	@SerializedName("P792")
	@Nullable
	public List<Mainsnak> p792;
	public List<Mainsnak> getP792() { return p792; }
	public void setP792(List<Mainsnak> p792){ this.p792 = p792; }
	@SerializedName("P1001")
	@Nullable
	public List<Mainsnak> p1001;
	public List<Mainsnak> getP1001() { return p1001; }
	public void setP1001(List<Mainsnak> p1001){ this.p1001 = p1001; }
	@SerializedName("P387")
	@Nullable
	public List<Mainsnak> p387;
	public List<Mainsnak> getP387() { return p387; }
	public void setP387(List<Mainsnak> p387){ this.p387 = p387; }
	@SerializedName("P225")
	@Nullable
	public List<Mainsnak> p225;
	public List<Mainsnak> getP225() { return p225; }
	public void setP225(List<Mainsnak> p225){ this.p225 = p225; }
	@SerializedName("P248")
	@Nullable
	public String p248;
	public String getP248() { return p248; }
	public void setP248(String p248){ this.p248 = p248; }
	@SerializedName("P347")
	@Nullable
	public List<Mainsnak> p347;
	public List<Mainsnak> getP347() { return p347; }
	public void setP347(List<Mainsnak> p347){ this.p347 = p347; }
	@SerializedName("P27")
	@Nullable
	public List<Mainsnak> p27;
	public List<Mainsnak> getP27() { return p27; }
	public void setP27(List<Mainsnak> p27){ this.p27 = p27; }
	@SerializedName("P960")
	@Nullable
	public List<Mainsnak> p960;
	public List<Mainsnak> getP960() { return p960; }
	public void setP960(List<Mainsnak> p960){ this.p960 = p960; }
	@SerializedName("P402")
	@Nullable
	public List<Mainsnak> p402;
	public List<Mainsnak> getP402() { return p402; }
	public void setP402(List<Mainsnak> p402){ this.p402 = p402; }
	@SerializedName("P585")
	@Nullable
	public List<Mainsnak> p585;
	public List<Mainsnak> getP585() { return p585; }
	public void setP585(List<Mainsnak> p585){ this.p585 = p585; }
	@SerializedName("P640")
	@Nullable
	public List<Mainsnak> p640;
	public List<Mainsnak> getP640() { return p640; }
	public void setP640(List<Mainsnak> p640){ this.p640 = p640; }
	@SerializedName("P633")
	@Nullable
	public List<Mainsnak> p633;
	public List<Mainsnak> getP633() { return p633; }
	public void setP633(List<Mainsnak> p633){ this.p633 = p633; }
	@SerializedName("P687")
	@Nullable
	public List<Mainsnak> p687;
	public List<Mainsnak> getP687() { return p687; }
	public void setP687(List<Mainsnak> p687){ this.p687 = p687; }
	@SerializedName("P627")
	@Nullable
	public List<Mainsnak> p627;
	public List<Mainsnak> getP627() { return p627; }
	public void setP627(List<Mainsnak> p627){ this.p627 = p627; }
	}
	public static class References {
	@Nullable
	public Snaks snaks;
	public Snaks getSnaks() { return snaks; }
	public void setSnaks(Snaks snaks){ this.snaks = snaks; }
	@Nullable
	public String hash;
	public String getHash() { return hash; }
	public void setHash(String hash){ this.hash = hash; }
	@SerializedName("snaks-order")
	@Nullable
	public List<String> snaksOrder;
	public List<String> getSnaksOrder() { return snaksOrder; }
	public void setSnaksOrder(List<String> snaksOrder){ this.snaksOrder = snaksOrder; }
	}
	public static class P508 {
	@Nullable
	public String id;
	public String getId() { return id; }
	public void setId(String id){ this.id = id; }
	@Nullable
	public Mainsnak mainsnak;
	public Mainsnak getMainsnak() { return mainsnak; }
	public void setMainsnak(Mainsnak mainsnak){ this.mainsnak = mainsnak; }
	@Nullable
	public List<References> references;
	public List<References> getReferences() { return references; }
	public void setReferences(List<References> references){ this.references = references; }
	@Nullable
	public String type;
	public String getType() { return type; }
	public void setType(String type){ this.type = type; }
	@Nullable
	public String rank;
	public String getRank() { return rank; }
	public void setRank(String rank){ this.rank = rank; }
	}
	public static class Claims {
	@SerializedName("P513")
	@Nullable
	public String p513;
	public String getP513() { return p513; }
	public void setP513(String p513){ this.p513 = p513; }
	@SerializedName("P1037")
	@Nullable
	public String p1037;
	public String getP1037() { return p1037; }
	public void setP1037(String p1037){ this.p1037 = p1037; }
	@SerializedName("P113")
	@Nullable
	public String p113;
	public String getP113() { return p113; }
	public void setP113(String p113){ this.p113 = p113; }
	@SerializedName("P668")
	@Nullable
	public String p668;
	public String getP668() { return p668; }
	public void setP668(String p668){ this.p668 = p668; }
	@SerializedName("P770")
	@Nullable
	public String p770;
	public String getP770() { return p770; }
	public void setP770(String p770){ this.p770 = p770; }
	@SerializedName("P473")
	@Nullable
	public String p473;
	public String getP473() { return p473; }
	public void setP473(String p473){ this.p473 = p473; }
	@SerializedName("P1344")
	@Nullable
	public String p1344;
	public String getP1344() { return p1344; }
	public void setP1344(String p1344){ this.p1344 = p1344; }
	@SerializedName("P747")
	@Nullable
	public String p747;
	public String getP747() { return p747; }
	public void setP747(String p747){ this.p747 = p747; }
	@SerializedName("P1145")
	@Nullable
	public String p1145;
	public String getP1145() { return p1145; }
	public void setP1145(String p1145){ this.p1145 = p1145; }
	@SerializedName("P847")
	@Nullable
	public List<P1245> p847;
	public List<P1245> getP847() { return p847; }
	public void setP847(List<P1245> p847){ this.p847 = p847; }
	@SerializedName("P1431")
	@Nullable
	public List<P1245> p1431;
	public List<P1245> getP1431() { return p1431; }
	public void setP1431(List<P1245> p1431){ this.p1431 = p1431; }
	@SerializedName("P137")
	@Nullable
	public String p137;
	public String getP137() { return p137; }
	public void setP137(String p137){ this.p137 = p137; }
	@SerializedName("P208")
	@Nullable
	public List<P1245> p208;
	public List<P1245> getP208() { return p208; }
	public void setP208(List<P1245> p208){ this.p208 = p208; }
	@SerializedName("P607")
	@Nullable
	public String p607;
	public String getP607() { return p607; }
	public void setP607(String p607){ this.p607 = p607; }
	@SerializedName("P737")
	@Nullable
	public String p737;
	public String getP737() { return p737; }
	public void setP737(String p737){ this.p737 = p737; }
	@SerializedName("P1068")
	@Nullable
	public List<P1245> p1068;
	public List<P1245> getP1068() { return p1068; }
	public void setP1068(List<P1245> p1068){ this.p1068 = p1068; }
	@SerializedName("P621")
	@Nullable
	public List<P1245> p621;
	public List<P1245> getP621() { return p621; }
	public void setP621(List<P1245> p621){ this.p621 = p621; }
	@SerializedName("P1347")
	@Nullable
	public List<P1245> p1347;
	public List<P1245> getP1347() { return p1347; }
	public void setP1347(List<P1245> p1347){ this.p1347 = p1347; }
	@SerializedName("P78")
	@Nullable
	public String p78;
	public String getP78() { return p78; }
	public void setP78(String p78){ this.p78 = p78; }
	@SerializedName("P1303")
	@Nullable
	public String p1303;
	public String getP1303() { return p1303; }
	public void setP1303(String p1303){ this.p1303 = p1303; }
	@SerializedName("P1365")
	@Nullable
	public String p1365;
	public String getP1365() { return p1365; }
	public void setP1365(String p1365){ this.p1365 = p1365; }
	@SerializedName("P708")
	@Nullable
	public String p708;
	public String getP708() { return p708; }
	public void setP708(String p708){ this.p708 = p708; }
	@SerializedName("P1266")
	@Nullable
	public List<P1245> p1266;
	public List<P1245> getP1266() { return p1266; }
	public void setP1266(List<P1245> p1266){ this.p1266 = p1266; }
	@SerializedName("P782")
	@Nullable
	public String p782;
	public String getP782() { return p782; }
	public void setP782(String p782){ this.p782 = p782; }
	@SerializedName("P26")
	@Nullable
	public String p26;
	public String getP26() { return p26; }
	public void setP26(String p26){ this.p26 = p26; }
	@SerializedName("P103")
	@Nullable
	public String p103;
	public String getP103() { return p103; }
	public void setP103(String p103){ this.p103 = p103; }
	@SerializedName("P1144")
	@Nullable
	public String p1144;
	public String getP1144() { return p1144; }
	public void setP1144(String p1144){ this.p1144 = p1144; }
	@SerializedName("P609")
	@Nullable
	public String p609;
	public String getP609() { return p609; }
	public void setP609(String p609){ this.p609 = p609; }
	@SerializedName("P1267")
	@Nullable
	public List<P1245> p1267;
	public List<P1245> getP1267() { return p1267; }
	public void setP1267(List<P1245> p1267){ this.p1267 = p1267; }
	@SerializedName("P886")
	@Nullable
	public List<P1245> p886;
	public List<P1245> getP886() { return p886; }
	public void setP886(List<P1245> p886){ this.p886 = p886; }
	@SerializedName("P1336")
	@Nullable
	public List<P1245> p1336;
	public List<P1245> getP1336() { return p1336; }
	public void setP1336(List<P1245> p1336){ this.p1336 = p1336; }
	@SerializedName("P403")
	@Nullable
	public String p403;
	public String getP403() { return p403; }
	public void setP403(String p403){ this.p403 = p403; }
	@SerializedName("P1472")
	@Nullable
	public String p1472;
	public String getP1472() { return p1472; }
	public void setP1472(String p1472){ this.p1472 = p1472; }
	@SerializedName("P87")
	@Nullable
	public String p87;
	public String getP87() { return p87; }
	public void setP87(String p87){ this.p87 = p87; }
	@SerializedName("P802")
	@Nullable
	public String p802;
	public String getP802() { return p802; }
	public void setP802(String p802){ this.p802 = p802; }
	@SerializedName("P85")
	@Nullable
	public String p85;
	public String getP85() { return p85; }
	public void setP85(String p85){ this.p85 = p85; }
	@SerializedName("P1299")
	@Nullable
	public List<P1245> p1299;
	public List<P1245> getP1299() { return p1299; }
	public void setP1299(List<P1245> p1299){ this.p1299 = p1299; }
	@SerializedName("P209")
	@Nullable
	public String p209;
	public String getP209() { return p209; }
	public void setP209(String p209){ this.p209 = p209; }
	@SerializedName("P98")
	@Nullable
	public String p98;
	public String getP98() { return p98; }
	public void setP98(String p98){ this.p98 = p98; }
	@SerializedName("P298")
	@Nullable
	public List<P1245> p298;
	public List<P1245> getP298() { return p298; }
	public void setP298(List<P1245> p298){ this.p298 = p298; }
	@SerializedName("P620")
	@Nullable
	public List<P1245> p620;
	public List<P1245> getP620() { return p620; }
	public void setP620(List<P1245> p620){ this.p620 = p620; }
	@SerializedName("P704")
	@Nullable
	public List<P508> p704;
	public List<P508> getP704() { return p704; }
	public void setP704(List<P508> p704){ this.p704 = p704; }
	@SerializedName("P154")
	@Nullable
	public String p154;
	public String getP154() { return p154; }
	public void setP154(String p154){ this.p154 = p154; }
	@SerializedName("P50")
	@Nullable
	public String p50;
	public String getP50() { return p50; }
	public void setP50(String p50){ this.p50 = p50; }
	@SerializedName("P685")
	@Nullable
	public String p685;
	public String getP685() { return p685; }
	public void setP685(String p685){ this.p685 = p685; }
	@SerializedName("P1672")
	@Nullable
	public List<P1245> p1672;
	public List<P1245> getP1672() { return p1672; }
	public void setP1672(List<P1245> p1672){ this.p1672 = p1672; }
	@SerializedName("P541")
	@Nullable
	public List<P1245> p541;
	public List<P1245> getP541() { return p541; }
	public void setP541(List<P1245> p541){ this.p541 = p541; }
	@SerializedName("P69")
	@Nullable
	public String p69;
	public String getP69() { return p69; }
	public void setP69(String p69){ this.p69 = p69; }
	@SerializedName("P858")
	@Nullable
	public String p858;
	public String getP858() { return p858; }
	public void setP858(String p858){ this.p858 = p858; }
	@SerializedName("P1133")
	@Nullable
	public List<P1245> p1133;
	public List<P1245> getP1133() { return p1133; }
	public void setP1133(List<P1245> p1133){ this.p1133 = p1133; }
	@SerializedName("P233")
	@Nullable
	public String p233;
	public String getP233() { return p233; }
	public void setP233(String p233){ this.p233 = p233; }
	@SerializedName("P410")
	@Nullable
	public String p410;
	public String getP410() { return p410; }
	public void setP410(String p410){ this.p410 = p410; }
	@SerializedName("P275")
	@Nullable
	public String p275;
	public String getP275() { return p275; }
	public void setP275(String p275){ this.p275 = p275; }
	@SerializedName("P1659")
	@Nullable
	public List<P1245> p1659;
	public List<P1245> getP1659() { return p1659; }
	public void setP1659(List<P1245> p1659){ this.p1659 = p1659; }
	@SerializedName("P155")
	@Nullable
	public String p155;
	public String getP155() { return p155; }
	public void setP155(String p155){ this.p155 = p155; }
	@SerializedName("P911")
	@Nullable
	public String p911;
	public String getP911() { return p911; }
	public void setP911(String p911){ this.p911 = p911; }
	@SerializedName("P1042")
	@Nullable
	public String p1042;
	public String getP1042() { return p1042; }
	public void setP1042(String p1042){ this.p1042 = p1042; }
	@SerializedName("P799")
	@Nullable
	public List<P1245> p799;
	public List<P1245> getP799() { return p799; }
	public void setP799(List<P1245> p799){ this.p799 = p799; }
	@SerializedName("P1045")
	@Nullable
	public String p1045;
	public String getP1045() { return p1045; }
	public void setP1045(String p1045){ this.p1045 = p1045; }
	@SerializedName("P767")
	@Nullable
	public String p767;
	public String getP767() { return p767; }
	public void setP767(String p767){ this.p767 = p767; }
	@SerializedName("P560")
	@Nullable
	public List<P1417> p560;
	public List<P1417> getP560() { return p560; }
	public void setP560(List<P1417> p560){ this.p560 = p560; }
	@SerializedName("P595")
	@Nullable
	public List<P1245> p595;
	public List<P1245> getP595() { return p595; }
	public void setP595(List<P1245> p595){ this.p595 = p595; }
	@SerializedName("P136")
	@Nullable
	public String p136;
	public String getP136() { return p136; }
	public void setP136(String p136){ this.p136 = p136; }
	@SerializedName("P484")
	@Nullable
	public String p484;
	public String getP484() { return p484; }
	public void setP484(String p484){ this.p484 = p484; }
	@SerializedName("P1086")
	@Nullable
	public String p1086;
	public String getP1086() { return p1086; }
	public void setP1086(String p1086){ this.p1086 = p1086; }
	@SerializedName("P917")
	@Nullable
	public String p917;
	public String getP917() { return p917; }
	public void setP917(String p917){ this.p917 = p917; }
	@SerializedName("P1198")
	@Nullable
	public List<P26> p1198;
	public List<P26> getP1198() { return p1198; }
	public void setP1198(List<P26> p1198){ this.p1198 = p1198; }
	@SerializedName("P1246")
	@Nullable
	public List<P1245> p1246;
	public List<P1245> getP1246() { return p1246; }
	public void setP1246(List<P1245> p1246){ this.p1246 = p1246; }
	@SerializedName("P844")
	@Nullable
	public List<P1245> p844;
	public List<P1245> getP844() { return p844; }
	public void setP844(List<P1245> p844){ this.p844 = p844; }
	@SerializedName("P180")
	@Nullable
	public String p180;
	public String getP180() { return p180; }
	public void setP180(String p180){ this.p180 = p180; }
	@SerializedName("P1563")
	@Nullable
	public String p1563;
	public String getP1563() { return p1563; }
	public void setP1563(String p1563){ this.p1563 = p1563; }
	@SerializedName("P576")
	@Nullable
	public String p576;
	public String getP576() { return p576; }
	public void setP576(String p576){ this.p576 = p576; }
	@SerializedName("P1364")
	@Nullable
	public List<P1245> p1364;
	public List<P1245> getP1364() { return p1364; }
	public void setP1364(List<P1245> p1364){ this.p1364 = p1364; }
	@SerializedName("P878")
	@Nullable
	public List<P1245> p878;
	public List<P1245> getP878() { return p878; }
	public void setP878(List<P1245> p878){ this.p878 = p878; }
	@SerializedName("P940")
	@Nullable
	public List<P1245> p940;
	public List<P1245> getP940() { return p940; }
	public void setP940(List<P1245> p940){ this.p940 = p940; }
	@SerializedName("P44")
	@Nullable
	public List<P1245> p44;
	public List<P1245> getP44() { return p44; }
	public void setP44(List<P1245> p44){ this.p44 = p44; }
	@SerializedName("P769")
	@Nullable
	public String p769;
	public String getP769() { return p769; }
	public void setP769(String p769){ this.p769 = p769; }
	@SerializedName("P474")
	@Nullable
	public String p474;
	public String getP474() { return p474; }
	public void setP474(String p474){ this.p474 = p474; }
	@SerializedName("P199")
	@Nullable
	public String p199;
	public String getP199() { return p199; }
	public void setP199(String p199){ this.p199 = p199; }
	@SerializedName("P743")
	@Nullable
	public String p743;
	public String getP743() { return p743; }
	public void setP743(String p743){ this.p743 = p743; }
	@SerializedName("P22")
	@Nullable
	public String p22;
	public String getP22() { return p22; }
	public void setP22(String p22){ this.p22 = p22; }
	@SerializedName("P693")
	@Nullable
	public List<P1417> p693;
	public List<P1417> getP693() { return p693; }
	public void setP693(List<P1417> p693){ this.p693 = p693; }
	@SerializedName("P366")
	@Nullable
	public String p366;
	public String getP366() { return p366; }
	public void setP366(String p366){ this.p366 = p366; }
	@SerializedName("P649")
	@Nullable
	public List<P1245> p649;
	public List<P1245> getP649() { return p649; }
	public void setP649(List<P1245> p649){ this.p649 = p649; }
	@SerializedName("P200")
	@Nullable
	public List<P1245> p200;
	public List<P1245> getP200() { return p200; }
	public void setP200(List<P1245> p200){ this.p200 = p200; }
	@SerializedName("P1280")
	@Nullable
	public List<P1245> p1280;
	public List<P1245> getP1280() { return p1280; }
	public void setP1280(List<P1245> p1280){ this.p1280 = p1280; }
	@SerializedName("P1412")
	@Nullable
	public String p1412;
	public String getP1412() { return p1412; }
	public void setP1412(String p1412){ this.p1412 = p1412; }
	@SerializedName("P21")
	@Nullable
	public String p21;
	public String getP21() { return p21; }
	public void setP21(String p21){ this.p21 = p21; }
	@SerializedName("P683")
	@Nullable
	public String p683;
	public String getP683() { return p683; }
	public void setP683(String p683){ this.p683 = p683; }
	@SerializedName("P1376")
	@Nullable
	public String p1376;
	public String getP1376() { return p1376; }
	public void setP1376(String p1376){ this.p1376 = p1376; }
	@SerializedName("P672")
	@Nullable
	public String p672;
	public String getP672() { return p672; }
	public void setP672(String p672){ this.p672 = p672; }
	@SerializedName("P711")
	@Nullable
	public String p711;
	public String getP711() { return p711; }
	public void setP711(String p711){ this.p711 = p711; }
	@SerializedName("P745")
	@Nullable
	public List<P1245> p745;
	public List<P1245> getP745() { return p745; }
	public void setP745(List<P1245> p745){ this.p745 = p745; }
	@SerializedName("P781")
	@Nullable
	public List<P508> p781;
	public List<P508> getP781() { return p781; }
	public void setP781(List<P508> p781){ this.p781 = p781; }
	@SerializedName("P1305")
	@Nullable
	public List<P1245> p1305;
	public List<P1245> getP1305() { return p1305; }
	public void setP1305(List<P1245> p1305){ this.p1305 = p1305; }
	@SerializedName("P134")
	@Nullable
	public String p134;
	public String getP134() { return p134; }
	public void setP134(String p134){ this.p134 = p134; }
	@SerializedName("P345")
	@Nullable
	public String p345;
	public String getP345() { return p345; }
	public void setP345(String p345){ this.p345 = p345; }
	@SerializedName("P1332")
	@Nullable
	public String p1332;
	public String getP1332() { return p1332; }
	public void setP1332(String p1332){ this.p1332 = p1332; }
	@SerializedName("P1532")
	@Nullable
	public List<P508> p1532;
	public List<P508> getP1532() { return p1532; }
	public void setP1532(List<P508> p1532){ this.p1532 = p1532; }
	@SerializedName("P190")
	@Nullable
	public String p190;
	public String getP190() { return p190; }
	public void setP190(String p190){ this.p190 = p190; }
	@SerializedName("P364")
	@Nullable
	public String p364;
	public String getP364() { return p364; }
	public void setP364(String p364){ this.p364 = p364; }
	@SerializedName("P490")
	@Nullable
	public String p490;
	public String getP490() { return p490; }
	public void setP490(String p490){ this.p490 = p490; }
	@SerializedName("P1181")
	@Nullable
	public List<P1245> p1181;
	public List<P1245> getP1181() { return p1181; }
	public void setP1181(List<P1245> p1181){ this.p1181 = p1181; }
	@SerializedName("P734")
	@Nullable
	public String p734;
	public String getP734() { return p734; }
	public void setP734(String p734){ this.p734 = p734; }
	@SerializedName("P1080")
	@Nullable
	public String p1080;
	public String getP1080() { return p1080; }
	public void setP1080(String p1080){ this.p1080 = p1080; }
	@SerializedName("P762")
	@Nullable
	public List<P508> p762;
	public List<P508> getP762() { return p762; }
	public void setP762(List<P508> p762){ this.p762 = p762; }
	@SerializedName("P722")
	@Nullable
	public List<P508> p722;
	public List<P508> getP722() { return p722; }
	public void setP722(List<P508> p722){ this.p722 = p722; }
	@SerializedName("P690")
	@Nullable
	public String p690;
	public String getP690() { return p690; }
	public void setP690(String p690){ this.p690 = p690; }
	@SerializedName("P248")
	@Nullable
	public String p248;
	public String getP248() { return p248; }
	public void setP248(String p248){ this.p248 = p248; }
	@SerializedName("P1311")
	@Nullable
	public List<P1245> p1311;
	public List<P1245> getP1311() { return p1311; }
	public void setP1311(List<P1245> p1311){ this.p1311 = p1311; }
	@SerializedName("P460")
	@Nullable
	public String p460;
	public String getP460() { return p460; }
	public void setP460(String p460){ this.p460 = p460; }
	@SerializedName("P237")
	@Nullable
	public String p237;
	public String getP237() { return p237; }
	public void setP237(String p237){ this.p237 = p237; }
	@SerializedName("P881")
	@Nullable
	public List<P1245> p881;
	public List<P1245> getP881() { return p881; }
	public void setP881(List<P1245> p881){ this.p881 = p881; }
	@SerializedName("P1075")
	@Nullable
	public String p1075;
	public String getP1075() { return p1075; }
	public void setP1075(String p1075){ this.p1075 = p1075; }
	@SerializedName("P1612")
	@Nullable
	public String p1612;
	public String getP1612() { return p1612; }
	public void setP1612(String p1612){ this.p1612 = p1612; }
	@SerializedName("P1004")
	@Nullable
	public String p1004;
	public String getP1004() { return p1004; }
	public void setP1004(String p1004){ this.p1004 = p1004; }
	@SerializedName("P1283")
	@Nullable
	public String p1283;
	public String getP1283() { return p1283; }
	public void setP1283(String p1283){ this.p1283 = p1283; }
	@SerializedName("P1324")
	@Nullable
	public List<P1245> p1324;
	public List<P1245> getP1324() { return p1324; }
	public void setP1324(List<P1245> p1324){ this.p1324 = p1324; }
	@SerializedName("P721")
	@Nullable
	public String p721;
	public String getP721() { return p721; }
	public void setP721(String p721){ this.p721 = p721; }
	@SerializedName("P1254")
	@Nullable
	public List<P1245> p1254;
	public List<P1245> getP1254() { return p1254; }
	public void setP1254(List<P1245> p1254){ this.p1254 = p1254; }
	@SerializedName("P594")
	@Nullable
	public String p594;
	public String getP594() { return p594; }
	public void setP594(String p594){ this.p594 = p594; }
	@SerializedName("P496")
	@Nullable
	public String p496;
	public String getP496() { return p496; }
	public void setP496(String p496){ this.p496 = p496; }
	@SerializedName("P867")
	@Nullable
	public String p867;
	public String getP867() { return p867; }
	public void setP867(String p867){ this.p867 = p867; }
	@SerializedName("P547")
	@Nullable
	public String p547;
	public String getP547() { return p547; }
	public void setP547(String p547){ this.p547 = p547; }
	@SerializedName("P828")
	@Nullable
	public String p828;
	public String getP828() { return p828; }
	public void setP828(String p828){ this.p828 = p828; }
	@SerializedName("P1615")
	@Nullable
	public List<P1245> p1615;
	public List<P1245> getP1615() { return p1615; }
	public void setP1615(List<P1245> p1615){ this.p1615 = p1615; }
	@SerializedName("P1408")
	@Nullable
	public List<P1245> p1408;
	public List<P1245> getP1408() { return p1408; }
	public void setP1408(List<P1245> p1408){ this.p1408 = p1408; }
	@SerializedName("P941")
	@Nullable
	public String p941;
	public String getP941() { return p941; }
	public void setP941(String p941){ this.p941 = p941; }
	@SerializedName("P1138")
	@Nullable
	public List<P508> p1138;
	public List<P508> getP1138() { return p1138; }
	public void setP1138(List<P508> p1138){ this.p1138 = p1138; }
	@SerializedName("P1334")
	@Nullable
	public String p1334;
	public String getP1334() { return p1334; }
	public void setP1334(String p1334){ this.p1334 = p1334; }
	@SerializedName("P689")
	@Nullable
	public List<P1245> p689;
	public List<P1245> getP689() { return p689; }
	public void setP689(List<P1245> p689){ this.p689 = p689; }
	@SerializedName("P939")
	@Nullable
	public String p939;
	public String getP939() { return p939; }
	public void setP939(String p939){ this.p939 = p939; }
	@SerializedName("P1343")
	@Nullable
	public String p1343;
	public String getP1343() { return p1343; }
	public void setP1343(String p1343){ this.p1343 = p1343; }
	@SerializedName("P1192")
	@Nullable
	public String p1192;
	public String getP1192() { return p1192; }
	public void setP1192(String p1192){ this.p1192 = p1192; }
	@SerializedName("P122")
	@Nullable
	public String p122;
	public String getP122() { return p122; }
	public void setP122(String p122){ this.p122 = p122; }
	@SerializedName("P635")
	@Nullable
	public String p635;
	public String getP635() { return p635; }
	public void setP635(String p635){ this.p635 = p635; }
	@SerializedName("P1235")
	@Nullable
	public List<P1245> p1235;
	public List<P1245> getP1235() { return p1235; }
	public void setP1235(List<P1245> p1235){ this.p1235 = p1235; }
	@SerializedName("P1066")
	@Nullable
	public String p1066;
	public String getP1066() { return p1066; }
	public void setP1066(String p1066){ this.p1066 = p1066; }
	@SerializedName("P43")
	@Nullable
	public List<P1245> p43;
	public List<P1245> getP43() { return p43; }
	public void setP43(List<P1245> p43){ this.p43 = p43; }
	@SerializedName("P663")
	@Nullable
	public List<P1245> p663;
	public List<P1245> getP663() { return p663; }
	public void setP663(List<P1245> p663){ this.p663 = p663; }
	@SerializedName("P628")
	@Nullable
	public String p628;
	public String getP628() { return p628; }
	public void setP628(String p628){ this.p628 = p628; }
	@SerializedName("P1463")
	@Nullable
	public String p1463;
	public String getP1463() { return p1463; }
	public void setP1463(String p1463){ this.p1463 = p1463; }
	@SerializedName("P281")
	@Nullable
	public String p281;
	public String getP281() { return p281; }
	public void setP281(String p281){ this.p281 = p281; }
	@SerializedName("P590")
	@Nullable
	public String p590;
	public String getP590() { return p590; }
	public void setP590(String p590){ this.p590 = p590; }
	@SerializedName("P1613")
	@Nullable
	public String p1613;
	public String getP1613() { return p1613; }
	public void setP1613(String p1613){ this.p1613 = p1613; }
	@SerializedName("P935")
	@Nullable
	public String p935;
	public String getP935() { return p935; }
	public void setP935(String p935){ this.p935 = p935; }
	@SerializedName("P701")
	@Nullable
	public List<P1245> p701;
	public List<P1245> getP701() { return p701; }
	public void setP701(List<P1245> p701){ this.p701 = p701; }
	@SerializedName("P587")
	@Nullable
	public List<P1245> p587;
	public List<P1245> getP587() { return p587; }
	public void setP587(List<P1245> p587){ this.p587 = p587; }
	@SerializedName("P1229")
	@Nullable
	public List<P508> p1229;
	public List<P508> getP1229() { return p1229; }
	public void setP1229(List<P508> p1229){ this.p1229 = p1229; }
	@SerializedName("P1559")
	@Nullable
	public List<P1245> p1559;
	public List<P1245> getP1559() { return p1559; }
	public void setP1559(List<P1245> p1559){ this.p1559 = p1559; }
	@SerializedName("P358")
	@Nullable
	public String p358;
	public String getP358() { return p358; }
	public void setP358(String p358){ this.p358 = p358; }
	@SerializedName("P121")
	@Nullable
	public String p121;
	public String getP121() { return p121; }
	public void setP121(String p121){ this.p121 = p121; }
	@SerializedName("P523")
	@Nullable
	public String p523;
	public String getP523() { return p523; }
	public void setP523(String p523){ this.p523 = p523; }
	@SerializedName("P1159")
	@Nullable
	public List<P508> p1159;
	public List<P508> getP1159() { return p1159; }
	public void setP1159(List<P508> p1159){ this.p1159 = p1159; }
	@SerializedName("P840")
	@Nullable
	public String p840;
	public String getP840() { return p840; }
	public void setP840(String p840){ this.p840 = p840; }
	@SerializedName("P495")
	@Nullable
	public String p495;
	public String getP495() { return p495; }
	public void setP495(String p495){ this.p495 = p495; }
	@SerializedName("P854")
	@Nullable
	public List<P1245> p854;
	public List<P1245> getP854() { return p854; }
	public void setP854(List<P1245> p854){ this.p854 = p854; }
	@SerializedName("P835")
	@Nullable
	public List<P1245> p835;
	public List<P1245> getP835() { return p835; }
	public void setP835(List<P1245> p835){ this.p835 = p835; }
	@SerializedName("P829")
	@Nullable
	public List<P1245> p829;
	public List<P1245> getP829() { return p829; }
	public void setP829(List<P1245> p829){ this.p829 = p829; }
	@SerializedName("P219")
	@Nullable
	public String p219;
	public String getP219() { return p219; }
	public void setP219(String p219){ this.p219 = p219; }
	@SerializedName("P624")
	@Nullable
	public List<P1245> p624;
	public List<P1245> getP624() { return p624; }
	public void setP624(List<P1245> p624){ this.p624 = p624; }
	@SerializedName("P1552")
	@Nullable
	public List<P1245> p1552;
	public List<P1245> getP1552() { return p1552; }
	public void setP1552(List<P1245> p1552){ this.p1552 = p1552; }
	@SerializedName("P1622")
	@Nullable
	public List<P1245> p1622;
	public List<P1245> getP1622() { return p1622; }
	public void setP1622(List<P1245> p1622){ this.p1622 = p1622; }
	@SerializedName("P608")
	@Nullable
	public String p608;
	public String getP608() { return p608; }
	public void setP608(String p608){ this.p608 = p608; }
	@SerializedName("P862")
	@Nullable
	public List<P1245> p862;
	public List<P1245> getP862() { return p862; }
	public void setP862(List<P1245> p862){ this.p862 = p862; }
	@SerializedName("P1189")
	@Nullable
	public List<P1245> p1189;
	public List<P1245> getP1189() { return p1189; }
	public void setP1189(List<P1245> p1189){ this.p1189 = p1189; }
	@SerializedName("P1414")
	@Nullable
	public List<P1245> p1414;
	public List<P1245> getP1414() { return p1414; }
	public void setP1414(List<P1245> p1414){ this.p1414 = p1414; }
	@SerializedName("P691")
	@Nullable
	public String p691;
	public String getP691() { return p691; }
	public void setP691(String p691){ this.p691 = p691; }
	@SerializedName("P1101")
	@Nullable
	public String p1101;
	public String getP1101() { return p1101; }
	public void setP1101(String p1101){ this.p1101 = p1101; }
	@SerializedName("P1255")
	@Nullable
	public List<P1245> p1255;
	public List<P1245> getP1255() { return p1255; }
	public void setP1255(List<P1245> p1255){ this.p1255 = p1255; }
	@SerializedName("P177")
	@Nullable
	public String p177;
	public String getP177() { return p177; }
	public void setP177(String p177){ this.p177 = p177; }
	@SerializedName("P728")
	@Nullable
	public List<P1245> p728;
	public List<P1245> getP728() { return p728; }
	public void setP728(List<P1245> p728){ this.p728 = p728; }
	@SerializedName("P730")
	@Nullable
	public String p730;
	public String getP730() { return p730; }
	public void setP730(String p730){ this.p730 = p730; }
	@SerializedName("P518")
	@Nullable
	public List<P1245> p518;
	public List<P1245> getP518() { return p518; }
	public void setP518(List<P1245> p518){ this.p518 = p518; }
	@SerializedName("P838")
	@Nullable
	public List<P1245> p838;
	public List<P1245> getP838() { return p838; }
	public void setP838(List<P1245> p838){ this.p838 = p838; }
	@SerializedName("P232")
	@Nullable
	public String p232;
	public String getP232() { return p232; }
	public void setP232(String p232){ this.p232 = p232; }
	@SerializedName("P205")
	@Nullable
	public List<P1245> p205;
	public List<P1245> getP205() { return p205; }
	public void setP205(List<P1245> p205){ this.p205 = p205; }
	@SerializedName("P1476")
	@Nullable
	public String p1476;
	public String getP1476() { return p1476; }
	public void setP1476(String p1476){ this.p1476 = p1476; }
	@SerializedName("P1029")
	@Nullable
	public String p1029;
	public String getP1029() { return p1029; }
	public void setP1029(String p1029){ this.p1029 = p1029; }
	@SerializedName("P726")
	@Nullable
	public List<P1245> p726;
	public List<P1245> getP726() { return p726; }
	public void setP726(List<P1245> p726){ this.p726 = p726; }
	@SerializedName("P118")
	@Nullable
	public String p118;
	public String getP118() { return p118; }
	public void setP118(String p118){ this.p118 = p118; }
	@SerializedName("P1168")
	@Nullable
	public List<P508> p1168;
	public List<P508> getP1168() { return p1168; }
	public void setP1168(List<P508> p1168){ this.p1168 = p1168; }
	@SerializedName("P723")
	@Nullable
	public String p723;
	public String getP723() { return p723; }
	public void setP723(String p723){ this.p723 = p723; }
	@SerializedName("P740")
	@Nullable
	public String p740;
	public String getP740() { return p740; }
	public void setP740(String p740){ this.p740 = p740; }
	@SerializedName("P488")
	@Nullable
	public String p488;
	public String getP488() { return p488; }
	public void setP488(String p488){ this.p488 = p488; }
	@SerializedName("P1200")
	@Nullable
	public String p1200;
	public String getP1200() { return p1200; }
	public void setP1200(String p1200){ this.p1200 = p1200; }
	@SerializedName("P1285")
	@Nullable
	public String p1285;
	public String getP1285() { return p1285; }
	public void setP1285(String p1285){ this.p1285 = p1285; }
	@SerializedName("P1462")
	@Nullable
	public String p1462;
	public String getP1462() { return p1462; }
	public void setP1462(String p1462){ this.p1462 = p1462; }
	@SerializedName("P724")
	@Nullable
	public List<P1245> p724;
	public List<P1245> getP724() { return p724; }
	public void setP724(List<P1245> p724){ this.p724 = p724; }
	@SerializedName("P1397")
	@Nullable
	public List<P1245> p1397;
	public List<P1245> getP1397() { return p1397; }
	public void setP1397(List<P1245> p1397){ this.p1397 = p1397; }
	@SerializedName("P950")
	@Nullable
	public String p950;
	public String getP950() { return p950; }
	public void setP950(String p950){ this.p950 = p950; }
	@SerializedName("P247")
	@Nullable
	public String p247;
	public String getP247() { return p247; }
	public void setP247(String p247){ this.p247 = p247; }
	@SerializedName("P1228")
	@Nullable
	public List<P508> p1228;
	public List<P508> getP1228() { return p1228; }
	public void setP1228(List<P508> p1228){ this.p1228 = p1228; }
	@SerializedName("P355")
	@Nullable
	public String p355;
	public String getP355() { return p355; }
	public void setP355(String p355){ this.p355 = p355; }
	@SerializedName("P1567")
	@Nullable
	public String p1567;
	public String getP1567() { return p1567; }
	public void setP1567(String p1567){ this.p1567 = p1567; }
	@SerializedName("P1617")
	@Nullable
	public List<P1245> p1617;
	public List<P1245> getP1617() { return p1617; }
	public void setP1617(List<P1245> p1617){ this.p1617 = p1617; }
	@SerializedName("P1545")
	@Nullable
	public List<P1245> p1545;
	public List<P1245> getP1545() { return p1545; }
	public void setP1545(List<P1245> p1545){ this.p1545 = p1545; }
	@SerializedName("P885")
	@Nullable
	public String p885;
	public String getP885() { return p885; }
	public void setP885(String p885){ this.p885 = p885; }
	@SerializedName("P303")
	@Nullable
	public List<P508> p303;
	public List<P508> getP303() { return p303; }
	public void setP303(List<P508> p303){ this.p303 = p303; }
	@SerializedName("P566")
	@Nullable
	public List<P1245> p566;
	public List<P1245> getP566() { return p566; }
	public void setP566(List<P1245> p566){ this.p566 = p566; }
	@SerializedName("P1423")
	@Nullable
	public List<P1245> p1423;
	public List<P1245> getP1423() { return p1423; }
	public void setP1423(List<P1245> p1423){ this.p1423 = p1423; }
	@SerializedName("P1422")
	@Nullable
	public List<P1245> p1422;
	public List<P1245> getP1422() { return p1422; }
	public void setP1422(List<P1245> p1422){ this.p1422 = p1422; }
	@SerializedName("P710")
	@Nullable
	public String p710;
	public String getP710() { return p710; }
	public void setP710(String p710){ this.p710 = p710; }
	@SerializedName("P1375")
	@Nullable
	public String p1375;
	public String getP1375() { return p1375; }
	public void setP1375(String p1375){ this.p1375 = p1375; }
	@SerializedName("P1291")
	@Nullable
	public String p1291;
	public String getP1291() { return p1291; }
	public void setP1291(String p1291){ this.p1291 = p1291; }
	@SerializedName("P1558")
	@Nullable
	public List<P1245> p1558;
	public List<P1245> getP1558() { return p1558; }
	public void setP1558(List<P1245> p1558){ this.p1558 = p1558; }
	@SerializedName("P16")
	@Nullable
	public String p16;
	public String getP16() { return p16; }
	public void setP16(String p16){ this.p16 = p16; }
	@SerializedName("P538")
	@Nullable
	public List<P1245> p538;
	public List<P1245> getP538() { return p538; }
	public void setP538(List<P1245> p538){ this.p538 = p538; }
	@SerializedName("P764")
	@Nullable
	public String p764;
	public String getP764() { return p764; }
	public void setP764(String p764){ this.p764 = p764; }
	@SerializedName("P1317")
	@Nullable
	public String p1317;
	public String getP1317() { return p1317; }
	public void setP1317(String p1317){ this.p1317 = p1317; }
	@SerializedName("P361")
	@Nullable
	public String p361;
	public String getP361() { return p361; }
	public void setP361(String p361){ this.p361 = p361; }
	@SerializedName("P185")
	@Nullable
	public String p185;
	public String getP185() { return p185; }
	public void setP185(String p185){ this.p185 = p185; }
	@SerializedName("P946")
	@Nullable
	public String p946;
	public String getP946() { return p946; }
	public void setP946(String p946){ this.p946 = p946; }
	@SerializedName("P589")
	@Nullable
	public List<P1245> p589;
	public List<P1245> getP589() { return p589; }
	public void setP589(List<P1245> p589){ this.p589 = p589; }
	@SerializedName("P1165")
	@Nullable
	public List<P1245> p1165;
	public List<P1245> getP1165() { return p1165; }
	public void setP1165(List<P1245> p1165){ this.p1165 = p1165; }
	@SerializedName("P912")
	@Nullable
	public String p912;
	public String getP912() { return p912; }
	public void setP912(String p912){ this.p912 = p912; }
	@SerializedName("P92")
	@Nullable
	public String p92;
	public String getP92() { return p92; }
	public void setP92(String p92){ this.p92 = p92; }
	@SerializedName("P291")
	@Nullable
	public String p291;
	public String getP291() { return p291; }
	public void setP291(String p291){ this.p291 = p291; }
	@SerializedName("P244")
	@Nullable
	public String p244;
	public String getP244() { return p244; }
	public void setP244(String p244){ this.p244 = p244; }
	@SerializedName("P974")
	@Nullable
	public String p974;
	public String getP974() { return p974; }
	public void setP974(String p974){ this.p974 = p974; }
	@SerializedName("P592")
	@Nullable
	public List<P508> p592;
	public List<P508> getP592() { return p592; }
	public void setP592(List<P508> p592){ this.p592 = p592; }
	@SerializedName("P1070")
	@Nullable
	public String p1070;
	public String getP1070() { return p1070; }
	public void setP1070(String p1070){ this.p1070 = p1070; }
	@SerializedName("P413")
	@Nullable
	public String p413;
	public String getP413() { return p413; }
	public void setP413(String p413){ this.p413 = p413; }
	@SerializedName("P183")
	@Nullable
	public String p183;
	public String getP183() { return p183; }
	public void setP183(String p183){ this.p183 = p183; }
	@SerializedName("P1191")
	@Nullable
	public String p1191;
	public String getP1191() { return p1191; }
	public void setP1191(String p1191){ this.p1191 = p1191; }
	@SerializedName("P489")
	@Nullable
	public List<P1245> p489;
	public List<P1245> getP489() { return p489; }
	public void setP489(List<P1245> p489){ this.p489 = p489; }
	@SerializedName("P703")
	@Nullable
	public String p703;
	public String getP703() { return p703; }
	public void setP703(String p703){ this.p703 = p703; }
	@SerializedName("P1185")
	@Nullable
	public String p1185;
	public String getP1185() { return p1185; }
	public void setP1185(String p1185){ this.p1185 = p1185; }
	@SerializedName("P1641")
	@Nullable
	public String p1641;
	public String getP1641() { return p1641; }
	public void setP1641(String p1641){ this.p1641 = p1641; }
	@SerializedName("P673")
	@Nullable
	public List<P508> p673;
	public List<P508> getP673() { return p673; }
	public void setP673(List<P508> p673){ this.p673 = p673; }
	@SerializedName("P231")
	@Nullable
	public String p231;
	public String getP231() { return p231; }
	public void setP231(String p231){ this.p231 = p231; }
	@SerializedName("P493")
	@Nullable
	public String p493;
	public String getP493() { return p493; }
	public void setP493(String p493){ this.p493 = p493; }
	@SerializedName("P91")
	@Nullable
	public String p91;
	public String getP91() { return p91; }
	public void setP91(String p91){ this.p91 = p91; }
	@SerializedName("P613")
	@Nullable
	public String p613;
	public String getP613() { return p613; }
	public void setP613(String p613){ this.p613 = p613; }
	@SerializedName("P994")
	@Nullable
	public List<P1245> p994;
	public List<P1245> getP994() { return p994; }
	public void setP994(List<P1245> p994){ this.p994 = p994; }
	@SerializedName("P972")
	@Nullable
	public List<P1417> p972;
	public List<P1417> getP972() { return p972; }
	public void setP972(List<P1417> p972){ this.p972 = p972; }
	@SerializedName("P10")
	@Nullable
	public String p10;
	public String getP10() { return p10; }
	public void setP10(String p10){ this.p10 = p10; }
	@SerializedName("P163")
	@Nullable
	public String p163;
	public String getP163() { return p163; }
	public void setP163(String p163){ this.p163 = p163; }
	@SerializedName("P758")
	@Nullable
	public List<P508> p758;
	public List<P508> getP758() { return p758; }
	public void setP758(List<P508> p758){ this.p758 = p758; }
	@SerializedName("P1082")
	@Nullable
	public String p1082;
	public String getP1082() { return p1082; }
	public void setP1082(String p1082){ this.p1082 = p1082; }
	@SerializedName("P525")
	@Nullable
	public String p525;
	public String getP525() { return p525; }
	public void setP525(String p525){ this.p525 = p525; }
	@SerializedName("P650")
	@Nullable
	public String p650;
	public String getP650() { return p650; }
	public void setP650(String p650){ this.p650 = p650; }
	@SerializedName("P57")
	@Nullable
	public String p57;
	public String getP57() { return p57; }
	public void setP57(String p57){ this.p57 = p57; }
	@SerializedName("P1072")
	@Nullable
	public List<P1245> p1072;
	public List<P1245> getP1072() { return p1072; }
	public void setP1072(List<P1245> p1072){ this.p1072 = p1072; }
	@SerializedName("P1366")
	@Nullable
	public String p1366;
	public String getP1366() { return p1366; }
	public void setP1366(String p1366){ this.p1366 = p1366; }
	@SerializedName("P1139")
	@Nullable
	public List<P508> p1139;
	public List<P508> getP1139() { return p1139; }
	public void setP1139(List<P508> p1139){ this.p1139 = p1139; }
	@SerializedName("P1110")
	@Nullable
	public List<P1245> p1110;
	public List<P1245> getP1110() { return p1110; }
	public void setP1110(List<P1245> p1110){ this.p1110 = p1110; }
	@SerializedName("P1396")
	@Nullable
	public List<P1245> p1396;
	public List<P1245> getP1396() { return p1396; }
	public void setP1396(List<P1245> p1396){ this.p1396 = p1396; }
	@SerializedName("P1448")
	@Nullable
	public String p1448;
	public String getP1448() { return p1448; }
	public void setP1448(String p1448){ this.p1448 = p1448; }
	@SerializedName("P27")
	@Nullable
	public String p27;
	public String getP27() { return p27; }
	public void setP27(String p27){ this.p27 = p27; }
	@SerializedName("P1241")
	@Nullable
	public List<P1245> p1241;
	public List<P1245> getP1241() { return p1241; }
	public void setP1241(List<P1245> p1241){ this.p1241 = p1241; }
	@SerializedName("P640")
	@Nullable
	public String p640;
	public String getP640() { return p640; }
	public void setP640(String p640){ this.p640 = p640; }
	@SerializedName("P1429")
	@Nullable
	public List<P1245> p1429;
	public List<P1245> getP1429() { return p1429; }
	public void setP1429(List<P1245> p1429){ this.p1429 = p1429; }
	@SerializedName("P352")
	@Nullable
	public String p352;
	public String getP352() { return p352; }
	public void setP352(String p352){ this.p352 = p352; }
	@SerializedName("P884")
	@Nullable
	public List<P508> p884;
	public List<P508> getP884() { return p884; }
	public void setP884(List<P508> p884){ this.p884 = p884; }
	@SerializedName("P680")
	@Nullable
	public String p680;
	public String getP680() { return p680; }
	public void setP680(String p680){ this.p680 = p680; }
	@SerializedName("P84")
	@Nullable
	public String p84;
	public String getP84() { return p84; }
	public void setP84(String p84){ this.p84 = p84; }
	@SerializedName("P215")
	@Nullable
	public String p215;
	public String getP215() { return p215; }
	public void setP215(String p215){ this.p215 = p215; }
	@SerializedName("P451")
	@Nullable
	public String p451;
	public String getP451() { return p451; }
	public void setP451(String p451){ this.p451 = p451; }
	@SerializedName("P537")
	@Nullable
	public List<P1245> p537;
	public List<P1245> getP537() { return p537; }
	public void setP537(List<P1245> p537){ this.p537 = p537; }
	@SerializedName("P7")
	@Nullable
	public String p7;
	public String getP7() { return p7; }
	public void setP7(String p7){ this.p7 = p7; }
	@SerializedName("P1670")
	@Nullable
	public String p1670;
	public String getP1670() { return p1670; }
	public void setP1670(String p1670){ this.p1670 = p1670; }
	@SerializedName("P606")
	@Nullable
	public String p606;
	public String getP606() { return p606; }
	public void setP606(String p606){ this.p606 = p606; }
	@SerializedName("P528")
	@Nullable
	public String p528;
	public String getP528() { return p528; }
	public void setP528(String p528){ this.p528 = p528; }
	@SerializedName("P453")
	@Nullable
	public List<P1245> p453;
	public List<P1245> getP453() { return p453; }
	public void setP453(List<P1245> p453){ this.p453 = p453; }
	@SerializedName("P449")
	@Nullable
	public String p449;
	public String getP449() { return p449; }
	public void setP449(String p449){ this.p449 = p449; }
	@SerializedName("P1151")
	@Nullable
	public List<P1245> p1151;
	public List<P1245> getP1151() { return p1151; }
	public void setP1151(List<P1245> p1151){ this.p1151 = p1151; }
	@SerializedName("P246")
	@Nullable
	public List<P508> p246;
	public List<P508> getP246() { return p246; }
	public void setP246(List<P508> p246){ this.p246 = p246; }
	@SerializedName("P1394")
	@Nullable
	public List<P1245> p1394;
	public List<P1245> getP1394() { return p1394; }
	public void setP1394(List<P1245> p1394){ this.p1394 = p1394; }
	@SerializedName("P1565")
	@Nullable
	public List<P1245> p1565;
	public List<P1245> getP1565() { return p1565; }
	public void setP1565(List<P1245> p1565){ this.p1565 = p1565; }
	@SerializedName("P535")
	@Nullable
	public String p535;
	public String getP535() { return p535; }
	public void setP535(String p535){ this.p535 = p535; }
	@SerializedName("P962")
	@Nullable
	public List<P1245> p962;
	public List<P1245> getP962() { return p962; }
	public void setP962(List<P1245> p962){ this.p962 = p962; }
	@SerializedName("P1076")
	@Nullable
	public List<P1245> p1076;
	public List<P1245> getP1076() { return p1076; }
	public void setP1076(List<P1245> p1076){ this.p1076 = p1076; }
	@SerializedName("P1149")
	@Nullable
	public String p1149;
	public String getP1149() { return p1149; }
	public void setP1149(String p1149){ this.p1149 = p1149; }
	@SerializedName("P682")
	@Nullable
	public String p682;
	public String getP682() { return p682; }
	public void setP682(String p682){ this.p682 = p682; }
	@SerializedName("P112")
	@Nullable
	public String p112;
	public String getP112() { return p112; }
	public void setP112(String p112){ this.p112 = p112; }
	@SerializedName("P1005")
	@Nullable
	public String p1005;
	public String getP1005() { return p1005; }
	public void setP1005(String p1005){ this.p1005 = p1005; }
	@SerializedName("P553")
	@Nullable
	public String p553;
	public String getP553() { return p553; }
	public void setP553(String p553){ this.p553 = p553; }
	@SerializedName("P973")
	@Nullable
	public String p973;
	public String getP973() { return p973; }
	public void setP973(String p973){ this.p973 = p973; }
	@SerializedName("P36")
	@Nullable
	public String p36;
	public String getP36() { return p36; }
	public void setP36(String p36){ this.p36 = p36; }
	@SerializedName("P1351")
	@Nullable
	public List<P1245> p1351;
	public List<P1245> getP1351() { return p1351; }
	public void setP1351(List<P1245> p1351){ this.p1351 = p1351; }
	@SerializedName("P416")
	@Nullable
	public List<P1245> p416;
	public List<P1245> getP416() { return p416; }
	public void setP416(List<P1245> p416){ this.p416 = p416; }
	@SerializedName("P1304")
	@Nullable
	public List<P1245> p1304;
	public List<P1245> getP1304() { return p1304; }
	public void setP1304(List<P1245> p1304){ this.p1304 = p1304; }
	@SerializedName("P197")
	@Nullable
	public String p197;
	public String getP197() { return p197; }
	public void setP197(String p197){ this.p197 = p197; }
	@SerializedName("P1278")
	@Nullable
	public List<P1245> p1278;
	public List<P1245> getP1278() { return p1278; }
	public void setP1278(List<P1245> p1278){ this.p1278 = p1278; }
	@SerializedName("P1048")
	@Nullable
	public List<P1245> p1048;
	public List<P1245> getP1048() { return p1048; }
	public void setP1048(List<P1245> p1048){ this.p1048 = p1048; }
	@SerializedName("P998")
	@Nullable
	public String p998;
	public String getP998() { return p998; }
	public void setP998(String p998){ this.p998 = p998; }
	@SerializedName("P773")
	@Nullable
	public List<P1245> p773;
	public List<P1245> getP773() { return p773; }
	public void setP773(List<P1245> p773){ this.p773 = p773; }
	@SerializedName("P1629")
	@Nullable
	public List<P1245> p1629;
	public List<P1245> getP1629() { return p1629; }
	public void setP1629(List<P1245> p1629){ this.p1629 = p1629; }
	@SerializedName("P268")
	@Nullable
	public String p268;
	public String getP268() { return p268; }
	public void setP268(String p268){ this.p268 = p268; }
	@SerializedName("P396")
	@Nullable
	public String p396;
	public String getP396() { return p396; }
	public void setP396(String p396){ this.p396 = p396; }
	@SerializedName("P201")
	@Nullable
	public List<P1245> p201;
	public List<P1245> getP201() { return p201; }
	public void setP201(List<P1245> p201){ this.p201 = p201; }
	@SerializedName("P1033")
	@Nullable
	public List<P508> p1033;
	public List<P508> getP1033() { return p1033; }
	public void setP1033(List<P508> p1033){ this.p1033 = p1033; }
	@SerializedName("P1190")
	@Nullable
	public String p1190;
	public String getP1190() { return p1190; }
	public void setP1190(String p1190){ this.p1190 = p1190; }
	@SerializedName("P117")
	@Nullable
	public String p117;
	public String getP117() { return p117; }
	public void setP117(String p117){ this.p117 = p117; }
	@SerializedName("P458")
	@Nullable
	public List<P1245> p458;
	public List<P1245> getP458() { return p458; }
	public void setP458(List<P1245> p458){ this.p458 = p458; }
	@SerializedName("P1036")
	@Nullable
	public String p1036;
	public String getP1036() { return p1036; }
	public void setP1036(String p1036){ this.p1036 = p1036; }
	@SerializedName("P159")
	@Nullable
	public String p159;
	public String getP159() { return p159; }
	public void setP159(String p159){ this.p159 = p159; }
	@SerializedName("P1444")
	@Nullable
	public List<P1245> p1444;
	public List<P1245> getP1444() { return p1444; }
	public void setP1444(List<P1245> p1444){ this.p1444 = p1444; }
	@SerializedName("P804")
	@Nullable
	public List<P1245> p804;
	public List<P1245> getP804() { return p804; }
	public void setP804(List<P1245> p804){ this.p804 = p804; }
	@SerializedName("P665")
	@Nullable
	public List<P508> p665;
	public List<P508> getP665() { return p665; }
	public void setP665(List<P508> p665){ this.p665 = p665; }
	@SerializedName("P611")
	@Nullable
	public String p611;
	public String getP611() { return p611; }
	public void setP611(String p611){ this.p611 = p611; }
	@SerializedName("P1140")
	@Nullable
	public String p1140;
	public String getP1140() { return p1140; }
	public void setP1140(String p1140){ this.p1140 = p1140; }
	@SerializedName("P746")
	@Nullable
	public List<P1245> p746;
	public List<P1245> getP746() { return p746; }
	public void setP746(List<P1245> p746){ this.p746 = p746; }
	@SerializedName("P220")
	@Nullable
	public String p220;
	public String getP220() { return p220; }
	public void setP220(String p220){ this.p220 = p220; }
	@SerializedName("P846")
	@Nullable
	public List<P1245> p846;
	public List<P1245> getP846() { return p846; }
	public void setP846(List<P1245> p846){ this.p846 = p846; }
	@SerializedName("P539")
	@Nullable
	public List<P1245> p539;
	public List<P1245> getP539() { return p539; }
	public void setP539(List<P1245> p539){ this.p539 = p539; }
	@SerializedName("P53")
	@Nullable
	public String p53;
	public String getP53() { return p53; }
	public void setP53(String p53){ this.p53 = p53; }
	@SerializedName("P350")
	@Nullable
	public List<P1245> p350;
	public List<P1245> getP350() { return p350; }
	public void setP350(List<P1245> p350){ this.p350 = p350; }
	@SerializedName("P546")
	@Nullable
	public List<P1245> p546;
	public List<P1245> getP546() { return p546; }
	public void setP546(List<P1245> p546){ this.p546 = p546; }
	@SerializedName("P1533")
	@Nullable
	public List<P1245> p1533;
	public List<P1245> getP1533() { return p1533; }
	public void setP1533(List<P1245> p1533){ this.p1533 = p1533; }
	@SerializedName("P276")
	@Nullable
	public String p276;
	public String getP276() { return p276; }
	public void setP276(String p276){ this.p276 = p276; }
	@SerializedName("P634")
	@Nullable
	public String p634;
	public String getP634() { return p634; }
	public void setP634(String p634){ this.p634 = p634; }
	@SerializedName("P1158")
	@Nullable
	public List<P1245> p1158;
	public List<P1245> getP1158() { return p1158; }
	public void setP1158(List<P1245> p1158){ this.p1158 = p1158; }
	@SerializedName("P1263")
	@Nullable
	public List<P1245> p1263;
	public List<P1245> getP1263() { return p1263; }
	public void setP1263(List<P1245> p1263){ this.p1263 = p1263; }
	@SerializedName("P376")
	@Nullable
	public List<P1245> p376;
	public List<P1245> getP376() { return p376; }
	public void setP376(List<P1245> p376){ this.p376 = p376; }
	@SerializedName("P652")
	@Nullable
	public List<P1245> p652;
	public List<P1245> getP652() { return p652; }
	public void setP652(List<P1245> p652){ this.p652 = p652; }
	@SerializedName("P382")
	@Nullable
	public String p382;
	public String getP382() { return p382; }
	public void setP382(String p382){ this.p382 = p382; }
	@SerializedName("P1323")
	@Nullable
	public List<P1245> p1323;
	public List<P1245> getP1323() { return p1323; }
	public void setP1323(List<P1245> p1323){ this.p1323 = p1323; }
	@SerializedName("P1201")
	@Nullable
	public List<P508> p1201;
	public List<P508> getP1201() { return p1201; }
	public void setP1201(List<P508> p1201){ this.p1201 = p1201; }
	@SerializedName("P1276")
	@Nullable
	public List<P1245> p1276;
	public List<P1245> getP1276() { return p1276; }
	public void setP1276(List<P1245> p1276){ this.p1276 = p1276; }
	@SerializedName("P105")
	@Nullable
	public String p105;
	public String getP105() { return p105; }
	public void setP105(String p105){ this.p105 = p105; }
	@SerializedName("P943")
	@Nullable
	public String p943;
	public String getP943() { return p943; }
	public void setP943(String p943){ this.p943 = p943; }
	@SerializedName("P1150")
	@Nullable
	public List<P1245> p1150;
	public List<P1245> getP1150() { return p1150; }
	public void setP1150(List<P1245> p1150){ this.p1150 = p1150; }
	@SerializedName("P1053")
	@Nullable
	public List<P1245> p1053;
	public List<P1245> getP1053() { return p1053; }
	public void setP1053(List<P1245> p1053){ this.p1053 = p1053; }
	@SerializedName("P1312")
	@Nullable
	public String p1312;
	public String getP1312() { return p1312; }
	public void setP1312(String p1312){ this.p1312 = p1312; }
	@SerializedName("P942")
	@Nullable
	public List<P1245> p942;
	public List<P1245> getP942() { return p942; }
	public void setP942(List<P1245> p942){ this.p942 = p942; }
	@SerializedName("P605")
	@Nullable
	public List<P1245> p605;
	public List<P1245> getP605() { return p605; }
	public void setP605(List<P1245> p605){ this.p605 = p605; }
	@SerializedName("P1644")
	@Nullable
	public List<P1245> p1644;
	public List<P1245> getP1644() { return p1644; }
	public void setP1644(List<P1245> p1644){ this.p1644 = p1644; }
	@SerializedName("P661")
	@Nullable
	public String p661;
	public String getP661() { return p661; }
	public void setP661(String p661){ this.p661 = p661; }
	@SerializedName("P1371")
	@Nullable
	public List<P1245> p1371;
	public List<P1245> getP1371() { return p1371; }
	public void setP1371(List<P1245> p1371){ this.p1371 = p1371; }
	@SerializedName("P696")
	@Nullable
	public List<P508> p696;
	public List<P508> getP696() { return p696; }
	public void setP696(List<P508> p696){ this.p696 = p696; }
	@SerializedName("P59")
	@Nullable
	public String p59;
	public String getP59() { return p59; }
	public void setP59(String p59){ this.p59 = p59; }
	@SerializedName("P638")
	@Nullable
	public List<P508> p638;
	public List<P508> getP638() { return p638; }
	public void setP638(List<P508> p638){ this.p638 = p638; }
	@SerializedName("P1546")
	@Nullable
	public String p1546;
	public String getP1546() { return p1546; }
	public void setP1546(String p1546){ this.p1546 = p1546; }
	@SerializedName("P41")
	@Nullable
	public String p41;
	public String getP41() { return p41; }
	public void setP41(String p41){ this.p41 = p41; }
	@SerializedName("P195")
	@Nullable
	public String p195;
	public String getP195() { return p195; }
	public void setP195(String p195){ this.p195 = p195; }
	@SerializedName("P677")
	@Nullable
	public List<P1245> p677;
	public List<P1245> getP677() { return p677; }
	public void setP677(List<P1245> p677){ this.p677 = p677; }
	@SerializedName("P713")
	@Nullable
	public String p713;
	public String getP713() { return p713; }
	public void setP713(String p713){ this.p713 = p713; }
	@SerializedName("P507")
	@Nullable
	public String p507;
	public String getP507() { return p507; }
	public void setP507(String p507){ this.p507 = p507; }
	@SerializedName("P772")
	@Nullable
	public String p772;
	public String getP772() { return p772; }
	public void setP772(String p772){ this.p772 = p772; }
	@SerializedName("P483")
	@Nullable
	public List<P1245> p483;
	public List<P1245> getP483() { return p483; }
	public void setP483(List<P1245> p483){ this.p483 = p483; }
	@SerializedName("P1464")
	@Nullable
	public String p1464;
	public String getP1464() { return p1464; }
	public void setP1464(String p1464){ this.p1464 = p1464; }
	@SerializedName("P597")
	@Nullable
	public String p597;
	public String getP597() { return p597; }
	public void setP597(String p597){ this.p597 = p597; }
	@SerializedName("P1478")
	@Nullable
	public List<P1245> p1478;
	public List<P1245> getP1478() { return p1478; }
	public void setP1478(List<P1245> p1478){ this.p1478 = p1478; }
	@SerializedName("P791")
	@Nullable
	public String p791;
	public String getP791() { return p791; }
	public void setP791(String p791){ this.p791 = p791; }
	@SerializedName("P1038")
	@Nullable
	public String p1038;
	public String getP1038() { return p1038; }
	public void setP1038(String p1038){ this.p1038 = p1038; }
	@SerializedName("P1014")
	@Nullable
	public List<P1245> p1014;
	public List<P1245> getP1014() { return p1014; }
	public void setP1014(List<P1245> p1014){ this.p1014 = p1014; }
	@SerializedName("P742")
	@Nullable
	public String p742;
	public String getP742() { return p742; }
	public void setP742(String p742){ this.p742 = p742; }
	@SerializedName("P217")
	@Nullable
	public String p217;
	public String getP217() { return p217; }
	public void setP217(String p217){ this.p217 = p217; }
	@SerializedName("P1207")
	@Nullable
	public String p1207;
	public String getP1207() { return p1207; }
	public void setP1207(String p1207){ this.p1207 = p1207; }
	@SerializedName("P418")
	@Nullable
	public String p418;
	public String getP418() { return p418; }
	public void setP418(String p418){ this.p418 = p418; }
	@SerializedName("P175")
	@Nullable
	public String p175;
	public String getP175() { return p175; }
	public void setP175(String p175){ this.p175 = p175; }
	@SerializedName("P1128")
	@Nullable
	public String p1128;
	public String getP1128() { return p1128; }
	public void setP1128(String p1128){ this.p1128 = p1128; }
	@SerializedName("P367")
	@Nullable
	public List<P508> p367;
	public List<P508> getP367() { return p367; }
	public void setP367(List<P508> p367){ this.p367 = p367; }
	@SerializedName("P1302")
	@Nullable
	public List<P1245> p1302;
	public List<P1245> getP1302() { return p1302; }
	public void setP1302(List<P1245> p1302){ this.p1302 = p1302; }
	@SerializedName("P111")
	@Nullable
	public List<P1245> p111;
	public List<P1245> getP111() { return p111; }
	public void setP111(List<P1245> p111){ this.p111 = p111; }
	@SerializedName("P25")
	@Nullable
	public String p25;
	public String getP25() { return p25; }
	public void setP25(String p25){ this.p25 = p25; }
	@SerializedName("P669")
	@Nullable
	public String p669;
	public String getP669() { return p669; }
	public void setP669(String p669){ this.p669 = p669; }
	@SerializedName("P1589")
	@Nullable
	public List<P1245> p1589;
	public List<P1245> getP1589() { return p1589; }
	public void setP1589(List<P1245> p1589){ this.p1589 = p1589; }
	@SerializedName("P427")
	@Nullable
	public List<P1245> p427;
	public List<P1245> getP427() { return p427; }
	public void setP427(List<P1245> p427){ this.p427 = p427; }
	@SerializedName("P582")
	@Nullable
	public String p582;
	public String getP582() { return p582; }
	public void setP582(String p582){ this.p582 = p582; }
	@SerializedName("P1050")
	@Nullable
	public String p1050;
	public String getP1050() { return p1050; }
	public void setP1050(String p1050){ this.p1050 = p1050; }
	@SerializedName("P425")
	@Nullable
	public List<P1245> p425;
	public List<P1245> getP425() { return p425; }
	public void setP425(List<P1245> p425){ this.p425 = p425; }
	@SerializedName("P506")
	@Nullable
	public List<P1245> p506;
	public List<P1245> getP506() { return p506; }
	public void setP506(List<P1245> p506){ this.p506 = p506; }
	@SerializedName("P210")
	@Nullable
	public List<P1245> p210;
	public List<P1245> getP210() { return p210; }
	public void setP210(List<P1245> p210){ this.p210 = p210; }
	@SerializedName("P841")
	@Nullable
	public String p841;
	public String getP841() { return p841; }
	public void setP841(String p841){ this.p841 = p841; }
	@SerializedName("P277")
	@Nullable
	public String p277;
	public String getP277() { return p277; }
	public void setP277(String p277){ this.p277 = p277; }
	@SerializedName("P859")
	@Nullable
	public List<P1245> p859;
	public List<P1245> getP859() { return p859; }
	public void setP859(List<P1245> p859){ this.p859 = p859; }
	@SerializedName("P960")
	@Nullable
	public String p960;
	public String getP960() { return p960; }
	public void setP960(String p960){ this.p960 = p960; }
	@SerializedName("P1115")
	@Nullable
	public List<P1245> p1115;
	public List<P1245> getP1115() { return p1115; }
	public void setP1115(List<P1245> p1115){ this.p1115 = p1115; }
	@SerializedName("P1325")
	@Nullable
	public List<P1417> p1325;
	public List<P1417> getP1325() { return p1325; }
	public void setP1325(List<P1417> p1325){ this.p1325 = p1325; }
	@SerializedName("P1636")
	@Nullable
	public String p1636;
	public String getP1636() { return p1636; }
	public void setP1636(String p1636){ this.p1636 = p1636; }
	@SerializedName("P826")
	@Nullable
	public String p826;
	public String getP826() { return p826; }
	public void setP826(String p826){ this.p826 = p826; }
	@SerializedName("P193")
	@Nullable
	public String p193;
	public String getP193() { return p193; }
	public void setP193(String p193){ this.p193 = p193; }
	@SerializedName("P377")
	@Nullable
	public String p377;
	public String getP377() { return p377; }
	public void setP377(String p377){ this.p377 = p377; }
	@SerializedName("P438")
	@Nullable
	public String p438;
	public String getP438() { return p438; }
	public void setP438(String p438){ this.p438 = p438; }
	@SerializedName("P1064")
	@Nullable
	public String p1064;
	public String getP1064() { return p1064; }
	public void setP1064(String p1064){ this.p1064 = p1064; }
	@SerializedName("P1057")
	@Nullable
	public String p1057;
	public String getP1057() { return p1057; }
	public void setP1057(String p1057){ this.p1057 = p1057; }
	@SerializedName("P504")
	@Nullable
	public String p504;
	public String getP504() { return p504; }
	public void setP504(String p504){ this.p504 = p504; }
	@SerializedName("P1569")
	@Nullable
	public List<P1245> p1569;
	public List<P1245> getP1569() { return p1569; }
	public void setP1569(List<P1245> p1569){ this.p1569 = p1569; }
	@SerializedName("P629")
	@Nullable
	public List<P1245> p629;
	public List<P1245> getP629() { return p629; }
	public void setP629(List<P1245> p629){ this.p629 = p629; }
	@SerializedName("P1430")
	@Nullable
	public List<P1245> p1430;
	public List<P1245> getP1430() { return p1430; }
	public void setP1430(List<P1245> p1430){ this.p1430 = p1430; }
	@SerializedName("P1134")
	@Nullable
	public String p1134;
	public String getP1134() { return p1134; }
	public void setP1134(String p1134){ this.p1134 = p1134; }
	@SerializedName("P1294")
	@Nullable
	public List<P1245> p1294;
	public List<P1245> getP1294() { return p1294; }
	public void setP1294(List<P1245> p1294){ this.p1294 = p1294; }
	@SerializedName("P1288")
	@Nullable
	public List<P1245> p1288;
	public List<P1245> getP1288() { return p1288; }
	public void setP1288(List<P1245> p1288){ this.p1288 = p1288; }
	@SerializedName("P227")
	@Nullable
	public String p227;
	public String getP227() { return p227; }
	public void setP227(String p227){ this.p227 = p227; }
	@SerializedName("P1289")
	@Nullable
	public String p1289;
	public String getP1289() { return p1289; }
	public void setP1289(String p1289){ this.p1289 = p1289; }
	@SerializedName("P296")
	@Nullable
	public String p296;
	public String getP296() { return p296; }
	public void setP296(String p296){ this.p296 = p296; }
	@SerializedName("P357")
	@Nullable
	public String p357;
	public String getP357() { return p357; }
	public void setP357(String p357){ this.p357 = p357; }
	@SerializedName("P1449")
	@Nullable
	public String p1449;
	public String getP1449() { return p1449; }
	public void setP1449(String p1449){ this.p1449 = p1449; }
	@SerializedName("P1174")
	@Nullable
	public String p1174;
	public String getP1174() { return p1174; }
	public void setP1174(String p1174){ this.p1174 = p1174; }
	@SerializedName("P1350")
	@Nullable
	public List<P1245> p1350;
	public List<P1245> getP1350() { return p1350; }
	public void setP1350(List<P1245> p1350){ this.p1350 = p1350; }
	@SerializedName("P1125")
	@Nullable
	public String p1125;
	public String getP1125() { return p1125; }
	public void setP1125(String p1125){ this.p1125 = p1125; }
	@SerializedName("P556")
	@Nullable
	public String p556;
	public String getP556() { return p556; }
	public void setP556(String p556){ this.p556 = p556; }
	@SerializedName("P20")
	@Nullable
	public String p20;
	public String getP20() { return p20; }
	public void setP20(String p20){ this.p20 = p20; }
	@SerializedName("P815")
	@Nullable
	public String p815;
	public String getP815() { return p815; }
	public void setP815(String p815){ this.p815 = p815; }
	@SerializedName("P800")
	@Nullable
	public String p800;
	public String getP800() { return p800; }
	public void setP800(String p800){ this.p800 = p800; }
	@SerializedName("P181")
	@Nullable
	public String p181;
	public String getP181() { return p181; }
	public void setP181(String p181){ this.p181 = p181; }
	@SerializedName("P1382")
	@Nullable
	public List<P1245> p1382;
	public List<P1245> getP1382() { return p1382; }
	public void setP1382(List<P1245> p1382){ this.p1382 = p1382; }
	@SerializedName("P771")
	@Nullable
	public String p771;
	public String getP771() { return p771; }
	public void setP771(String p771){ this.p771 = p771; }
	@SerializedName("P865")
	@Nullable
	public List<P1245> p865;
	public List<P1245> getP865() { return p865; }
	public void setP865(List<P1245> p865){ this.p865 = p865; }
	@SerializedName("P662")
	@Nullable
	public String p662;
	public String getP662() { return p662; }
	public void setP662(String p662){ this.p662 = p662; }
	@SerializedName("P1322")
	@Nullable
	public List<P1245> p1322;
	public List<P1245> getP1322() { return p1322; }
	public void setP1322(List<P1245> p1322){ this.p1322 = p1322; }
	@SerializedName("P1650")
	@Nullable
	public List<P508> p1650;
	public List<P508> getP1650() { return p1650; }
	public void setP1650(List<P508> p1650){ this.p1650 = p1650; }
	@SerializedName("P1195")
	@Nullable
	public List<P1245> p1195;
	public List<P1245> getP1195() { return p1195; }
	public void setP1195(List<P1245> p1195){ this.p1195 = p1195; }
	@SerializedName("P1434")
	@Nullable
	public List<P1245> p1434;
	public List<P1245> getP1434() { return p1434; }
	public void setP1434(List<P1245> p1434){ this.p1434 = p1434; }
	@SerializedName("P593")
	@Nullable
	public String p593;
	public String getP593() { return p593; }
	public void setP593(String p593){ this.p593 = p593; }
	@SerializedName("P370")
	@Nullable
	public String p370;
	public String getP370() { return p370; }
	public void setP370(String p370){ this.p370 = p370; }
	@SerializedName("P234")
	@Nullable
	public String p234;
	public String getP234() { return p234; }
	public void setP234(String p234){ this.p234 = p234; }
	@SerializedName("P1203")
	@Nullable
	public List<P508> p1203;
	public List<P508> getP1203() { return p1203; }
	public void setP1203(List<P508> p1203){ this.p1203 = p1203; }
	@SerializedName("P1220")
	@Nullable
	public List<P1245> p1220;
	public List<P1245> getP1220() { return p1220; }
	public void setP1220(List<P1245> p1220){ this.p1220 = p1220; }
	@SerializedName("P477")
	@Nullable
	public List<P1245> p477;
	public List<P1245> getP477() { return p477; }
	public void setP477(List<P1245> p477){ this.p477 = p477; }
	@SerializedName("P212")
	@Nullable
	public String p212;
	public String getP212() { return p212; }
	public void setP212(String p212){ this.p212 = p212; }
	@SerializedName("P1088")
	@Nullable
	public String p1088;
	public String getP1088() { return p1088; }
	public void setP1088(String p1088){ this.p1088 = p1088; }
	@SerializedName("P676")
	@Nullable
	public String p676;
	public String getP676() { return p676; }
	public void setP676(String p676){ this.p676 = p676; }
	@SerializedName("P264")
	@Nullable
	public String p264;
	public String getP264() { return p264; }
	public void setP264(String p264){ this.p264 = p264; }
	@SerializedName("P1330")
	@Nullable
	public String p1330;
	public String getP1330() { return p1330; }
	public void setP1330(String p1330){ this.p1330 = p1330; }
	@SerializedName("P166")
	@Nullable
	public String p166;
	public String getP166() { return p166; }
	public void setP166(String p166){ this.p166 = p166; }
	@SerializedName("P374")
	@Nullable
	public String p374;
	public String getP374() { return p374; }
	public void setP374(String p374){ this.p374 = p374; }
	@SerializedName("P793")
	@Nullable
	public String p793;
	public String getP793() { return p793; }
	public void setP793(String p793){ this.p793 = p793; }
	@SerializedName("P143")
	@Nullable
	public List<P1417> p143;
	public List<P1417> getP143() { return p143; }
	public void setP143(List<P1417> p143){ this.p143 = p143; }
	@SerializedName("P19")
	@Nullable
	public String p19;
	public String getP19() { return p19; }
	public void setP19(String p19){ this.p19 = p19; }
	@SerializedName("P1419")
	@Nullable
	public List<P1245> p1419;
	public List<P1245> getP1419() { return p1419; }
	public void setP1419(List<P1245> p1419){ this.p1419 = p1419; }
	@SerializedName("P880")
	@Nullable
	public String p880;
	public String getP880() { return p880; }
	public void setP880(String p880){ this.p880 = p880; }
	@SerializedName("P898")
	@Nullable
	public String p898;
	public String getP898() { return p898; }
	public void setP898(String p898){ this.p898 = p898; }
	@SerializedName("P511")
	@Nullable
	public String p511;
	public String getP511() { return p511; }
	public void setP511(String p511){ this.p511 = p511; }
	@SerializedName("P798")
	@Nullable
	public String p798;
	public String getP798() { return p798; }
	public void setP798(String p798){ this.p798 = p798; }
	@SerializedName("P1069")
	@Nullable
	public List<P1245> p1069;
	public List<P1245> getP1069() { return p1069; }
	public void setP1069(List<P1245> p1069){ this.p1069 = p1069; }
	@SerializedName("P179")
	@Nullable
	public String p179;
	public String getP179() { return p179; }
	public void setP179(String p179){ this.p179 = p179; }
	@SerializedName("P580")
	@Nullable
	public String p580;
	public String getP580() { return p580; }
	public void setP580(String p580){ this.p580 = p580; }
	@SerializedName("P214")
	@Nullable
	public String p214;
	public String getP214() { return p214; }
	public void setP214(String p214){ this.p214 = p214; }
	@SerializedName("P1104")
	@Nullable
	public List<P1245> p1104;
	public List<P1245> getP1104() { return p1104; }
	public void setP1104(List<P1245> p1104){ this.p1104 = p1104; }
	@SerializedName("P450")
	@Nullable
	public String p450;
	public String getP450() { return p450; }
	public void setP450(String p450){ this.p450 = p450; }
	@SerializedName("P1438")
	@Nullable
	public String p1438;
	public String getP1438() { return p1438; }
	public void setP1438(String p1438){ this.p1438 = p1438; }
	@SerializedName("P1248")
	@Nullable
	public List<P508> p1248;
	public List<P508> getP1248() { return p1248; }
	public void setP1248(List<P508> p1248){ this.p1248 = p1248; }
	@SerializedName("P570")
	@Nullable
	public String p570;
	public String getP570() { return p570; }
	public void setP570(String p570){ this.p570 = p570; }
	@SerializedName("P354")
	@Nullable
	public List<P508> p354;
	public List<P508> getP354() { return p354; }
	public void setP354(List<P508> p354){ this.p354 = p354; }
	@SerializedName("P282")
	@Nullable
	public List<P1245> p282;
	public List<P1245> getP282() { return p282; }
	public void setP282(List<P1245> p282){ this.p282 = p282; }
	@SerializedName("P1389")
	@Nullable
	public String p1389;
	public String getP1389() { return p1389; }
	public void setP1389(String p1389){ this.p1389 = p1389; }
	@SerializedName("P213")
	@Nullable
	public String p213;
	public String getP213() { return p213; }
	public void setP213(String p213){ this.p213 = p213; }
	@SerializedName("P989")
	@Nullable
	public String p989;
	public String getP989() { return p989; }
	public void setP989(String p989){ this.p989 = p989; }
	@SerializedName("P1019")
	@Nullable
	public String p1019;
	public String getP1019() { return p1019; }
	public void setP1019(String p1019){ this.p1019 = p1019; }
	@SerializedName("P1416")
	@Nullable
	public String p1416;
	public String getP1416() { return p1416; }
	public void setP1416(String p1416){ this.p1416 = p1416; }
	@SerializedName("P1561")
	@Nullable
	public List<P1245> p1561;
	public List<P1245> getP1561() { return p1561; }
	public void setP1561(List<P1245> p1561){ this.p1561 = p1561; }
	@SerializedName("P1286")
	@Nullable
	public List<P1245> p1286;
	public List<P1245> getP1286() { return p1286; }
	public void setP1286(List<P1245> p1286){ this.p1286 = p1286; }
	@SerializedName("P1114")
	@Nullable
	public String p1114;
	public String getP1114() { return p1114; }
	public void setP1114(String p1114){ this.p1114 = p1114; }
	@SerializedName("P637")
	@Nullable
	public String p637;
	public String getP637() { return p637; }
	public void setP637(String p637){ this.p637 = p637; }
	@SerializedName("P949")
	@Nullable
	public String p949;
	public String getP949() { return p949; }
	public void setP949(String p949){ this.p949 = p949; }
	@SerializedName("P1435")
	@Nullable
	public String p1435;
	public String getP1435() { return p1435; }
	public void setP1435(String p1435){ this.p1435 = p1435; }
	@SerializedName("P1385")
	@Nullable
	public List<P1245> p1385;
	public List<P1245> getP1385() { return p1385; }
	public void setP1385(List<P1245> p1385){ this.p1385 = p1385; }
	@SerializedName("P17")
	@Nullable
	public String p17;
	public String getP17() { return p17; }
	public void setP17(String p17){ this.p17 = p17; }
	@SerializedName("P351")
	@Nullable
	public String p351;
	public String getP351() { return p351; }
	public void setP351(String p351){ this.p351 = p351; }
	@SerializedName("P1447")
	@Nullable
	public String p1447;
	public String getP1447() { return p1447; }
	public void setP1447(String p1447){ this.p1447 = p1447; }
	@SerializedName("P921")
	@Nullable
	public String p921;
	public String getP921() { return p921; }
	public void setP921(String p921){ this.p921 = p921; }
	@SerializedName("P751")
	@Nullable
	public List<P1245> p751;
	public List<P1245> getP751() { return p751; }
	public void setP751(List<P1245> p751){ this.p751 = p751; }
	@SerializedName("P768")
	@Nullable
	public List<P1245> p768;
	public List<P1245> getP768() { return p768; }
	public void setP768(List<P1245> p768){ this.p768 = p768; }
	@SerializedName("P1627")
	@Nullable
	public List<P1245> p1627;
	public List<P1245> getP1627() { return p1627; }
	public void setP1627(List<P1245> p1627){ this.p1627 = p1627; }
	@SerializedName("P1056")
	@Nullable
	public String p1056;
	public String getP1056() { return p1056; }
	public void setP1056(String p1056){ this.p1056 = p1056; }
	@SerializedName("P588")
	@Nullable
	public List<P1245> p588;
	public List<P1245> getP588() { return p588; }
	public void setP588(List<P1245> p588){ this.p588 = p588; }
	@SerializedName("P1624")
	@Nullable
	public List<P1245> p1624;
	public List<P1245> getP1624() { return p1624; }
	public void setP1624(List<P1245> p1624){ this.p1624 = p1624; }
	@SerializedName("P373")
	@Nullable
	public String p373;
	public String getP373() { return p373; }
	public void setP373(String p373){ this.p373 = p373; }
	@SerializedName("P1017")
	@Nullable
	public String p1017;
	public String getP1017() { return p1017; }
	public void setP1017(String p1017){ this.p1017 = p1017; }
	@SerializedName("P65")
	@Nullable
	public String p65;
	public String getP65() { return p65; }
	public void setP65(String p65){ this.p65 = p65; }
	@SerializedName("P452")
	@Nullable
	public String p452;
	public String getP452() { return p452; }
	public void setP452(String p452){ this.p452 = p452; }
	@SerializedName("P47")
	@Nullable
	public String p47;
	public String getP47() { return p47; }
	public void setP47(String p47){ this.p47 = p47; }
	@SerializedName("P948")
	@Nullable
	public List<P1245> p948;
	public List<P1245> getP948() { return p948; }
	public void setP948(List<P1245> p948){ this.p948 = p948; }
	@SerializedName("P157")
	@Nullable
	public String p157;
	public String getP157() { return p157; }
	public void setP157(String p157){ this.p157 = p157; }
	@SerializedName("P551")
	@Nullable
	public String p551;
	public String getP551() { return p551; }
	public void setP551(String p551){ this.p551 = p551; }
	@SerializedName("P81")
	@Nullable
	public String p81;
	public String getP81() { return p81; }
	public void setP81(String p81){ this.p81 = p81; }
	@SerializedName("P1049")
	@Nullable
	public List<P1245> p1049;
	public List<P1245> getP1049() { return p1049; }
	public void setP1049(List<P1245> p1049){ this.p1049 = p1049; }
	@SerializedName("P1440")
	@Nullable
	public List<P508> p1440;
	public List<P508> getP1440() { return p1440; }
	public void setP1440(List<P508> p1440){ this.p1440 = p1440; }
	@SerializedName("P1224")
	@Nullable
	public List<P1245> p1224;
	public List<P1245> getP1224() { return p1224; }
	public void setP1224(List<P1245> p1224){ this.p1224 = p1224; }
	@SerializedName("P1214")
	@Nullable
	public List<P1245> p1214;
	public List<P1245> getP1214() { return p1214; }
	public void setP1214(List<P1245> p1214){ this.p1214 = p1214; }
	@SerializedName("P1604")
	@Nullable
	public List<P1245> p1604;
	public List<P1245> getP1604() { return p1604; }
	public void setP1604(List<P1245> p1604){ this.p1604 = p1604; }
	@SerializedName("P503")
	@Nullable
	public List<P1245> p503;
	public List<P1245> getP503() { return p503; }
	public void setP503(List<P1245> p503){ this.p503 = p503; }
	@SerializedName("P571")
	@Nullable
	public String p571;
	public String getP571() { return p571; }
	public void setP571(String p571){ this.p571 = p571; }
	@SerializedName("P172")
	@Nullable
	public String p172;
	public String getP172() { return p172; }
	public void setP172(String p172){ this.p172 = p172; }
	@SerializedName("P552")
	@Nullable
	public String p552;
	public String getP552() { return p552; }
	public void setP552(String p552){ this.p552 = p552; }
	@SerializedName("P150")
	@Nullable
	public String p150;
	public String getP150() { return p150; }
	public void setP150(String p150){ this.p150 = p150; }
	@SerializedName("P1606")
	@Nullable
	public List<P1245> p1606;
	public List<P1245> getP1606() { return p1606; }
	public void setP1606(List<P1245> p1606){ this.p1606 = p1606; }
	@SerializedName("P1582")
	@Nullable
	public List<P1245> p1582;
	public List<P1245> getP1582() { return p1582; }
	public void setP1582(List<P1245> p1582){ this.p1582 = p1582; }
	@SerializedName("P1100")
	@Nullable
	public List<P1245> p1100;
	public List<P1245> getP1100() { return p1100; }
	public void setP1100(List<P1245> p1100){ this.p1100 = p1100; }
	@SerializedName("P954")
	@Nullable
	public String p954;
	public String getP954() { return p954; }
	public void setP954(String p954){ this.p954 = p954; }
	@SerializedName("P1003")
	@Nullable
	public List<P1245> p1003;
	public List<P1245> getP1003() { return p1003; }
	public void setP1003(List<P1245> p1003){ this.p1003 = p1003; }
	@SerializedName("P720")
	@Nullable
	public String p720;
	public String getP720() { return p720; }
	public void setP720(String p720){ this.p720 = p720; }
	@SerializedName("P286")
	@Nullable
	public String p286;
	public String getP286() { return p286; }
	public void setP286(String p286){ this.p286 = p286; }
	@SerializedName("P236")
	@Nullable
	public String p236;
	public String getP236() { return p236; }
	public void setP236(String p236){ this.p236 = p236; }
	@SerializedName("P1402")
	@Nullable
	public List<P1245> p1402;
	public List<P1245> getP1402() { return p1402; }
	public void setP1402(List<P1245> p1402){ this.p1402 = p1402; }
	@SerializedName("P381")
	@Nullable
	public List<P1245> p381;
	public List<P1245> getP381() { return p381; }
	public void setP381(List<P1245> p381){ this.p381 = p381; }
	@SerializedName("P852")
	@Nullable
	public List<P508> p852;
	public List<P508> getP852() { return p852; }
	public void setP852(List<P508> p852){ this.p852 = p852; }
	@SerializedName("P527")
	@Nullable
	public String p527;
	public String getP527() { return p527; }
	public void setP527(String p527){ this.p527 = p527; }
	@SerializedName("P639")
	@Nullable
	public String p639;
	public String getP639() { return p639; }
	public void setP639(String p639){ this.p639 = p639; }
	@SerializedName("P1001")
	@Nullable
	public String p1001;
	public String getP1001() { return p1001; }
	public void setP1001(String p1001){ this.p1001 = p1001; }
	@SerializedName("P1085")
	@Nullable
	public List<P1245> p1085;
	public List<P1245> getP1085() { return p1085; }
	public void setP1085(List<P1245> p1085){ this.p1085 = p1085; }
	@SerializedName("P404")
	@Nullable
	public String p404;
	public String getP404() { return p404; }
	public void setP404(String p404){ this.p404 = p404; }
	@SerializedName("P398")
	@Nullable
	public String p398;
	public String getP398() { return p398; }
	public void setP398(String p398){ this.p398 = p398; }
	@SerializedName("P1156")
	@Nullable
	public List<P508> p1156;
	public List<P508> getP1156() { return p1156; }
	public void setP1156(List<P508> p1156){ this.p1156 = p1156; }
	@SerializedName("P399")
	@Nullable
	public String p399;
	public String getP399() { return p399; }
	public void setP399(String p399){ this.p399 = p399; }
	@SerializedName("P242")
	@Nullable
	public String p242;
	public String getP242() { return p242; }
	public void setP242(String p242){ this.p242 = p242; }
	@SerializedName("P1186")
	@Nullable
	public String p1186;
	public String getP1186() { return p1186; }
	public void setP1186(String p1186){ this.p1186 = p1186; }
	@SerializedName("P599")
	@Nullable
	public String p599;
	public String getP599() { return p599; }
	public void setP599(String p599){ this.p599 = p599; }
	@SerializedName("P761")
	@Nullable
	public List<P1245> p761;
	public List<P1245> getP761() { return p761; }
	public void setP761(List<P1245> p761){ this.p761 = p761; }
	@SerializedName("P1333")
	@Nullable
	public String p1333;
	public String getP1333() { return p1333; }
	public void setP1333(String p1333){ this.p1333 = p1333; }
	@SerializedName("P1399")
	@Nullable
	public String p1399;
	public String getP1399() { return p1399; }
	public void setP1399(String p1399){ this.p1399 = p1399; }
	@SerializedName("P1236")
	@Nullable
	public List<P1245> p1236;
	public List<P1245> getP1236() { return p1236; }
	public void setP1236(List<P1245> p1236){ this.p1236 = p1236; }
	@SerializedName("P853")
	@Nullable
	public List<P508> p853;
	public List<P508> getP853() { return p853; }
	public void setP853(List<P508> p853){ this.p853 = p853; }
	@SerializedName("P542")
	@Nullable
	public List<P1245> p542;
	public List<P1245> getP542() { return p542; }
	public void setP542(List<P1245> p542){ this.p542 = p542; }
	@SerializedName("P931")
	@Nullable
	public List<P1245> p931;
	public List<P1245> getP931() { return p931; }
	public void setP931(List<P1245> p931){ this.p931 = p931; }
	@SerializedName("P278")
	@Nullable
	public String p278;
	public String getP278() { return p278; }
	public void setP278(String p278){ this.p278 = p278; }
	@SerializedName("P402")
	@Nullable
	public String p402;
	public String getP402() { return p402; }
	public void setP402(String p402){ this.p402 = p402; }
	@SerializedName("P530")
	@Nullable
	public String p530;
	public String getP530() { return p530; }
	public void setP530(String p530){ this.p530 = p530; }
	@SerializedName("P585")
	@Nullable
	public String p585;
	public String getP585() { return p585; }
	public void setP585(String p585){ this.p585 = p585; }
	@SerializedName("P725")
	@Nullable
	public String p725;
	public String getP725() { return p725; }
	public void setP725(String p725){ this.p725 = p725; }
	@SerializedName("P524")
	@Nullable
	public List<P1245> p524;
	public List<P1245> getP524() { return p524; }
	public void setP524(List<P1245> p524){ this.p524 = p524; }
	@SerializedName("P1361")
	@Nullable
	public List<P1245> p1361;
	public List<P1245> getP1361() { return p1361; }
	public void setP1361(List<P1245> p1361){ this.p1361 = p1361; }
	@SerializedName("P681")
	@Nullable
	public String p681;
	public String getP681() { return p681; }
	public void setP681(String p681){ this.p681 = p681; }
	@SerializedName("P1290")
	@Nullable
	public List<P1245> p1290;
	public List<P1245> getP1290() { return p1290; }
	public void setP1290(List<P1245> p1290){ this.p1290 = p1290; }
	@SerializedName("P610")
	@Nullable
	public String p610;
	public String getP610() { return p610; }
	public void setP610(String p610){ this.p610 = p610; }
	@SerializedName("P963")
	@Nullable
	public List<P1245> p963;
	public List<P1245> getP963() { return p963; }
	public void setP963(List<P1245> p963){ this.p963 = p963; }
	@SerializedName("P1015")
	@Nullable
	public String p1015;
	public String getP1015() { return p1015; }
	public void setP1015(String p1015){ this.p1015 = p1015; }
	@SerializedName("P509")
	@Nullable
	public String p509;
	public String getP509() { return p509; }
	public void setP509(String p509){ this.p509 = p509; }
	@SerializedName("P301")
	@Nullable
	public String p301;
	public String getP301() { return p301; }
	public void setP301(String p301){ this.p301 = p301; }
	@SerializedName("P1071")
	@Nullable
	public String p1071;
	public String getP1071() { return p1071; }
	public void setP1071(String p1071){ this.p1071 = p1071; }
	@SerializedName("P480")
	@Nullable
	public String p480;
	public String getP480() { return p480; }
	public void setP480(String p480){ this.p480 = p480; }
	@SerializedName("P411")
	@Nullable
	public String p411;
	public String getP411() { return p411; }
	public void setP411(String p411){ this.p411 = p411; }
	@SerializedName("P497")
	@Nullable
	public List<P1245> p497;
	public List<P1245> getP497() { return p497; }
	public void setP497(List<P1245> p497){ this.p497 = p497; }
	@SerializedName("P101")
	@Nullable
	public String p101;
	public String getP101() { return p101; }
	public void setP101(String p101){ this.p101 = p101; }
	@SerializedName("P1417")
	@Nullable
	public String p1417;
	public String getP1417() { return p1417; }
	public void setP1417(String p1417){ this.p1417 = p1417; }
	@SerializedName("P516")
	@Nullable
	public String p516;
	public String getP516() { return p516; }
	public void setP516(String p516){ this.p516 = p516; }
	@SerializedName("P1581")
	@Nullable
	public List<P1245> p1581;
	public List<P1245> getP1581() { return p1581; }
	public void setP1581(List<P1245> p1581){ this.p1581 = p1581; }
	@SerializedName("P31")
	@Nullable
	public String p31;
	public String getP31() { return p31; }
	public void setP31(String p31){ this.p31 = p31; }
	@SerializedName("P883")
	@Nullable
	public List<P1245> p883;
	public List<P1245> getP883() { return p883; }
	public void setP883(List<P1245> p883){ this.p883 = p883; }
	@SerializedName("P806")
	@Nullable
	public String p806;
	public String getP806() { return p806; }
	public void setP806(String p806){ this.p806 = p806; }
	@SerializedName("P598")
	@Nullable
	public String p598;
	public String getP598() { return p598; }
	public void setP598(String p598){ this.p598 = p598; }
	@SerializedName("P1441")
	@Nullable
	public String p1441;
	public String getP1441() { return p1441; }
	public void setP1441(String p1441){ this.p1441 = p1441; }
	@SerializedName("P274")
	@Nullable
	public String p274;
	public String getP274() { return p274; }
	public void setP274(String p274){ this.p274 = p274; }
	@SerializedName("P964")
	@Nullable
	public String p964;
	public String getP964() { return p964; }
	public void setP964(String p964){ this.p964 = p964; }
	@SerializedName("P297")
	@Nullable
	public List<P1245> p297;
	public List<P1245> getP297() { return p297; }
	public void setP297(List<P1245> p297){ this.p297 = p297; }
	@SerializedName("P1395")
	@Nullable
	public List<P508> p1395;
	public List<P508> getP1395() { return p1395; }
	public void setP1395(List<P508> p1395){ this.p1395 = p1395; }
	@SerializedName("P1421")
	@Nullable
	public List<P1245> p1421;
	public List<P1245> getP1421() { return p1421; }
	public void setP1421(List<P1245> p1421){ this.p1421 = p1421; }
	@SerializedName("P1119")
	@Nullable
	public String p1119;
	public String getP1119() { return p1119; }
	public void setP1119(String p1119){ this.p1119 = p1119; }
	@SerializedName("P907")
	@Nullable
	public List<P1245> p907;
	public List<P1245> getP907() { return p907; }
	public void setP907(List<P1245> p907){ this.p907 = p907; }
	@SerializedName("P1529")
	@Nullable
	public List<P1245> p1529;
	public List<P1245> getP1529() { return p1529; }
	public void setP1529(List<P1245> p1529){ this.p1529 = p1529; }
	@SerializedName("P240")
	@Nullable
	public String p240;
	public String getP240() { return p240; }
	public void setP240(String p240){ this.p240 = p240; }
	@SerializedName("P558")
	@Nullable
	public String p558;
	public String getP558() { return p558; }
	public void setP558(String p558){ this.p558 = p558; }
	@SerializedName("P512")
	@Nullable
	public String p512;
	public String getP512() { return p512; }
	public void setP512(String p512){ this.p512 = p512; }
	@SerializedName("P375")
	@Nullable
	public String p375;
	public String getP375() { return p375; }
	public void setP375(String p375){ this.p375 = p375; }
	@SerializedName("P1413")
	@Nullable
	public List<P1245> p1413;
	public List<P1245> getP1413() { return p1413; }
	public void setP1413(List<P1245> p1413){ this.p1413 = p1413; }
	@SerializedName("P866")
	@Nullable
	public List<P1245> p866;
	public List<P1245> getP866() { return p866; }
	public void setP866(List<P1245> p866){ this.p866 = p866; }
	@SerializedName("P647")
	@Nullable
	public String p647;
	public String getP647() { return p647; }
	public void setP647(String p647){ this.p647 = p647; }
	@SerializedName("P1578")
	@Nullable
	public List<P1245> p1578;
	public List<P1245> getP1578() { return p1578; }
	public void setP1578(List<P1245> p1578){ this.p1578 = p1578; }
	@SerializedName("P1392")
	@Nullable
	public List<P1245> p1392;
	public List<P1245> getP1392() { return p1392; }
	public void setP1392(List<P1245> p1392){ this.p1392 = p1392; }
	@SerializedName("P959")
	@Nullable
	public String p959;
	public String getP959() { return p959; }
	public void setP959(String p959){ this.p959 = p959; }
	@SerializedName("P644")
	@Nullable
	public List<P508> p644;
	public List<P508> getP644() { return p644; }
	public void setP644(List<P508> p644){ this.p644 = p644; }
	@SerializedName("P712")
	@Nullable
	public String p712;
	public String getP712() { return p712; }
	public void setP712(String p712){ this.p712 = p712; }
	@SerializedName("P1599")
	@Nullable
	public List<P1245> p1599;
	public List<P1245> getP1599() { return p1599; }
	public void setP1599(List<P1245> p1599){ this.p1599 = p1599; }
	@SerializedName("P18")
	@Nullable
	public String p18;
	public String getP18() { return p18; }
	public void setP18(String p18){ this.p18 = p18; }
	@SerializedName("P508")
	@Nullable
	public String p508;
	public String getP508() { return p508; }
	public void setP508(String p508){ this.p508 = p508; }
	@SerializedName("P223")
	@Nullable
	public List<P508> p223;
	public List<P508> getP223() { return p223; }
	public void setP223(List<P508> p223){ this.p223 = p223; }
	@SerializedName("P167")
	@Nullable
	public List<P1245> p167;
	public List<P1245> getP167() { return p167; }
	public void setP167(List<P1245> p167){ this.p167 = p167; }
	@SerializedName("P1618")
	@Nullable
	public String p1618;
	public String getP1618() { return p1618; }
	public void setP1618(String p1618){ this.p1618 = p1618; }
	@SerializedName("P426")
	@Nullable
	public List<P1245> p426;
	public List<P1245> getP426() { return p426; }
	public void setP426(List<P1245> p426){ this.p426 = p426; }
	@SerializedName("P947")
	@Nullable
	public String p947;
	public String getP947() { return p947; }
	public void setP947(String p947){ this.p947 = p947; }
	@SerializedName("P1188")
	@Nullable
	public List<P1245> p1188;
	public List<P1245> getP1188() { return p1188; }
	public void setP1188(List<P1245> p1188){ this.p1188 = p1188; }
	@SerializedName("P409")
	@Nullable
	public String p409;
	public String getP409() { return p409; }
	public void setP409(String p409){ this.p409 = p409; }
	@SerializedName("P805")
	@Nullable
	public List<P1245> p805;
	public List<P1245> getP805() { return p805; }
	public void setP805(List<P1245> p805){ this.p805 = p805; }
	@SerializedName("P263")
	@Nullable
	public String p263;
	public String getP263() { return p263; }
	public void setP263(String p263){ this.p263 = p263; }
	@SerializedName("P470")
	@Nullable
	public String p470;
	public String getP470() { return p470; }
	public void setP470(String p470){ this.p470 = p470; }
	@SerializedName("P757")
	@Nullable
	public String p757;
	public String getP757() { return p757; }
	public void setP757(String p757){ this.p757 = p757; }
	@SerializedName("P1067")
	@Nullable
	public String p1067;
	public String getP1067() { return p1067; }
	public void setP1067(String p1067){ this.p1067 = p1067; }
	@SerializedName("P86")
	@Nullable
	public String p86;
	public String getP86() { return p86; }
	public void setP86(String p86){ this.p86 = p86; }
	@SerializedName("P686")
	@Nullable
	public String p686;
	public String getP686() { return p686; }
	public void setP686(String p686){ this.p686 = p686; }
	@SerializedName("P1556")
	@Nullable
	public List<P1245> p1556;
	public List<P1245> getP1556() { return p1556; }
	public void setP1556(List<P1245> p1556){ this.p1556 = p1556; }
	@SerializedName("P395")
	@Nullable
	public String p395;
	public String getP395() { return p395; }
	public void setP395(String p395){ this.p395 = p395; }
	@SerializedName("P178")
	@Nullable
	public String p178;
	public String getP178() { return p178; }
	public void setP178(String p178){ this.p178 = p178; }
	@SerializedName("P856")
	@Nullable
	public String p856;
	public String getP856() { return p856; }
	public void setP856(String p856){ this.p856 = p856; }
	@SerializedName("P1265")
	@Nullable
	public String p1265;
	public String getP1265() { return p1265; }
	public void setP1265(String p1265){ this.p1265 = p1265; }
	@SerializedName("P577")
	@Nullable
	public String p577;
	public String getP577() { return p577; }
	public void setP577(String p577){ this.p577 = p577; }
	@SerializedName("P951")
	@Nullable
	public List<P1245> p951;
	public List<P1245> getP951() { return p951; }
	public void setP951(List<P1245> p951){ this.p951 = p951; }
	@SerializedName("P1461")
	@Nullable
	public List<P508> p1461;
	public List<P508> getP1461() { return p1461; }
	public void setP1461(List<P508> p1461){ this.p1461 = p1461; }
	@SerializedName("P1309")
	@Nullable
	public String p1309;
	public String getP1309() { return p1309; }
	public void setP1309(String p1309){ this.p1309 = p1309; }
	@SerializedName("P1240")
	@Nullable
	public List<P508> p1240;
	public List<P508> getP1240() { return p1240; }
	public void setP1240(List<P508> p1240){ this.p1240 = p1240; }
	@SerializedName("P267")
	@Nullable
	public String p267;
	public String getP267() { return p267; }
	public void setP267(String p267){ this.p267 = p267; }
	@SerializedName("P407")
	@Nullable
	public String p407;
	public String getP407() { return p407; }
	public void setP407(String p407){ this.p407 = p407; }
	@SerializedName("P557")
	@Nullable
	public String p557;
	public String getP557() { return p557; }
	public void setP557(String p557){ this.p557 = p557; }
	@SerializedName("P1258")
	@Nullable
	public String p1258;
	public String getP1258() { return p1258; }
	public void setP1258(String p1258){ this.p1258 = p1258; }
	@SerializedName("P1251")
	@Nullable
	public List<P1245> p1251;
	public List<P1245> getP1251() { return p1251; }
	public void setP1251(List<P1245> p1251){ this.p1251 = p1251; }
	@SerializedName("P463")
	@Nullable
	public String p463;
	public String getP463() { return p463; }
	public void setP463(String p463){ this.p463 = p463; }
	@SerializedName("P1098")
	@Nullable
	public String p1098;
	public String getP1098() { return p1098; }
	public void setP1098(String p1098){ this.p1098 = p1098; }
	@SerializedName("P642")
	@Nullable
	public List<P1245> p642;
	public List<P1245> getP642() { return p642; }
	public void setP642(List<P1245> p642){ this.p642 = p642; }
	@SerializedName("P1120")
	@Nullable
	public String p1120;
	public String getP1120() { return p1120; }
	public void setP1120(String p1120){ this.p1120 = p1120; }
	@SerializedName("P706")
	@Nullable
	public String p706;
	public String getP706() { return p706; }
	public void setP706(String p706){ this.p706 = p706; }
	@SerializedName("P631")
	@Nullable
	public String p631;
	public String getP631() { return p631; }
	public void setP631(String p631){ this.p631 = p631; }
	@SerializedName("P961")
	@Nullable
	public String p961;
	public String getP961() { return p961; }
	public void setP961(String p961){ this.p961 = p961; }
	@SerializedName("P306")
	@Nullable
	public String p306;
	public String getP306() { return p306; }
	public void setP306(String p306){ this.p306 = p306; }
	@SerializedName("P1455")
	@Nullable
	public String p1455;
	public String getP1455() { return p1455; }
	public void setP1455(String p1455){ this.p1455 = p1455; }
	@SerializedName("P910")
	@Nullable
	public String p910;
	public String getP910() { return p910; }
	public void setP910(String p910){ this.p910 = p910; }
	@SerializedName("P651")
	@Nullable
	public String p651;
	public String getP651() { return p651; }
	public void setP651(String p651){ this.p651 = p651; }
	@SerializedName("P702")
	@Nullable
	public String p702;
	public String getP702() { return p702; }
	public void setP702(String p702){ this.p702 = p702; }
	@SerializedName("P749")
	@Nullable
	public String p749;
	public String getP749() { return p749; }
	public void setP749(String p749){ this.p749 = p749; }
	@SerializedName("P269")
	@Nullable
	public String p269;
	public String getP269() { return p269; }
	public void setP269(String p269){ this.p269 = p269; }
	@SerializedName("P171")
	@Nullable
	public String p171;
	public String getP171() { return p171; }
	public void setP171(String p171){ this.p171 = p171; }
	@SerializedName("P688")
	@Nullable
	public List<P1245> p688;
	public List<P1245> getP688() { return p688; }
	public void setP688(List<P1245> p688){ this.p688 = p688; }
	@SerializedName("P945")
	@Nullable
	public String p945;
	public String getP945() { return p945; }
	public void setP945(String p945){ this.p945 = p945; }
	@SerializedName("P348")
	@Nullable
	public String p348;
	public String getP348() { return p348; }
	public void setP348(String p348){ this.p348 = p348; }
	@SerializedName("P636")
	@Nullable
	public List<P1245> p636;
	public List<P1245> getP636() { return p636; }
	public void setP636(List<P1245> p636){ this.p636 = p636; }
	@SerializedName("P1060")
	@Nullable
	public List<P1245> p1060;
	public List<P1245> getP1060() { return p1060; }
	public void setP1060(List<P1245> p1060){ this.p1060 = p1060; }
	@SerializedName("P465")
	@Nullable
	public String p465;
	public String getP465() { return p465; }
	public void setP465(String p465){ this.p465 = p465; }
	@SerializedName("P1081")
	@Nullable
	public String p1081;
	public String getP1081() { return p1081; }
	public void setP1081(String p1081){ this.p1081 = p1081; }
	@SerializedName("P655")
	@Nullable
	public String p655;
	public String getP655() { return p655; }
	public void setP655(String p655){ this.p655 = p655; }
	@SerializedName("P776")
	@Nullable
	public List<P1245> p776;
	public List<P1245> getP776() { return p776; }
	public void setP776(List<P1245> p776){ this.p776 = p776; }
	@SerializedName("P905")
	@Nullable
	public List<P1245> p905;
	public List<P1245> getP905() { return p905; }
	public void setP905(List<P1245> p905){ this.p905 = p905; }
	@SerializedName("P397")
	@Nullable
	public String p397;
	public String getP397() { return p397; }
	public void setP397(String p397){ this.p397 = p397; }
	@SerializedName("P468")
	@Nullable
	public List<P1245> p468;
	public List<P1245> getP468() { return p468; }
	public void setP468(List<P1245> p468){ this.p468 = p468; }
	@SerializedName("P1315")
	@Nullable
	public List<P1245> p1315;
	public List<P1245> getP1315() { return p1315; }
	public void setP1315(List<P1245> p1315){ this.p1315 = p1315; }
	@SerializedName("P735")
	@Nullable
	public String p735;
	public String getP735() { return p735; }
	public void setP735(String p735){ this.p735 = p735; }
	@SerializedName("P836")
	@Nullable
	public List<P1245> p836;
	public List<P1245> getP836() { return p836; }
	public void setP836(List<P1245> p836){ this.p836 = p836; }
	@SerializedName("P158")
	@Nullable
	public String p158;
	public String getP158() { return p158; }
	public void setP158(String p158){ this.p158 = p158; }
	@SerializedName("P1352")
	@Nullable
	public List<P26> p1352;
	public List<P26> getP1352() { return p1352; }
	public void setP1352(List<P26> p1352){ this.p1352 = p1352; }
	@SerializedName("P1601")
	@Nullable
	public List<P1245> p1601;
	public List<P1245> getP1601() { return p1601; }
	public void setP1601(List<P1245> p1601){ this.p1601 = p1601; }
	@SerializedName("P520")
	@Nullable
	public String p520;
	public String getP520() { return p520; }
	public void setP520(String p520){ this.p520 = p520; }
	@SerializedName("P633")
	@Nullable
	public String p633;
	public String getP633() { return p633; }
	public void setP633(String p633){ this.p633 = p633; }
	@SerializedName("P1469")
	@Nullable
	public List<P508> p1469;
	public List<P508> getP1469() { return p1469; }
	public void setP1469(List<P508> p1469){ this.p1469 = p1469; }
	@SerializedName("P843")
	@Nullable
	public String p843;
	public String getP843() { return p843; }
	public void setP843(String p843){ this.p843 = p843; }
	@SerializedName("P687")
	@Nullable
	public List<P1245> p687;
	public List<P1245> getP687() { return p687; }
	public void setP687(List<P1245> p687){ this.p687 = p687; }
	@SerializedName("P114")
	@Nullable
	public String p114;
	public String getP114() { return p114; }
	public void setP114(String p114){ this.p114 = p114; }
	@SerializedName("P1281")
	@Nullable
	public String p1281;
	public String getP1281() { return p1281; }
	public void setP1281(String p1281){ this.p1281 = p1281; }
	@SerializedName("P1566")
	@Nullable
	public String p1566;
	public String getP1566() { return p1566; }
	public void setP1566(String p1566){ this.p1566 = p1566; }
	@SerializedName("P448")
	@Nullable
	public String p448;
	public String getP448() { return p448; }
	public void setP448(String p448){ this.p448 = p448; }
	@SerializedName("P393")
	@Nullable
	public List<P1245> p393;
	public List<P1245> getP393() { return p393; }
	public void setP393(List<P1245> p393){ this.p393 = p393; }
	@SerializedName("P1035")
	@Nullable
	public List<P1245> p1035;
	public List<P1245> getP1035() { return p1035; }
	public void setP1035(List<P1245> p1035){ this.p1035 = p1035; }
	@SerializedName("P437")
	@Nullable
	public String p437;
	public String getP437() { return p437; }
	public void setP437(String p437){ this.p437 = p437; }
	@SerializedName("P1470")
	@Nullable
	public List<P1245> p1470;
	public List<P1245> getP1470() { return p1470; }
	public void setP1470(List<P1245> p1470){ this.p1470 = p1470; }
	@SerializedName("P529")
	@Nullable
	public String p529;
	public String getP529() { return p529; }
	public void setP529(String p529){ this.p529 = p529; }
	@SerializedName("P1531")
	@Nullable
	public List<P508> p1531;
	public List<P508> getP1531() { return p1531; }
	public void setP1531(List<P508> p1531){ this.p1531 = p1531; }
	@SerializedName("P349")
	@Nullable
	public String p349;
	public String getP349() { return p349; }
	public void setP349(String p349){ this.p349 = p349; }
	@SerializedName("P9")
	@Nullable
	public String p9;
	public String getP9() { return p9; }
	public void setP9(String p9){ this.p9 = p9; }
	@SerializedName("P186")
	@Nullable
	public String p186;
	public String getP186() { return p186; }
	public void setP186(String p186){ this.p186 = p186; }
	@SerializedName("P982")
	@Nullable
	public String p982;
	public String getP982() { return p982; }
	public void setP982(String p982){ this.p982 = p982; }
	@SerializedName("P617")
	@Nullable
	public String p617;
	public String getP617() { return p617; }
	public void setP617(String p617){ this.p617 = p617; }
	@SerializedName("P830")
	@Nullable
	public String p830;
	public String getP830() { return p830; }
	public void setP830(String p830){ this.p830 = p830; }
	@SerializedName("P825")
	@Nullable
	public List<P1245> p825;
	public List<P1245> getP825() { return p825; }
	public void setP825(List<P1245> p825){ this.p825 = p825; }
	@SerializedName("P814")
	@Nullable
	public String p814;
	public String getP814() { return p814; }
	public void setP814(String p814){ this.p814 = p814; }
	@SerializedName("P1077")
	@Nullable
	public List<P508> p1077;
	public List<P508> getP1077() { return p1077; }
	public void setP1077(List<P508> p1077){ this.p1077 = p1077; }
	@SerializedName("P1308")
	@Nullable
	public List<P1245> p1308;
	public List<P1245> getP1308() { return p1308; }
	public void setP1308(List<P1245> p1308){ this.p1308 = p1308; }
	@SerializedName("P149")
	@Nullable
	public String p149;
	public String getP149() { return p149; }
	public void setP149(String p149){ this.p149 = p149; }
	@SerializedName("P432")
	@Nullable
	public String p432;
	public String getP432() { return p432; }
	public void setP432(String p432){ this.p432 = p432; }
	@SerializedName("P522")
	@Nullable
	public List<P1245> p522;
	public List<P1245> getP522() { return p522; }
	public void setP522(List<P1245> p522){ this.p522 = p522; }
	@SerializedName("P532")
	@Nullable
	public List<P1245> p532;
	public List<P1245> getP532() { return p532; }
	public void setP532(List<P1245> p532){ this.p532 = p532; }
	@SerializedName("P645")
	@Nullable
	public List<P508> p645;
	public List<P508> getP645() { return p645; }
	public void setP645(List<P508> p645){ this.p645 = p645; }
	@SerializedName("P993")
	@Nullable
	public List<P1245> p993;
	public List<P1245> getP993() { return p993; }
	public void setP993(List<P1245> p993){ this.p993 = p993; }
	@SerializedName("P1647")
	@Nullable
	public List<P1245> p1647;
	public List<P1245> getP1647() { return p1647; }
	public void setP1647(List<P1245> p1647){ this.p1647 = p1647; }
	@SerializedName("P58")
	@Nullable
	public String p58;
	public String getP58() { return p58; }
	public void setP58(String p58){ this.p58 = p58; }
	@SerializedName("P380")
	@Nullable
	public String p380;
	public String getP380() { return p380; }
	public void setP380(String p380){ this.p380 = p380; }
	@SerializedName("P434")
	@Nullable
	public String p434;
	public String getP434() { return p434; }
	public void setP434(String p434){ this.p434 = p434; }
	@SerializedName("P6")
	@Nullable
	public String p6;
	public String getP6() { return p6; }
	public void setP6(String p6){ this.p6 = p6; }
	@SerializedName("P695")
	@Nullable
	public List<P508> p695;
	public List<P508> getP695() { return p695; }
	public void setP695(List<P508> p695){ this.p695 = p695; }
	@SerializedName("P1118")
	@Nullable
	public String p1118;
	public String getP1118() { return p1118; }
	public void setP1118(String p1118){ this.p1118 = p1118; }
	@SerializedName("P908")
	@Nullable
	public List<P508> p908;
	public List<P508> getP908() { return p908; }
	public void setP908(List<P508> p908){ this.p908 = p908; }
	@SerializedName("P1439")
	@Nullable
	public List<P508> p1439;
	public List<P508> getP1439() { return p1439; }
	public void setP1439(List<P508> p1439){ this.p1439 = p1439; }
	@SerializedName("P462")
	@Nullable
	public String p462;
	public String getP462() { return p462; }
	public void setP462(String p462){ this.p462 = p462; }
	@SerializedName("P1587")
	@Nullable
	public List<P1245> p1587;
	public List<P1245> getP1587() { return p1587; }
	public void setP1587(List<P1245> p1587){ this.p1587 = p1587; }
	@SerializedName("P1477")
	@Nullable
	public String p1477;
	public String getP1477() { return p1477; }
	public void setP1477(String p1477){ this.p1477 = p1477; }
	@SerializedName("P1696")
	@Nullable
	public List<P1245> p1696;
	public List<P1245> getP1696() { return p1696; }
	public void setP1696(List<P1245> p1696){ this.p1696 = p1696; }
	@SerializedName("P591")
	@Nullable
	public List<P1245> p591;
	public List<P1245> getP591() { return p591; }
	public void setP591(List<P1245> p591){ this.p591 = p591; }
	@SerializedName("P1342")
	@Nullable
	public List<P1245> p1342;
	public List<P1245> getP1342() { return p1342; }
	public void setP1342(List<P1245> p1342){ this.p1342 = p1342; }
	@SerializedName("P604")
	@Nullable
	public String p604;
	public String getP604() { return p604; }
	public void setP604(String p604){ this.p604 = p604; }
	@SerializedName("P995")
	@Nullable
	public List<P1245> p995;
	public List<P1245> getP995() { return p995; }
	public void setP995(List<P1245> p995){ this.p995 = p995; }
	@SerializedName("P1340")
	@Nullable
	public List<P1245> p1340;
	public List<P1245> getP1340() { return p1340; }
	public void setP1340(List<P1245> p1340){ this.p1340 = p1340; }
	@SerializedName("P861")
	@Nullable
	public String p861;
	public String getP861() { return p861; }
	public void setP861(String p861){ this.p861 = p861; }
	@SerializedName("P1044")
	@Nullable
	public List<P1245> p1044;
	public List<P1245> getP1044() { return p1044; }
	public void setP1044(List<P1245> p1044){ this.p1044 = p1044; }
	@SerializedName("P1183")
	@Nullable
	public List<P508> p1183;
	public List<P508> getP1183() { return p1183; }
	public void setP1183(List<P508> p1183){ this.p1183 = p1183; }
	@SerializedName("P657")
	@Nullable
	public List<P508> p657;
	public List<P508> getP657() { return p657; }
	public void setP657(List<P508> p657){ this.p657 = p657; }
	@SerializedName("P229")
	@Nullable
	public String p229;
	public String getP229() { return p229; }
	public void setP229(String p229){ this.p229 = p229; }
	@SerializedName("P714")
	@Nullable
	public String p714;
	public String getP714() { return p714; }
	public void setP714(String p714){ this.p714 = p714; }
	@SerializedName("P906")
	@Nullable
	public String p906;
	public String getP906() { return p906; }
	public void setP906(String p906){ this.p906 = p906; }
	@SerializedName("P1249")
	@Nullable
	public String p1249;
	public String getP1249() { return p1249; }
	public void setP1249(String p1249){ this.p1249 = p1249; }
	@SerializedName("P1577")
	@Nullable
	public List<P1245> p1577;
	public List<P1245> getP1577() { return p1577; }
	public void setP1577(List<P1245> p1577){ this.p1577 = p1577; }
	@SerializedName("P270")
	@Nullable
	public List<P1245> p270;
	public List<P1245> getP270() { return p270; }
	public void setP270(List<P1245> p270){ this.p270 = p270; }
	@SerializedName("P1339")
	@Nullable
	public List<P508> p1339;
	public List<P508> getP1339() { return p1339; }
	public void setP1339(List<P508> p1339){ this.p1339 = p1339; }
	@SerializedName("P957")
	@Nullable
	public String p957;
	public String getP957() { return p957; }
	public void setP957(String p957){ this.p957 = p957; }
	@SerializedName("P1362")
	@Nullable
	public String p1362;
	public String getP1362() { return p1362; }
	public void setP1362(String p1362){ this.p1362 = p1362; }
	@SerializedName("P1026")
	@Nullable
	public List<P1245> p1026;
	public List<P1245> getP1026() { return p1026; }
	public void setP1026(List<P1245> p1026){ this.p1026 = p1026; }
	@SerializedName("P194")
	@Nullable
	public String p194;
	public String getP194() { return p194; }
	public void setP194(String p194){ this.p194 = p194; }
	@SerializedName("P88")
	@Nullable
	public List<P1245> p88;
	public List<P1245> getP88() { return p88; }
	public void setP88(List<P1245> p88){ this.p88 = p88; }
	@SerializedName("P1367")
	@Nullable
	public String p1367;
	public String getP1367() { return p1367; }
	public void setP1367(String p1367){ this.p1367 = p1367; }
	@SerializedName("P505")
	@Nullable
	public List<P1417> p505;
	public List<P1417> getP505() { return p505; }
	public void setP505(List<P1417> p505){ this.p505 = p505; }
	@SerializedName("P1551")
	@Nullable
	public List<P1245> p1551;
	public List<P1245> getP1551() { return p1551; }
	public void setP1551(List<P1245> p1551){ this.p1551 = p1551; }
	@SerializedName("P850")
	@Nullable
	public List<P508> p850;
	public List<P508> getP850() { return p850; }
	public void setP850(List<P508> p850){ this.p850 = p850; }
	@SerializedName("P1420")
	@Nullable
	public String p1420;
	public String getP1420() { return p1420; }
	public void setP1420(String p1420){ this.p1420 = p1420; }
	@SerializedName("P981")
	@Nullable
	public List<P1245> p981;
	public List<P1245> getP981() { return p981; }
	public void setP981(List<P1245> p981){ this.p981 = p981; }
	@SerializedName("P1287")
	@Nullable
	public List<P1245> p1287;
	public List<P1245> getP1287() { return p1287; }
	public void setP1287(List<P1245> p1287){ this.p1287 = p1287; }
	@SerializedName("P1090")
	@Nullable
	public List<P508> p1090;
	public List<P508> getP1090() { return p1090; }
	public void setP1090(List<P508> p1090){ this.p1090 = p1090; }
	@SerializedName("P1320")
	@Nullable
	public List<P1245> p1320;
	public List<P1245> getP1320() { return p1320; }
	public void setP1320(List<P1245> p1320){ this.p1320 = p1320; }
	@SerializedName("P243")
	@Nullable
	public String p243;
	public String getP243() { return p243; }
	public void setP243(String p243){ this.p243 = p243; }
	@SerializedName("P1074")
	@Nullable
	public List<P1245> p1074;
	public List<P1245> getP1074() { return p1074; }
	public void setP1074(List<P1245> p1074){ this.p1074 = p1074; }
	@SerializedName("P744")
	@Nullable
	public List<P1245> p744;
	public List<P1245> getP744() { return p744; }
	public void setP744(List<P1245> p744){ this.p744 = p744; }
	@SerializedName("P108")
	@Nullable
	public String p108;
	public String getP108() { return p108; }
	public void setP108(String p108){ this.p108 = p108; }
	@SerializedName("P1479")
	@Nullable
	public List<P1245> p1479;
	public List<P1245> getP1479() { return p1479; }
	public void setP1479(List<P1245> p1479){ this.p1479 = p1479; }
	@SerializedName("P612")
	@Nullable
	public String p612;
	public String getP612() { return p612; }
	public void setP612(String p612){ this.p612 = p612; }
	@SerializedName("P184")
	@Nullable
	public String p184;
	public String getP184() { return p184; }
	public void setP184(String p184){ this.p184 = p184; }
	@SerializedName("P40")
	@Nullable
	public String p40;
	public String getP40() { return p40; }
	public void setP40(String p40){ this.p40 = p40; }
	@SerializedName("P138")
	@Nullable
	public String p138;
	public String getP138() { return p138; }
	public void setP138(String p138){ this.p138 = p138; }
	@SerializedName("P1116")
	@Nullable
	public List<P1245> p1116;
	public List<P1245> getP1116() { return p1116; }
	public void setP1116(List<P1245> p1116){ this.p1116 = p1116; }
	@SerializedName("P161")
	@Nullable
	public String p161;
	public String getP161() { return p161; }
	public void setP161(String p161){ this.p161 = p161; }
	@SerializedName("P400")
	@Nullable
	public String p400;
	public String getP400() { return p400; }
	public void setP400(String p400){ this.p400 = p400; }
	@SerializedName("P444")
	@Nullable
	public String p444;
	public String getP444() { return p444; }
	public void setP444(String p444){ this.p444 = p444; }
	@SerializedName("P543")
	@Nullable
	public List<P1245> p543;
	public List<P1245> getP543() { return p543; }
	public void setP543(List<P1245> p543){ this.p543 = p543; }
	@SerializedName("P1122")
	@Nullable
	public List<P1245> p1122;
	public List<P1245> getP1122() { return p1122; }
	public void setP1122(List<P1245> p1122){ this.p1122 = p1122; }
	@SerializedName("P1002")
	@Nullable
	public List<P1245> p1002;
	public List<P1245> getP1002() { return p1002; }
	public void setP1002(List<P1245> p1002){ this.p1002 = p1002; }
	@SerializedName("P1059")
	@Nullable
	public List<P1245> p1059;
	public List<P1245> getP1059() { return p1059; }
	public void setP1059(List<P1245> p1059){ this.p1059 = p1059; }
	@SerializedName("P371")
	@Nullable
	public String p371;
	public String getP371() { return p371; }
	public void setP371(String p371){ this.p371 = p371; }
	@SerializedName("P176")
	@Nullable
	public String p176;
	public String getP176() { return p176; }
	public void setP176(String p176){ this.p176 = p176; }
	@SerializedName("P1646")
	@Nullable
	public List<P1245> p1646;
	public List<P1245> getP1646() { return p1646; }
	public void setP1646(List<P1245> p1646){ this.p1646 = p1646; }
	@SerializedName("P1483")
	@Nullable
	public List<P508> p1483;
	public List<P508> getP1483() { return p1483; }
	public void setP1483(List<P508> p1483){ this.p1483 = p1483; }
	@SerializedName("P1318")
	@Nullable
	public String p1318;
	public String getP1318() { return p1318; }
	public void setP1318(String p1318){ this.p1318 = p1318; }
	@SerializedName("P1046")
	@Nullable
	public String p1046;
	public String getP1046() { return p1046; }
	public void setP1046(String p1046){ this.p1046 = p1046; }
	@SerializedName("P1103")
	@Nullable
	public String p1103;
	public String getP1103() { return p1103; }
	public void setP1103(String p1103){ this.p1103 = p1103; }
	@SerializedName("P618")
	@Nullable
	public List<P1245> p618;
	public List<P1245> getP618() { return p618; }
	public void setP618(List<P1245> p618){ this.p618 = p618; }
	@SerializedName("P1239")
	@Nullable
	public List<P1245> p1239;
	public List<P1245> getP1239() { return p1239; }
	public void setP1239(List<P1245> p1239){ this.p1239 = p1239; }
	@SerializedName("P106")
	@Nullable
	public String p106;
	public String getP106() { return p106; }
	public void setP106(String p106){ this.p106 = p106; }
	@SerializedName("P241")
	@Nullable
	public String p241;
	public String getP241() { return p241; }
	public void setP241(String p241){ this.p241 = p241; }
	@SerializedName("P39")
	@Nullable
	public String p39;
	public String getP39() { return p39; }
	public void setP39(String p39){ this.p39 = p39; }
	@SerializedName("P575")
	@Nullable
	public String p575;
	public String getP575() { return p575; }
	public void setP575(String p575){ this.p575 = p575; }
	@SerializedName("P107")
	@Nullable
	public String p107;
	public String getP107() { return p107; }
	public void setP107(String p107){ this.p107 = p107; }
	@SerializedName("P272")
	@Nullable
	public String p272;
	public String getP272() { return p272; }
	public void setP272(String p272){ this.p272 = p272; }
	@SerializedName("P879")
	@Nullable
	public List<P1245> p879;
	public List<P1245> getP879() { return p879; }
	public void setP879(List<P1245> p879){ this.p879 = p879; }
	@SerializedName("P569")
	@Nullable
	public String p569;
	public String getP569() { return p569; }
	public void setP569(String p569){ this.p569 = p569; }
	@SerializedName("P170")
	@Nullable
	public String p170;
	public String getP170() { return p170; }
	public void setP170(String p170){ this.p170 = p170; }
	@SerializedName("P991")
	@Nullable
	public String p991;
	public String getP991() { return p991; }
	public void setP991(String p991){ this.p991 = p991; }
	@SerializedName("P1027")
	@Nullable
	public String p1027;
	public String getP1027() { return p1027; }
	public void setP1027(String p1027){ this.p1027 = p1027; }
	@SerializedName("P727")
	@Nullable
	public String p727;
	public String getP727() { return p727; }
	public void setP727(String p727){ this.p727 = p727; }
	@SerializedName("P443")
	@Nullable
	public String p443;
	public String getP443() { return p443; }
	public void setP443(String p443){ this.p443 = p443; }
	@SerializedName("P467")
	@Nullable
	public List<P1245> p467;
	public List<P1245> getP467() { return p467; }
	public void setP467(List<P1245> p467){ this.p467 = p467; }
	@SerializedName("P664")
	@Nullable
	public String p664;
	public String getP664() { return p664; }
	public void setP664(String p664){ this.p664 = p664; }
	@SerializedName("P428")
	@Nullable
	public List<P508> p428;
	public List<P508> getP428() { return p428; }
	public void setP428(List<P508> p428){ this.p428 = p428; }
	@SerializedName("P1535")
	@Nullable
	public List<P1245> p1535;
	public List<P1245> getP1535() { return p1535; }
	public void setP1535(List<P1245> p1535){ this.p1535 = p1535; }
	@SerializedName("P353")
	@Nullable
	public List<P508> p353;
	public List<P508> getP353() { return p353; }
	public void setP353(List<P508> p353){ this.p353 = p353; }
	@SerializedName("P225")
	@Nullable
	public String p225;
	public String getP225() { return p225; }
	public void setP225(String p225){ this.p225 = p225; }
	@SerializedName("P1087")
	@Nullable
	public List<P26> p1087;
	public List<P26> getP1087() { return p1087; }
	public void setP1087(List<P26> p1087){ this.p1087 = p1087; }
	@SerializedName("P347")
	@Nullable
	public List<P1245> p347;
	public List<P1245> getP347() { return p347; }
	public void setP347(List<P1245> p347){ this.p347 = p347; }
	@SerializedName("P1146")
	@Nullable
	public String p1146;
	public String getP1146() { return p1146; }
	public void setP1146(String p1146){ this.p1146 = p1146; }
	@SerializedName("P1233")
	@Nullable
	public String p1233;
	public String getP1233() { return p1233; }
	public void setP1233(String p1233){ this.p1233 = p1233; }
	@SerializedName("P300")
	@Nullable
	public String p300;
	public String getP300() { return p300; }
	public void setP300(String p300){ this.p300 = p300; }
	@SerializedName("P630")
	@Nullable
	public String p630;
	public String getP630() { return p630; }
	public void setP630(String p630){ this.p630 = p630; }
	@SerializedName("P1630")
	@Nullable
	public String p1630;
	public String getP1630() { return p1630; }
	public void setP1630(String p1630){ this.p1630 = p1630; }
	@SerializedName("P1123")
	@Nullable
	public List<P1245> p1123;
	public List<P1245> getP1123() { return p1123; }
	public void setP1123(List<P1245> p1123){ this.p1123 = p1123; }
	@SerializedName("P1560")
	@Nullable
	public List<P1245> p1560;
	public List<P1245> getP1560() { return p1560; }
	public void setP1560(List<P1245> p1560){ this.p1560 = p1560; }
	@SerializedName("P487")
	@Nullable
	public String p487;
	public String getP487() { return p487; }
	public void setP487(String p487){ this.p487 = p487; }
	@SerializedName("P1142")
	@Nullable
	public String p1142;
	public String getP1142() { return p1142; }
	public void setP1142(String p1142){ this.p1142 = p1142; }
	@SerializedName("P559")
	@Nullable
	public String p559;
	public String getP559() { return p559; }
	public void setP559(String p559){ this.p559 = p559; }
	@SerializedName("P1204")
	@Nullable
	public List<P1245> p1204;
	public List<P1245> getP1204() { return p1204; }
	public void setP1204(List<P1245> p1204){ this.p1204 = p1204; }
	@SerializedName("P356")
	@Nullable
	public List<P1245> p356;
	public List<P1245> getP356() { return p356; }
	public void setP356(List<P1245> p356){ this.p356 = p356; }
	@SerializedName("P1370")
	@Nullable
	public List<P1245> p1370;
	public List<P1245> getP1370() { return p1370; }
	public void setP1370(List<P1245> p1370){ this.p1370 = p1370; }
	@SerializedName("P424")
	@Nullable
	public List<P1245> p424;
	public List<P1245> getP424() { return p424; }
	public void setP424(List<P1245> p424){ this.p424 = p424; }
	@SerializedName("P131")
	@Nullable
	public String p131;
	public String getP131() { return p131; }
	public void setP131(String p131){ this.p131 = p131; }
	@SerializedName("P230")
	@Nullable
	public String p230;
	public String getP230() { return p230; }
	public void setP230(String p230){ this.p230 = p230; }
	@SerializedName("P914")
	@Nullable
	public List<P508> p914;
	public List<P508> getP914() { return p914; }
	public void setP914(List<P508> p914){ this.p914 = p914; }
	@SerializedName("P821")
	@Nullable
	public List<P1245> p821;
	public List<P1245> getP821() { return p821; }
	public void setP821(List<P1245> p821){ this.p821 = p821; }
	@SerializedName("P1391")
	@Nullable
	public String p1391;
	public String getP1391() { return p1391; }
	public void setP1391(String p1391){ this.p1391 = p1391; }
	@SerializedName("P839")
	@Nullable
	public List<P1245> p839;
	public List<P1245> getP839() { return p839; }
	public void setP839(List<P1245> p839){ this.p839 = p839; }
	@SerializedName("P1451")
	@Nullable
	public String p1451;
	public String getP1451() { return p1451; }
	public void setP1451(String p1451){ this.p1451 = p1451; }
	@SerializedName("P1296")
	@Nullable
	public String p1296;
	public String getP1296() { return p1296; }
	public void setP1296(String p1296){ this.p1296 = p1296; }
	@SerializedName("P822")
	@Nullable
	public String p822;
	public String getP822() { return p822; }
	public void setP822(String p822){ this.p822 = p822; }
	@SerializedName("P196")
	@Nullable
	public String p196;
	public String getP196() { return p196; }
	public void setP196(String p196){ this.p196 = p196; }
	@SerializedName("P126")
	@Nullable
	public String p126;
	public String getP126() { return p126; }
	public void setP126(String p126){ this.p126 = p126; }
	@SerializedName("P1121")
	@Nullable
	public List<P508> p1121;
	public List<P508> getP1121() { return p1121; }
	public void setP1121(List<P508> p1121){ this.p1121 = p1121; }
	@SerializedName("P1667")
	@Nullable
	public List<P1245> p1667;
	public List<P1245> getP1667() { return p1667; }
	public void setP1667(List<P1245> p1667){ this.p1667 = p1667; }
	@SerializedName("P1698")
	@Nullable
	public List<P508> p1698;
	public List<P508> getP1698() { return p1698; }
	public void setP1698(List<P508> p1698){ this.p1698 = p1698; }
	@SerializedName("P1301")
	@Nullable
	public List<P1245> p1301;
	public List<P1245> getP1301() { return p1301; }
	public void setP1301(List<P1245> p1301){ this.p1301 = p1301; }
	@SerializedName("P239")
	@Nullable
	public String p239;
	public String getP239() { return p239; }
	public void setP239(String p239){ this.p239 = p239; }
	@SerializedName("P238")
	@Nullable
	public String p238;
	public String getP238() { return p238; }
	public void setP238(String p238){ this.p238 = p238; }
	@SerializedName("P1687")
	@Nullable
	public List<P1245> p1687;
	public List<P1245> getP1687() { return p1687; }
	public void setP1687(List<P1245> p1687){ this.p1687 = p1687; }
	@SerializedName("P842")
	@Nullable
	public String p842;
	public String getP842() { return p842; }
	public void setP842(String p842){ this.p842 = p842; }
	@SerializedName("P1222")
	@Nullable
	public List<P1245> p1222;
	public List<P1245> getP1222() { return p1222; }
	public void setP1222(List<P1245> p1222){ this.p1222 = p1222; }
	@SerializedName("P1668")
	@Nullable
	public List<P1245> p1668;
	public List<P1245> getP1668() { return p1668; }
	public void setP1668(List<P1245> p1668){ this.p1668 = p1668; }
	@SerializedName("P1148")
	@Nullable
	public List<P1245> p1148;
	public List<P1245> getP1148() { return p1148; }
	public void setP1148(List<P1245> p1148){ this.p1148 = p1148; }
	@SerializedName("P492")
	@Nullable
	public String p492;
	public String getP492() { return p492; }
	public void setP492(String p492){ this.p492 = p492; }
	@SerializedName("P971")
	@Nullable
	public String p971;
	public String getP971() { return p971; }
	public void setP971(String p971){ this.p971 = p971; }
	@SerializedName("P1043")
	@Nullable
	public String p1043;
	public String getP1043() { return p1043; }
	public void setP1043(String p1043){ this.p1043 = p1043; }
	@SerializedName("P127")
	@Nullable
	public String p127;
	public String getP127() { return p127; }
	public void setP127(String p127){ this.p127 = p127; }
	@SerializedName("P1442")
	@Nullable
	public List<P1245> p1442;
	public List<P1245> getP1442() { return p1442; }
	public void setP1442(List<P1245> p1442){ this.p1442 = p1442; }
	@SerializedName("P1136")
	@Nullable
	public List<P1417> p1136;
	public List<P1417> getP1136() { return p1136; }
	public void setP1136(List<P1417> p1136){ this.p1136 = p1136; }
	@SerializedName("P1576")
	@Nullable
	public List<P1245> p1576;
	public List<P1245> getP1576() { return p1576; }
	public void setP1576(List<P1245> p1576){ this.p1576 = p1576; }
	@SerializedName("P780")
	@Nullable
	public String p780;
	public String getP780() { return p780; }
	public void setP780(String p780){ this.p780 = p780; }
	@SerializedName("P563")
	@Nullable
	public List<P508> p563;
	public List<P508> getP563() { return p563; }
	public void setP563(List<P508> p563){ this.p563 = p563; }
	@SerializedName("P299")
	@Nullable
	public List<P1245> p299;
	public List<P1245> getP299() { return p299; }
	public void setP299(List<P1245> p299){ this.p299 = p299; }
	@SerializedName("P984")
	@Nullable
	public List<P508> p984;
	public List<P508> getP984() { return p984; }
	public void setP984(List<P508> p984){ this.p984 = p984; }
	@SerializedName("P501")
	@Nullable
	public List<P1245> p501;
	public List<P1245> getP501() { return p501; }
	public void setP501(List<P1245> p501){ this.p501 = p501; }
	@SerializedName("P1157")
	@Nullable
	public List<P1245> p1157;
	public List<P1245> getP1157() { return p1157; }
	public void setP1157(List<P1245> p1157){ this.p1157 = p1157; }
	@SerializedName("P1436")
	@Nullable
	public String p1436;
	public String getP1436() { return p1436; }
	public void setP1436(String p1436){ this.p1436 = p1436; }
	@SerializedName("P435")
	@Nullable
	public String p435;
	public String getP435() { return p435; }
	public void setP435(String p435){ this.p435 = p435; }
	@SerializedName("P625")
	@Nullable
	public String p625;
	public String getP625() { return p625; }
	public void setP625(String p625){ this.p625 = p625; }
	@SerializedName("P827")
	@Nullable
	public List<P1245> p827;
	public List<P1245> getP827() { return p827; }
	public void setP827(List<P1245> p827){ this.p827 = p827; }
	@SerializedName("P1187")
	@Nullable
	public List<P1245> p1187;
	public List<P1245> getP1187() { return p1187; }
	public void setP1187(List<P1245> p1187){ this.p1187 = p1187; }
	@SerializedName("P1602")
	@Nullable
	public List<P1245> p1602;
	public List<P1245> getP1602() { return p1602; }
	public void setP1602(List<P1245> p1602){ this.p1602 = p1602; }
	@SerializedName("P684")
	@Nullable
	public List<P508> p684;
	public List<P508> getP684() { return p684; }
	public void setP684(List<P508> p684){ this.p684 = p684; }
	@SerializedName("P833")
	@Nullable
	public List<P1245> p833;
	public List<P1245> getP833() { return p833; }
	public void setP833(List<P1245> p833){ this.p833 = p833; }
	@SerializedName("P218")
	@Nullable
	public String p218;
	public String getP218() { return p218; }
	public void setP218(String p218){ this.p218 = p218; }
	@SerializedName("P1113")
	@Nullable
	public List<P1245> p1113;
	public List<P1245> getP1113() { return p1113; }
	public void setP1113(List<P1245> p1113){ this.p1113 = p1113; }
	@SerializedName("P1570")
	@Nullable
	public List<P1245> p1570;
	public List<P1245> getP1570() { return p1570; }
	public void setP1570(List<P1245> p1570){ this.p1570 = p1570; }
	@SerializedName("P135")
	@Nullable
	public String p135;
	public String getP135() { return p135; }
	public void setP135(String p135){ this.p135 = p135; }
	@SerializedName("P1028")
	@Nullable
	public List<P1245> p1028;
	public List<P1245> getP1028() { return p1028; }
	public void setP1028(List<P1245> p1028){ this.p1028 = p1028; }
	@SerializedName("P249")
	@Nullable
	public String p249;
	public String getP249() { return p249; }
	public void setP249(String p249){ this.p249 = p249; }
	@SerializedName("P140")
	@Nullable
	public String p140;
	public String getP140() { return p140; }
	public void setP140(String p140){ this.p140 = p140; }
	@SerializedName("P738")
	@Nullable
	public String p738;
	public String getP738() { return p738; }
	public void setP738(String p738){ this.p738 = p738; }
	@SerializedName("P1108")
	@Nullable
	public String p1108;
	public String getP1108() { return p1108; }
	public void setP1108(String p1108){ this.p1108 = p1108; }
	@SerializedName("P408")
	@Nullable
	public String p408;
	public String getP408() { return p408; }
	public void setP408(String p408){ this.p408 = p408; }
	@SerializedName("P736")
	@Nullable
	public String p736;
	public String getP736() { return p736; }
	public void setP736(String p736){ this.p736 = p736; }
	@SerializedName("P486")
	@Nullable
	public String p486;
	public String getP486() { return p486; }
	public void setP486(String p486){ this.p486 = p486; }
	@SerializedName("P469")
	@Nullable
	public String p469;
	public String getP469() { return p469; }
	public void setP469(String p469){ this.p469 = p469; }
	@SerializedName("P287")
	@Nullable
	public String p287;
	public String getP287() { return p287; }
	public void setP287(String p287){ this.p287 = p287; }
	@SerializedName("P1465")
	@Nullable
	public String p1465;
	public String getP1465() { return p1465; }
	public void setP1465(String p1465){ this.p1465 = p1465; }
	@SerializedName("P1454")
	@Nullable
	public String p1454;
	public String getP1454() { return p1454; }
	public void setP1454(String p1454){ this.p1454 = p1454; }
	@SerializedName("P1331")
	@Nullable
	public List<P1245> p1331;
	public List<P1245> getP1331() { return p1331; }
	public void setP1331(List<P1245> p1331){ this.p1331 = p1331; }
	@SerializedName("P1482")
	@Nullable
	public List<P1245> p1482;
	public List<P1245> getP1482() { return p1482; }
	public void setP1482(List<P1245> p1482){ this.p1482 = p1482; }
	@SerializedName("P235")
	@Nullable
	public String p235;
	public String getP235() { return p235; }
	public void setP235(String p235){ this.p235 = p235; }
	@SerializedName("P837")
	@Nullable
	public String p837;
	public String getP837() { return p837; }
	public void setP837(String p837){ this.p837 = p837; }
	@SerializedName("P1329")
	@Nullable
	public List<P1245> p1329;
	public List<P1245> getP1329() { return p1329; }
	public void setP1329(List<P1245> p1329){ this.p1329 = p1329; }
	@SerializedName("P38")
	@Nullable
	public String p38;
	public String getP38() { return p38; }
	public void setP38(String p38){ this.p38 = p38; }
	@SerializedName("P882")
	@Nullable
	public String p882;
	public String getP882() { return p882; }
	public void setP882(String p882){ this.p882 = p882; }
	@SerializedName("P429")
	@Nullable
	public List<P1245> p429;
	public List<P1245> getP429() { return p429; }
	public void setP429(List<P1245> p429){ this.p429 = p429; }
	@SerializedName("P66")
	@Nullable
	public List<P1245> p66;
	public List<P1245> getP66() { return p66; }
	public void setP66(List<P1245> p66){ this.p66 = p66; }
	@SerializedName("P1284")
	@Nullable
	public List<P1245> p1284;
	public List<P1245> getP1284() { return p1284; }
	public void setP1284(List<P1245> p1284){ this.p1284 = p1284; }
	@SerializedName("P1621")
	@Nullable
	public List<P1245> p1621;
	public List<P1245> getP1621() { return p1621; }
	public void setP1621(List<P1245> p1621){ this.p1621 = p1621; }
	@SerializedName("P206")
	@Nullable
	public String p206;
	public String getP206() { return p206; }
	public void setP206(String p206){ this.p206 = p206; }
	@SerializedName("P1092")
	@Nullable
	public String p1092;
	public String getP1092() { return p1092; }
	public void setP1092(String p1092){ this.p1092 = p1092; }
	@SerializedName("P1132")
	@Nullable
	public List<P1245> p1132;
	public List<P1245> getP1132() { return p1132; }
	public void setP1132(List<P1245> p1132){ this.p1132 = p1132; }
	@SerializedName("P406")
	@Nullable
	public List<P1245> p406;
	public List<P1245> getP406() { return p406; }
	public void setP406(List<P1245> p406){ this.p406 = p406; }
	@SerializedName("P1574")
	@Nullable
	public List<P1245> p1574;
	public List<P1245> getP1574() { return p1574; }
	public void setP1574(List<P1245> p1574){ this.p1574 = p1574; }
	@SerializedName("P1579")
	@Nullable
	public List<P1245> p1579;
	public List<P1245> getP1579() { return p1579; }
	public void setP1579(List<P1245> p1579){ this.p1579 = p1579; }
	@SerializedName("P1313")
	@Nullable
	public List<P1245> p1313;
	public List<P1245> getP1313() { return p1313; }
	public void setP1313(List<P1245> p1313){ this.p1313 = p1313; }
	@SerializedName("P892")
	@Nullable
	public String p892;
	public String getP892() { return p892; }
	public void setP892(String p892){ this.p892 = p892; }
	@SerializedName("P102")
	@Nullable
	public String p102;
	public String getP102() { return p102; }
	public void setP102(String p102){ this.p102 = p102; }
	@SerializedName("P110")
	@Nullable
	public String p110;
	public String getP110() { return p110; }
	public void setP110(String p110){ this.p110 = p110; }
	@SerializedName("P1269")
	@Nullable
	public String p1269;
	public String getP1269() { return p1269; }
	public void setP1269(String p1269){ this.p1269 = p1269; }
	@SerializedName("P54")
	@Nullable
	public String p54;
	public String getP54() { return p54; }
	public void setP54(String p54){ this.p54 = p54; }
	@SerializedName("P1433")
	@Nullable
	public String p1433;
	public String getP1433() { return p1433; }
	public void setP1433(String p1433){ this.p1433 = p1433; }
	@SerializedName("P15")
	@Nullable
	public List<P1245> p15;
	public List<P1245> getP15() { return p15; }
	public void setP15(List<P1245> p15){ this.p15 = p15; }
	@SerializedName("P915")
	@Nullable
	public String p915;
	public String getP915() { return p915; }
	public void setP915(String p915){ this.p915 = p915; }
	@SerializedName("P1368")
	@Nullable
	public String p1368;
	public String getP1368() { return p1368; }
	public void setP1368(String p1368){ this.p1368 = p1368; }
	@SerializedName("P533")
	@Nullable
	public List<P1245> p533;
	public List<P1245> getP533() { return p533; }
	public void setP533(List<P1245> p533){ this.p533 = p533; }
	@SerializedName("P741")
	@Nullable
	public String p741;
	public String getP741() { return p741; }
	public void setP741(String p741){ this.p741 = p741; }
	@SerializedName("P969")
	@Nullable
	public String p969;
	public String getP969() { return p969; }
	public void setP969(String p969){ this.p969 = p969; }
	@SerializedName("P1631")
	@Nullable
	public List<P1245> p1631;
	public List<P1245> getP1631() { return p1631; }
	public void setP1631(List<P1245> p1631){ this.p1631 = p1631; }
	@SerializedName("P1383")
	@Nullable
	public List<P1245> p1383;
	public List<P1245> getP1383() { return p1383; }
	public void setP1383(List<P1245> p1383){ this.p1383 = p1383; }
	@SerializedName("P902")
	@Nullable
	public String p902;
	public String getP902() { return p902; }
	public void setP902(String p902){ this.p902 = p902; }
	@SerializedName("P436")
	@Nullable
	public String p436;
	public String getP436() { return p436; }
	public void setP436(String p436){ this.p436 = p436; }
	@SerializedName("P913")
	@Nullable
	public List<P1245> p913;
	public List<P1245> getP913() { return p913; }
	public void setP913(List<P1245> p913){ this.p913 = p913; }
	@SerializedName("P619")
	@Nullable
	public List<P508> p619;
	public List<P508> getP619() { return p619; }
	public void setP619(List<P508> p619){ this.p619 = p619; }
	@SerializedName("P667")
	@Nullable
	public List<P508> p667;
	public List<P508> getP667() { return p667; }
	public void setP667(List<P508> p667){ this.p667 = p667; }
	@SerializedName("P531")
	@Nullable
	public List<P26> p531;
	public List<P26> getP531() { return p531; }
	public void setP531(List<P26> p531){ this.p531 = p531; }
	@SerializedName("P990")
	@Nullable
	public String p990;
	public String getP990() { return p990; }
	public void setP990(String p990){ this.p990 = p990; }
	@SerializedName("P832")
	@Nullable
	public String p832;
	public String getP832() { return p832; }
	public void setP832(String p832){ this.p832 = p832; }
	@SerializedName("P937")
	@Nullable
	public String p937;
	public String getP937() { return p937; }
	public void setP937(String p937){ this.p937 = p937; }
	@SerializedName("P1662")
	@Nullable
	public List<P1245> p1662;
	public List<P1245> getP1662() { return p1662; }
	public void setP1662(List<P1245> p1662){ this.p1662 = p1662; }
	@SerializedName("P61")
	@Nullable
	public String p61;
	public String getP61() { return p61; }
	public void setP61(String p61){ this.p61 = p61; }
	@SerializedName("P414")
	@Nullable
	public String p414;
	public String getP414() { return p414; }
	public void setP414(String p414){ this.p414 = p414; }
	@SerializedName("P561")
	@Nullable
	public String p561;
	public String getP561() { return p561; }
	public void setP561(String p561){ this.p561 = p561; }
	@SerializedName("P705")
	@Nullable
	public String p705;
	public String getP705() { return p705; }
	public void setP705(String p705){ this.p705 = p705; }
	@SerializedName("P1401")
	@Nullable
	public String p1401;
	public String getP1401() { return p1401; }
	public void setP1401(String p1401){ this.p1401 = p1401; }
	@SerializedName("P1657")
	@Nullable
	public List<P1245> p1657;
	public List<P1245> getP1657() { return p1657; }
	public void setP1657(List<P1245> p1657){ this.p1657 = p1657; }
	@SerializedName("P564")
	@Nullable
	public String p564;
	public String getP564() { return p564; }
	public void setP564(String p564){ this.p564 = p564; }
	@SerializedName("P1680")
	@Nullable
	public List<P1245> p1680;
	public List<P1245> getP1680() { return p1680; }
	public void setP1680(List<P1245> p1680){ this.p1680 = p1680; }
	@SerializedName("P1648")
	@Nullable
	public List<P1245> p1648;
	public List<P1245> getP1648() { return p1648; }
	public void setP1648(List<P1245> p1648){ this.p1648 = p1648; }
	@SerializedName("P775")
	@Nullable
	public List<P508> p775;
	public List<P508> getP775() { return p775; }
	public void setP775(List<P508> p775){ this.p775 = p775; }
	@SerializedName("P344")
	@Nullable
	public String p344;
	public String getP344() { return p344; }
	public void setP344(String p344){ this.p344 = p344; }
	@SerializedName("P1215")
	@Nullable
	public String p1215;
	public String getP1215() { return p1215; }
	public void setP1215(String p1215){ this.p1215 = p1215; }
	@SerializedName("P1250")
	@Nullable
	public List<P508> p1250;
	public List<P508> getP1250() { return p1250; }
	public void setP1250(List<P508> p1250){ this.p1250 = p1250; }
	@SerializedName("P699")
	@Nullable
	public List<P508> p699;
	public List<P508> getP699() { return p699; }
	public void setP699(List<P508> p699){ this.p699 = p699; }
	@SerializedName("P1403")
	@Nullable
	public List<P1245> p1403;
	public List<P1245> getP1403() { return p1403; }
	public void setP1403(List<P1245> p1403){ this.p1403 = p1403; }
	@SerializedName("P1473")
	@Nullable
	public List<P1245> p1473;
	public List<P1245> getP1473() { return p1473; }
	public void setP1473(List<P1245> p1473){ this.p1473 = p1473; }
	@SerializedName("P1282")
	@Nullable
	public String p1282;
	public String getP1282() { return p1282; }
	public void setP1282(String p1282){ this.p1282 = p1282; }
	@SerializedName("P1598")
	@Nullable
	public List<P1245> p1598;
	public List<P1245> getP1598() { return p1598; }
	public void setP1598(List<P1245> p1598){ this.p1598 = p1598; }
	@SerializedName("P1047")
	@Nullable
	public String p1047;
	public String getP1047() { return p1047; }
	public void setP1047(String p1047){ this.p1047 = p1047; }
	@SerializedName("P1006")
	@Nullable
	public String p1006;
	public String getP1006() { return p1006; }
	public void setP1006(String p1006){ this.p1006 = p1006; }
	@SerializedName("P536")
	@Nullable
	public String p536;
	public String getP536() { return p536; }
	public void setP536(String p536){ this.p536 = p536; }
	@SerializedName("P555")
	@Nullable
	public String p555;
	public String getP555() { return p555; }
	public void setP555(String p555){ this.p555 = p555; }
	@SerializedName("P694")
	@Nullable
	public List<P1245> p694;
	public List<P1245> getP694() { return p694; }
	public void setP694(List<P1245> p694){ this.p694 = p694; }
	@SerializedName("P549")
	@Nullable
	public String p549;
	public String getP549() { return p549; }
	public void setP549(String p549){ this.p549 = p549; }
	@SerializedName("P454")
	@Nullable
	public String p454;
	public String getP454() { return p454; }
	public void setP454(String p454){ this.p454 = p454; }
	@SerializedName("P412")
	@Nullable
	public String p412;
	public String getP412() { return p412; }
	public void setP412(String p412){ this.p412 = p412; }
	@SerializedName("P94")
	@Nullable
	public String p94;
	public String getP94() { return p94; }
	public void setP94(String p94){ this.p94 = p94; }
	@SerializedName("P1415")
	@Nullable
	public String p1415;
	public String getP1415() { return p1415; }
	public void setP1415(String p1415){ this.p1415 = p1415; }
	@SerializedName("P115")
	@Nullable
	public String p115;
	public String getP115() { return p115; }
	public void setP115(String p115){ this.p115 = p115; }
	@SerializedName("P1321")
	@Nullable
	public String p1321;
	public String getP1321() { return p1321; }
	public void setP1321(String p1321){ this.p1321 = p1321; }
	@SerializedName("P1297")
	@Nullable
	public List<P1245> p1297;
	public List<P1245> getP1297() { return p1297; }
	public void setP1297(List<P1245> p1297){ this.p1297 = p1297; }
	@SerializedName("P417")
	@Nullable
	public String p417;
	public String getP417() { return p417; }
	public void setP417(String p417){ this.p417 = p417; }
	@SerializedName("P169")
	@Nullable
	public String p169;
	public String getP169() { return p169; }
	public void setP169(String p169){ this.p169 = p169; }
	@SerializedName("P1377")
	@Nullable
	public List<P1245> p1377;
	public List<P1245> getP1377() { return p1377; }
	public void setP1377(List<P1245> p1377){ this.p1377 = p1377; }
	@SerializedName("P392")
	@Nullable
	public String p392;
	public String getP392() { return p392; }
	public void setP392(String p392){ this.p392 = p392; }
	@SerializedName("P1638")
	@Nullable
	public List<P1245> p1638;
	public List<P1245> getP1638() { return p1638; }
	public void setP1638(List<P1245> p1638){ this.p1638 = p1638; }
	@SerializedName("P1553")
	@Nullable
	public List<P1245> p1553;
	public List<P1245> getP1553() { return p1553; }
	public void setP1553(List<P1245> p1553){ this.p1553 = p1553; }
	@SerializedName("P1237")
	@Nullable
	public List<P1245> p1237;
	public List<P1245> getP1237() { return p1237; }
	public void setP1237(List<P1245> p1237){ this.p1237 = p1237; }
	@SerializedName("P750")
	@Nullable
	public String p750;
	public String getP750() { return p750; }
	public void setP750(String p750){ this.p750 = p750; }
	@SerializedName("P534")
	@Nullable
	public List<P1245> p534;
	public List<P1245> getP534() { return p534; }
	public void setP534(List<P1245> p534){ this.p534 = p534; }
	@SerializedName("P30")
	@Nullable
	public String p30;
	public String getP30() { return p30; }
	public void setP30(String p30){ this.p30 = p30; }
	@SerializedName("P37")
	@Nullable
	public String p37;
	public String getP37() { return p37; }
	public void setP37(String p37){ this.p37 = p37; }
	@SerializedName("P748")
	@Nullable
	public List<P508> p748;
	public List<P508> getP748() { return p748; }
	public void setP748(List<P508> p748){ this.p748 = p748; }
	@SerializedName("P494")
	@Nullable
	public String p494;
	public String getP494() { return p494; }
	public void setP494(String p494){ this.p494 = p494; }
	@SerializedName("P716")
	@Nullable
	public String p716;
	public String getP716() { return p716; }
	public void setP716(String p716){ this.p716 = p716; }
	@SerializedName("P245")
	@Nullable
	public String p245;
	public String getP245() { return p245; }
	public void setP245(String p245){ this.p245 = p245; }
	@SerializedName("P641")
	@Nullable
	public String p641;
	public String getP641() { return p641; }
	public void setP641(String p641){ this.p641 = p641; }
	@SerializedName("P562")
	@Nullable
	public String p562;
	public String getP562() { return p562; }
	public void setP562(String p562){ this.p562 = p562; }
	@SerializedName("P141")
	@Nullable
	public String p141;
	public String getP141() { return p141; }
	public void setP141(String p141){ this.p141 = p141; }
	@SerializedName("P674")
	@Nullable
	public String p674;
	public String getP674() { return p674; }
	public void setP674(String p674){ this.p674 = p674; }
	@SerializedName("P1542")
	@Nullable
	public List<P1245> p1542;
	public List<P1245> getP1542() { return p1542; }
	public void setP1542(List<P1245> p1542){ this.p1542 = p1542; }
	@SerializedName("P421")
	@Nullable
	public String p421;
	public String getP421() { return p421; }
	public void setP421(String p421){ this.p421 = p421; }
	@SerializedName("P1346")
	@Nullable
	public String p1346;
	public String getP1346() { return p1346; }
	public void setP1346(String p1346){ this.p1346 = p1346; }
	@SerializedName("P600")
	@Nullable
	public List<P1245> p600;
	public List<P1245> getP600() { return p600; }
	public void setP600(List<P1245> p600){ this.p600 = p600; }
	@SerializedName("P1710")
	@Nullable
	public List<P508> p1710;
	public List<P508> getP1710() { return p1710; }
	public void setP1710(List<P508> p1710){ this.p1710 = p1710; }
	@SerializedName("P479")
	@Nullable
	public String p479;
	public String getP479() { return p479; }
	public void setP479(String p479){ this.p479 = p479; }
	@SerializedName("P1427")
	@Nullable
	public List<P1245> p1427;
	public List<P1245> getP1427() { return p1427; }
	public void setP1427(List<P1245> p1427){ this.p1427 = p1427; }
	@SerializedName("P461")
	@Nullable
	public String p461;
	public String getP461() { return p461; }
	public void setP461(String p461){ this.p461 = p461; }
	@SerializedName("P1695")
	@Nullable
	public String p1695;
	public String getP1695() { return p1695; }
	public void setP1695(String p1695){ this.p1695 = p1695; }
	@SerializedName("P1245")
	@Nullable
	public List<P1245> p1245;
	public List<P1245> getP1245() { return p1245; }
	public void setP1245(List<P1245> p1245){ this.p1245 = p1245; }
	@SerializedName("P109")
	@Nullable
	public String p109;
	public String getP109() { return p109; }
	public void setP109(String p109){ this.p109 = p109; }
	@SerializedName("P1018")
	@Nullable
	public List<P1245> p1018;
	public List<P1245> getP1018() { return p1018; }
	public void setP1018(List<P1245> p1018){ this.p1018 = p1018; }
	@SerializedName("P1557")
	@Nullable
	public List<P1245> p1557;
	public List<P1245> getP1557() { return p1557; }
	public void setP1557(List<P1245> p1557){ this.p1557 = p1557; }
	@SerializedName("P812")
	@Nullable
	public List<P1245> p812;
	public List<P1245> getP812() { return p812; }
	public void setP812(List<P1245> p812){ this.p812 = p812; }
	@SerializedName("P729")
	@Nullable
	public String p729;
	public String getP729() { return p729; }
	public void setP729(String p729){ this.p729 = p729; }
	@SerializedName("P1256")
	@Nullable
	public List<P1245> p1256;
	public List<P1245> getP1256() { return p1256; }
	public void setP1256(List<P1245> p1256){ this.p1256 = p1256; }
	@SerializedName("P279")
	@Nullable
	public String p279;
	public String getP279() { return p279; }
	public void setP279(String p279){ this.p279 = p279; }
	@SerializedName("P1212")
	@Nullable
	public String p1212;
	public String getP1212() { return p1212; }
	public void setP1212(String p1212){ this.p1212 = p1212; }
	@SerializedName("P1196")
	@Nullable
	public String p1196;
	public String getP1196() { return p1196; }
	public void setP1196(String p1196){ this.p1196 = p1196; }
	@SerializedName("P1073")
	@Nullable
	public List<P1245> p1073;
	public List<P1245> getP1073() { return p1073; }
	public void setP1073(List<P1245> p1073){ this.p1073 = p1073; }
	@SerializedName("P1216")
	@Nullable
	public String p1216;
	public String getP1216() { return p1216; }
	public void setP1216(String p1216){ this.p1216 = p1216; }
	@SerializedName("P1549")
	@Nullable
	public List<P1245> p1549;
	public List<P1245> getP1549() { return p1549; }
	public void setP1549(List<P1245> p1549){ this.p1549 = p1549; }
	@SerializedName("P51")
	@Nullable
	public String p51;
	public String getP51() { return p51; }
	public void setP51(String p51){ this.p51 = p51; }
	@SerializedName("P35")
	@Nullable
	public String p35;
	public String getP35() { return p35; }
	public void setP35(String p35){ this.p35 = p35; }
	@SerializedName("P442")
	@Nullable
	public String p442;
	public String getP442() { return p442; }
	public void setP442(String p442){ this.p442 = p442; }
	@SerializedName("P1012")
	@Nullable
	public List<P1245> p1012;
	public List<P1245> getP1012() { return p1012; }
	public void setP1012(List<P1245> p1012){ this.p1012 = p1012; }
	@SerializedName("P545")
	@Nullable
	public List<P1245> p545;
	public List<P1245> getP545() { return p545; }
	public void setP545(List<P1245> p545){ this.p545 = p545; }
	@SerializedName("P952")
	@Nullable
	public List<P1245> p952;
	public List<P1245> getP952() { return p952; }
	public void setP952(List<P1245> p952){ this.p952 = p952; }
	@SerializedName("P809")
	@Nullable
	public String p809;
	public String getP809() { return p809; }
	public void setP809(String p809){ this.p809 = p809; }
	@SerializedName("P305")
	@Nullable
	public String p305;
	public String getP305() { return p305; }
	public void setP305(String p305){ this.p305 = p305; }
	@SerializedName("P715")
	@Nullable
	public String p715;
	public String getP715() { return p715; }
	public void setP715(String p715){ this.p715 = p715; }
	@SerializedName("P901")
	@Nullable
	public String p901;
	public String getP901() { return p901; }
	public void setP901(String p901){ this.p901 = p901; }
	@SerializedName("P648")
	@Nullable
	public String p648;
	public String getP648() { return p648; }
	public void setP648(String p648){ this.p648 = p648; }
	@SerializedName("P144")
	@Nullable
	public String p144;
	public String getP144() { return p144; }
	public void setP144(String p144){ this.p144 = p144; }
	@SerializedName("P709")
	@Nullable
	public List<P1245> p709;
	public List<P1245> getP709() { return p709; }
	public void setP709(List<P1245> p709){ this.p709 = p709; }
	@SerializedName("P765")
	@Nullable
	public List<P1245> p765;
	public List<P1245> getP765() { return p765; }
	public void setP765(List<P1245> p765){ this.p765 = p765; }
	@SerializedName("P1083")
	@Nullable
	public String p1083;
	public String getP1083() { return p1083; }
	public void setP1083(String p1083){ this.p1083 = p1083; }
	@SerializedName("P1597")
	@Nullable
	public List<P1245> p1597;
	public List<P1245> getP1597() { return p1597; }
	public void setP1597(List<P1245> p1597){ this.p1597 = p1597; }
	@SerializedName("P156")
	@Nullable
	public String p156;
	public String getP156() { return p156; }
	public void setP156(String p156){ this.p156 = p156; }
	@SerializedName("P966")
	@Nullable
	public String p966;
	public String getP966() { return p966; }
	public void setP966(String p966){ this.p966 = p966; }
	@SerializedName("P944")
	@Nullable
	public List<P1245> p944;
	public List<P1245> getP944() { return p944; }
	public void setP944(List<P1245> p944){ this.p944 = p944; }
	@SerializedName("P123")
	@Nullable
	public String p123;
	public String getP123() { return p123; }
	public void setP123(String p123){ this.p123 = p123; }
	@SerializedName("P1562")
	@Nullable
	public List<P508> p1562;
	public List<P508> getP1562() { return p1562; }
	public void setP1562(List<P508> p1562){ this.p1562 = p1562; }
	@SerializedName("P500")
	@Nullable
	public List<P1245> p500;
	public List<P1245> getP500() { return p500; }
	public void setP500(List<P1245> p500){ this.p500 = p500; }
	@SerializedName("P924")
	@Nullable
	public String p924;
	public String getP924() { return p924; }
	public void setP924(String p924){ this.p924 = p924; }
	@SerializedName("P271")
	@Nullable
	public String p271;
	public String getP271() { return p271; }
	public void setP271(String p271){ this.p271 = p271; }
	@SerializedName("P774")
	@Nullable
	public String p774;
	public String getP774() { return p774; }
	public void setP774(String p774){ this.p774 = p774; }
	@SerializedName("P1424")
	@Nullable
	public List<P1245> p1424;
	public List<P1245> getP1424() { return p1424; }
	public void setP1424(List<P1245> p1424){ this.p1424 = p1424; }
	@SerializedName("P579")
	@Nullable
	public String p579;
	public String getP579() { return p579; }
	public void setP579(String p579){ this.p579 = p579; }
	@SerializedName("P289")
	@Nullable
	public String p289;
	public String getP289() { return p289; }
	public void setP289(String p289){ this.p289 = p289; }
	@SerializedName("P1058")
	@Nullable
	public List<P508> p1058;
	public List<P508> getP1058() { return p1058; }
	public void setP1058(List<P508> p1058){ this.p1058 = p1058; }
	@SerializedName("P1034")
	@Nullable
	public String p1034;
	public String getP1034() { return p1034; }
	public void setP1034(String p1034){ this.p1034 = p1034; }
	@SerializedName("P455")
	@Nullable
	public List<P1245> p455;
	public List<P1245> getP455() { return p455; }
	public void setP455(List<P1245> p455){ this.p455 = p455; }
	@SerializedName("P1335")
	@Nullable
	public String p1335;
	public String getP1335() { return p1335; }
	public void setP1335(String p1335){ this.p1335 = p1335; }
	@SerializedName("P14")
	@Nullable
	public List<P1245> p14;
	public List<P1245> getP14() { return p14; }
	public void setP14(List<P1245> p14){ this.p14 = p14; }
	@SerializedName("P1253")
	@Nullable
	public List<P508> p1253;
	public List<P508> getP1253() { return p1253; }
	public void setP1253(List<P508> p1253){ this.p1253 = p1253; }
	@SerializedName("P622")
	@Nullable
	public List<P1245> p622;
	public List<P1245> getP622() { return p622; }
	public void setP622(List<P1245> p622){ this.p622 = p622; }
	@SerializedName("P1117")
	@Nullable
	public List<P1245> p1117;
	public List<P1245> getP1117() { return p1117; }
	public void setP1117(List<P1245> p1117){ this.p1117 = p1117; }
	@SerializedName("P1611")
	@Nullable
	public List<P1245> p1611;
	public List<P1245> getP1611() { return p1611; }
	public void setP1611(List<P1245> p1611){ this.p1611 = p1611; }
	@SerializedName("P517")
	@Nullable
	public List<P1245> p517;
	public List<P1245> getP517() { return p517; }
	public void setP517(List<P1245> p517){ this.p517 = p517; }
	@SerializedName("P189")
	@Nullable
	public String p189;
	public String getP189() { return p189; }
	public void setP189(String p189){ this.p189 = p189; }
	@SerializedName("P440")
	@Nullable
	public List<P508> p440;
	public List<P508> getP440() { return p440; }
	public void setP440(List<P508> p440){ this.p440 = p440; }
	@SerializedName("P1163")
	@Nullable
	public String p1163;
	public String getP1163() { return p1163; }
	public void setP1163(String p1163){ this.p1163 = p1163; }
	@SerializedName("P868")
	@Nullable
	public List<P508> p868;
	public List<P508> getP868() { return p868; }
	public void setP868(List<P508> p868){ this.p868 = p868; }
	@SerializedName("P1307")
	@Nullable
	public String p1307;
	public String getP1307() { return p1307; }
	public void setP1307(String p1307){ this.p1307 = p1307; }
	@SerializedName("P162")
	@Nullable
	public String p162;
	public String getP162() { return p162; }
	public void setP162(String p162){ this.p162 = p162; }
	@SerializedName("P119")
	@Nullable
	public String p119;
	public String getP119() { return p119; }
	public void setP119(String p119){ this.p119 = p119; }
	@SerializedName("P1040")
	@Nullable
	public String p1040;
	public String getP1040() { return p1040; }
	public void setP1040(String p1040){ this.p1040 = p1040; }
	@SerializedName("P1369")
	@Nullable
	public String p1369;
	public String getP1369() { return p1369; }
	public void setP1369(String p1369){ this.p1369 = p1369; }
	@SerializedName("P1273")
	@Nullable
	public String p1273;
	public String getP1273() { return p1273; }
	public void setP1273(String p1273){ this.p1273 = p1273; }
	@SerializedName("P658")
	@Nullable
	public String p658;
	public String getP658() { return p658; }
	public void setP658(String p658){ this.p658 = p658; }
	@SerializedName("P1705")
	@Nullable
	public List<P1245> p1705;
	public List<P1245> getP1705() { return p1705; }
	public void setP1705(List<P1245> p1705){ this.p1705 = p1705; }
	@SerializedName("P1096")
	@Nullable
	public String p1096;
	public String getP1096() { return p1096; }
	public void setP1096(String p1096){ this.p1096 = p1096; }
	@SerializedName("P996")
	@Nullable
	public List<P508> p996;
	public List<P508> getP996() { return p996; }
	public void setP996(List<P508> p996){ this.p996 = p996; }
	@SerializedName("P466")
	@Nullable
	public String p466;
	public String getP466() { return p466; }
	public void setP466(String p466){ this.p466 = p466; }
	@SerializedName("P739")
	@Nullable
	public String p739;
	public String getP739() { return p739; }
	public void setP739(String p739){ this.p739 = p739; }
	@SerializedName("P1456")
	@Nullable
	public String p1456;
	public String getP1456() { return p1456; }
	public void setP1456(String p1456){ this.p1456 = p1456; }
	@SerializedName("P498")
	@Nullable
	public String p498;
	public String getP498() { return p498; }
	public void setP498(String p498){ this.p498 = p498; }
	@SerializedName("P1694")
	@Nullable
	public List<P1245> p1694;
	public List<P1245> getP1694() { return p1694; }
	public void setP1694(List<P1245> p1694){ this.p1694 = p1694; }
	@SerializedName("P360")
	@Nullable
	public String p360;
	public String getP360() { return p360; }
	public void setP360(String p360){ this.p360 = p360; }
	@SerializedName("P97")
	@Nullable
	public String p97;
	public String getP97() { return p97; }
	public void setP97(String p97){ this.p97 = p97; }
	@SerializedName("P457")
	@Nullable
	public List<P1245> p457;
	public List<P1245> getP457() { return p457; }
	public void setP457(List<P1245> p457){ this.p457 = p457; }
	@SerializedName("P359")
	@Nullable
	public String p359;
	public String getP359() { return p359; }
	public void setP359(String p359){ this.p359 = p359; }
	@SerializedName("P1238")
	@Nullable
	public List<P1245> p1238;
	public List<P1245> getP1238() { return p1238; }
	public void setP1238(List<P1245> p1238){ this.p1238 = p1238; }
	@SerializedName("P1628")
	@Nullable
	public List<P1245> p1628;
	public List<P1245> getP1628() { return p1628; }
	public void setP1628(List<P1245> p1628){ this.p1628 = p1628; }
	@SerializedName("P485")
	@Nullable
	public String p485;
	public String getP485() { return p485; }
	public void setP485(String p485){ this.p485 = p485; }
	@SerializedName("P646")
	@Nullable
	public String p646;
	public String getP646() { return p646; }
	public void setP646(String p646){ this.p646 = p646; }
	@SerializedName("P439")
	@Nullable
	public String p439;
	public String getP439() { return p439; }
	public void setP439(String p439){ this.p439 = p439; }
	@SerializedName("P1360")
	@Nullable
	public List<P1245> p1360;
	public List<P1245> getP1360() { return p1360; }
	public void setP1360(List<P1245> p1360){ this.p1360 = p1360; }
	@SerializedName("P1614")
	@Nullable
	public List<P1245> p1614;
	public List<P1245> getP1614() { return p1614; }
	public void setP1614(List<P1245> p1614){ this.p1614 = p1614; }
	@SerializedName("P1387")
	@Nullable
	public List<P1245> p1387;
	public List<P1245> getP1387() { return p1387; }
	public void setP1387(List<P1245> p1387){ this.p1387 = p1387; }
	}
	public static class Enwiki {
	@Nullable
	public List<String> badges;
	public List<String> getBadges() { return badges; }
	public void setBadges(List<String> badges){ this.badges = badges; }
	@Nullable
	public String title;
	public String getTitle() { return title; }
	public void setTitle(String title){ this.title = title; }
	@Nullable
	public String site;
	public String getSite() { return site; }
	public void setSite(String site){ this.site = site; }
	}
	public static class Sitelinks {
	@Nullable
	public Enwiki chrwiki;
	public Enwiki getChrwiki() { return chrwiki; }
	public void setChrwiki(Enwiki chrwiki){ this.chrwiki = chrwiki; }
	@Nullable
	public Enwiki sqwiki;
	public Enwiki getSqwiki() { return sqwiki; }
	public void setSqwiki(Enwiki sqwiki){ this.sqwiki = sqwiki; }
	@Nullable
	public Enwiki lnwiki;
	public Enwiki getLnwiki() { return lnwiki; }
	public void setLnwiki(Enwiki lnwiki){ this.lnwiki = lnwiki; }
	@Nullable
	public Enwiki idwikisource;
	public Enwiki getIdwikisource() { return idwikisource; }
	public void setIdwikisource(Enwiki idwikisource){ this.idwikisource = idwikisource; }
	@Nullable
	public Enwiki hywiki;
	public Enwiki getHywiki() { return hywiki; }
	public void setHywiki(Enwiki hywiki){ this.hywiki = hywiki; }
	@Nullable
	public Enwiki sawikiquote;
	public Enwiki getSawikiquote() { return sawikiquote; }
	public void setSawikiquote(Enwiki sawikiquote){ this.sawikiquote = sawikiquote; }
	@Nullable
	public Enwiki hywikisource;
	public Enwiki getHywikisource() { return hywikisource; }
	public void setHywikisource(Enwiki hywikisource){ this.hywikisource = hywikisource; }
	@Nullable
	public Enwiki arwikinews;
	public Enwiki getArwikinews() { return arwikinews; }
	public void setArwikinews(Enwiki arwikinews){ this.arwikinews = arwikinews; }
	@Nullable
	public Enwiki cswikiquote;
	public Enwiki getCswikiquote() { return cswikiquote; }
	public void setCswikiquote(Enwiki cswikiquote){ this.cswikiquote = cswikiquote; }
	@Nullable
	public Enwiki nlwikivoyage;
	public Enwiki getNlwikivoyage() { return nlwikivoyage; }
	public void setNlwikivoyage(Enwiki nlwikivoyage){ this.nlwikivoyage = nlwikivoyage; }
	@Nullable
	public Enwiki huwikinews;
	public Enwiki getHuwikinews() { return huwikinews; }
	public void setHuwikinews(Enwiki huwikinews){ this.huwikinews = huwikinews; }
	@Nullable
	public Enwiki nrmwiki;
	public Enwiki getNrmwiki() { return nrmwiki; }
	public void setNrmwiki(Enwiki nrmwiki){ this.nrmwiki = nrmwiki; }
	@Nullable
	public Enwiki wikidatawiki;
	public Enwiki getWikidatawiki() { return wikidatawiki; }
	public void setWikidatawiki(Enwiki wikidatawiki){ this.wikidatawiki = wikidatawiki; }
	@Nullable
	public Enwiki idwiki;
	public Enwiki getIdwiki() { return idwiki; }
	public void setIdwiki(Enwiki idwiki){ this.idwiki = idwiki; }
	@Nullable
	public Enwiki tpiwiki;
	public Enwiki getTpiwiki() { return tpiwiki; }
	public void setTpiwiki(Enwiki tpiwiki){ this.tpiwiki = tpiwiki; }
	@Nullable
	public Enwiki smwiki;
	public Enwiki getSmwiki() { return smwiki; }
	public void setSmwiki(Enwiki smwiki){ this.smwiki = smwiki; }
	@Nullable
	public Enwiki enwikinews;
	public Enwiki getEnwikinews() { return enwikinews; }
	public void setEnwikinews(Enwiki enwikinews){ this.enwikinews = enwikinews; }
	@Nullable
	public Enwiki glwiki;
	public Enwiki getGlwiki() { return glwiki; }
	public void setGlwiki(Enwiki glwiki){ this.glwiki = glwiki; }
	@Nullable
	public Enwiki azwikiquote;
	public Enwiki getAzwikiquote() { return azwikiquote; }
	public void setAzwikiquote(Enwiki azwikiquote){ this.azwikiquote = azwikiquote; }
	@Nullable
	public Enwiki rwwiki;
	public Enwiki getRwwiki() { return rwwiki; }
	public void setRwwiki(Enwiki rwwiki){ this.rwwiki = rwwiki; }
	@Nullable
	public Enwiki akwiki;
	public Enwiki getAkwiki() { return akwiki; }
	public void setAkwiki(Enwiki akwiki){ this.akwiki = akwiki; }
	@Nullable
	public Enwiki mkwiki;
	public Enwiki getMkwiki() { return mkwiki; }
	public void setMkwiki(Enwiki mkwiki){ this.mkwiki = mkwiki; }
	@Nullable
	public Enwiki mznwiki;
	public Enwiki getMznwiki() { return mznwiki; }
	public void setMznwiki(Enwiki mznwiki){ this.mznwiki = mznwiki; }
	@Nullable
	public Enwiki zhwikivoyage;
	public Enwiki getZhwikivoyage() { return zhwikivoyage; }
	public void setZhwikivoyage(Enwiki zhwikivoyage){ this.zhwikivoyage = zhwikivoyage; }
	@Nullable
	public Enwiki uzwiki;
	public Enwiki getUzwiki() { return uzwiki; }
	public void setUzwiki(Enwiki uzwiki){ this.uzwiki = uzwiki; }
	@Nullable
	public Enwiki vecwiki;
	public Enwiki getVecwiki() { return vecwiki; }
	public void setVecwiki(Enwiki vecwiki){ this.vecwiki = vecwiki; }
	@Nullable
	public Enwiki bgwikiquote;
	public Enwiki getBgwikiquote() { return bgwikiquote; }
	public void setBgwikiquote(Enwiki bgwikiquote){ this.bgwikiquote = bgwikiquote; }
	@Nullable
	public Enwiki thwikiquote;
	public Enwiki getThwikiquote() { return thwikiquote; }
	public void setThwikiquote(Enwiki thwikiquote){ this.thwikiquote = thwikiquote; }
	@Nullable
	public Enwiki mrwiki;
	public Enwiki getMrwiki() { return mrwiki; }
	public void setMrwiki(Enwiki mrwiki){ this.mrwiki = mrwiki; }
	@Nullable
	public Enwiki ilowiki;
	public Enwiki getIlowiki() { return ilowiki; }
	public void setIlowiki(Enwiki ilowiki){ this.ilowiki = ilowiki; }
	@Nullable
	public Enwiki enwiki;
	public Enwiki getEnwiki() { return enwiki; }
	public void setEnwiki(Enwiki enwiki){ this.enwiki = enwiki; }
	@Nullable
	public Enwiki fawiki;
	public Enwiki getFawiki() { return fawiki; }
	public void setFawiki(Enwiki fawiki){ this.fawiki = fawiki; }
	@Nullable
	public Enwiki ukwikivoyage;
	public Enwiki getUkwikivoyage() { return ukwikivoyage; }
	public void setUkwikivoyage(Enwiki ukwikivoyage){ this.ukwikivoyage = ukwikivoyage; }
	@Nullable
	public Enwiki gagwiki;
	public Enwiki getGagwiki() { return gagwiki; }
	public void setGagwiki(Enwiki gagwiki){ this.gagwiki = gagwiki; }
	@Nullable
	public Enwiki urwiki;
	public Enwiki getUrwiki() { return urwiki; }
	public void setUrwiki(Enwiki urwiki){ this.urwiki = urwiki; }
	@Nullable
	public Enwiki elwikivoyage;
	public Enwiki getElwikivoyage() { return elwikivoyage; }
	public void setElwikivoyage(Enwiki elwikivoyage){ this.elwikivoyage = elwikivoyage; }
	@Nullable
	public Enwiki emlwiki;
	public Enwiki getEmlwiki() { return emlwiki; }
	public void setEmlwiki(Enwiki emlwiki){ this.emlwiki = emlwiki; }
	@Nullable
	public Enwiki kabwiki;
	public Enwiki getKabwiki() { return kabwiki; }
	public void setKabwiki(Enwiki kabwiki){ this.kabwiki = kabwiki; }
	@Nullable
	public Enwiki tumwiki;
	public Enwiki getTumwiki() { return tumwiki; }
	public void setTumwiki(Enwiki tumwiki){ this.tumwiki = tumwiki; }
	@Nullable
	public Enwiki uzwikiquote;
	public Enwiki getUzwikiquote() { return uzwikiquote; }
	public void setUzwikiquote(Enwiki uzwikiquote){ this.uzwikiquote = uzwikiquote; }
	@Nullable
	public Enwiki glwikiquote;
	public Enwiki getGlwikiquote() { return glwikiquote; }
	public void setGlwikiquote(Enwiki glwikiquote){ this.glwikiquote = glwikiquote; }
	@Nullable
	public Enwiki hewikinews;
	public Enwiki getHewikinews() { return hewikinews; }
	public void setHewikinews(Enwiki hewikinews){ this.hewikinews = hewikinews; }
	@Nullable
	public Enwiki iswikisource;
	public Enwiki getIswikisource() { return iswikisource; }
	public void setIswikisource(Enwiki iswikisource){ this.iswikisource = iswikisource; }
	@Nullable
	public Enwiki rmwiki;
	public Enwiki getRmwiki() { return rmwiki; }
	public void setRmwiki(Enwiki rmwiki){ this.rmwiki = rmwiki; }
	@Nullable
	public Enwiki furwiki;
	public Enwiki getFurwiki() { return furwiki; }
	public void setFurwiki(Enwiki furwiki){ this.furwiki = furwiki; }
	@Nullable
	public Enwiki bswikiquote;
	public Enwiki getBswikiquote() { return bswikiquote; }
	public void setBswikiquote(Enwiki bswikiquote){ this.bswikiquote = bswikiquote; }
	@Nullable
	public Enwiki svwikiquote;
	public Enwiki getSvwikiquote() { return svwikiquote; }
	public void setSvwikiquote(Enwiki svwikiquote){ this.svwikiquote = svwikiquote; }
	@Nullable
	public Enwiki ukwikisource;
	public Enwiki getUkwikisource() { return ukwikisource; }
	public void setUkwikisource(Enwiki ukwikisource){ this.ukwikisource = ukwikisource; }
	@Nullable
	public Enwiki ltwikisource;
	public Enwiki getLtwikisource() { return ltwikisource; }
	public void setLtwikisource(Enwiki ltwikisource){ this.ltwikisource = ltwikisource; }
	@Nullable
	public Enwiki fowikisource;
	public Enwiki getFowikisource() { return fowikisource; }
	public void setFowikisource(Enwiki fowikisource){ this.fowikisource = fowikisource; }
	@Nullable
	public Enwiki guwikisource;
	public Enwiki getGuwikisource() { return guwikisource; }
	public void setGuwikisource(Enwiki guwikisource){ this.guwikisource = guwikisource; }
	@Nullable
	public Enwiki mlwikisource;
	public Enwiki getMlwikisource() { return mlwikisource; }
	public void setMlwikisource(Enwiki mlwikisource){ this.mlwikisource = mlwikisource; }
	@Nullable
	public Enwiki eswikiquote;
	public Enwiki getEswikiquote() { return eswikiquote; }
	public void setEswikiquote(Enwiki eswikiquote){ this.eswikiquote = eswikiquote; }
	@Nullable
	public Enwiki rowikivoyage;
	public Enwiki getRowikivoyage() { return rowikivoyage; }
	public void setRowikivoyage(Enwiki rowikivoyage){ this.rowikivoyage = rowikivoyage; }
	@Nullable
	public Enwiki arcwiki;
	public Enwiki getArcwiki() { return arcwiki; }
	public void setArcwiki(Enwiki arcwiki){ this.arcwiki = arcwiki; }
	@Nullable
	public Enwiki tawikisource;
	public Enwiki getTawikisource() { return tawikisource; }
	public void setTawikisource(Enwiki tawikisource){ this.tawikisource = tawikisource; }
	@Nullable
	public Enwiki skwikiquote;
	public Enwiki getSkwikiquote() { return skwikiquote; }
	public void setSkwikiquote(Enwiki skwikiquote){ this.skwikiquote = skwikiquote; }
	@Nullable
	public Enwiki zuwiki;
	public Enwiki getZuwiki() { return zuwiki; }
	public void setZuwiki(Enwiki zuwiki){ this.zuwiki = zuwiki; }
	@Nullable
	public Enwiki glkwiki;
	public Enwiki getGlkwiki() { return glkwiki; }
	public void setGlkwiki(Enwiki glkwiki){ this.glkwiki = glkwiki; }
	@Nullable
	public Enwiki bgwiki;
	public Enwiki getBgwiki() { return bgwiki; }
	public void setBgwiki(Enwiki bgwiki){ this.bgwiki = bgwiki; }
	@Nullable
	public Enwiki elwikinews;
	public Enwiki getElwikinews() { return elwikinews; }
	public void setElwikinews(Enwiki elwikinews){ this.elwikinews = elwikinews; }
	@Nullable
	public Enwiki dewikisource;
	public Enwiki getDewikisource() { return dewikisource; }
	public void setDewikisource(Enwiki dewikisource){ this.dewikisource = dewikisource; }
	@Nullable
	public Enwiki jbowiki;
	public Enwiki getJbowiki() { return jbowiki; }
	public void setJbowiki(Enwiki jbowiki){ this.jbowiki = jbowiki; }
	@Nullable
	public Enwiki frwikinews;
	public Enwiki getFrwikinews() { return frwikinews; }
	public void setFrwikinews(Enwiki frwikinews){ this.frwikinews = frwikinews; }
	@Nullable
	public Enwiki kywiki;
	public Enwiki getKywiki() { return kywiki; }
	public void setKywiki(Enwiki kywiki){ this.kywiki = kywiki; }
	@SerializedName("bat_smgwiki")
	@Nullable
	public Enwiki batSmgwiki;
	public Enwiki getBatSmgwiki() { return batSmgwiki; }
	public void setBatSmgwiki(Enwiki batSmgwiki){ this.batSmgwiki = batSmgwiki; }
	@Nullable
	public Enwiki myvwiki;
	public Enwiki getMyvwiki() { return myvwiki; }
	public void setMyvwiki(Enwiki myvwiki){ this.myvwiki = myvwiki; }
	@Nullable
	public Enwiki vowiki;
	public Enwiki getVowiki() { return vowiki; }
	public void setVowiki(Enwiki vowiki){ this.vowiki = vowiki; }
	@Nullable
	public Enwiki nowiki;
	public Enwiki getNowiki() { return nowiki; }
	public void setNowiki(Enwiki nowiki){ this.nowiki = nowiki; }
	@Nullable
	public Enwiki ruwikinews;
	public Enwiki getRuwikinews() { return ruwikinews; }
	public void setRuwikinews(Enwiki ruwikinews){ this.ruwikinews = ruwikinews; }
	@Nullable
	public Enwiki hrwiki;
	public Enwiki getHrwiki() { return hrwiki; }
	public void setHrwiki(Enwiki hrwiki){ this.hrwiki = hrwiki; }
	@Nullable
	public Enwiki kmwiki;
	public Enwiki getKmwiki() { return kmwiki; }
	public void setKmwiki(Enwiki kmwiki){ this.kmwiki = kmwiki; }
	@Nullable
	public Enwiki lijwiki;
	public Enwiki getLijwiki() { return lijwiki; }
	public void setLijwiki(Enwiki lijwiki){ this.lijwiki = lijwiki; }
	@Nullable
	public Enwiki svwikivoyage;
	public Enwiki getSvwikivoyage() { return svwikivoyage; }
	public void setSvwikivoyage(Enwiki svwikivoyage){ this.svwikivoyage = svwikivoyage; }
	@Nullable
	public Enwiki bugwiki;
	public Enwiki getBugwiki() { return bugwiki; }
	public void setBugwiki(Enwiki bugwiki){ this.bugwiki = bugwiki; }
	@Nullable
	public Enwiki lawikisource;
	public Enwiki getLawikisource() { return lawikisource; }
	public void setLawikisource(Enwiki lawikisource){ this.lawikisource = lawikisource; }
	@Nullable
	public Enwiki arwikiquote;
	public Enwiki getArwikiquote() { return arwikiquote; }
	public void setArwikiquote(Enwiki arwikiquote){ this.arwikiquote = arwikiquote; }
	@Nullable
	public Enwiki minwiki;
	public Enwiki getMinwiki() { return minwiki; }
	public void setMinwiki(Enwiki minwiki){ this.minwiki = minwiki; }
	@Nullable
	public Enwiki extwiki;
	public Enwiki getExtwiki() { return extwiki; }
	public void setExtwiki(Enwiki extwiki){ this.extwiki = extwiki; }
	@Nullable
	public Enwiki chwiki;
	public Enwiki getChwiki() { return chwiki; }
	public void setChwiki(Enwiki chwiki){ this.chwiki = chwiki; }
	@Nullable
	public Enwiki piwiki;
	public Enwiki getPiwiki() { return piwiki; }
	public void setPiwiki(Enwiki piwiki){ this.piwiki = piwiki; }
	@Nullable
	public Enwiki enwikiquote;
	public Enwiki getEnwikiquote() { return enwikiquote; }
	public void setEnwikiquote(Enwiki enwikiquote){ this.enwikiquote = enwikiquote; }
	@Nullable
	public Enwiki xhwiki;
	public Enwiki getXhwiki() { return xhwiki; }
	public void setXhwiki(Enwiki xhwiki){ this.xhwiki = xhwiki; }
	@Nullable
	public Enwiki tlwiki;
	public Enwiki getTlwiki() { return tlwiki; }
	public void setTlwiki(Enwiki tlwiki){ this.tlwiki = tlwiki; }
	@Nullable
	public Enwiki kgwiki;
	public Enwiki getKgwiki() { return kgwiki; }
	public void setKgwiki(Enwiki kgwiki){ this.kgwiki = kgwiki; }
	@Nullable
	public Enwiki xmfwiki;
	public Enwiki getXmfwiki() { return xmfwiki; }
	public void setXmfwiki(Enwiki xmfwiki){ this.xmfwiki = xmfwiki; }
	@SerializedName("map_bmswiki")
	@Nullable
	public Enwiki mapBmswiki;
	public Enwiki getMapBmswiki() { return mapBmswiki; }
	public void setMapBmswiki(Enwiki mapBmswiki){ this.mapBmswiki = mapBmswiki; }
	@Nullable
	public Enwiki commonswiki;
	public Enwiki getCommonswiki() { return commonswiki; }
	public void setCommonswiki(Enwiki commonswiki){ this.commonswiki = commonswiki; }
	@Nullable
	public Enwiki nywiki;
	public Enwiki getNywiki() { return nywiki; }
	public void setNywiki(Enwiki nywiki){ this.nywiki = nywiki; }
	@Nullable
	public Enwiki itwikisource;
	public Enwiki getItwikisource() { return itwikisource; }
	public void setItwikisource(Enwiki itwikisource){ this.itwikisource = itwikisource; }
	@Nullable
	public Enwiki fowiki;
	public Enwiki getFowiki() { return fowiki; }
	public void setFowiki(Enwiki fowiki){ this.fowiki = fowiki; }
	@Nullable
	public Enwiki dawiki;
	public Enwiki getDawiki() { return dawiki; }
	public void setDawiki(Enwiki dawiki){ this.dawiki = dawiki; }
	@Nullable
	public Enwiki iswiki;
	public Enwiki getIswiki() { return iswiki; }
	public void setIswiki(Enwiki iswiki){ this.iswiki = iswiki; }
	@Nullable
	public Enwiki mlwikiquote;
	public Enwiki getMlwikiquote() { return mlwikiquote; }
	public void setMlwikiquote(Enwiki mlwikiquote){ this.mlwikiquote = mlwikiquote; }
	@Nullable
	public Enwiki sowiki;
	public Enwiki getSowiki() { return sowiki; }
	public void setSowiki(Enwiki sowiki){ this.sowiki = sowiki; }
	@Nullable
	public Enwiki kowikinews;
	public Enwiki getKowikinews() { return kowikinews; }
	public void setKowikinews(Enwiki kowikinews){ this.kowikinews = kowikinews; }
	@Nullable
	public Enwiki mwlwiki;
	public Enwiki getMwlwiki() { return mwlwiki; }
	public void setMwlwiki(Enwiki mwlwiki){ this.mwlwiki = mwlwiki; }
	@Nullable
	public Enwiki svwiki;
	public Enwiki getSvwiki() { return svwiki; }
	public void setSvwiki(Enwiki svwiki){ this.svwiki = svwiki; }
	@Nullable
	public Enwiki trwikisource;
	public Enwiki getTrwikisource() { return trwikisource; }
	public void setTrwikisource(Enwiki trwikisource){ this.trwikisource = trwikisource; }
	@Nullable
	public Enwiki gvwiki;
	public Enwiki getGvwiki() { return gvwiki; }
	public void setGvwiki(Enwiki gvwiki){ this.gvwiki = gvwiki; }
	@Nullable
	public Enwiki jawikisource;
	public Enwiki getJawikisource() { return jawikisource; }
	public void setJawikisource(Enwiki jawikisource){ this.jawikisource = jawikisource; }
	@Nullable
	public Enwiki wawiki;
	public Enwiki getWawiki() { return wawiki; }
	public void setWawiki(Enwiki wawiki){ this.wawiki = wawiki; }
	@Nullable
	public Enwiki srwikinews;
	public Enwiki getSrwikinews() { return srwikinews; }
	public void setSrwikinews(Enwiki srwikinews){ this.srwikinews = srwikinews; }
	@Nullable
	public Enwiki pnbwiki;
	public Enwiki getPnbwiki() { return pnbwiki; }
	public void setPnbwiki(Enwiki pnbwiki){ this.pnbwiki = pnbwiki; }
	@Nullable
	public Enwiki frwikivoyage;
	public Enwiki getFrwikivoyage() { return frwikivoyage; }
	public void setFrwikivoyage(Enwiki frwikivoyage){ this.frwikivoyage = frwikivoyage; }
	@Nullable
	public Enwiki fywiki;
	public Enwiki getFywiki() { return fywiki; }
	public void setFywiki(Enwiki fywiki){ this.fywiki = fywiki; }
	@Nullable
	public Enwiki skwikisource;
	public Enwiki getSkwikisource() { return skwikisource; }
	public void setSkwikisource(Enwiki skwikisource){ this.skwikisource = skwikisource; }
	@Nullable
	public Enwiki iawiki;
	public Enwiki getIawiki() { return iawiki; }
	public void setIawiki(Enwiki iawiki){ this.iawiki = iawiki; }
	@Nullable
	public Enwiki jawikiquote;
	public Enwiki getJawikiquote() { return jawikiquote; }
	public void setJawikiquote(Enwiki jawikiquote){ this.jawikiquote = jawikiquote; }
	@Nullable
	public Enwiki eswikivoyage;
	public Enwiki getEswikivoyage() { return eswikivoyage; }
	public void setEswikivoyage(Enwiki eswikivoyage){ this.eswikivoyage = eswikivoyage; }
	@Nullable
	public Enwiki thwikisource;
	public Enwiki getThwikisource() { return thwikisource; }
	public void setThwikisource(Enwiki thwikisource){ this.thwikisource = thwikisource; }
	@Nullable
	public Enwiki vecwikisource;
	public Enwiki getVecwikisource() { return vecwikisource; }
	public void setVecwikisource(Enwiki vecwikisource){ this.vecwikisource = vecwikisource; }
	@Nullable
	public Enwiki twwiki;
	public Enwiki getTwwiki() { return twwiki; }
	public void setTwwiki(Enwiki twwiki){ this.twwiki = twwiki; }
	@Nullable
	public Enwiki eswikinews;
	public Enwiki getEswikinews() { return eswikinews; }
	public void setEswikinews(Enwiki eswikinews){ this.eswikinews = eswikinews; }
	@Nullable
	public Enwiki nlwiki;
	public Enwiki getNlwiki() { return nlwiki; }
	public void setNlwiki(Enwiki nlwiki){ this.nlwiki = nlwiki; }
	@Nullable
	public Enwiki astwiki;
	public Enwiki getAstwiki() { return astwiki; }
	public void setAstwiki(Enwiki astwiki){ this.astwiki = astwiki; }
	@Nullable
	public Enwiki cuwiki;
	public Enwiki getCuwiki() { return cuwiki; }
	public void setCuwiki(Enwiki cuwiki){ this.cuwiki = cuwiki; }
	@Nullable
	public Enwiki srwikiquote;
	public Enwiki getSrwikiquote() { return srwikiquote; }
	public void setSrwikiquote(Enwiki srwikiquote){ this.srwikiquote = srwikiquote; }
	@Nullable
	public Enwiki fawikiquote;
	public Enwiki getFawikiquote() { return fawikiquote; }
	public void setFawikiquote(Enwiki fawikiquote){ this.fawikiquote = fawikiquote; }
	@Nullable
	public Enwiki itwikivoyage;
	public Enwiki getItwikivoyage() { return itwikivoyage; }
	public void setItwikivoyage(Enwiki itwikivoyage){ this.itwikivoyage = itwikivoyage; }
	@Nullable
	public Enwiki hewikiquote;
	public Enwiki getHewikiquote() { return hewikiquote; }
	public void setHewikiquote(Enwiki hewikiquote){ this.hewikiquote = hewikiquote; }
	@Nullable
	public Enwiki kawikiquote;
	public Enwiki getKawikiquote() { return kawikiquote; }
	public void setKawikiquote(Enwiki kawikiquote){ this.kawikiquote = kawikiquote; }
	@Nullable
	public Enwiki simplewikiquote;
	public Enwiki getSimplewikiquote() { return simplewikiquote; }
	public void setSimplewikiquote(Enwiki simplewikiquote){ this.simplewikiquote = simplewikiquote; }
	@Nullable
	public Enwiki frwikisource;
	public Enwiki getFrwikisource() { return frwikisource; }
	public void setFrwikisource(Enwiki frwikisource){ this.frwikisource = frwikisource; }
	@Nullable
	public Enwiki fawikinews;
	public Enwiki getFawikinews() { return fawikinews; }
	public void setFawikinews(Enwiki fawikinews){ this.fawikinews = fawikinews; }
	@Nullable
	public Enwiki tkwiki;
	public Enwiki getTkwiki() { return tkwiki; }
	public void setTkwiki(Enwiki tkwiki){ this.tkwiki = tkwiki; }
	@Nullable
	public Enwiki ffwiki;
	public Enwiki getFfwiki() { return ffwiki; }
	public void setFfwiki(Enwiki ffwiki){ this.ffwiki = ffwiki; }
	@Nullable
	public Enwiki avwiki;
	public Enwiki getAvwiki() { return avwiki; }
	public void setAvwiki(Enwiki avwiki){ this.avwiki = avwiki; }
	@Nullable
	public Enwiki bclwiki;
	public Enwiki getBclwiki() { return bclwiki; }
	public void setBclwiki(Enwiki bclwiki){ this.bclwiki = bclwiki; }
	@Nullable
	public Enwiki kaawiki;
	public Enwiki getKaawiki() { return kaawiki; }
	public void setKaawiki(Enwiki kaawiki){ this.kaawiki = kaawiki; }
	@Nullable
	public Enwiki liwikisource;
	public Enwiki getLiwikisource() { return liwikisource; }
	public void setLiwikisource(Enwiki liwikisource){ this.liwikisource = liwikisource; }
	@Nullable
	public Enwiki huwikisource;
	public Enwiki getHuwikisource() { return huwikisource; }
	public void setHuwikisource(Enwiki huwikisource){ this.huwikisource = huwikisource; }
	@Nullable
	public Enwiki yowiki;
	public Enwiki getYowiki() { return yowiki; }
	public void setYowiki(Enwiki yowiki){ this.yowiki = yowiki; }
	@Nullable
	public Enwiki svwikinews;
	public Enwiki getSvwikinews() { return svwikinews; }
	public void setSvwikinews(Enwiki svwikinews){ this.svwikinews = svwikinews; }
	@Nullable
	public Enwiki skwiki;
	public Enwiki getSkwiki() { return skwiki; }
	public void setSkwiki(Enwiki skwiki){ this.skwiki = skwiki; }
	@Nullable
	public Enwiki amwiki;
	public Enwiki getAmwiki() { return amwiki; }
	public void setAmwiki(Enwiki amwiki){ this.amwiki = amwiki; }
	@Nullable
	public Enwiki ganwiki;
	public Enwiki getGanwiki() { return ganwiki; }
	public void setGanwiki(Enwiki ganwiki){ this.ganwiki = ganwiki; }
	@Nullable
	public Enwiki tetwiki;
	public Enwiki getTetwiki() { return tetwiki; }
	public void setTetwiki(Enwiki tetwiki){ this.tetwiki = tetwiki; }
	@Nullable
	public Enwiki hewikisource;
	public Enwiki getHewikisource() { return hewikisource; }
	public void setHewikisource(Enwiki hewikisource){ this.hewikisource = hewikisource; }
	@Nullable
	public Enwiki newiki;
	public Enwiki getNewiki() { return newiki; }
	public void setNewiki(Enwiki newiki){ this.newiki = newiki; }
	@Nullable
	public Enwiki pflwiki;
	public Enwiki getPflwiki() { return pflwiki; }
	public void setPflwiki(Enwiki pflwiki){ this.pflwiki = pflwiki; }
	@Nullable
	public Enwiki bewikiquote;
	public Enwiki getBewikiquote() { return bewikiquote; }
	public void setBewikiquote(Enwiki bewikiquote){ this.bewikiquote = bewikiquote; }
	@Nullable
	public Enwiki kwwiki;
	public Enwiki getKwwiki() { return kwwiki; }
	public void setKwwiki(Enwiki kwwiki){ this.kwwiki = kwwiki; }
	@Nullable
	public Enwiki fawikisource;
	public Enwiki getFawikisource() { return fawikisource; }
	public void setFawikisource(Enwiki fawikisource){ this.fawikisource = fawikisource; }
	@Nullable
	public Enwiki maiwiki;
	public Enwiki getMaiwiki() { return maiwiki; }
	public void setMaiwiki(Enwiki maiwiki){ this.maiwiki = maiwiki; }
	@Nullable
	public Enwiki cawikiquote;
	public Enwiki getCawikiquote() { return cawikiquote; }
	public void setCawikiquote(Enwiki cawikiquote){ this.cawikiquote = cawikiquote; }
	@Nullable
	public Enwiki frrwiki;
	public Enwiki getFrrwiki() { return frrwiki; }
	public void setFrrwiki(Enwiki frrwiki){ this.frrwiki = frrwiki; }
	@Nullable
	public Enwiki enwikivoyage;
	public Enwiki getEnwikivoyage() { return enwikivoyage; }
	public void setEnwikivoyage(Enwiki enwikivoyage){ this.enwikivoyage = enwikivoyage; }
	@Nullable
	public Enwiki cywiki;
	public Enwiki getCywiki() { return cywiki; }
	public void setCywiki(Enwiki cywiki){ this.cywiki = cywiki; }
	@Nullable
	public Enwiki jvwiki;
	public Enwiki getJvwiki() { return jvwiki; }
	public void setJvwiki(Enwiki jvwiki){ this.jvwiki = jvwiki; }
	@Nullable
	public Enwiki fawikivoyage;
	public Enwiki getFawikivoyage() { return fawikivoyage; }
	public void setFawikivoyage(Enwiki fawikivoyage){ this.fawikivoyage = fawikivoyage; }
	@Nullable
	public Enwiki wowikiquote;
	public Enwiki getWowikiquote() { return wowikiquote; }
	public void setWowikiquote(Enwiki wowikiquote){ this.wowikiquote = wowikiquote; }
	@SerializedName("cbk_zamwiki")
	@Nullable
	public Enwiki cbkZamwiki;
	public Enwiki getCbkZamwiki() { return cbkZamwiki; }
	public void setCbkZamwiki(Enwiki cbkZamwiki){ this.cbkZamwiki = cbkZamwiki; }
	@Nullable
	public Enwiki barwiki;
	public Enwiki getBarwiki() { return barwiki; }
	public void setBarwiki(Enwiki barwiki){ this.barwiki = barwiki; }
	@Nullable
	public Enwiki kuwiki;
	public Enwiki getKuwiki() { return kuwiki; }
	public void setKuwiki(Enwiki kuwiki){ this.kuwiki = kuwiki; }
	@Nullable
	public Enwiki iiwiki;
	public Enwiki getIiwiki() { return iiwiki; }
	public void setIiwiki(Enwiki iiwiki){ this.iiwiki = iiwiki; }
	@Nullable
	public Enwiki gotwiki;
	public Enwiki getGotwiki() { return gotwiki; }
	public void setGotwiki(Enwiki gotwiki){ this.gotwiki = gotwiki; }
	@Nullable
	public Enwiki oswiki;
	public Enwiki getOswiki() { return oswiki; }
	public void setOswiki(Enwiki oswiki){ this.oswiki = oswiki; }
	@Nullable
	public Enwiki ugwiki;
	public Enwiki getUgwiki() { return ugwiki; }
	public void setUgwiki(Enwiki ugwiki){ this.ugwiki = ugwiki; }
	@Nullable
	public Enwiki zhwikisource;
	public Enwiki getZhwikisource() { return zhwikisource; }
	public void setZhwikisource(Enwiki zhwikisource){ this.zhwikisource = zhwikisource; }
	@Nullable
	public Enwiki bswikisource;
	public Enwiki getBswikisource() { return bswikisource; }
	public void setBswikisource(Enwiki bswikisource){ this.bswikisource = bswikisource; }
	@Nullable
	public Enwiki viwikisource;
	public Enwiki getViwikisource() { return viwikisource; }
	public void setViwikisource(Enwiki viwikisource){ this.viwikisource = viwikisource; }
	@Nullable
	public Enwiki kkwiki;
	public Enwiki getKkwiki() { return kkwiki; }
	public void setKkwiki(Enwiki kkwiki){ this.kkwiki = kkwiki; }
	@Nullable
	public Enwiki dsbwiki;
	public Enwiki getDsbwiki() { return dsbwiki; }
	public void setDsbwiki(Enwiki dsbwiki){ this.dsbwiki = dsbwiki; }
	@SerializedName("nds_nlwiki")
	@Nullable
	public Enwiki ndsNlwiki;
	public Enwiki getNdsNlwiki() { return ndsNlwiki; }
	public void setNdsNlwiki(Enwiki ndsNlwiki){ this.ndsNlwiki = ndsNlwiki; }
	@Nullable
	public Enwiki mlwiki;
	public Enwiki getMlwiki() { return mlwiki; }
	public void setMlwiki(Enwiki mlwiki){ this.mlwiki = mlwiki; }
	@Nullable
	public Enwiki iswikiquote;
	public Enwiki getIswikiquote() { return iswikiquote; }
	public void setIswikiquote(Enwiki iswikiquote){ this.iswikiquote = iswikiquote; }
	@Nullable
	public Enwiki yiwiki;
	public Enwiki getYiwiki() { return yiwiki; }
	public void setYiwiki(Enwiki yiwiki){ this.yiwiki = yiwiki; }
	@Nullable
	public Enwiki zawiki;
	public Enwiki getZawiki() { return zawiki; }
	public void setZawiki(Enwiki zawiki){ this.zawiki = zawiki; }
	@Nullable
	public Enwiki tywiki;
	public Enwiki getTywiki() { return tywiki; }
	public void setTywiki(Enwiki tywiki){ this.tywiki = tywiki; }
	@Nullable
	public Enwiki bawiki;
	public Enwiki getBawiki() { return bawiki; }
	public void setBawiki(Enwiki bawiki){ this.bawiki = bawiki; }
	@Nullable
	public Enwiki itwikiquote;
	public Enwiki getItwikiquote() { return itwikiquote; }
	public void setItwikiquote(Enwiki itwikiquote){ this.itwikiquote = itwikiquote; }
	@Nullable
	public Enwiki nnwiki;
	public Enwiki getNnwiki() { return nnwiki; }
	public void setNnwiki(Enwiki nnwiki){ this.nnwiki = nnwiki; }
	@Nullable
	public Enwiki angwiki;
	public Enwiki getAngwiki() { return angwiki; }
	public void setAngwiki(Enwiki angwiki){ this.angwiki = angwiki; }
	@Nullable
	public Enwiki lawikiquote;
	public Enwiki getLawikiquote() { return lawikiquote; }
	public void setLawikiquote(Enwiki lawikiquote){ this.lawikiquote = lawikiquote; }
	@Nullable
	public Enwiki frwiki;
	public Enwiki getFrwiki() { return frwiki; }
	public void setFrwiki(Enwiki frwiki){ this.frwiki = frwiki; }
	@Nullable
	public Enwiki newwiki;
	public Enwiki getNewwiki() { return newwiki; }
	public void setNewwiki(Enwiki newwiki){ this.newwiki = newwiki; }
	@Nullable
	public Enwiki sahwiki;
	public Enwiki getSahwiki() { return sahwiki; }
	public void setSahwiki(Enwiki sahwiki){ this.sahwiki = sahwiki; }
	@Nullable
	public Enwiki cvwiki;
	public Enwiki getCvwiki() { return cvwiki; }
	public void setCvwiki(Enwiki cvwiki){ this.cvwiki = cvwiki; }
	@Nullable
	public Enwiki napwiki;
	public Enwiki getNapwiki() { return napwiki; }
	public void setNapwiki(Enwiki napwiki){ this.napwiki = napwiki; }
	@Nullable
	public Enwiki ptwikiquote;
	public Enwiki getPtwikiquote() { return ptwikiquote; }
	public void setPtwikiquote(Enwiki ptwikiquote){ this.ptwikiquote = ptwikiquote; }
	@Nullable
	public Enwiki guwiki;
	public Enwiki getGuwiki() { return guwiki; }
	public void setGuwiki(Enwiki guwiki){ this.guwiki = guwiki; }
	@Nullable
	public Enwiki bgwikinews;
	public Enwiki getBgwikinews() { return bgwikinews; }
	public void setBgwikinews(Enwiki bgwikinews){ this.bgwikinews = bgwikinews; }
	@Nullable
	public Enwiki cowiki;
	public Enwiki getCowiki() { return cowiki; }
	public void setCowiki(Enwiki cowiki){ this.cowiki = cowiki; }
	@Nullable
	public Enwiki jawiki;
	public Enwiki getJawiki() { return jawiki; }
	public void setJawiki(Enwiki jawiki){ this.jawiki = jawiki; }
	@SerializedName("zh_min_nanwikisource")
	@Nullable
	public Enwiki zhMinNanwikisource;
	public Enwiki getZhMinNanwikisource() { return zhMinNanwikisource; }
	public void setZhMinNanwikisource(Enwiki zhMinNanwikisource){ this.zhMinNanwikisource = zhMinNanwikisource; }
	@Nullable
	public Enwiki cawikinews;
	public Enwiki getCawikinews() { return cawikinews; }
	public void setCawikinews(Enwiki cawikinews){ this.cawikinews = cawikinews; }
	@Nullable
	public Enwiki lbewiki;
	public Enwiki getLbewiki() { return lbewiki; }
	public void setLbewiki(Enwiki lbewiki){ this.lbewiki = lbewiki; }
	@Nullable
	public Enwiki rowikisource;
	public Enwiki getRowikisource() { return rowikisource; }
	public void setRowikisource(Enwiki rowikisource){ this.rowikisource = rowikisource; }
	@Nullable
	public Enwiki ttwiki;
	public Enwiki getTtwiki() { return ttwiki; }
	public void setTtwiki(Enwiki ttwiki){ this.ttwiki = ttwiki; }
	@Nullable
	public Enwiki lawiki;
	public Enwiki getLawiki() { return lawiki; }
	public void setLawiki(Enwiki lawiki){ this.lawiki = lawiki; }
	@Nullable
	public Enwiki ruwikisource;
	public Enwiki getRuwikisource() { return ruwikisource; }
	public void setRuwikisource(Enwiki ruwikisource){ this.ruwikisource = ruwikisource; }
	@Nullable
	public Enwiki pcdwiki;
	public Enwiki getPcdwiki() { return pcdwiki; }
	public void setPcdwiki(Enwiki pcdwiki){ this.pcdwiki = pcdwiki; }
	@Nullable
	public Enwiki dawikiquote;
	public Enwiki getDawikiquote() { return dawikiquote; }
	public void setDawikiquote(Enwiki dawikiquote){ this.dawikiquote = dawikiquote; }
	@Nullable
	public Enwiki bpywiki;
	public Enwiki getBpywiki() { return bpywiki; }
	public void setBpywiki(Enwiki bpywiki){ this.bpywiki = bpywiki; }
	@Nullable
	public Enwiki afwikiquote;
	public Enwiki getAfwikiquote() { return afwikiquote; }
	public void setAfwikiquote(Enwiki afwikiquote){ this.afwikiquote = afwikiquote; }
	@Nullable
	public Enwiki swwiki;
	public Enwiki getSwwiki() { return swwiki; }
	public void setSwwiki(Enwiki swwiki){ this.swwiki = swwiki; }
	@Nullable
	public Enwiki hifwiki;
	public Enwiki getHifwiki() { return hifwiki; }
	public void setHifwiki(Enwiki hifwiki){ this.hifwiki = hifwiki; }
	@Nullable
	public Enwiki etwikisource;
	public Enwiki getEtwikisource() { return etwikisource; }
	public void setEtwikisource(Enwiki etwikisource){ this.etwikisource = etwikisource; }
	@Nullable
	public Enwiki dewiki;
	public Enwiki getDewiki() { return dewiki; }
	public void setDewiki(Enwiki dewiki){ this.dewiki = dewiki; }
	@Nullable
	public Enwiki nlwikisource;
	public Enwiki getNlwikisource() { return nlwikisource; }
	public void setNlwikisource(Enwiki nlwikisource){ this.nlwikisource = nlwikisource; }
	@Nullable
	public Enwiki acewiki;
	public Enwiki getAcewiki() { return acewiki; }
	public void setAcewiki(Enwiki acewiki){ this.acewiki = acewiki; }
	@Nullable
	public Enwiki ptwikivoyage;
	public Enwiki getPtwikivoyage() { return ptwikivoyage; }
	public void setPtwikivoyage(Enwiki ptwikivoyage){ this.ptwikivoyage = ptwikivoyage; }
	@Nullable
	public Enwiki mkwikisource;
	public Enwiki getMkwikisource() { return mkwikisource; }
	public void setMkwikisource(Enwiki mkwikisource){ this.mkwikisource = mkwikisource; }
	@Nullable
	public Enwiki bxrwiki;
	public Enwiki getBxrwiki() { return bxrwiki; }
	public void setBxrwiki(Enwiki bxrwiki){ this.bxrwiki = bxrwiki; }
	@Nullable
	public Enwiki sahwikisource;
	public Enwiki getSahwikisource() { return sahwikisource; }
	public void setSahwikisource(Enwiki sahwikisource){ this.sahwikisource = sahwikisource; }
	@Nullable
	public Enwiki cywikisource;
	public Enwiki getCywikisource() { return cywikisource; }
	public void setCywikisource(Enwiki cywikisource){ this.cywikisource = cywikisource; }
	@Nullable
	public Enwiki kowikiquote;
	public Enwiki getKowikiquote() { return kowikiquote; }
	public void setKowikiquote(Enwiki kowikiquote){ this.kowikiquote = kowikiquote; }
	@Nullable
	public Enwiki slwiki;
	public Enwiki getSlwiki() { return slwiki; }
	public void setSlwiki(Enwiki slwiki){ this.slwiki = slwiki; }
	@SerializedName("be_x_oldwiki")
	@Nullable
	public Enwiki beXOldwiki;
	public Enwiki getBeXOldwiki() { return beXOldwiki; }
	public void setBeXOldwiki(Enwiki beXOldwiki){ this.beXOldwiki = beXOldwiki; }
	@Nullable
	public Enwiki htwiki;
	public Enwiki getHtwiki() { return htwiki; }
	public void setHtwiki(Enwiki htwiki){ this.htwiki = htwiki; }
	@Nullable
	public Enwiki dewikiquote;
	public Enwiki getDewikiquote() { return dewikiquote; }
	public void setDewikiquote(Enwiki dewikiquote){ this.dewikiquote = dewikiquote; }
	@Nullable
	public Enwiki cewiki;
	public Enwiki getCewiki() { return cewiki; }
	public void setCewiki(Enwiki cewiki){ this.cewiki = cewiki; }
	@Nullable
	public Enwiki brwikisource;
	public Enwiki getBrwikisource() { return brwikisource; }
	public void setBrwikisource(Enwiki brwikisource){ this.brwikisource = brwikisource; }
	@Nullable
	public Enwiki mtwiki;
	public Enwiki getMtwiki() { return mtwiki; }
	public void setMtwiki(Enwiki mtwiki){ this.mtwiki = mtwiki; }
	@Nullable
	public Enwiki frwikiquote;
	public Enwiki getFrwikiquote() { return frwikiquote; }
	public void setFrwikiquote(Enwiki frwikiquote){ this.frwikiquote = frwikiquote; }
	@Nullable
	public Enwiki xalwiki;
	public Enwiki getXalwiki() { return xalwiki; }
	public void setXalwiki(Enwiki xalwiki){ this.xalwiki = xalwiki; }
	@Nullable
	public Enwiki ukwikinews;
	public Enwiki getUkwikinews() { return ukwikinews; }
	public void setUkwikinews(Enwiki ukwikinews){ this.ukwikinews = ukwikinews; }
	@Nullable
	public Enwiki guwikiquote;
	public Enwiki getGuwikiquote() { return guwikiquote; }
	public void setGuwikiquote(Enwiki guwikiquote){ this.guwikiquote = guwikiquote; }
	@Nullable
	public Enwiki kvwiki;
	public Enwiki getKvwiki() { return kvwiki; }
	public void setKvwiki(Enwiki kvwiki){ this.kvwiki = kvwiki; }
	@Nullable
	public Enwiki udmwiki;
	public Enwiki getUdmwiki() { return udmwiki; }
	public void setUdmwiki(Enwiki udmwiki){ this.udmwiki = udmwiki; }
	@Nullable
	public Enwiki hsbwiki;
	public Enwiki getHsbwiki() { return hsbwiki; }
	public void setHsbwiki(Enwiki hsbwiki){ this.hsbwiki = hsbwiki; }
	@Nullable
	public Enwiki fjwiki;
	public Enwiki getFjwiki() { return fjwiki; }
	public void setFjwiki(Enwiki fjwiki){ this.fjwiki = fjwiki; }
	@Nullable
	public Enwiki tiwiki;
	public Enwiki getTiwiki() { return tiwiki; }
	public void setTiwiki(Enwiki tiwiki){ this.tiwiki = tiwiki; }
	@Nullable
	public Enwiki lbwiki;
	public Enwiki getLbwiki() { return lbwiki; }
	public void setLbwiki(Enwiki lbwiki){ this.lbwiki = lbwiki; }
	@Nullable
	public Enwiki ukwiki;
	public Enwiki getUkwiki() { return ukwiki; }
	public void setUkwiki(Enwiki ukwiki){ this.ukwiki = ukwiki; }
	@Nullable
	public Enwiki klwiki;
	public Enwiki getKlwiki() { return klwiki; }
	public void setKlwiki(Enwiki klwiki){ this.klwiki = klwiki; }
	@Nullable
	public Enwiki nlwikinews;
	public Enwiki getNlwikinews() { return nlwikinews; }
	public void setNlwikinews(Enwiki nlwikinews){ this.nlwikinews = nlwikinews; }
	@Nullable
	public Enwiki rowiki;
	public Enwiki getRowiki() { return rowiki; }
	public void setRowiki(Enwiki rowiki){ this.rowiki = rowiki; }
	@Nullable
	public Enwiki dzwiki;
	public Enwiki getDzwiki() { return dzwiki; }
	public void setDzwiki(Enwiki dzwiki){ this.dzwiki = dzwiki; }
	@Nullable
	public Enwiki nnwikiquote;
	public Enwiki getNnwikiquote() { return nnwikiquote; }
	public void setNnwikiquote(Enwiki nnwikiquote){ this.nnwikiquote = nnwikiquote; }
	@Nullable
	public Enwiki crhwiki;
	public Enwiki getCrhwiki() { return crhwiki; }
	public void setCrhwiki(Enwiki crhwiki){ this.crhwiki = crhwiki; }
	@Nullable
	public Enwiki kowikisource;
	public Enwiki getKowikisource() { return kowikisource; }
	public void setKowikisource(Enwiki kowikisource){ this.kowikisource = kowikisource; }
	@Nullable
	public Enwiki gnwiki;
	public Enwiki getGnwiki() { return gnwiki; }
	public void setGnwiki(Enwiki gnwiki){ this.gnwiki = gnwiki; }
	@Nullable
	public Enwiki viwikivoyage;
	public Enwiki getViwikivoyage() { return viwikivoyage; }
	public void setViwikivoyage(Enwiki viwikivoyage){ this.viwikivoyage = viwikivoyage; }
	@Nullable
	public Enwiki plwikivoyage;
	public Enwiki getPlwikivoyage() { return plwikivoyage; }
	public void setPlwikivoyage(Enwiki plwikivoyage){ this.plwikivoyage = plwikivoyage; }
	@Nullable
	public Enwiki orwiki;
	public Enwiki getOrwiki() { return orwiki; }
	public void setOrwiki(Enwiki orwiki){ this.orwiki = orwiki; }
	@Nullable
	public Enwiki angwikiquote;
	public Enwiki getAngwikiquote() { return angwikiquote; }
	public void setAngwikiquote(Enwiki angwikiquote){ this.angwikiquote = angwikiquote; }
	@Nullable
	public Enwiki crwiki;
	public Enwiki getCrwiki() { return crwiki; }
	public void setCrwiki(Enwiki crwiki){ this.crwiki = crwiki; }
	@Nullable
	public Enwiki lmowiki;
	public Enwiki getLmowiki() { return lmowiki; }
	public void setLmowiki(Enwiki lmowiki){ this.lmowiki = lmowiki; }
	@Nullable
	public Enwiki kywikiquote;
	public Enwiki getKywikiquote() { return kywikiquote; }
	public void setKywikiquote(Enwiki kywikiquote){ this.kywikiquote = kywikiquote; }
	@Nullable
	public Enwiki wowiki;
	public Enwiki getWowiki() { return wowiki; }
	public void setWowiki(Enwiki wowiki){ this.wowiki = wowiki; }
	@Nullable
	public Enwiki scowiki;
	public Enwiki getScowiki() { return scowiki; }
	public void setScowiki(Enwiki scowiki){ this.scowiki = scowiki; }
	@Nullable
	public Enwiki nowikisource;
	public Enwiki getNowikisource() { return nowikisource; }
	public void setNowikisource(Enwiki nowikisource){ this.nowikisource = nowikisource; }
	@Nullable
	public Enwiki trwiki;
	public Enwiki getTrwiki() { return trwiki; }
	public void setTrwiki(Enwiki trwiki){ this.trwiki = trwiki; }
	@Nullable
	public Enwiki arwiki;
	public Enwiki getArwiki() { return arwiki; }
	public void setArwiki(Enwiki arwiki){ this.arwiki = arwiki; }
	@Nullable
	public Enwiki tawikiquote;
	public Enwiki getTawikiquote() { return tawikiquote; }
	public void setTawikiquote(Enwiki tawikiquote){ this.tawikiquote = tawikiquote; }
	@Nullable
	public Enwiki dewikivoyage;
	public Enwiki getDewikivoyage() { return dewikivoyage; }
	public void setDewikivoyage(Enwiki dewikivoyage){ this.dewikivoyage = dewikivoyage; }
	@Nullable
	public Enwiki ptwikinews;
	public Enwiki getPtwikinews() { return ptwikinews; }
	public void setPtwikinews(Enwiki ptwikinews){ this.ptwikinews = ptwikinews; }
	@Nullable
	public Enwiki igwiki;
	public Enwiki getIgwiki() { return igwiki; }
	public void setIgwiki(Enwiki igwiki){ this.igwiki = igwiki; }
	@Nullable
	public Enwiki eswiki;
	public Enwiki getEswiki() { return eswiki; }
	public void setEswiki(Enwiki eswiki){ this.eswiki = eswiki; }
	@Nullable
	public Enwiki bnwiki;
	public Enwiki getBnwiki() { return bnwiki; }
	public void setBnwiki(Enwiki bnwiki){ this.bnwiki = bnwiki; }
	@Nullable
	public Enwiki euwiki;
	public Enwiki getEuwiki() { return euwiki; }
	public void setEuwiki(Enwiki euwiki){ this.euwiki = euwiki; }
	@Nullable
	public Enwiki tawikinews;
	public Enwiki getTawikinews() { return tawikinews; }
	public void setTawikinews(Enwiki tawikinews){ this.tawikinews = tawikinews; }
	@Nullable
	public Enwiki brwikiquote;
	public Enwiki getBrwikiquote() { return brwikiquote; }
	public void setBrwikiquote(Enwiki brwikiquote){ this.brwikiquote = brwikiquote; }
	@Nullable
	public Enwiki glwikisource;
	public Enwiki getGlwikisource() { return glwikisource; }
	public void setGlwikisource(Enwiki glwikisource){ this.glwikisource = glwikisource; }
	@Nullable
	public Enwiki etwiki;
	public Enwiki getEtwiki() { return etwiki; }
	public void setEtwiki(Enwiki etwiki){ this.etwiki = etwiki; }
	@Nullable
	public Enwiki hiwiki;
	public Enwiki getHiwiki() { return hiwiki; }
	public void setHiwiki(Enwiki hiwiki){ this.hiwiki = hiwiki; }
	@Nullable
	public Enwiki knwiki;
	public Enwiki getKnwiki() { return knwiki; }
	public void setKnwiki(Enwiki knwiki){ this.knwiki = knwiki; }
	@Nullable
	public Enwiki sswiki;
	public Enwiki getSswiki() { return sswiki; }
	public void setSswiki(Enwiki sswiki){ this.sswiki = sswiki; }
	@SerializedName("roa_rupwiki")
	@Nullable
	public Enwiki roaRupwiki;
	public Enwiki getRoaRupwiki() { return roaRupwiki; }
	public void setRoaRupwiki(Enwiki roaRupwiki){ this.roaRupwiki = roaRupwiki; }
	@Nullable
	public Enwiki itwiki;
	public Enwiki getItwiki() { return itwiki; }
	public void setItwiki(Enwiki itwiki){ this.itwiki = itwiki; }
	@Nullable
	public Enwiki brwiki;
	public Enwiki getBrwiki() { return brwiki; }
	public void setBrwiki(Enwiki brwiki){ this.brwiki = brwiki; }
	@Nullable
	public Enwiki zhwikinews;
	public Enwiki getZhwikinews() { return zhwikinews; }
	public void setZhwikinews(Enwiki zhwikinews){ this.zhwikinews = zhwikinews; }
	@Nullable
	public Enwiki knwikiquote;
	public Enwiki getKnwikiquote() { return knwikiquote; }
	public void setKnwikiquote(Enwiki knwikiquote){ this.knwikiquote = knwikiquote; }
	@Nullable
	public Enwiki ruwikivoyage;
	public Enwiki getRuwikivoyage() { return ruwikivoyage; }
	public void setRuwikivoyage(Enwiki ruwikivoyage){ this.ruwikivoyage = ruwikivoyage; }
	@SerializedName("fiu_vrowiki")
	@Nullable
	public Enwiki fiuVrowiki;
	public Enwiki getFiuVrowiki() { return fiuVrowiki; }
	public void setFiuVrowiki(Enwiki fiuVrowiki){ this.fiuVrowiki = fiuVrowiki; }
	@Nullable
	public Enwiki hewiki;
	public Enwiki getHewiki() { return hewiki; }
	public void setHewiki(Enwiki hewiki){ this.hewiki = hewiki; }
	@Nullable
	public Enwiki ltgwiki;
	public Enwiki getLtgwiki() { return ltgwiki; }
	public void setLtgwiki(Enwiki ltgwiki){ this.ltgwiki = ltgwiki; }
	@Nullable
	public Enwiki mhwiki;
	public Enwiki getMhwiki() { return mhwiki; }
	public void setMhwiki(Enwiki mhwiki){ this.mhwiki = mhwiki; }
	@SerializedName("zh_yuewiki")
	@Nullable
	public Enwiki zhYuewiki;
	public Enwiki getZhYuewiki() { return zhYuewiki; }
	public void setZhYuewiki(Enwiki zhYuewiki){ this.zhYuewiki = zhYuewiki; }
	@Nullable
	public Enwiki aswiki;
	public Enwiki getAswiki() { return aswiki; }
	public void setAswiki(Enwiki aswiki){ this.aswiki = aswiki; }
	@Nullable
	public Enwiki pmswiki;
	public Enwiki getPmswiki() { return pmswiki; }
	public void setPmswiki(Enwiki pmswiki){ this.pmswiki = pmswiki; }
	@Nullable
	public Enwiki lowiki;
	public Enwiki getLowiki() { return lowiki; }
	public void setLowiki(Enwiki lowiki){ this.lowiki = lowiki; }
	@Nullable
	public Enwiki slwikisource;
	public Enwiki getSlwikisource() { return slwikisource; }
	public void setSlwikisource(Enwiki slwikisource){ this.slwikisource = slwikisource; }
	@Nullable
	public Enwiki huwikiquote;
	public Enwiki getHuwikiquote() { return huwikiquote; }
	public void setHuwikiquote(Enwiki huwikiquote){ this.huwikiquote = huwikiquote; }
	@Nullable
	public Enwiki bnwikisource;
	public Enwiki getBnwikisource() { return bnwikisource; }
	public void setBnwikisource(Enwiki bnwikisource){ this.bnwikisource = bnwikisource; }
	@Nullable
	public Enwiki hawwiki;
	public Enwiki getHawwiki() { return hawwiki; }
	public void setHawwiki(Enwiki hawwiki){ this.hawwiki = hawwiki; }
	@Nullable
	public Enwiki kuwikiquote;
	public Enwiki getKuwikiquote() { return kuwikiquote; }
	public void setKuwikiquote(Enwiki kuwikiquote){ this.kuwikiquote = kuwikiquote; }
	@Nullable
	public Enwiki tewiki;
	public Enwiki getTewiki() { return tewiki; }
	public void setTewiki(Enwiki tewiki){ this.tewiki = tewiki; }
	@Nullable
	public Enwiki hrwikiquote;
	public Enwiki getHrwikiquote() { return hrwikiquote; }
	public void setHrwikiquote(Enwiki hrwikiquote){ this.hrwikiquote = hrwikiquote; }
	@Nullable
	public Enwiki bhwiki;
	public Enwiki getBhwiki() { return bhwiki; }
	public void setBhwiki(Enwiki bhwiki){ this.bhwiki = bhwiki; }
	@Nullable
	public Enwiki fiwikisource;
	public Enwiki getFiwikisource() { return fiwikisource; }
	public void setFiwikisource(Enwiki fiwikisource){ this.fiwikisource = fiwikisource; }
	@Nullable
	public Enwiki viwikiquote;
	public Enwiki getViwikiquote() { return viwikiquote; }
	public void setViwikiquote(Enwiki viwikiquote){ this.viwikiquote = viwikiquote; }
	@Nullable
	public Enwiki srnwiki;
	public Enwiki getSrnwiki() { return srnwiki; }
	public void setSrnwiki(Enwiki srnwiki){ this.srnwiki = srnwiki; }
	@Nullable
	public Enwiki rnwiki;
	public Enwiki getRnwiki() { return rnwiki; }
	public void setRnwiki(Enwiki rnwiki){ this.rnwiki = rnwiki; }
	@Nullable
	public Enwiki krcwiki;
	public Enwiki getKrcwiki() { return krcwiki; }
	public void setKrcwiki(Enwiki krcwiki){ this.krcwiki = krcwiki; }
	@Nullable
	public Enwiki mrwikiquote;
	public Enwiki getMrwikiquote() { return mrwikiquote; }
	public void setMrwikiquote(Enwiki mrwikiquote){ this.mrwikiquote = mrwikiquote; }
	@Nullable
	public Enwiki papwiki;
	public Enwiki getPapwiki() { return papwiki; }
	public void setPapwiki(Enwiki papwiki){ this.papwiki = papwiki; }
	@Nullable
	public Enwiki zhwikiquote;
	public Enwiki getZhwikiquote() { return zhwikiquote; }
	public void setZhwikiquote(Enwiki zhwikiquote){ this.zhwikiquote = zhwikiquote; }
	@Nullable
	public Enwiki mnwiki;
	public Enwiki getMnwiki() { return mnwiki; }
	public void setMnwiki(Enwiki mnwiki){ this.mnwiki = mnwiki; }
	@Nullable
	public Enwiki cswikinews;
	public Enwiki getCswikinews() { return cswikinews; }
	public void setCswikinews(Enwiki cswikinews){ this.cswikinews = cswikinews; }
	@Nullable
	public Enwiki sewiki;
	public Enwiki getSewiki() { return sewiki; }
	public void setSewiki(Enwiki sewiki){ this.sewiki = sewiki; }
	@Nullable
	public Enwiki rmywiki;
	public Enwiki getRmywiki() { return rmywiki; }
	public void setRmywiki(Enwiki rmywiki){ this.rmywiki = rmywiki; }
	@SerializedName("zh_min_nanwikiquote")
	@Nullable
	public Enwiki zhMinNanwikiquote;
	public Enwiki getZhMinNanwikiquote() { return zhMinNanwikiquote; }
	public void setZhMinNanwikiquote(Enwiki zhMinNanwikiquote){ this.zhMinNanwikiquote = zhMinNanwikiquote; }
	@Nullable
	public Enwiki zhwiki;
	public Enwiki getZhwiki() { return zhwiki; }
	public void setZhwiki(Enwiki zhwiki){ this.zhwiki = zhwiki; }
	@Nullable
	public Enwiki ocwiki;
	public Enwiki getOcwiki() { return ocwiki; }
	public void setOcwiki(Enwiki ocwiki){ this.ocwiki = ocwiki; }
	@Nullable
	public Enwiki iowiki;
	public Enwiki getIowiki() { return iowiki; }
	public void setIowiki(Enwiki iowiki){ this.iowiki = iowiki; }
	@Nullable
	public Enwiki enwikisource;
	public Enwiki getEnwikisource() { return enwikisource; }
	public void setEnwikisource(Enwiki enwikisource){ this.enwikisource = enwikisource; }
	@Nullable
	public Enwiki kswiki;
	public Enwiki getKswiki() { return kswiki; }
	public void setKswiki(Enwiki kswiki){ this.kswiki = kswiki; }
	@Nullable
	public Enwiki lvwiki;
	public Enwiki getLvwiki() { return lvwiki; }
	public void setLvwiki(Enwiki lvwiki){ this.lvwiki = lvwiki; }
	@Nullable
	public Enwiki ckbwiki;
	public Enwiki getCkbwiki() { return ckbwiki; }
	public void setCkbwiki(Enwiki ckbwiki){ this.ckbwiki = ckbwiki; }
	@Nullable
	public Enwiki mswiki;
	public Enwiki getMswiki() { return mswiki; }
	public void setMswiki(Enwiki mswiki){ this.mswiki = mswiki; }
	@Nullable
	public Enwiki kiwiki;
	public Enwiki getKiwiki() { return kiwiki; }
	public void setKiwiki(Enwiki kiwiki){ this.kiwiki = kiwiki; }
	@Nullable
	public Enwiki elwikisource;
	public Enwiki getElwikisource() { return elwikisource; }
	public void setElwikisource(Enwiki elwikisource){ this.elwikisource = elwikisource; }
	@Nullable
	public Enwiki thwiki;
	public Enwiki getThwiki() { return thwiki; }
	public void setThwiki(Enwiki thwiki){ this.thwiki = thwiki; }
	@Nullable
	public Enwiki hiwikiquote;
	public Enwiki getHiwikiquote() { return hiwikiquote; }
	public void setHiwikiquote(Enwiki hiwikiquote){ this.hiwikiquote = hiwikiquote; }
	@Nullable
	public Enwiki towiki;
	public Enwiki getTowiki() { return towiki; }
	public void setTowiki(Enwiki towiki){ this.towiki = towiki; }
	@Nullable
	public Enwiki pswiki;
	public Enwiki getPswiki() { return pswiki; }
	public void setPswiki(Enwiki pswiki){ this.pswiki = pswiki; }
	@Nullable
	public Enwiki ladwiki;
	public Enwiki getLadwiki() { return ladwiki; }
	public void setLadwiki(Enwiki ladwiki){ this.ladwiki = ladwiki; }
	@Nullable
	public Enwiki bgwikisource;
	public Enwiki getBgwikisource() { return bgwikisource; }
	public void setBgwikisource(Enwiki bgwikisource){ this.bgwikisource = bgwikisource; }
	@Nullable
	public Enwiki plwikinews;
	public Enwiki getPlwikinews() { return plwikinews; }
	public void setPlwikinews(Enwiki plwikinews){ this.plwikinews = plwikinews; }
	@Nullable
	public Enwiki plwikiquote;
	public Enwiki getPlwikiquote() { return plwikiquote; }
	public void setPlwikiquote(Enwiki plwikiquote){ this.plwikiquote = plwikiquote; }
	@Nullable
	public Enwiki shwiki;
	public Enwiki getShwiki() { return shwiki; }
	public void setShwiki(Enwiki shwiki){ this.shwiki = shwiki; }
	@Nullable
	public Enwiki gdwiki;
	public Enwiki getGdwiki() { return gdwiki; }
	public void setGdwiki(Enwiki gdwiki){ this.gdwiki = gdwiki; }
	@Nullable
	public Enwiki tgwiki;
	public Enwiki getTgwiki() { return tgwiki; }
	public void setTgwiki(Enwiki tgwiki){ this.tgwiki = tgwiki; }
	@Nullable
	public Enwiki cawikisource;
	public Enwiki getCawikisource() { return cawikisource; }
	public void setCawikisource(Enwiki cawikisource){ this.cawikisource = cawikisource; }
	@Nullable
	public Enwiki eewiki;
	public Enwiki getEewiki() { return eewiki; }
	public void setEewiki(Enwiki eewiki){ this.eewiki = eewiki; }
	@Nullable
	public Enwiki stqwiki;
	public Enwiki getStqwiki() { return stqwiki; }
	public void setStqwiki(Enwiki stqwiki){ this.stqwiki = stqwiki; }
	@Nullable
	public Enwiki kawiki;
	public Enwiki getKawiki() { return kawiki; }
	public void setKawiki(Enwiki kawiki){ this.kawiki = kawiki; }
	@Nullable
	public Enwiki zeawiki;
	public Enwiki getZeawiki() { return zeawiki; }
	public void setZeawiki(Enwiki zeawiki){ this.zeawiki = zeawiki; }
	@Nullable
	public Enwiki nahwiki;
	public Enwiki getNahwiki() { return nahwiki; }
	public void setNahwiki(Enwiki nahwiki){ this.nahwiki = nahwiki; }
	@Nullable
	public Enwiki mowiki;
	public Enwiki getMowiki() { return mowiki; }
	public void setMowiki(Enwiki mowiki){ this.mowiki = mowiki; }
	@Nullable
	public Enwiki ruwiki;
	public Enwiki getRuwiki() { return ruwiki; }
	public void setRuwiki(Enwiki ruwiki){ this.ruwiki = ruwiki; }
	@Nullable
	public Enwiki warwiki;
	public Enwiki getWarwiki() { return warwiki; }
	public void setWarwiki(Enwiki warwiki){ this.warwiki = warwiki; }
	@Nullable
	public Enwiki ngwiki;
	public Enwiki getNgwiki() { return ngwiki; }
	public void setNgwiki(Enwiki ngwiki){ this.ngwiki = ngwiki; }
	@Nullable
	public Enwiki tewikiquote;
	public Enwiki getTewikiquote() { return tewikiquote; }
	public void setTewikiquote(Enwiki tewikiquote){ this.tewikiquote = tewikiquote; }
	@Nullable
	public Enwiki eowiki;
	public Enwiki getEowiki() { return eowiki; }
	public void setEowiki(Enwiki eowiki){ this.eowiki = eowiki; }
	@Nullable
	public Enwiki wuuwiki;
	public Enwiki getWuuwiki() { return wuuwiki; }
	public void setWuuwiki(Enwiki wuuwiki){ this.wuuwiki = wuuwiki; }
	@Nullable
	public Enwiki scwiki;
	public Enwiki getScwiki() { return scwiki; }
	public void setScwiki(Enwiki scwiki){ this.scwiki = scwiki; }
	@Nullable
	public Enwiki srwikisource;
	public Enwiki getSrwikisource() { return srwikisource; }
	public void setSrwikisource(Enwiki srwikisource){ this.srwikisource = srwikisource; }
	@Nullable
	public Enwiki tawiki;
	public Enwiki getTawiki() { return tawiki; }
	public void setTawiki(Enwiki tawiki){ this.tawiki = tawiki; }
	@Nullable
	public Enwiki bewikisource;
	public Enwiki getBewikisource() { return bewikisource; }
	public void setBewikisource(Enwiki bewikisource){ this.bewikisource = bewikisource; }
	@Nullable
	public Enwiki sdwiki;
	public Enwiki getSdwiki() { return sdwiki; }
	public void setSdwiki(Enwiki sdwiki){ this.sdwiki = sdwiki; }
	@Nullable
	public Enwiki plwikisource;
	public Enwiki getPlwikisource() { return plwikisource; }
	public void setPlwikisource(Enwiki plwikisource){ this.plwikisource = plwikisource; }
	@SerializedName("zh_min_nanwiki")
	@Nullable
	public Enwiki zhMinNanwiki;
	public Enwiki getZhMinNanwiki() { return zhMinNanwiki; }
	public void setZhMinNanwiki(Enwiki zhMinNanwiki){ this.zhMinNanwiki = zhMinNanwiki; }
	@Nullable
	public Enwiki tyvwiki;
	public Enwiki getTyvwiki() { return tyvwiki; }
	public void setTyvwiki(Enwiki tyvwiki){ this.tyvwiki = tyvwiki; }
	@Nullable
	public Enwiki sgwiki;
	public Enwiki getSgwiki() { return sgwiki; }
	public void setSgwiki(Enwiki sgwiki){ this.sgwiki = sgwiki; }
	@Nullable
	public Enwiki ukwikiquote;
	public Enwiki getUkwikiquote() { return ukwikiquote; }
	public void setUkwikiquote(Enwiki ukwikiquote){ this.ukwikiquote = ukwikiquote; }
	@Nullable
	public Enwiki bswikinews;
	public Enwiki getBswikinews() { return bswikinews; }
	public void setBswikinews(Enwiki bswikinews){ this.bswikinews = bswikinews; }
	@Nullable
	public Enwiki eowikisource;
	public Enwiki getEowikisource() { return eowikisource; }
	public void setEowikisource(Enwiki eowikisource){ this.eowikisource = eowikisource; }
	@Nullable
	public Enwiki eswikisource;
	public Enwiki getEswikisource() { return eswikisource; }
	public void setEswikisource(Enwiki eswikisource){ this.eswikisource = eswikisource; }
	@Nullable
	public Enwiki mdfwiki;
	public Enwiki getMdfwiki() { return mdfwiki; }
	public void setMdfwiki(Enwiki mdfwiki){ this.mdfwiki = mdfwiki; }
	@Nullable
	public Enwiki tswiki;
	public Enwiki getTswiki() { return tswiki; }
	public void setTswiki(Enwiki tswiki){ this.tswiki = tswiki; }
	@Nullable
	public Enwiki viwiki;
	public Enwiki getViwiki() { return viwiki; }
	public void setViwiki(Enwiki viwiki){ this.viwiki = viwiki; }
	@Nullable
	public Enwiki iewiki;
	public Enwiki getIewiki() { return iewiki; }
	public void setIewiki(Enwiki iewiki){ this.iewiki = iewiki; }
	@Nullable
	public Enwiki hewikivoyage;
	public Enwiki getHewikivoyage() { return hewikivoyage; }
	public void setHewikivoyage(Enwiki hewikivoyage){ this.hewikivoyage = hewikivoyage; }
	@Nullable
	public Enwiki bewiki;
	public Enwiki getBewiki() { return bewiki; }
	public void setBewiki(Enwiki bewiki){ this.bewiki = bewiki; }
	@Nullable
	public Enwiki ltwikiquote;
	public Enwiki getLtwikiquote() { return ltwikiquote; }
	public void setLtwikiquote(Enwiki ltwikiquote){ this.ltwikiquote = ltwikiquote; }
	@Nullable
	public Enwiki lbwikiquote;
	public Enwiki getLbwikiquote() { return lbwikiquote; }
	public void setLbwikiquote(Enwiki lbwikiquote){ this.lbwikiquote = lbwikiquote; }
	@Nullable
	public Enwiki abwiki;
	public Enwiki getAbwiki() { return abwiki; }
	public void setAbwiki(Enwiki abwiki){ this.abwiki = abwiki; }
	@Nullable
	public Enwiki dewikinews;
	public Enwiki getDewikinews() { return dewikinews; }
	public void setDewikinews(Enwiki dewikinews){ this.dewikinews = dewikinews; }
	@Nullable
	public Enwiki etwikiquote;
	public Enwiki getEtwikiquote() { return etwikiquote; }
	public void setEtwikiquote(Enwiki etwikiquote){ this.etwikiquote = etwikiquote; }
	@Nullable
	public Enwiki cdowiki;
	public Enwiki getCdowiki() { return cdowiki; }
	public void setCdowiki(Enwiki cdowiki){ this.cdowiki = cdowiki; }
	@Nullable
	public Enwiki nlwikiquote;
	public Enwiki getNlwikiquote() { return nlwikiquote; }
	public void setNlwikiquote(Enwiki nlwikiquote){ this.nlwikiquote = nlwikiquote; }
	@Nullable
	public Enwiki sqwikinews;
	public Enwiki getSqwikinews() { return sqwikinews; }
	public void setSqwikinews(Enwiki sqwikinews){ this.sqwikinews = sqwikinews; }
	@Nullable
	public Enwiki ltwiki;
	public Enwiki getLtwiki() { return ltwiki; }
	public void setLtwiki(Enwiki ltwiki){ this.ltwiki = ltwiki; }
	@Nullable
	public Enwiki kbdwiki;
	public Enwiki getKbdwiki() { return kbdwiki; }
	public void setKbdwiki(Enwiki kbdwiki){ this.kbdwiki = kbdwiki; }
	@Nullable
	public Enwiki ptwikisource;
	public Enwiki getPtwikisource() { return ptwikisource; }
	public void setPtwikisource(Enwiki ptwikisource){ this.ptwikisource = ptwikisource; }
	@Nullable
	public Enwiki frpwiki;
	public Enwiki getFrpwiki() { return frpwiki; }
	public void setFrpwiki(Enwiki frpwiki){ this.frpwiki = frpwiki; }
	@Nullable
	public Enwiki gawiki;
	public Enwiki getGawiki() { return gawiki; }
	public void setGawiki(Enwiki gawiki){ this.gawiki = gawiki; }
	@SerializedName("roa_tarawiki")
	@Nullable
	public Enwiki roaTarawiki;
	public Enwiki getRoaTarawiki() { return roaTarawiki; }
	public void setRoaTarawiki(Enwiki roaTarawiki){ this.roaTarawiki = roaTarawiki; }
	@Nullable
	public Enwiki ikwiki;
	public Enwiki getIkwiki() { return ikwiki; }
	public void setIkwiki(Enwiki ikwiki){ this.ikwiki = ikwiki; }
	@Nullable
	public Enwiki pawiki;
	public Enwiki getPawiki() { return pawiki; }
	public void setPawiki(Enwiki pawiki){ this.pawiki = pawiki; }
	@Nullable
	public Enwiki miwiki;
	public Enwiki getMiwiki() { return miwiki; }
	public void setMiwiki(Enwiki miwiki){ this.miwiki = miwiki; }
	@Nullable
	public Enwiki nvwiki;
	public Enwiki getNvwiki() { return nvwiki; }
	public void setNvwiki(Enwiki nvwiki){ this.nvwiki = nvwiki; }
	@Nullable
	public Enwiki idwikiquote;
	public Enwiki getIdwikiquote() { return idwikiquote; }
	public void setIdwikiquote(Enwiki idwikiquote){ this.idwikiquote = idwikiquote; }
	@Nullable
	public Enwiki hakwiki;
	public Enwiki getHakwiki() { return hakwiki; }
	public void setHakwiki(Enwiki hakwiki){ this.hakwiki = hakwiki; }
	@Nullable
	public Enwiki szlwiki;
	public Enwiki getSzlwiki() { return szlwiki; }
	public void setSzlwiki(Enwiki szlwiki){ this.szlwiki = szlwiki; }
	@Nullable
	public Enwiki fiwiki;
	public Enwiki getFiwiki() { return fiwiki; }
	public void setFiwiki(Enwiki fiwiki){ this.fiwiki = fiwiki; }
	@Nullable
	public Enwiki aywiki;
	public Enwiki getAywiki() { return aywiki; }
	public void setAywiki(Enwiki aywiki){ this.aywiki = aywiki; }
	@Nullable
	public Enwiki diqwiki;
	public Enwiki getDiqwiki() { return diqwiki; }
	public void setDiqwiki(Enwiki diqwiki){ this.diqwiki = diqwiki; }
	@Nullable
	public Enwiki yiwikisource;
	public Enwiki getYiwikisource() { return yiwikisource; }
	public void setYiwikisource(Enwiki yiwikisource){ this.yiwikisource = yiwikisource; }
	@Nullable
	public Enwiki omwiki;
	public Enwiki getOmwiki() { return omwiki; }
	public void setOmwiki(Enwiki omwiki){ this.omwiki = omwiki; }
	@Nullable
	public Enwiki hywikiquote;
	public Enwiki getHywikiquote() { return hywikiquote; }
	public void setHywikiquote(Enwiki hywikiquote){ this.hywikiquote = hywikiquote; }
	@Nullable
	public Enwiki ruewiki;
	public Enwiki getRuewiki() { return ruewiki; }
	public void setRuewiki(Enwiki ruewiki){ this.ruewiki = ruewiki; }
	@Nullable
	public Enwiki alswiki;
	public Enwiki getAlswiki() { return alswiki; }
	public void setAlswiki(Enwiki alswiki){ this.alswiki = alswiki; }
	@Nullable
	public Enwiki fiwikiquote;
	public Enwiki getFiwikiquote() { return fiwikiquote; }
	public void setFiwikiquote(Enwiki fiwikiquote){ this.fiwikiquote = fiwikiquote; }
	@Nullable
	public Enwiki elwikiquote;
	public Enwiki getElwikiquote() { return elwikiquote; }
	public void setElwikiquote(Enwiki elwikiquote){ this.elwikiquote = elwikiquote; }
	@Nullable
	public Enwiki kshwiki;
	public Enwiki getKshwiki() { return kshwiki; }
	public void setKshwiki(Enwiki kshwiki){ this.kshwiki = kshwiki; }
	@Nullable
	public Enwiki svwikisource;
	public Enwiki getSvwikisource() { return svwikisource; }
	public void setSvwikisource(Enwiki svwikisource){ this.svwikisource = svwikisource; }
	@Nullable
	public Enwiki tewikisource;
	public Enwiki getTewikisource() { return tewikisource; }
	public void setTewikisource(Enwiki tewikisource){ this.tewikisource = tewikisource; }
	@Nullable
	public Enwiki chowiki;
	public Enwiki getChowiki() { return chowiki; }
	public void setChowiki(Enwiki chowiki){ this.chowiki = chowiki; }
	@Nullable
	public Enwiki sqwikiquote;
	public Enwiki getSqwikiquote() { return sqwikiquote; }
	public void setSqwikiquote(Enwiki sqwikiquote){ this.sqwikiquote = sqwikiquote; }
	@Nullable
	public Enwiki nowikinews;
	public Enwiki getNowikinews() { return nowikinews; }
	public void setNowikinews(Enwiki nowikinews){ this.nowikinews = nowikinews; }
	@Nullable
	public Enwiki bowiki;
	public Enwiki getBowiki() { return bowiki; }
	public void setBowiki(Enwiki bowiki){ this.bowiki = bowiki; }
	@Nullable
	public Enwiki siwiki;
	public Enwiki getSiwiki() { return siwiki; }
	public void setSiwiki(Enwiki siwiki){ this.siwiki = siwiki; }
	@Nullable
	public Enwiki mhrwiki;
	public Enwiki getMhrwiki() { return mhrwiki; }
	public void setMhrwiki(Enwiki mhrwiki){ this.mhrwiki = mhrwiki; }
	@Nullable
	public Enwiki vewiki;
	public Enwiki getVewiki() { return vewiki; }
	public void setVewiki(Enwiki vewiki){ this.vewiki = vewiki; }
	@Nullable
	public Enwiki azwikisource;
	public Enwiki getAzwikisource() { return azwikisource; }
	public void setAzwikisource(Enwiki azwikisource){ this.azwikisource = azwikisource; }
	@Nullable
	public Enwiki snwiki;
	public Enwiki getSnwiki() { return snwiki; }
	public void setSnwiki(Enwiki snwiki){ this.snwiki = snwiki; }
	@Nullable
	public Enwiki pihwiki;
	public Enwiki getPihwiki() { return pihwiki; }
	public void setPihwiki(Enwiki pihwiki){ this.pihwiki = pihwiki; }
	@Nullable
	public Enwiki itwikinews;
	public Enwiki getItwikinews() { return itwikinews; }
	public void setItwikinews(Enwiki itwikinews){ this.itwikinews = itwikinews; }
	@Nullable
	public Enwiki dvwiki;
	public Enwiki getDvwiki() { return dvwiki; }
	public void setDvwiki(Enwiki dvwiki){ this.dvwiki = dvwiki; }
	@Nullable
	public Enwiki koiwiki;
	public Enwiki getKoiwiki() { return koiwiki; }
	public void setKoiwiki(Enwiki koiwiki){ this.koiwiki = koiwiki; }
	@Nullable
	public Enwiki sawikisource;
	public Enwiki getSawikisource() { return sawikisource; }
	public void setSawikisource(Enwiki sawikisource){ this.sawikisource = sawikisource; }
	@Nullable
	public Enwiki tnwiki;
	public Enwiki getTnwiki() { return tnwiki; }
	public void setTnwiki(Enwiki tnwiki){ this.tnwiki = tnwiki; }
	@Nullable
	public Enwiki bmwiki;
	public Enwiki getBmwiki() { return bmwiki; }
	public void setBmwiki(Enwiki bmwiki){ this.bmwiki = bmwiki; }
	@Nullable
	public Enwiki cywikiquote;
	public Enwiki getCywikiquote() { return cywikiquote; }
	public void setCywikiquote(Enwiki cywikiquote){ this.cywikiquote = cywikiquote; }
	@Nullable
	public Enwiki huwiki;
	public Enwiki getHuwiki() { return huwiki; }
	public void setHuwiki(Enwiki huwiki){ this.huwiki = huwiki; }
	@Nullable
	public Enwiki suwiki;
	public Enwiki getSuwiki() { return suwiki; }
	public void setSuwiki(Enwiki suwiki){ this.suwiki = suwiki; }
	@Nullable
	public Enwiki mywiki;
	public Enwiki getMywiki() { return mywiki; }
	public void setMywiki(Enwiki mywiki){ this.mywiki = mywiki; }
	@Nullable
	public Enwiki nawiki;
	public Enwiki getNawiki() { return nawiki; }
	public void setNawiki(Enwiki nawiki){ this.nawiki = nawiki; }
	@Nullable
	public Enwiki simplewiki;
	public Enwiki getSimplewiki() { return simplewiki; }
	public void setSimplewiki(Enwiki simplewiki){ this.simplewiki = simplewiki; }
	@Nullable
	public Enwiki vlswiki;
	public Enwiki getVlswiki() { return vlswiki; }
	public void setVlswiki(Enwiki vlswiki){ this.vlswiki = vlswiki; }
	@Nullable
	public Enwiki quwiki;
	public Enwiki getQuwiki() { return quwiki; }
	public void setQuwiki(Enwiki quwiki){ this.quwiki = quwiki; }
	@Nullable
	public Enwiki nsowiki;
	public Enwiki getNsowiki() { return nsowiki; }
	public void setNsowiki(Enwiki nsowiki){ this.nsowiki = nsowiki; }
	@Nullable
	public Enwiki rowikiquote;
	public Enwiki getRowikiquote() { return rowikiquote; }
	public void setRowikiquote(Enwiki rowikiquote){ this.rowikiquote = rowikiquote; }
	@Nullable
	public Enwiki pamwiki;
	public Enwiki getPamwiki() { return pamwiki; }
	public void setPamwiki(Enwiki pamwiki){ this.pamwiki = pamwiki; }
	@Nullable
	public Enwiki elwiki;
	public Enwiki getElwiki() { return elwiki; }
	public void setElwiki(Enwiki elwiki){ this.elwiki = elwiki; }
	@Nullable
	public Enwiki cawiki;
	public Enwiki getCawiki() { return cawiki; }
	public void setCawiki(Enwiki cawiki){ this.cawiki = cawiki; }
	@Nullable
	public Enwiki mrjwiki;
	public Enwiki getMrjwiki() { return mrjwiki; }
	public void setMrjwiki(Enwiki mrjwiki){ this.mrjwiki = mrjwiki; }
	@Nullable
	public Enwiki bswiki;
	public Enwiki getBswiki() { return bswiki; }
	public void setBswiki(Enwiki bswiki){ this.bswiki = bswiki; }
	@Nullable
	public Enwiki novwiki;
	public Enwiki getNovwiki() { return novwiki; }
	public void setNovwiki(Enwiki novwiki){ this.novwiki = novwiki; }
	@Nullable
	public Enwiki hrwikisource;
	public Enwiki getHrwikisource() { return hrwikisource; }
	public void setHrwikisource(Enwiki hrwikisource){ this.hrwikisource = hrwikisource; }
	@Nullable
	public Enwiki urwikiquote;
	public Enwiki getUrwikiquote() { return urwikiquote; }
	public void setUrwikiquote(Enwiki urwikiquote){ this.urwikiquote = urwikiquote; }
	@Nullable
	public Enwiki plwiki;
	public Enwiki getPlwiki() { return plwiki; }
	public void setPlwiki(Enwiki plwiki){ this.plwiki = plwiki; }
	@Nullable
	public Enwiki hawiki;
	public Enwiki getHawiki() { return hawiki; }
	public void setHawiki(Enwiki hawiki){ this.hawiki = hawiki; }
	@Nullable
	public Enwiki trwikinews;
	public Enwiki getTrwikinews() { return trwikinews; }
	public void setTrwikinews(Enwiki trwikinews){ this.trwikinews = trwikinews; }
	@Nullable
	public Enwiki eowikiquote;
	public Enwiki getEowikiquote() { return eowikiquote; }
	public void setEowikiquote(Enwiki eowikiquote){ this.eowikiquote = eowikiquote; }
	@Nullable
	public Enwiki fiwikinews;
	public Enwiki getFiwikinews() { return fiwikinews; }
	public void setFiwikinews(Enwiki fiwikinews){ this.fiwikinews = fiwikinews; }
	@Nullable
	public Enwiki biwiki;
	public Enwiki getBiwiki() { return biwiki; }
	public void setBiwiki(Enwiki biwiki){ this.biwiki = biwiki; }
	@Nullable
	public Enwiki pagwiki;
	public Enwiki getPagwiki() { return pagwiki; }
	public void setPagwiki(Enwiki pagwiki){ this.pagwiki = pagwiki; }
	@Nullable
	public Enwiki ruwikiquote;
	public Enwiki getRuwikiquote() { return ruwikiquote; }
	public void setRuwikiquote(Enwiki ruwikiquote){ this.ruwikiquote = ruwikiquote; }
	@Nullable
	public Enwiki afwiki;
	public Enwiki getAfwiki() { return afwiki; }
	public void setAfwiki(Enwiki afwiki){ this.afwiki = afwiki; }
	@Nullable
	public Enwiki lezwiki;
	public Enwiki getLezwiki() { return lezwiki; }
	public void setLezwiki(Enwiki lezwiki){ this.lezwiki = lezwiki; }
	@Nullable
	public Enwiki pntwiki;
	public Enwiki getPntwiki() { return pntwiki; }
	public void setPntwiki(Enwiki pntwiki){ this.pntwiki = pntwiki; }
	@Nullable
	public Enwiki sawiki;
	public Enwiki getSawiki() { return sawiki; }
	public void setSawiki(Enwiki sawiki){ this.sawiki = sawiki; }
	@Nullable
	public Enwiki anwiki;
	public Enwiki getAnwiki() { return anwiki; }
	public void setAnwiki(Enwiki anwiki){ this.anwiki = anwiki; }
	@SerializedName("zh_classicalwiki")
	@Nullable
	public Enwiki zhClassicalwiki;
	public Enwiki getZhClassicalwiki() { return zhClassicalwiki; }
	public void setZhClassicalwiki(Enwiki zhClassicalwiki){ this.zhClassicalwiki = zhClassicalwiki; }
	@Nullable
	public Enwiki kowiki;
	public Enwiki getKowiki() { return kowiki; }
	public void setKowiki(Enwiki kowiki){ this.kowiki = kowiki; }
	@Nullable
	public Enwiki iuwiki;
	public Enwiki getIuwiki() { return iuwiki; }
	public void setIuwiki(Enwiki iuwiki){ this.iuwiki = iuwiki; }
	@Nullable
	public Enwiki vepwiki;
	public Enwiki getVepwiki() { return vepwiki; }
	public void setVepwiki(Enwiki vepwiki){ this.vepwiki = vepwiki; }
	@Nullable
	public Enwiki srwiki;
	public Enwiki getSrwiki() { return srwiki; }
	public void setSrwiki(Enwiki srwiki){ this.srwiki = srwiki; }
	@Nullable
	public Enwiki bjnwiki;
	public Enwiki getBjnwiki() { return bjnwiki; }
	public void setBjnwiki(Enwiki bjnwiki){ this.bjnwiki = bjnwiki; }
	@Nullable
	public Enwiki euwikiquote;
	public Enwiki getEuwikiquote() { return euwikiquote; }
	public void setEuwikiquote(Enwiki euwikiquote){ this.euwikiquote = euwikiquote; }
	@Nullable
	public Enwiki cswikisource;
	public Enwiki getCswikisource() { return cswikisource; }
	public void setCswikisource(Enwiki cswikisource){ this.cswikisource = cswikisource; }
	@Nullable
	public Enwiki rowikinews;
	public Enwiki getRowikinews() { return rowikinews; }
	public void setRowikinews(Enwiki rowikinews){ this.rowikinews = rowikinews; }
	@Nullable
	public Enwiki arwikisource;
	public Enwiki getArwikisource() { return arwikisource; }
	public void setArwikisource(Enwiki arwikisource){ this.arwikisource = arwikisource; }
	@Nullable
	public Enwiki csbwiki;
	public Enwiki getCsbwiki() { return csbwiki; }
	public void setCsbwiki(Enwiki csbwiki){ this.csbwiki = csbwiki; }
	@Nullable
	public Enwiki ndswiki;
	public Enwiki getNdswiki() { return ndswiki; }
	public void setNdswiki(Enwiki ndswiki){ this.ndswiki = ndswiki; }
	@Nullable
	public Enwiki lgwiki;
	public Enwiki getLgwiki() { return lgwiki; }
	public void setLgwiki(Enwiki lgwiki){ this.lgwiki = lgwiki; }
	@Nullable
	public Enwiki trwikiquote;
	public Enwiki getTrwikiquote() { return trwikiquote; }
	public void setTrwikiquote(Enwiki trwikiquote){ this.trwikiquote = trwikiquote; }
	@Nullable
	public Enwiki cswiki;
	public Enwiki getCswiki() { return cswiki; }
	public void setCswiki(Enwiki cswiki){ this.cswiki = cswiki; }
	@Nullable
	public Enwiki nowikiquote;
	public Enwiki getNowikiquote() { return nowikiquote; }
	public void setNowikiquote(Enwiki nowikiquote){ this.nowikiquote = nowikiquote; }
	@Nullable
	public Enwiki ptwiki;
	public Enwiki getPtwiki() { return ptwiki; }
	public void setPtwiki(Enwiki ptwiki){ this.ptwiki = ptwiki; }
	@Nullable
	public Enwiki chywiki;
	public Enwiki getChywiki() { return chywiki; }
	public void setChywiki(Enwiki chywiki){ this.chywiki = chywiki; }
	@Nullable
	public Enwiki stwiki;
	public Enwiki getStwiki() { return stwiki; }
	public void setStwiki(Enwiki stwiki){ this.stwiki = stwiki; }
	@Nullable
	public Enwiki cebwiki;
	public Enwiki getCebwiki() { return cebwiki; }
	public void setCebwiki(Enwiki cebwiki){ this.cebwiki = cebwiki; }
	@Nullable
	public Enwiki slwikiquote;
	public Enwiki getSlwikiquote() { return slwikiquote; }
	public void setSlwikiquote(Enwiki slwikiquote){ this.slwikiquote = slwikiquote; }
	@Nullable
	public Enwiki eowikinews;
	public Enwiki getEowikinews() { return eowikinews; }
	public void setEowikinews(Enwiki eowikinews){ this.eowikinews = eowikinews; }
	@Nullable
	public Enwiki arzwiki;
	public Enwiki getArzwiki() { return arzwiki; }
	public void setArzwiki(Enwiki arzwiki){ this.arzwiki = arzwiki; }
	@Nullable
	public Enwiki jawikinews;
	public Enwiki getJawikinews() { return jawikinews; }
	public void setJawikinews(Enwiki jawikinews){ this.jawikinews = jawikinews; }
	@Nullable
	public Enwiki dawikisource;
	public Enwiki getDawikisource() { return dawikisource; }
	public void setDawikisource(Enwiki dawikisource){ this.dawikisource = dawikisource; }
	@Nullable
	public Enwiki liwikiquote;
	public Enwiki getLiwikiquote() { return liwikiquote; }
	public void setLiwikiquote(Enwiki liwikiquote){ this.liwikiquote = liwikiquote; }
	@Nullable
	public Enwiki scnwiki;
	public Enwiki getScnwiki() { return scnwiki; }
	public void setScnwiki(Enwiki scnwiki){ this.scnwiki = scnwiki; }
	@Nullable
	public Enwiki liwiki;
	public Enwiki getLiwiki() { return liwiki; }
	public void setLiwiki(Enwiki liwiki){ this.liwiki = liwiki; }
	@Nullable
	public Enwiki azwiki;
	public Enwiki getAzwiki() { return azwiki; }
	public void setAzwiki(Enwiki azwiki){ this.azwiki = azwiki; }
	@Nullable
	public Enwiki mgwiki;
	public Enwiki getMgwiki() { return mgwiki; }
	public void setMgwiki(Enwiki mgwiki){ this.mgwiki = mgwiki; }
	@Nullable
	public Enwiki pdcwiki;
	public Enwiki getPdcwiki() { return pdcwiki; }
	public void setPdcwiki(Enwiki pdcwiki){ this.pdcwiki = pdcwiki; }
	}
	public static class P580 {
	@Nullable
	public Qualifiers qualifiers;
	public Qualifiers getQualifiers() { return qualifiers; }
	public void setQualifiers(Qualifiers qualifiers){ this.qualifiers = qualifiers; }
	@Nullable
	public String id;
	public String getId() { return id; }
	public void setId(String id){ this.id = id; }
	@Nullable
	public String type;
	public String getType() { return type; }
	public void setType(String type){ this.type = type; }
	@Nullable
	public String property;
	public String getProperty() { return property; }
	public void setProperty(String property){ this.property = property; }
	@SerializedName("qualifiers-order")
	@Nullable
	public List<String> qualifiersOrder;
	public List<String> getQualifiersOrder() { return qualifiersOrder; }
	public void setQualifiersOrder(List<String> qualifiersOrder){ this.qualifiersOrder = qualifiersOrder; }
	@Nullable
	public Datavalue datavalue;
	public Datavalue getDatavalue() { return datavalue; }
	public void setDatavalue(Datavalue datavalue){ this.datavalue = datavalue; }
	@Nullable
	public String datatype;
	public String getDatatype() { return datatype; }
	public void setDatatype(String datatype){ this.datatype = datatype; }
	@Nullable
	public Mainsnak mainsnak;
	public Mainsnak getMainsnak() { return mainsnak; }
	public void setMainsnak(Mainsnak mainsnak){ this.mainsnak = mainsnak; }
	@Nullable
	public String snaktype;
	public String getSnaktype() { return snaktype; }
	public void setSnaktype(String snaktype){ this.snaktype = snaktype; }
	@Nullable
	public String rank;
	public String getRank() { return rank; }
	public void setRank(String rank){ this.rank = rank; }
	@Nullable
	public String hash;
	public String getHash() { return hash; }
	public void setHash(String hash){ this.hash = hash; }
	}
	public static class Qualifiers {
	@SerializedName("P1037")
	@Nullable
	public List<P407> p1037;
	public List<P407> getP1037() { return p1037; }
	public void setP1037(List<P407> p1037){ this.p1037 = p1037; }
	@SerializedName("P131")
	@Nullable
	public String p131;
	public String getP131() { return p131; }
	public void setP131(String p131){ this.p131 = p131; }
	@SerializedName("P101")
	@Nullable
	public String p101;
	public String getP101() { return p101; }
	public void setP101(String p101){ this.p101 = p101; }
	@SerializedName("P747")
	@Nullable
	public String p747;
	public String getP747() { return p747; }
	public void setP747(String p747){ this.p747 = p747; }
	@SerializedName("P453")
	@Nullable
	public String p453;
	public String getP453() { return p453; }
	public void setP453(String p453){ this.p453 = p453; }
	@SerializedName("P670")
	@Nullable
	public String p670;
	public String getP670() { return p670; }
	public void setP670(String p670){ this.p670 = p670; }
	@SerializedName("P528")
	@Nullable
	public String p528;
	public String getP528() { return p528; }
	public void setP528(String p528){ this.p528 = p528; }
	@SerializedName("P137")
	@Nullable
	public String p137;
	public String getP137() { return p137; }
	public void setP137(String p137){ this.p137 = p137; }
	@SerializedName("P31")
	@Nullable
	public String p31;
	public String getP31() { return p31; }
	public void setP31(String p31){ this.p31 = p31; }
	@SerializedName("P697")
	@Nullable
	public String p697;
	public String getP697() { return p697; }
	public void setP697(String p697){ this.p697 = p697; }
	@SerializedName("P1227")
	@Nullable
	public List<P580> p1227;
	public List<P580> getP1227() { return p1227; }
	public void setP1227(List<P580> p1227){ this.p1227 = p1227; }
	@SerializedName("P112")
	@Nullable
	public List<P407> p112;
	public List<P407> getP112() { return p112; }
	public void setP112(List<P407> p112){ this.p112 = p112; }
	@SerializedName("P708")
	@Nullable
	public List<P407> p708;
	public List<P407> getP708() { return p708; }
	public void setP708(List<P407> p708){ this.p708 = p708; }
	@SerializedName("P1686")
	@Nullable
	public String p1686;
	public String getP1686() { return p1686; }
	public void setP1686(String p1686){ this.p1686 = p1686; }
	@SerializedName("P1365")
	@Nullable
	public String p1365;
	public String getP1365() { return p1365; }
	public void setP1365(String p1365){ this.p1365 = p1365; }
	@SerializedName("P1480")
	@Nullable
	public String p1480;
	public String getP1480() { return p1480; }
	public void setP1480(String p1480){ this.p1480 = p1480; }
	@SerializedName("P1351")
	@Nullable
	public List<P407> p1351;
	public List<P407> getP1351() { return p1351; }
	public void setP1351(List<P407> p1351){ this.p1351 = p1351; }
	@SerializedName("P26")
	@Nullable
	public List<P580> p26;
	public List<P580> getP26() { return p26; }
	public void setP26(List<P580> p26){ this.p26 = p26; }
	@SerializedName("P127")
	@Nullable
	public String p127;
	public String getP127() { return p127; }
	public void setP127(String p127){ this.p127 = p127; }
	@SerializedName("P197")
	@Nullable
	public String p197;
	public String getP197() { return p197; }
	public void setP197(String p197){ this.p197 = p197; }
	@SerializedName("P512")
	@Nullable
	public String p512;
	public String getP512() { return p512; }
	public void setP512(String p512){ this.p512 = p512; }
	@SerializedName("P405")
	@Nullable
	public String p405;
	public String getP405() { return p405; }
	public void setP405(String p405){ this.p405 = p405; }
	@SerializedName("P625")
	@Nullable
	public String p625;
	public String getP625() { return p625; }
	public void setP625(String p625){ this.p625 = p625; }
	@SerializedName("P827")
	@Nullable
	public List<P407> p827;
	public List<P407> getP827() { return p827; }
	public void setP827(List<P407> p827){ this.p827 = p827; }
	@SerializedName("P18")
	@Nullable
	public List<P580> p18;
	public List<P580> getP18() { return p18; }
	public void setP18(List<P580> p18){ this.p18 = p18; }
	@SerializedName("P159")
	@Nullable
	public List<P407> p159;
	public List<P407> getP159() { return p159; }
	public void setP159(List<P407> p159){ this.p159 = p159; }
	@SerializedName("P1444")
	@Nullable
	public List<P580> p1444;
	public List<P580> getP1444() { return p1444; }
	public void setP1444(List<P580> p1444){ this.p1444 = p1444; }
	@SerializedName("P50")
	@Nullable
	public String p50;
	public String getP50() { return p50; }
	public void setP50(String p50){ this.p50 = p50; }
	@SerializedName("P426")
	@Nullable
	public List<P407> p426;
	public List<P407> getP426() { return p426; }
	public void setP426(List<P407> p426){ this.p426 = p426; }
	@SerializedName("P218")
	@Nullable
	public List<P580> p218;
	public List<P580> getP218() { return p218; }
	public void setP218(List<P580> p218){ this.p218 = p218; }
	@SerializedName("P69")
	@Nullable
	public List<P580> p69;
	public List<P580> getP69() { return p69; }
	public void setP69(List<P580> p69){ this.p69 = p69; }
	@SerializedName("P249")
	@Nullable
	public String p249;
	public String getP249() { return p249; }
	public void setP249(String p249){ this.p249 = p249; }
	@SerializedName("P140")
	@Nullable
	public String p140;
	public String getP140() { return p140; }
	public void setP140(String p140){ this.p140 = p140; }
	@SerializedName("P410")
	@Nullable
	public String p410;
	public String getP410() { return p410; }
	public void setP410(String p410){ this.p410 = p410; }
	@SerializedName("P155")
	@Nullable
	public String p155;
	public String getP155() { return p155; }
	public void setP155(String p155){ this.p155 = p155; }
	@SerializedName("P805")
	@Nullable
	public String p805;
	public String getP805() { return p805; }
	public void setP805(String p805){ this.p805 = p805; }
	@SerializedName("P811")
	@Nullable
	public List<P580> p811;
	public List<P580> getP811() { return p811; }
	public void setP811(List<P580> p811){ this.p811 = p811; }
	@SerializedName("P560")
	@Nullable
	public String p560;
	public String getP560() { return p560; }
	public void setP560(String p560){ this.p560 = p560; }
	@SerializedName("P276")
	@Nullable
	public String p276;
	public String getP276() { return p276; }
	public void setP276(String p276){ this.p276 = p276; }
	@SerializedName("P382")
	@Nullable
	public String p382;
	public String getP382() { return p382; }
	public void setP382(String p382){ this.p382 = p382; }
	@SerializedName("P965")
	@Nullable
	public String p965;
	public String getP965() { return p965; }
	public void setP965(String p965){ this.p965 = p965; }
	@SerializedName("P136")
	@Nullable
	public List<P407> p136;
	public List<P407> getP136() { return p136; }
	public void setP136(List<P407> p136){ this.p136 = p136; }
	@SerializedName("P1345")
	@Nullable
	public List<P580> p1345;
	public List<P580> getP1345() { return p1345; }
	public void setP1345(List<P580> p1345){ this.p1345 = p1345; }
	@SerializedName("P484")
	@Nullable
	public List<P407> p484;
	public List<P407> getP484() { return p484; }
	public void setP484(List<P407> p484){ this.p484 = p484; }
	@SerializedName("P577")
	@Nullable
	public String p577;
	public String getP577() { return p577; }
	public void setP577(String p577){ this.p577 = p577; }
	@SerializedName("P1354")
	@Nullable
	public List<P580> p1354;
	public List<P580> getP1354() { return p1354; }
	public void setP1354(List<P580> p1354){ this.p1354 = p1354; }
	@SerializedName("P1358")
	@Nullable
	public List<P407> p1358;
	public List<P407> getP1358() { return p1358; }
	public void setP1358(List<P407> p1358){ this.p1358 = p1358; }
	@SerializedName("P576")
	@Nullable
	public List<P407> p576;
	public List<P407> getP576() { return p576; }
	public void setP576(List<P407> p576){ this.p576 = p576; }
	@SerializedName("P1164")
	@Nullable
	public List<P580> p1164;
	public List<P580> getP1164() { return p1164; }
	public void setP1164(List<P580> p1164){ this.p1164 = p1164; }
	@SerializedName("P195")
	@Nullable
	public String p195;
	public String getP195() { return p195; }
	public void setP195(String p195){ this.p195 = p195; }
	@SerializedName("P407")
	@Nullable
	public String p407;
	public String getP407() { return p407; }
	public void setP407(String p407){ this.p407 = p407; }
	@SerializedName("P102")
	@Nullable
	public String p102;
	public String getP102() { return p102; }
	public void setP102(String p102){ this.p102 = p102; }
	@SerializedName("P1433")
	@Nullable
	public List<P407> p1433;
	public List<P407> getP1433() { return p1433; }
	public void setP1433(List<P407> p1433){ this.p1433 = p1433; }
	@SerializedName("P915")
	@Nullable
	public List<P407> p915;
	public List<P407> getP915() { return p915; }
	public void setP915(List<P407> p915){ this.p915 = p915; }
	@SerializedName("P969")
	@Nullable
	public String p969;
	public String getP969() { return p969; }
	public void setP969(String p969){ this.p969 = p969; }
	@SerializedName("P463")
	@Nullable
	public String p463;
	public String getP463() { return p463; }
	public void setP463(String p463){ this.p463 = p463; }
	@SerializedName("P654")
	@Nullable
	public String p654;
	public String getP654() { return p654; }
	public void setP654(String p654){ this.p654 = p654; }
	@SerializedName("P743")
	@Nullable
	public List<P407> p743;
	public List<P407> getP743() { return p743; }
	public void setP743(List<P407> p743){ this.p743 = p743; }
	@SerializedName("P22")
	@Nullable
	public List<P407> p22;
	public List<P407> getP22() { return p22; }
	public void setP22(List<P407> p22){ this.p22 = p22; }
	@SerializedName("P693")
	@Nullable
	public List<P580> p693;
	public List<P580> getP693() { return p693; }
	public void setP693(List<P580> p693){ this.p693 = p693; }
	@SerializedName("P1596")
	@Nullable
	public List<P580> p1596;
	public List<P580> getP1596() { return p1596; }
	public void setP1596(List<P580> p1596){ this.p1596 = p1596; }
	@SerializedName("P1038")
	@Nullable
	public List<P407> p1038;
	public List<P407> getP1038() { return p1038; }
	public void setP1038(List<P407> p1038){ this.p1038 = p1038; }
	@SerializedName("P742")
	@Nullable
	public String p742;
	public String getP742() { return p742; }
	public void setP742(String p742){ this.p742 = p742; }
	@SerializedName("P642")
	@Nullable
	public String p642;
	public String getP642() { return p642; }
	public void setP642(String p642){ this.p642 = p642; }
	@SerializedName("P531")
	@Nullable
	public List<P580> p531;
	public List<P580> getP531() { return p531; }
	public void setP531(List<P580> p531){ this.p531 = p531; }
	@SerializedName("P1120")
	@Nullable
	public List<P580> p1120;
	public List<P580> getP1120() { return p1120; }
	public void setP1120(List<P580> p1120){ this.p1120 = p1120; }
	@SerializedName("P619")
	@Nullable
	public List<P580> p619;
	public List<P580> getP619() { return p619; }
	public void setP619(List<P580> p619){ this.p619 = p619; }
	@SerializedName("P706")
	@Nullable
	public List<P407> p706;
	public List<P407> getP706() { return p706; }
	public void setP706(List<P407> p706){ this.p706 = p706; }
	@SerializedName("P217")
	@Nullable
	public String p217;
	public String getP217() { return p217; }
	public void setP217(String p217){ this.p217 = p217; }
	@SerializedName("P306")
	@Nullable
	public List<P580> p306;
	public List<P580> getP306() { return p306; }
	public void setP306(List<P580> p306){ this.p306 = p306; }
	@SerializedName("P366")
	@Nullable
	public List<P407> p366;
	public List<P407> getP366() { return p366; }
	public void setP366(List<P407> p366){ this.p366 = p366; }
	@SerializedName("P418")
	@Nullable
	public List<P580> p418;
	public List<P580> getP418() { return p418; }
	public void setP418(List<P580> p418){ this.p418 = p418; }
	@SerializedName("P175")
	@Nullable
	public List<P407> p175;
	public List<P407> getP175() { return p175; }
	public void setP175(List<P407> p175){ this.p175 = p175; }
	@SerializedName("P414")
	@Nullable
	public List<P580> p414;
	public List<P580> getP414() { return p414; }
	public void setP414(List<P580> p414){ this.p414 = p414; }
	@SerializedName("P134")
	@Nullable
	public List<P407> p134;
	public List<P407> getP134() { return p134; }
	public void setP134(List<P407> p134){ this.p134 = p134; }
	@SerializedName("P1107")
	@Nullable
	public String p1107;
	public String getP1107() { return p1107; }
	public void setP1107(String p1107){ this.p1107 = p1107; }
	@SerializedName("P25")
	@Nullable
	public String p25;
	public String getP25() { return p25; }
	public void setP25(String p25){ this.p25 = p25; }
	@SerializedName("P669")
	@Nullable
	public List<P407> p669;
	public List<P407> getP669() { return p669; }
	public void setP669(List<P407> p669){ this.p669 = p669; }
	@SerializedName("P582")
	@Nullable
	public String p582;
	public String getP582() { return p582; }
	public void setP582(String p582){ this.p582 = p582; }
	@SerializedName("P1080")
	@Nullable
	public List<P407> p1080;
	public List<P407> getP1080() { return p1080; }
	public void setP1080(List<P407> p1080){ this.p1080 = p1080; }
	@SerializedName("P387")
	@Nullable
	public List<P407> p387;
	public List<P407> getP387() { return p387; }
	public void setP387(List<P407> p387){ this.p387 = p387; }
	@SerializedName("P734")
	@Nullable
	public List<P407> p734;
	public List<P407> getP734() { return p734; }
	public void setP734(List<P407> p734){ this.p734 = p734; }
	@SerializedName("P425")
	@Nullable
	public List<P407> p425;
	public List<P407> getP425() { return p425; }
	public void setP425(List<P407> p425){ this.p425 = p425; }
	@SerializedName("P248")
	@Nullable
	public String p248;
	public String getP248() { return p248; }
	public void setP248(String p248){ this.p248 = p248; }
	@SerializedName("P397")
	@Nullable
	public List<P580> p397;
	public List<P580> getP397() { return p397; }
	public void setP397(List<P580> p397){ this.p397 = p397; }
	@SerializedName("P735")
	@Nullable
	public List<P407> p735;
	public List<P407> getP735() { return p735; }
	public void setP735(List<P407> p735){ this.p735 = p735; }
	@SerializedName("P790")
	@Nullable
	public String p790;
	public String getP790() { return p790; }
	public void setP790(String p790){ this.p790 = p790; }
	@SerializedName("P1264")
	@Nullable
	public List<P580> p1264;
	public List<P580> getP1264() { return p1264; }
	public void setP1264(List<P580> p1264){ this.p1264 = p1264; }
	@SerializedName("P689")
	@Nullable
	public List<P407> p689;
	public List<P407> getP689() { return p689; }
	public void setP689(List<P407> p689){ this.p689 = p689; }
	@SerializedName("P393")
	@Nullable
	public List<P407> p393;
	public List<P407> getP393() { return p393; }
	public void setP393(List<P407> p393){ this.p393 = p393; }
	@SerializedName("P554")
	@Nullable
	public String p554;
	public String getP554() { return p554; }
	public void setP554(String p554){ this.p554 = p554; }
	@SerializedName("P1343")
	@Nullable
	public List<P580> p1343;
	public List<P580> getP1343() { return p1343; }
	public void setP1343(List<P580> p1343){ this.p1343 = p1343; }
	@SerializedName("P357")
	@Nullable
	public String p357;
	public String getP357() { return p357; }
	public void setP357(String p357){ this.p357 = p357; }
	@SerializedName("P186")
	@Nullable
	public String p186;
	public String getP186() { return p186; }
	public void setP186(String p186){ this.p186 = p186; }
	@SerializedName("P494")
	@Nullable
	public List<P580> p494;
	public List<P580> getP494() { return p494; }
	public void setP494(List<P580> p494){ this.p494 = p494; }
	@SerializedName("P1353")
	@Nullable
	public List<P407> p1353;
	public List<P407> getP1353() { return p1353; }
	public void setP1353(List<P407> p1353){ this.p1353 = p1353; }
	@SerializedName("P1350")
	@Nullable
	public List<P407> p1350;
	public List<P407> getP1350() { return p1350; }
	public void setP1350(List<P407> p1350){ this.p1350 = p1350; }
	@SerializedName("P1192")
	@Nullable
	public List<P407> p1192;
	public List<P407> getP1192() { return p1192; }
	public void setP1192(List<P407> p1192){ this.p1192 = p1192; }
	@SerializedName("P641")
	@Nullable
	public String p641;
	public String getP641() { return p641; }
	public void setP641(String p641){ this.p641 = p641; }
	@SerializedName("P1542")
	@Nullable
	public List<P407> p1542;
	public List<P407> getP1542() { return p1542; }
	public void setP1542(List<P407> p1542){ this.p1542 = p1542; }
	@SerializedName("P281")
	@Nullable
	public List<P407> p281;
	public List<P407> getP281() { return p281; }
	public void setP281(List<P407> p281){ this.p281 = p281; }
	@SerializedName("P304")
	@Nullable
	public String p304;
	public String getP304() { return p304; }
	public void setP304(String p304){ this.p304 = p304; }
	@SerializedName("P495")
	@Nullable
	public List<P407> p495;
	public List<P407> getP495() { return p495; }
	public void setP495(List<P407> p495){ this.p495 = p495; }
	@SerializedName("P6")
	@Nullable
	public List<P407> p6;
	public List<P407> getP6() { return p6; }
	public void setP6(List<P407> p6){ this.p6 = p6; }
	@SerializedName("P854")
	@Nullable
	public String p854;
	public String getP854() { return p854; }
	public void setP854(String p854){ this.p854 = p854; }
	@SerializedName("P794")
	@Nullable
	public String p794;
	public String getP794() { return p794; }
	public void setP794(String p794){ this.p794 = p794; }
	@SerializedName("P462")
	@Nullable
	public String p462;
	public String getP462() { return p462; }
	public void setP462(String p462){ this.p462 = p462; }
	@SerializedName("P1706")
	@Nullable
	public String p1706;
	public String getP1706() { return p1706; }
	public void setP1706(String p1706){ this.p1706 = p1706; }
	@SerializedName("P812")
	@Nullable
	public String p812;
	public String getP812() { return p812; }
	public void setP812(String p812){ this.p812 = p812; }
	@SerializedName("P813")
	@Nullable
	public String p813;
	public String getP813() { return p813; }
	public void setP813(String p813){ this.p813 = p813; }
	@SerializedName("P729")
	@Nullable
	public List<P407> p729;
	public List<P407> getP729() { return p729; }
	public void setP729(List<P407> p729){ this.p729 = p729; }
	@SerializedName("P1016")
	@Nullable
	public List<P407> p1016;
	public List<P407> getP1016() { return p1016; }
	public void setP1016(List<P407> p1016){ this.p1016 = p1016; }
	@SerializedName("P212")
	@Nullable
	public List<P407> p212;
	public List<P407> getP212() { return p212; }
	public void setP212(List<P407> p212){ this.p212 = p212; }
	@SerializedName("P730")
	@Nullable
	public String p730;
	public String getP730() { return p730; }
	public void setP730(String p730){ this.p730 = p730; }
	@SerializedName("P518")
	@Nullable
	public String p518;
	public String getP518() { return p518; }
	public void setP518(String p518){ this.p518 = p518; }
	@SerializedName("P678")
	@Nullable
	public String p678;
	public String getP678() { return p678; }
	public void setP678(String p678){ this.p678 = p678; }
	@SerializedName("P1249")
	@Nullable
	public List<P407> p1249;
	public List<P407> getP1249() { return p1249; }
	public void setP1249(List<P407> p1249){ this.p1249 = p1249; }
	@SerializedName("P1476")
	@Nullable
	public String p1476;
	public String getP1476() { return p1476; }
	public void setP1476(String p1476){ this.p1476 = p1476; }
	@SerializedName("P35")
	@Nullable
	public List<P407> p35;
	public List<P407> getP35() { return p35; }
	public void setP35(List<P407> p35){ this.p35 = p35; }
	@SerializedName("P1012")
	@Nullable
	public List<P407> p1012;
	public List<P407> getP1012() { return p1012; }
	public void setP1012(List<P407> p1012){ this.p1012 = p1012; }
	@SerializedName("P166")
	@Nullable
	public List<P407> p166;
	public List<P407> getP166() { return p166; }
	public void setP166(List<P407> p166){ this.p166 = p166; }
	@SerializedName("P1026")
	@Nullable
	public List<P580> p1026;
	public List<P580> getP1026() { return p1026; }
	public void setP1026(List<P580> p1026){ this.p1026 = p1026; }
	@SerializedName("P793")
	@Nullable
	public String p793;
	public String getP793() { return p793; }
	public void setP793(String p793){ this.p793 = p793; }
	@SerializedName("P143")
	@Nullable
	public String p143;
	public String getP143() { return p143; }
	public void setP143(String p143){ this.p143 = p143; }
	@SerializedName("P1319")
	@Nullable
	public String p1319;
	public String getP1319() { return p1319; }
	public void setP1319(String p1319){ this.p1319 = p1319; }
	@SerializedName("P19")
	@Nullable
	public List<P407> p19;
	public List<P407> getP19() { return p19; }
	public void setP19(List<P407> p19){ this.p19 = p19; }
	@SerializedName("P1419")
	@Nullable
	public List<P407> p1419;
	public List<P407> getP1419() { return p1419; }
	public void setP1419(List<P407> p1419){ this.p1419 = p1419; }
	@SerializedName("P488")
	@Nullable
	public String p488;
	public String getP488() { return p488; }
	public void setP488(String p488){ this.p488 = p488; }
	@SerializedName("P505")
	@Nullable
	public List<P407> p505;
	public List<P407> getP505() { return p505; }
	public void setP505(List<P407> p505){ this.p505 = p505; }
	@SerializedName("P798")
	@Nullable
	public List<P407> p798;
	public List<P407> getP798() { return p798; }
	public void setP798(List<P407> p798){ this.p798 = p798; }
	@SerializedName("P548")
	@Nullable
	public String p548;
	public String getP548() { return p548; }
	public void setP548(String p548){ this.p548 = p548; }
	@SerializedName("P179")
	@Nullable
	public List<P407> p179;
	public List<P407> getP179() { return p179; }
	public void setP179(List<P407> p179){ this.p179 = p179; }
	@SerializedName("P447")
	@Nullable
	public String p447;
	public String getP447() { return p447; }
	public void setP447(String p447){ this.p447 = p447; }
	@SerializedName("P580")
	@Nullable
	public List<P580> p580;
	public List<P580> getP580() { return p580; }
	public void setP580(List<P580> p580){ this.p580 = p580; }
	@SerializedName("P478")
	@Nullable
	public String p478;
	public String getP478() { return p478; }
	public void setP478(String p478){ this.p478 = p478; }
	@SerializedName("P574")
	@Nullable
	public String p574;
	public String getP574() { return p574; }
	public void setP574(String p574){ this.p574 = p574; }
	@SerializedName("P1013")
	@Nullable
	public String p1013;
	public String getP1013() { return p1013; }
	public void setP1013(String p1013){ this.p1013 = p1013; }
	@SerializedName("P1545")
	@Nullable
	public String p1545;
	public String getP1545() { return p1545; }
	public void setP1545(String p1545){ this.p1545 = p1545; }
	@SerializedName("P156")
	@Nullable
	public String p156;
	public String getP156() { return p156; }
	public void setP156(String p156){ this.p156 = p156; }
	@SerializedName("P570")
	@Nullable
	public List<P580> p570;
	public List<P580> getP570() { return p570; }
	public void setP570(List<P580> p570){ this.p570 = p570; }
	@SerializedName("P108")
	@Nullable
	public String p108;
	public String getP108() { return p108; }
	public void setP108(String p108){ this.p108 = p108; }
	@SerializedName("P123")
	@Nullable
	public List<P407> p123;
	public List<P407> getP123() { return p123; }
	public void setP123(List<P407> p123){ this.p123 = p123; }
	@SerializedName("P710")
	@Nullable
	public List<P407> p710;
	public List<P407> getP710() { return p710; }
	public void setP710(List<P407> p710){ this.p710 = p710; }
	@SerializedName("P1114")
	@Nullable
	public String p1114;
	public String getP1114() { return p1114; }
	public void setP1114(String p1114){ this.p1114 = p1114; }
	@SerializedName("P184")
	@Nullable
	public List<P580> p184;
	public List<P580> getP184() { return p184; }
	public void setP184(List<P580> p184){ this.p184 = p184; }
	@SerializedName("P579")
	@Nullable
	public String p579;
	public String getP579() { return p579; }
	public void setP579(String p579){ this.p579 = p579; }
	@SerializedName("P17")
	@Nullable
	public String p17;
	public String getP17() { return p17; }
	public void setP17(String p17){ this.p17 = p17; }
	@SerializedName("P138")
	@Nullable
	public String p138;
	public String getP138() { return p138; }
	public void setP138(String p138){ this.p138 = p138; }
	@SerializedName("P361")
	@Nullable
	public String p361;
	public String getP361() { return p361; }
	public void setP361(String p361){ this.p361 = p361; }
	@SerializedName("P768")
	@Nullable
	public String p768;
	public String getP768() { return p768; }
	public void setP768(String p768){ this.p768 = p768; }
	@SerializedName("P400")
	@Nullable
	public String p400;
	public String getP400() { return p400; }
	public void setP400(String p400){ this.p400 = p400; }
	@SerializedName("P291")
	@Nullable
	public String p291;
	public String getP291() { return p291; }
	public void setP291(String p291){ this.p291 = p291; }
	@SerializedName("P373")
	@Nullable
	public String p373;
	public String getP373() { return p373; }
	public void setP373(String p373){ this.p373 = p373; }
	@SerializedName("P958")
	@Nullable
	public String p958;
	public String getP958() { return p958; }
	public void setP958(String p958){ this.p958 = p958; }
	@SerializedName("P452")
	@Nullable
	public List<P407> p452;
	public List<P407> getP452() { return p452; }
	public void setP452(List<P407> p452){ this.p452 = p452; }
	@SerializedName("P157")
	@Nullable
	public String p157;
	public String getP157() { return p157; }
	public void setP157(String p157){ this.p157 = p157; }
	@SerializedName("P81")
	@Nullable
	public String p81;
	public String getP81() { return p81; }
	public void setP81(String p81){ this.p81 = p81; }
	@SerializedName("P571")
	@Nullable
	public String p571;
	public String getP571() { return p571; }
	public void setP571(String p571){ this.p571 = p571; }
	@SerializedName("P241")
	@Nullable
	public List<P407> p241;
	public List<P407> getP241() { return p241; }
	public void setP241(List<P407> p241){ this.p241 = p241; }
	@SerializedName("P106")
	@Nullable
	public String p106;
	public String getP106() { return p106; }
	public void setP106(String p106){ this.p106 = p106; }
	@SerializedName("P39")
	@Nullable
	public String p39;
	public String getP39() { return p39; }
	public void setP39(String p39){ this.p39 = p39; }
	@SerializedName("P575")
	@Nullable
	public List<P580> p575;
	public List<P580> getP575() { return p575; }
	public void setP575(List<P580> p575){ this.p575 = p575; }
	@SerializedName("P569")
	@Nullable
	public String p569;
	public String getP569() { return p569; }
	public void setP569(String p569){ this.p569 = p569; }
	@SerializedName("P170")
	@Nullable
	public List<P407> p170;
	public List<P407> getP170() { return p170; }
	public void setP170(List<P407> p170){ this.p170 = p170; }
	@SerializedName("P459")
	@Nullable
	public String p459;
	public String getP459() { return p459; }
	public void setP459(String p459){ this.p459 = p459; }
	@SerializedName("P1027")
	@Nullable
	public String p1027;
	public String getP1027() { return p1027; }
	public void setP1027(String p1027){ this.p1027 = p1027; }
	@SerializedName("P972")
	@Nullable
	public String p972;
	public String getP972() { return p972; }
	public void setP972(String p972){ this.p972 = p972; }
	@SerializedName("P527")
	@Nullable
	public List<P580> p527;
	public List<P580> getP527() { return p527; }
	public void setP527(List<P580> p527){ this.p527 = p527; }
	@SerializedName("P1001")
	@Nullable
	public List<P407> p1001;
	public List<P407> getP1001() { return p1001; }
	public void setP1001(List<P407> p1001){ this.p1001 = p1001; }
	@SerializedName("P1039")
	@Nullable
	public String p1039;
	public String getP1039() { return p1039; }
	public void setP1039(String p1039){ this.p1039 = p1039; }
	@SerializedName("P1366")
	@Nullable
	public String p1366;
	public String getP1366() { return p1366; }
	public void setP1366(String p1366){ this.p1366 = p1366; }
	@SerializedName("P1326")
	@Nullable
	public String p1326;
	public String getP1326() { return p1326; }
	public void setP1326(String p1326){ this.p1326 = p1326; }
	@SerializedName("P242")
	@Nullable
	public List<P407> p242;
	public List<P407> getP242() { return p242; }
	public void setP242(List<P407> p242){ this.p242 = p242; }
	@SerializedName("P457")
	@Nullable
	public List<P580> p457;
	public List<P580> getP457() { return p457; }
	public void setP457(List<P580> p457){ this.p457 = p457; }
	@SerializedName("P585")
	@Nullable
	public String p585;
	public String getP585() { return p585; }
	public void setP585(String p585){ this.p585 = p585; }
	@SerializedName("P725")
	@Nullable
	public List<P580> p725;
	public List<P580> getP725() { return p725; }
	public void setP725(List<P580> p725){ this.p725 = p725; }
	@SerializedName("P1011")
	@Nullable
	public List<P580> p1011;
	public List<P580> getP1011() { return p1011; }
	public void setP1011(List<P580> p1011){ this.p1011 = p1011; }
	@SerializedName("P1129")
	@Nullable
	public List<P407> p1129;
	public List<P407> getP1129() { return p1129; }
	public void setP1129(List<P407> p1129){ this.p1129 = p1129; }
	@SerializedName("P439")
	@Nullable
	public List<P580> p439;
	public List<P580> getP439() { return p439; }
	public void setP439(List<P580> p439){ this.p439 = p439; }
	@SerializedName("P559")
	@Nullable
	public List<P407> p559;
	public List<P407> getP559() { return p559; }
	public void setP559(List<P407> p559){ this.p559 = p559; }
	@SerializedName("P424")
	@Nullable
	public List<P407> p424;
	public List<P407> getP424() { return p424; }
	public void setP424(List<P407> p424){ this.p424 = p424; }
	}
	public static class P26 {
	@Nullable
	public Qualifiers qualifiers;
	public Qualifiers getQualifiers() { return qualifiers; }
	public void setQualifiers(Qualifiers qualifiers){ this.qualifiers = qualifiers; }
	@Nullable
	public String id;
	public String getId() { return id; }
	public void setId(String id){ this.id = id; }
	@Nullable
	public Mainsnak mainsnak;
	public Mainsnak getMainsnak() { return mainsnak; }
	public void setMainsnak(Mainsnak mainsnak){ this.mainsnak = mainsnak; }
	@Nullable
	public List<References> references;
	public List<References> getReferences() { return references; }
	public void setReferences(List<References> references){ this.references = references; }
	@Nullable
	public String type;
	public String getType() { return type; }
	public void setType(String type){ this.type = type; }
	@Nullable
	public String rank;
	public String getRank() { return rank; }
	public void setRank(String rank){ this.rank = rank; }
	@SerializedName("qualifiers-order")
	@Nullable
	public List<String> qualifiersOrder;
	public List<String> getQualifiersOrder() { return qualifiersOrder; }
	public void setQualifiersOrder(List<String> qualifiersOrder){ this.qualifiersOrder = qualifiersOrder; }
	}
	public static class P155 {
	@Nullable
	public Qualifiers qualifiers;
	public Qualifiers getQualifiers() { return qualifiers; }
	public void setQualifiers(Qualifiers qualifiers){ this.qualifiers = qualifiers; }
	@Nullable
	public String id;
	public String getId() { return id; }
	public void setId(String id){ this.id = id; }
	@Nullable
	public String type;
	public String getType() { return type; }
	public void setType(String type){ this.type = type; }
	@Nullable
	public String property;
	public String getProperty() { return property; }
	public void setProperty(String property){ this.property = property; }
	@SerializedName("qualifiers-order")
	@Nullable
	public List<String> qualifiersOrder;
	public List<String> getQualifiersOrder() { return qualifiersOrder; }
	public void setQualifiersOrder(List<String> qualifiersOrder){ this.qualifiersOrder = qualifiersOrder; }
	@Nullable
	public Datavalue datavalue;
	public Datavalue getDatavalue() { return datavalue; }
	public void setDatavalue(Datavalue datavalue){ this.datavalue = datavalue; }
	@Nullable
	public String datatype;
	public String getDatatype() { return datatype; }
	public void setDatatype(String datatype){ this.datatype = datatype; }
	@Nullable
	public Mainsnak mainsnak;
	public Mainsnak getMainsnak() { return mainsnak; }
	public void setMainsnak(Mainsnak mainsnak){ this.mainsnak = mainsnak; }
	@Nullable
	public String snaktype;
	public String getSnaktype() { return snaktype; }
	public void setSnaktype(String snaktype){ this.snaktype = snaktype; }
	@Nullable
	public String rank;
	public String getRank() { return rank; }
	public void setRank(String rank){ this.rank = rank; }
	@Nullable
	public String hash;
	public String getHash() { return hash; }
	public void setHash(String hash){ this.hash = hash; }
	}
	public static class P39 {
	@Nullable
	public Qualifiers qualifiers;
	public Qualifiers getQualifiers() { return qualifiers; }
	public void setQualifiers(Qualifiers qualifiers){ this.qualifiers = qualifiers; }
	@Nullable
	public String id;
	public String getId() { return id; }
	public void setId(String id){ this.id = id; }
	@Nullable
	public String type;
	public String getType() { return type; }
	public void setType(String type){ this.type = type; }
	@Nullable
	public String property;
	public String getProperty() { return property; }
	public void setProperty(String property){ this.property = property; }
	@SerializedName("qualifiers-order")
	@Nullable
	public List<String> qualifiersOrder;
	public List<String> getQualifiersOrder() { return qualifiersOrder; }
	public void setQualifiersOrder(List<String> qualifiersOrder){ this.qualifiersOrder = qualifiersOrder; }
	@Nullable
	public Datavalue datavalue;
	public Datavalue getDatavalue() { return datavalue; }
	public void setDatavalue(Datavalue datavalue){ this.datavalue = datavalue; }
	@Nullable
	public String datatype;
	public String getDatatype() { return datatype; }
	public void setDatatype(String datatype){ this.datatype = datatype; }
	@Nullable
	public Mainsnak mainsnak;
	public Mainsnak getMainsnak() { return mainsnak; }
	public void setMainsnak(Mainsnak mainsnak){ this.mainsnak = mainsnak; }
	@Nullable
	public List<References> references;
	public List<References> getReferences() { return references; }
	public void setReferences(List<References> references){ this.references = references; }
	@Nullable
	public String snaktype;
	public String getSnaktype() { return snaktype; }
	public void setSnaktype(String snaktype){ this.snaktype = snaktype; }
	@Nullable
	public String rank;
	public String getRank() { return rank; }
	public void setRank(String rank){ this.rank = rank; }
	@Nullable
	public String hash;
	public String getHash() { return hash; }
	public void setHash(String hash){ this.hash = hash; }
	}
	public static class P1417 {
	@Nullable
	public Qualifiers qualifiers;
	public Qualifiers getQualifiers() { return qualifiers; }
	public void setQualifiers(Qualifiers qualifiers){ this.qualifiers = qualifiers; }
	@Nullable
	public String id;
	public String getId() { return id; }
	public void setId(String id){ this.id = id; }
	@Nullable
	public Mainsnak mainsnak;
	public Mainsnak getMainsnak() { return mainsnak; }
	public void setMainsnak(Mainsnak mainsnak){ this.mainsnak = mainsnak; }
	@Nullable
	public String type;
	public String getType() { return type; }
	public void setType(String type){ this.type = type; }
	@Nullable
	public String rank;
	public String getRank() { return rank; }
	public void setRank(String rank){ this.rank = rank; }
	@SerializedName("qualifiers-order")
	@Nullable
	public List<String> qualifiersOrder;
	public List<String> getQualifiersOrder() { return qualifiersOrder; }
	public void setQualifiersOrder(List<String> qualifiersOrder){ this.qualifiersOrder = qualifiersOrder; }
	}
	public static class P407 {
	@Nullable
	public Datavalue datavalue;
	public Datavalue getDatavalue() { return datavalue; }
	public void setDatavalue(Datavalue datavalue){ this.datavalue = datavalue; }
	@Nullable
	public String snaktype;
	public String getSnaktype() { return snaktype; }
	public void setSnaktype(String snaktype){ this.snaktype = snaktype; }
	@Nullable
	public String datatype;
	public String getDatatype() { return datatype; }
	public void setDatatype(String datatype){ this.datatype = datatype; }
	@Nullable
	public String property;
	public String getProperty() { return property; }
	public void setProperty(String property){ this.property = property; }
	@Nullable
	public String hash;
	public String getHash() { return hash; }
	public void setHash(String hash){ this.hash = hash; }
	}
	public static class P248 {
	@Nullable
	public String snaktype;
	public String getSnaktype() { return snaktype; }
	public void setSnaktype(String snaktype){ this.snaktype = snaktype; }
	@Nullable
	public String property;
	public String getProperty() { return property; }
	public void setProperty(String property){ this.property = property; }
	}
	public static class P17 {
	@Nullable
	public Datavalue datavalue;
	public Datavalue getDatavalue() { return datavalue; }
	public void setDatavalue(Datavalue datavalue){ this.datavalue = datavalue; }
	@Nullable
	public String snaktype;
	public String getSnaktype() { return snaktype; }
	public void setSnaktype(String snaktype){ this.snaktype = snaktype; }
	@Nullable
	public String datatype;
	public String getDatatype() { return datatype; }
	public void setDatatype(String datatype){ this.datatype = datatype; }
	@Nullable
	public String property;
	public String getProperty() { return property; }
	public void setProperty(String property){ this.property = property; }
	@Nullable
	public String hash;
	public String getHash() { return hash; }
	public void setHash(String hash){ this.hash = hash; }
	}
	public static class P582 {
	@Nullable
	public String snaktype;
	public String getSnaktype() { return snaktype; }
	public void setSnaktype(String snaktype){ this.snaktype = snaktype; }
	@Nullable
	public String property;
	public String getProperty() { return property; }
	public void setProperty(String property){ this.property = property; }
	@Nullable
	public String hash;
	public String getHash() { return hash; }
	public void setHash(String hash){ this.hash = hash; }
	}
}
