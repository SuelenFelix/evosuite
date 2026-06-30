package icu.samnyan.aqua.sega.maimai2.model.userdata;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserExtend_getSelectMusicId_15832377733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143189;

    public UserExtend_getSelectMusicId_15832377733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term143195 = new Long(-2955854401507097864L);
        Integer term143258 = new Integer(234306621);
        ArrayList term143256 = new ArrayList();
        ((ArrayList) term143256).add(term143258);
        Integer term143264 = new Integer(1025525602);
        ArrayList term143262 = new ArrayList();
        ((ArrayList) term143262).add(term143264);
        Integer term143548 = new Integer(1669406334);
        Integer term143550 = new Integer(-780862464);
        Integer term143552 = new Integer(2014099129);
        Integer term143554 = new Integer(-1024382698);
        ArrayList term143546 = new ArrayList();
        ((ArrayList) term143546).add(term143548);
        ((ArrayList) term143546).add(term143550);
        ((ArrayList) term143546).add(term143552);
        ((ArrayList) term143546).add(term143554);
        ArrayList term143558 = new ArrayList();
        term143189 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        Object term143191 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term143193 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term143209 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143210 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143214 = newInstance(Class.forName("java.time.LocalTime"));
        Object term143219 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143220 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143224 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term143189, term143189.getClass(), "id", 4916484987595412942L);
        setLongField(term143191, term143191.getClass(), "id", 1694006504988171543L);
        setLongField(term143193, term143193.getClass(), "id", 6240836714377799088L);
        setField(term143193, term143193.getClass(), "extId", term143195);
        setField(term143193, term143193.getClass(), "luid", "ZaImFGAzCz");
        setIntField(term143210, term143210.getClass(), "year", 2021);
        setShortField(term143210, term143210.getClass(), "month", (short) 5);
        setShortField(term143210, term143210.getClass(), "day", (short) 7);
        setField(term143209, term143209.getClass(), "date", term143210);
        setByteField(term143214, term143214.getClass(), "hour", (byte) 16);
        setByteField(term143214, term143214.getClass(), "minute", (byte) 55);
        setByteField(term143214, term143214.getClass(), "second", (byte) 11);
        setIntField(term143214, term143214.getClass(), "nano", 243196047);
        setField(term143209, term143209.getClass(), "time", term143214);
        setField(term143193, term143193.getClass(), "registerTime", term143209);
        setIntField(term143220, term143220.getClass(), "year", 2023);
        setShortField(term143220, term143220.getClass(), "month", (short) 8);
        setShortField(term143220, term143220.getClass(), "day", (short) 23);
        setField(term143219, term143219.getClass(), "date", term143220);
        setByteField(term143224, term143224.getClass(), "hour", (byte) 12);
        setByteField(term143224, term143224.getClass(), "minute", (byte) 18);
        setByteField(term143224, term143224.getClass(), "second", (byte) 57);
        setIntField(term143224, term143224.getClass(), "nano", 764903264);
        setField(term143219, term143219.getClass(), "time", term143224);
        setField(term143193, term143193.getClass(), "accessTime", term143219);
        setField(term143191, term143191.getClass(), "card", term143193);
        setField(term143191, term143191.getClass(), "userName", "lkySuzJAZx");
        setIntField(term143191, term143191.getClass(), "isNetMember", -2004923949);
        setIntField(term143191, term143191.getClass(), "iconId", 1462015503);
        setIntField(term143191, term143191.getClass(), "plateId", 1329564508);
        setIntField(term143191, term143191.getClass(), "titleId", 1294433705);
        setIntField(term143191, term143191.getClass(), "partnerId", -1348634231);
        setIntField(term143191, term143191.getClass(), "frameId", -1188666831);
        setIntField(term143191, term143191.getClass(), "selectMapId", 1782059615);
        setIntField(term143191, term143191.getClass(), "totalAwake", 53804926);
        setIntField(term143191, term143191.getClass(), "gradeRating", -1667170549);
        setIntField(term143191, term143191.getClass(), "musicRating", -482792210);
        setIntField(term143191, term143191.getClass(), "playerRating", -206765569);
        setIntField(term143191, term143191.getClass(), "highestRating", -1371614953);
        setIntField(term143191, term143191.getClass(), "gradeRank", 1919582876);
        setIntField(term143191, term143191.getClass(), "classRank", -1180179163);
        setIntField(term143191, term143191.getClass(), "courseRank", 1145136743);
        setField(term143191, term143191.getClass(), "charaSlot", term143256);
        setField(term143191, term143191.getClass(), "charaLockSlot", term143262);
        setLongField(term143191, term143191.getClass(), "contentBit", -8873620250963771859L);
        setIntField(term143191, term143191.getClass(), "playCount", 1587227439);
        setField(term143191, term143191.getClass(), "eventWatchedDate", "SzCYINBfMP");
        setField(term143191, term143191.getClass(), "lastGameId", "SZxGdkheQC");
        setField(term143191, term143191.getClass(), "lastRomVersion", "ezHsVprTGp");
        setField(term143191, term143191.getClass(), "lastDataVersion", "LYGBvfTqST");
        setField(term143191, term143191.getClass(), "lastLoginDate", "SUHmXgYhGj");
        setField(term143191, term143191.getClass(), "lastPlayDate", "cYhJgiPexe");
        setIntField(term143191, term143191.getClass(), "lastPlayCredit", -118801642);
        setIntField(term143191, term143191.getClass(), "lastPlayMode", -1584878256);
        setIntField(term143191, term143191.getClass(), "lastPlaceId", -1322460687);
        setField(term143191, term143191.getClass(), "lastPlaceName", "zIofafmnvq");
        setIntField(term143191, term143191.getClass(), "lastAllNetId", -1227589816);
        setIntField(term143191, term143191.getClass(), "lastRegionId", -2138540955);
        setField(term143191, term143191.getClass(), "lastRegionName", "TUlaPxQqxL");
        setField(term143191, term143191.getClass(), "lastClientId", "wJwrAJjLHN");
        setField(term143191, term143191.getClass(), "lastCountryCode", "gSRycxEfPs");
        setIntField(term143191, term143191.getClass(), "lastSelectEMoney", 1205424873);
        setIntField(term143191, term143191.getClass(), "lastSelectTicket", -1362218312);
        setIntField(term143191, term143191.getClass(), "lastSelectCourse", -931123286);
        setIntField(term143191, term143191.getClass(), "lastCountCourse", -225670855);
        setField(term143191, term143191.getClass(), "firstGameId", "GbkbXMhBtB");
        setField(term143191, term143191.getClass(), "firstRomVersion", "STgtLenzXP");
        setField(term143191, term143191.getClass(), "firstDataVersion", "pnHopfEgPj");
        setField(term143191, term143191.getClass(), "firstPlayDate", "iJGTSezGOP");
        setField(term143191, term143191.getClass(), "compatibleCmVersion", "cYJhSeWnSi");
        setField(term143191, term143191.getClass(), "dailyBonusDate", "qzKzPGJuGS");
        setField(term143191, term143191.getClass(), "dailyCourseBonusDate", "sqSrNLvGGR");
        setField(term143191, term143191.getClass(), "lastPairLoginDate", "qTeNEZoQMq");
        setField(term143191, term143191.getClass(), "lastTrialPlayDate", "lsfFhJHsOw");
        setIntField(term143191, term143191.getClass(), "playVsCount", 1809930249);
        setIntField(term143191, term143191.getClass(), "playSyncCount", 742585707);
        setIntField(term143191, term143191.getClass(), "winCount", -665502806);
        setIntField(term143191, term143191.getClass(), "helpCount", 1816216567);
        setIntField(term143191, term143191.getClass(), "comboCount", -1787268270);
        setLongField(term143191, term143191.getClass(), "totalDeluxscore", -1472323836689877922L);
        setLongField(term143191, term143191.getClass(), "totalBasicDeluxscore", 7622376820753838488L);
        setLongField(term143191, term143191.getClass(), "totalAdvancedDeluxscore", 8351327195058320289L);
        setLongField(term143191, term143191.getClass(), "totalExpertDeluxscore", -1243769387042129320L);
        setLongField(term143191, term143191.getClass(), "totalMasterDeluxscore", 2444421751746962057L);
        setLongField(term143191, term143191.getClass(), "totalReMasterDeluxscore", -6752863710428340080L);
        setIntField(term143191, term143191.getClass(), "totalSync", 612540772);
        setIntField(term143191, term143191.getClass(), "totalBasicSync", 664095791);
        setIntField(term143191, term143191.getClass(), "totalAdvancedSync", 1805310704);
        setIntField(term143191, term143191.getClass(), "totalExpertSync", 1348119055);
        setIntField(term143191, term143191.getClass(), "totalMasterSync", -1042667016);
        setIntField(term143191, term143191.getClass(), "totalReMasterSync", -1341064078);
        setLongField(term143191, term143191.getClass(), "totalAchievement", -1428303263489085003L);
        setLongField(term143191, term143191.getClass(), "totalBasicAchievement", -8729285495352788630L);
        setLongField(term143191, term143191.getClass(), "totalAdvancedAchievement", -4131346277258860590L);
        setLongField(term143191, term143191.getClass(), "totalExpertAchievement", -5617062546218022600L);
        setLongField(term143191, term143191.getClass(), "totalMasterAchievement", -2165346898713982368L);
        setLongField(term143191, term143191.getClass(), "totalReMasterAchievement", -6074191035520916517L);
        setLongField(term143191, term143191.getClass(), "playerOldRating", 9136522293174537916L);
        setLongField(term143191, term143191.getClass(), "playerNewRating", -5973888354917585048L);
        setIntField(term143191, term143191.getClass(), "banState", -1088816172);
        setLongField(term143191, term143191.getClass(), "dateTime", -6749144750536665254L);
        setField(term143189, term143189.getClass(), "user", term143191);
        setIntField(term143189, term143189.getClass(), "selectMusicId", -1935578983);
        setIntField(term143189, term143189.getClass(), "selectDifficultyId", 1905602832);
        setIntField(term143189, term143189.getClass(), "categoryIndex", -431572220);
        setIntField(term143189, term143189.getClass(), "musicIndex", 972986984);
        setIntField(term143189, term143189.getClass(), "extraFlag", -1542767364);
        setIntField(term143189, term143189.getClass(), "selectScoreType", -597174536);
        setLongField(term143189, term143189.getClass(), "extendContentBit", 3914568255612611848L);
        setBooleanField(term143189, term143189.getClass(), "isPhotoAgree", true);
        setBooleanField(term143189, term143189.getClass(), "isGotoCodeRead", true);
        setBooleanField(term143189, term143189.getClass(), "selectResultDetails", false);
        setIntField(term143189, term143189.getClass(), "sortCategorySetting", -23544043);
        setIntField(term143189, term143189.getClass(), "sortMusicSetting", -1186171274);
        setField(term143189, term143189.getClass(), "selectedCardList", term143546);
        setField(term143189, term143189.getClass(), "encountMapNpcList", term143558);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectMusicId", argTypes, term143189, args);
    }

};


