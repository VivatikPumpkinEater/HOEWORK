package by.academy.classwork.regexp.hw8;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpHwMain {

    public static void main(String[] args) {
        int ftpCount = 0;
        int httpCount = 0;
        int httpsCount = 0;
        String urls = "http://www.obrnadzor.gov.com" +
                "http://stat.edu.ru" +
                "ftp://www.fipi.ru" +
                "ftp://www.lexed.ru" +
                "https://www.ru" +
                "http://www.edu.com" +
                "http://ege.edu.ru" +
                "ftp://www.ecsocman.edu.ru" +
                "https://www.law.edu.org" +
                "http://www.stavminobr.ru" +
                "ftp://www.minomos.ru" +
                "https://www.minobraz.net" +
                "http://www.edunso.ru" +
                "http://www.educom.ru" +
                "http://www.avorontcov.ru" +
                "http://bogoslovie.pro/" +
                "http://www.vlgregedu.ru" +
                "ftp://www.baikalnarobraz.ru" +
                "ftp://www.websib.ru" +
                "ftp://www.edu.murmansk.ru" +
                "ftp://www.eduhmao.ru" +
                "ftp://www.omsk.edu.ru" +
                "ftp://webinar.pgsga.ru" +
                "http://www.edukbr.ru" +
                "http://www.stavedu.ru" +
                "http://abc.edu-net.khb.ru" +
                "http://www.edu.yar.ru" +
                "http://iso.karelia.ru" +
                "http://imc.ocpi.ru" +
                "http://www.ug.ru" +
                "http://www.vestniknews.ru" +
                "http://www.elw.ru" +
                "http://vio.fio.ru" +
                "http://www.eidos.ru" +
                "http://news.abiturcenter.ru" +
                "http://kvant.mccme.ru" +
                "http://www.psyedu.ru" +
                "http://www.akademkniga.ru" +
                "http://www.lbz.ru" +
                "http://www.verbum-m.ru" +
                "http://www.vlados.ru" +
                "http://www.mnemozina.ru" +
                "http://www.msbook.ru" +
                "http://www.infojournal.ru" +
                "http://www.onyx.ru" +
                "http://www.prosv.ru" +
                "http://www.direktor.ru" +
                "http://www.titul.ru" +
                "http://www.uchebniki.ru" +
                "http://www.edu-expo.ru" +
                "http://www.ito.su" +
                "http://www.relarn.ru" +
                "http://www.mce.biophys.msu.ru" +
                "http://www.edu-it.ru" +
                "http://www.znanie.info" +
                "http://www.it-education.ru" +
                "http://eidos.ru" +
                "http://konkurs.lgo.ru" +
                "http://teacher.org.ru" +
                "http://www.iicavers.ru" +
                "http://www.prometeus.ru" +
                "http://www.learnware.ru" +
                "http://www.e-osnova.ru" +
                "http://www.websoft.ru" +
                "http://online.multilex.ru" +
                "http://www.slovari.ru" +
                "http://www.glossary.ru" +
                "http://www.krugosvet.ru" +
                "http://www.elementy.ru" +
                "http://www.sokr.ru" +
                "http://www.vestniknews.ru" +
                "http://www.eurekanet.ru" +
                "http://www.kpmo.ru" +
                "http://www.iteach.ru" +
                "http://mou.bsu.edu.ru" +
                "http://www.profile-edu.ru" +
                "http://www.setilab.ru" +
                "http://www.boards-edu.ru" +
                "http://www.teachpro.ru" +
                "http://oso.rcsz.ru" +
                "http://www.eidos.ru" +
                "http://ege.edu.ru" +
                "http://www.egesakha.ru" +
                "http://basicenglish.ru" +
                "http://philosophiya.ru" +
                "http://www.rcoi.net" +
                "http://www.irro.ru" +
                "https://www.ed.vseved.ru" +
                "https://www.znania.ru" +
                "https://www.detiplus.ru" +
                "https://www.obrazovan.ru" +
                "https://www.abiturcenter.ru" +
                "https://www.moscow-high.ru" +
                "https://www.astronet.ru" +
                "https://www.astrolab.ru" +
                "https://heritage.sai.msu.ru" +
                "https://www.m31.spb.ru" +
                "https://www.astro.websib.ru" +
                "https://www.space.vsi.ru" +
                "https://www.meteorite.narod.ru" +
                "https://moscowaleks.narod.ru" +
                "https://www.allplanets.ru" +
                "http://www.galspace.spb.ru" +
                "http://school.astro.spbu.ru" +
                "http://www.astrolib.ru" +
                "http://www.biodat.ru" +
                "http://www.floranimal.ru" +
                "http://www.kozlenkoa.narod.ru" +
                "http://www.biodan.narod.ru" +
                "http://www.biolog188.narod.ru" +
                "http://www.livt.net" +
                "http://learnbiology.narod.ru" +
                "http://med.claw.ru" +
                "http://www.palaeoentomolog.ru" +
                "http://evolution.powernet.ru" +
                "http://www.geosite.com.ru" +
                "http://www.rgo.ru" +
                "http://www.geografia.ru" +
                "http://geo-tur.narod.ru" +
                "http://uroki5.ru" +
                "http://www.karty.narod.ru" +
                "http://www.terrus.ru" +
                "http://afromberg.narod.ru" +
                "http://geo.metodist.ru" +
                "ftp://www.abc-english-grammar.com" +
                "ftp://www.fluent-english.ru" +
                "ftp://www.englishclub.narod.ru" +
                "ftp://lib.ru" +
                "ftp://englishaz.narod.ru" +
                "ftp://kinder-english.narod.ru" +
                "ftp://lessons.study.ru" +
                "ftp://uztranslations.net.ru" +
                "ftp://clubfr.narod.ru" +
                "ftp://www.toefl.ru" +
                "ftp://teach-learn.narod.ru" +
                "ftp://www.vzmakh.ru" +
                "ftp://www.computer-museum.ru" +
                "ftp://comp-science.narod.ru" +
                "ftp://lib.ru" +
                "http://infoschool.narod.ru" +
                "http://book.kbsu.ru" +
                "http://trushinov.chat.ru" +
                "http://www.nethistory.ru" +
                "http://www.edu-it.ru" +
                "http://ekochelaeva.narod.ru" +
                "http://www.child.ru" +
                "http://www.botik.ru" +
                "http://www.citforum.ru" +
                "http://www.sinf2000.narod.ru" +
                "http://inppt.ru" +
                "http://pofizike.ru" +
                "http://algolist.manual.ru" +
                "http://acm.timus.ru" +
                "http://inform-school.narod.ru" +
                "http://algorithm.narod.ru" +
                "http://www.mathprog.narod.ru" +
                "http://www.olympiads.ru" +
                "http://cyber-net.spb.ru" +
                "http://neerc.ifmo.ru" +
                "http://tests.academy.ru" +
                "http://www.junior.ru" +
                "http://www.ecdl.ru" +
                "http://pobeda.mosreg.ru" +
                "http://glory.rin.ru" +
                "http://www.1941-1945.ru" +
                "http://decemb.hobby.ru" +
                "http://www.warheroes.ru" +
                "http://www.moscowkremlin.ru" +
                "http://blokada.otrok.ru" +
                "http://www.praviteli.org" +
                "http://www.rkka.ru" +
                "http://battle.volgadmin.ru" +
                "http://www.oldgazette.ru" +
                "http://www.biografia.ru" +
                "http://www.worldhist.ru" +
                "http://www.1939-1945.net" +
                "http://www.ellada.spb.ru" +
                "http://www.ancienthistory.spb.ru" +
                "http://lesson-history.narod.ru" +
                "http://www.hrono.ru" +
                "http://www.bibliogid.ru" +
                "http://www.likt590.ru" +
                "http://skolakras.narod.ru" +
                "http://www.foxdesign.ru" +
                "http://edu-mipt.ru" +
                "http://likhachev.lfond.spb.ru" +
                "http://www.gercen.net.ru" +
                "http://www.dobrolyubov.net.ru" +
                "http://www.kuprin.org.ru" +
                "http://www.aleksandrpushkin.net.ru" +
                "http://www.saltykov.net.ru" +
                "http://www.antonchehov.org.ru" +
                "http://www.math.ru" +
                "http://www.mccme.ru" +
                "http://www.allmath.ru" +
                "http://eqworld.ipmnet.ru" +
                "http://graphfunk.narod.ru" +
                "http://comp-science.narod.ru" +
                "http://www.problems.ru" +
                "http://www.etudes.ru" +
                "http://www.mathtest.ru" +
                "http://school.msu.ru" +
                "http://www.mathprog.narod.ru" +
                "http://methmath.chat.ru" +
                "http://olympiads.mccme.ru" +
                "http://www.mathnet.spb.ru" +
                "http://www.ru" +
                "http://www.museum.ru" +
                "http://www.world-art.ru" +
                "http://petrov-gallery.narod.ru" +
                "http://www.museum-online.ru" +
                "http://www.tretyakov.ru" +
                "http://www.impressionism.ru" +
                "http://www.arthistory.ru" +
                "http://www.moscowkremlin.ru" +
                "http://www.cbook.ru" +
                "http://www.ilyarepin.org.ru" +
                "http://www.encspb.ru" +
                "http://www.gov.ru" +
                "http://www.president.kremlin.ru" +
                "http://economicus.ru" +
                "http://econom.nsc.ru" +
                "http://www.economics.ru" +
                "http://hsemacro.narod.ru" +
                "http://danur-w.narod.ru" +
                "http://www.hro.org" +
                "http://www.seprava.ru" +
                "http://afromberg.narod.ru" +
                "http://english-and-home.ru" +
                "http://www.mapryal.org" +
                "http://www.ru" +
                "http://www.ru" +
                "http://www.ropryal.ru" +
                "http://www.ivki.ru" +
                "http://slovesnik-oka.narod.ru" +
                "http://your-english.ru" +
                "http://www.school.mipt.ru" +
                "http://kvant.mccme.ru" +
                "http://ifilip.narod.ru" +
                "http://www.decoder.ru" +
                "http://www.phys.spb.ru" +
                "http://www.relativity.ru" +
                "http://physics03.narod.ru" +
                "http://physicomp.lipetsk.ru" +
                "http://www.elementy.ru" +
                "http://nuclphys.sinp.msu.ru" +
                "http://www.hemi.nsu.ru" +
                "http://belok-s.narod.ru" +
                "http://maratakm.narod.ru" +
                "http://www.fcpolimp.ru" +
                "http://www.lingvocat.com" +
                "http://all-met.narod.ru" +
                "http://rushim.ru" +
                "http://ege.karelia.ru" +
                "https://www.4egena100.info" +
                "https://www.udmedu.ru" +
                "https://www.sinncom.ru" +
                "https://www.beluno.ru" +
                "https://www.rost.ru" +
                "https://stat.edu.ru" +
                "https://www.informika.ru" +
                "https://www.fipi.ru" +
                "https://www.lexed.ru" +
                "https://www.ru" +
                "https://www.orenport.ru" +
                "https://www.infojournal.ru" +
                "https://www.academia-moscow.ru" +
                "https://www.aspectpress.ru" +
                "https://www.astpress-shkola.ru" +
                "https://www.ass21vek.ru" +
                "https://www.vaco.ru" +
                "https://www.vesmirbooks.ru" +
                "https://www.knigi-psychologia.com" +
                "https://www.dashkov.ru" +
                "https://www.drofa-sever.spb.ru" +
                "https://www.karapuz.com" +
                "http://www.karo.spb.ru" +
                "http://linka-press.ru" +
                "http://www.linguamedia.ru" +
                "http://www.martdon.ru" +
                "http://www.newwave.msk.ru" +
                "http://www.axis.ru" +
                "http://www.ucpva.ru" +
                "http://www.sup99.ru" +
                "http://www.speclit.spb.ru" +
                "http://abiturcenter.ru" +
                "http://www.ecolife.ru" +
                "http://www.dnevnik.ru" +
                "http://www.phoenixrostov.ru" +
                "http://www.flinta.ru" +
                "http://www.yantskaz.ru" +
                "http://www.ru" +
                "http://www.enas.ru" +
                "http://www.4-pu.ru" +
                "http://vernadsky.info" +
                "http://kvant.info/" +
                "http://teachpro.ru" +
                "http://akademius.narod.ru" +
                "http://www.astrotop.ru" +
                "http://www.astro.spbu.ru" +
                "http://www.astro.websib.ru" +
                "http://spacelife.narod.ru" +
                "http://www.meteorite.narod.ru" +
                "http://www.kosmofizika.ru" +
                "http://www.abitura.com" +
                "http://www.math.ru" +
                "http://www.mathnet.ru" +
                "http://ilib.mccme.ru" +
                "http://matematiku.ru" +
                "ftp://www.shevkin.ru" +
                "ftp://mat-game.narod.ru" +
                "ftp://kvant.mccme.ru" +
                "ftp://math.child.ru" +
                "ftp://muravin2007.narod.ru" +
                "ftp://sbiryukova.narod.ru" +
                "ftp://www.pms.ru" +
                "ftp://www.cnso.ru" +
                "ftp://www.mathprog.narod.ru" +
                "ftp://kpolyakov.narod.ru" +
                "ftp://psbatishev.narod.ru" +
                "ftp://comp-science.narod.ru" +
                "ftp://prohod.org" +
                "ftp://belok-s.narod.ru" +
                "ftp://biolka.narod.ru" +
                "ftp://bioword.narod.ru" +
                "ftp://learnbiology.narod.ru" +
                "ftp://darvinskiy.ru" +
                "ftp://www.dinosaur.ru" +
                "ftp://www.bigarctic.ru" +
                "ftp://zelenyshluz.narod.ru" +
                "ftp://zooex.baikal.ru" +
                "ftp://www.filin.vn.ua/" +
                "ftp://www.gepard.org/" +
                "ftp://dronisimo.chat.ru" +
                "ftp://www.anofdi.narod.ru" +
                "ftp://www.deserts.narod.ru" +
                "ftp://www.oopt.info/" +
                "ftp://paleobase.narod.ru" +
                "http://www.danki.ru" +
                "http://caelifera.narod.ru" +
                "http://www.biodiversity.ru" +
                "http://www.ecolife.ru" +
                "http://www.sci.aha.ru" +
                "http://www.abc.chemistry.bsu.by" +
                "http://classchem.narod.ru" +
                "http://n-t.ru" +
                "http://chemfiles.narod.ru" +
                "http://www.physchem.chimfak.rsu.ru" +
                "http://www.chemport.ru" +
                "http://www.himhelp.ru" +
                "http://atlantida.agava.ru" +
                "http://geo.web.ru" +
                "http://soils.narod.ru" +
                "http://www.meteoweb.ru" +
                "http://www.outdoors.ru" +
                "http://iklarin.narod.ru" +
                "http://www.myplanet-earth.com/" +
                "http://katastroffi.narod.ru" +
                "http://spelestology.narod.ru" +
                "http://chronicl.chat.ru" +
                "http://www.dnttm.ru" +
                "http://www.dm-centre.ru" +
                "http://www.dtdm.tomsk.ru" +
                "http://www.pioner-samara.ru" +
                "http://geoschool.web.ru" +
                "http://www.vvaschool.spb.ru" +
                "http://www.ecostudio.ru" +
                "http://www.school.mipt.ru" +
                "http://www.mgsun.ru" +
                "http://www.ku-obr.ru" +
                "http://www.child.ru" +
                "http://www.ru" +
                "http://www.komobr46.ru" +
                "http://phys.problems.ru" +
                "http://www.cdrm.ru" +
                "http://www.abiturcenter.ru" +
                "http://www.phtc.ru" +
                "http://www.cvr-mitino.ru" +
                "http://www.pilot-club.ru" +
                "http://www.eidos.ru" +
                "http://www.desc.ru" +
                "http://www.mccme.ru" +
                "http://moseco.narod.ru" +
                "http://schoolkey.onego.ru" +
                "http://yas.pl.ru" +
                "http://www.edu.yar.ru" +
                "http://www.svb-ffm.narod.ru" +
                "http://www.magmouse.ru" +
                "http://www.eduland.ru" +
                "http://ipo.spb.ru" +
                "http://www.rm.kirov.ru" +
                "http://vernadsky.info" +
                "http://konkurs.lgo.ru" +
                "http://www.olympiads.ru" +
                "http://neerc.ifmo.ru" +
                "http://www.cyber-net.spb.ru" +
                "http://physolymp.spb.ru" +
                "http://olympiads.mccme.ru" +
                "http://www.museum.ru" +
                "http://www.tretyakovgallery.ru" +
                "http://www.hermitage.ru" +
                "http://www.kreml.ru" +
                "http://www.cathedral.ru" +
                "http://www.ethnomuseum.ru" +
                "http://www.juniware.ru" +
                "http://www.klsh.ru" +
                "http://www.lmsh.ru" +
                "http://www.nortland.ru" +
                "http://www.mccme.ru" +
                "http://www.artek.org" +
                "http://www.fizlesh.ru" +
                "http://www.gmsib.ru" +
                "http://www.gimn6.ru" +
                "http://blockly.ru" +
                "http://sc64.ucoz.ru" +
                "http://www.gymnasium99.ru" +
                "http://www.gym1517.ru" +
                "http://www.gogi1516.ru" +
                "http://www.zemgym.ru" +
                "http://www.kpml.ru" +
                "http://lyceum1.perm.ru" +
                "http://www.1511.ru" +
                "http://www.lien.ru" +
                "http://www.school.ioffe.ru" +
                "http://www.1543.ru" +
                "http://www.school-1.ru" +
                "http://www.gymnasia-radonezh.ru" +
                "http://www.pms.ru" +
                "http://www.nanomil.ru" +
                "http://www.lic36.narod.ru" +
                "http://www.1580.ru" +
                "http://www.mhs548.ru" +
                "http://www.prioritet-school.ru" +
                "http://g1522.msk.ru" +
                "http://chinese-school11.msk.ru" +
                "http://www.chuvbook.ru" +
                "http://www.infojournal.ru" +
                "http://www.ecolife.ru" +
                "http://www.textbook.ru" +
                "http://www.altaydon.ru" +
                "http://www.ckbib.ru" +
                "http://www.abiturcenter.ru" +
                "http://www.book.ru" +
                "http://www.licey-kniga.ru" +
                "http://www.master-kniga.ru" +
                "http://www.moscowbooks.ru" +
                "http://www.mdk-arbat.ru" +
                "http://www.obrazpro.ru" +
                "http://www.td-shkolnik.com" +
                "https://booksshop.ru" +
                "http://www.mistral.ru" +
                "http://my-shop.ru" +
                "http://www.vashakniga.ru" +
                "http://litera.by" +
                "http://www.ru" +
                "http://www.slovobook.ru" +
                "http://www.bookler.ru" +
                "http://www.findbook.ru" +
                "http://ruthenia.ru" +
                "http://www.slovari.ru" +
                "http://www.artint.ru" +
                "http://vasmer.narod.ru" +
                "http://www.aot.ru" +
                "http://www.blues.ru" +
                "http://dop.ui-miit.ru" +
                "http://www.philol.msu.ru" +
                "http://www.rm.kirov.ru" +
                "http://www.ed-today.ru" +
                "http://uhtk59.ru" +
                "http://www.stengazeta.net" +
                "http://evartist.narod.ru" +
                "http://www.gramota.ru" +
                "http://bukinist.agava.ru" +
                "http://www.zorich.ru" +
                "http://levin.rinet.ru" +
                "http://www.kivinov.ru" +
                "http://www.akonstantinov.spb.ru" +
                "http://www.akunin.ru" +
                "http://www.frei.ru" +
                "https://www.fa.ru" +
                "https://www.vavilon.ru" +
                "https://www.pereplet.ru" +
                "https://otblesk.com/vysotsky" +
                "https://br00.narod.ru" +
                "https://www.crea.ru" +
                "https://mndlstam.chat.ru" +
                "http://malinsk.narod.ru" +
                "http://www.poezia.ru" +
                "http://www.ru" +
                "http://www.yabloko.ru" +
                "http://www.loc.gov/index.html" +
                "http://www.zeitungen.de" +
                "http://www.eslcafe.com/" +
                "http://www.reward.ru" +
                "http://lessons.study.ru" +
                "http://www.unil.ch/fra" +
                "http://www.fokus.msn.de" +
                "http://www.smirnova.net/" +
                "http://www.virtualfreesites.com/world.travel.html" +
                "http://www.classical.ru" +
                "http://www.abcgallery.com/" +
                "http://dop-obrazovanie.com/" +
                "http://www.cnso.ru" +
                "http://www.smallbay.ru" +
                "http://kizhi.karelia.ru" +
                "http://m-buanarroti.narod.ru" +
                "http://www.bards.ru" +
                "http://www.fondcultura.ru" +
                "http://www.varvar.ru" +
                "http://www.picturesrembrandt.org/" +
                "http://omu.ru" +
                "http://www.memo.ru" +
                "http://www.museum.ru" +
                "http://www.pish.ru" +
                "http://schoolart.narod.ru" +
                "http://www.koob.ru" +
                "http://www.childsoc.ru" +
                "http://www.supcourt.ru" +
                "http://genproc.gov.ru" +
                "http://www.ug.ru" +
                "http://www.hrights.ru" +
                "http://www.akdi.ru" +
                "http://www.akdi.ru" +
                "http://www.akdi.ru" +
                "http://www.memo.ru" +
                "ftp://www.childsoc.ru" +
                "ftp://vshdo.ru" +
                "ftp://www.zonaprav.ru" +
                "ftp://www.parlament-club.ru" +
                "ftp://www.praviteli.org" +
                "ftp://pravosoznanie.chel.org/" +
                "ftp://www.prodemo.ru" +
                "ftp://www.ug.ru" +
                "ftp://www.cikrf.ru" +
                "ftp://urfak.petrsu.ru" +
                "ftp://www.president.kremlin.ru" +
                "ftp://www.gov.ru" +
                "ftp://www.mid.ru" +
                "ftp://www.fas.gov.ru" +
                "http://www.fss.ru" +
                "http://www.wto.ru" +
                "http://www.zonaprav.ru" +
                "https://www.cbr.ru" +
                "http://www.chemfive.ru" +
                "http://www.akdi.ru" +
                "http://www.rbc.ru" +
                "http://www.yellowpagesrussia.ru" +
                "http://www.lib.ru" +
                "http://www.hist.msu.ru" +
                "http://virlib.eunnet.net" +
                "http://www.cbook.ru" +
                "http://www.sci.aha.ru" +
                "http://www.ymk.ru" +
                "http://www.cosmoschool.ru" +
                "http://www.khspu.ru" +
                "ftp://rsa.iso.karelia.ru" +
                "http://zaochn.mccme.ru" +
                "http://edutula.ru" +
                "http://sms-informator.ru" +
                "http://schoolmit.ru" +
                "http://uisrussia.msu.ru" +
                "https://kam-edu.ru" +
                "http://englishpost.ru" +
                "http://www.obe.ru" +
                "http://socobraz.ru" +
                "http://www.kyshtovgrad.ru" +
                "https://realstudy.ru" +
                "http://romanova-school.ru" +
                "http://www.e-parta.ru" +
                "http://langbridge.ru" +
                "https://www.tegec.ru" +
                "http://www.prodoski.ru" +
                "http://pl74.net" +
                "http://accounts.google.com" +
                "http://www.academkin.ru" +
                "https://sokolova-aa.ru" +
                "http://Lelang.ru" +
                "http://www.statgrad.org" +
                "http://babla.ru" +
                "http://tutorweb.ru" +
                "ftp://math.hashcode.ru" +
                "http://www.piligrim.com/" +
                "http://cdt.gidrotorf.org" +
                "http://www.toonto.ru" +
                "http://www.junradio.com" +
                "http://ouhmao.ru" +
                "http://poluroka.ru" +
                "http://english-mania.ru" +
                "http://xn----7sbbtociiwedaloc9a2a7bv2n.xn--p1ai/" +
                "http://www.spaces.ru" +
                "http://www.erudyt.ru" +
                "http://www.fipi.ru" +
                "http://epicon.ru" +
                "http://www.linguahouse.ru" +
                "http://zvzd3d.ru" +
                "http://www.shelk-put.com" +
                "ftp://testmath.ru" +
                "http://reword.org" +
                "http://www.ed.vseved.ru" +
                "http://prutzkow.com/numbers/" +
                "https://www.reg.ru" +
                "ftp://cleve.ru" +
                "http://1sg.ru" +
                "https://water-rf.ru" +
                "ftp://lang-land.com/";


        String protocol = "((http)|(https)|(ftp))";
        String domain = "((ru)|(com)|(org)|(net))";

        Pattern pattern = Pattern.compile(protocol + "(://)(\\S+?\\.)+?" + domain);
        Matcher matcher = pattern.matcher(urls);

        String[] arrayDomain = new String[]{"ru", "com", "org", "net"};
        String[] arrayProtocol = new String[]{"http", "https", "ftp"};

        Map<String, Integer> domains = new HashMap<>();
        Map<String, Integer> protocols = new HashMap<>();

        int count = 0;

        while (matcher.find()) {
            count++;
            for (int i = 0; i < 4; i++) {
                if (matcher.group(i + 8) != null) {
                    if (domains.containsKey(arrayDomain[i])) {
                        domains.put(arrayDomain[i], domains.get(arrayDomain[i]) + 1);
                    } else {
                        domains.put(arrayDomain[i], 1);
                    }
                }
            }
            for (int i = 0; i < 3; i++) {
                if (matcher.group(i + 2) != null) {
                    if (protocols.containsKey(arrayProtocol[i])) {
                        protocols.put(arrayProtocol[i], protocols.get(arrayProtocol[i]) + 1);
                    } else {
                        protocols.put(arrayProtocol[i], 1);
                    }
                }
            }

        }

//        System.out.println("Всего urls: " + count);
        System.out.println("<<TOPS>>\n_______\n protocol:");
        protocols.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed())
                .forEach(System.out::println);
        System.out.println("_________\n domain: ");
        domains.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed())
                .forEach(System.out::println);
        //про национальные не понял
    }
}