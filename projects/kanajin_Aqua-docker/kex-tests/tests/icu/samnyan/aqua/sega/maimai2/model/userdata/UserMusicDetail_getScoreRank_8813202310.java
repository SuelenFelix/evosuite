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

public class UserMusicDetail_getScoreRank_8813202310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60743;

    public UserMusicDetail_getScoreRank_8813202310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term60749 = new Long(2135754395358000892L);
        Integer term60812 = new Integer(-317900470);
        Integer term60814 = new Integer(-979568);
        Integer term60816 = new Integer(-1422131197);
        Integer term60818 = new Integer(-20399281);
        Integer term60820 = new Integer(-830170410);
        Integer term60822 = new Integer(-1742790308);
        ArrayList term60810 = new ArrayList();
        ((ArrayList) term60810).add(term60812);
        ((ArrayList) term60810).add(term60814);
        ((ArrayList) term60810).add(term60816);
        ((ArrayList) term60810).add(term60818);
        ((ArrayList) term60810).add(term60820);
        ((ArrayList) term60810).add(term60822);
        Integer term60828 = new Integer(-1592093430);
        Integer term60830 = new Integer(1178214545);
        Integer term60832 = new Integer(-985334541);
        Integer term60834 = new Integer(-1870004228);
        Integer term60836 = new Integer(380484139);
        ArrayList term60826 = new ArrayList();
        ((ArrayList) term60826).add(term60828);
        ((ArrayList) term60826).add(term60830);
        ((ArrayList) term60826).add(term60832);
        ((ArrayList) term60826).add(term60834);
        ((ArrayList) term60826).add(term60836);
        term60743 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        Object term60745 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term60747 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term60763 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60764 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60768 = newInstance(Class.forName("java.time.LocalTime"));
        Object term60773 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60774 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60778 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term60743, term60743.getClass(), "id", -1702769190313660197L);
        setLongField(term60745, term60745.getClass(), "id", 4850987747626140720L);
        setLongField(term60747, term60747.getClass(), "id", 1805176718113697933L);
        setField(term60747, term60747.getClass(), "extId", term60749);
        setField(term60747, term60747.getClass(), "luid", "gNeMyGSVIG");
        setIntField(term60764, term60764.getClass(), "year", 2017);
        setShortField(term60764, term60764.getClass(), "month", (short) 6);
        setShortField(term60764, term60764.getClass(), "day", (short) 7);
        setField(term60763, term60763.getClass(), "date", term60764);
        setByteField(term60768, term60768.getClass(), "hour", (byte) 13);
        setByteField(term60768, term60768.getClass(), "minute", (byte) 52);
        setByteField(term60768, term60768.getClass(), "second", (byte) 17);
        setIntField(term60768, term60768.getClass(), "nano", 78180039);
        setField(term60763, term60763.getClass(), "time", term60768);
        setField(term60747, term60747.getClass(), "registerTime", term60763);
        setIntField(term60774, term60774.getClass(), "year", 2017);
        setShortField(term60774, term60774.getClass(), "month", (short) 6);
        setShortField(term60774, term60774.getClass(), "day", (short) 23);
        setField(term60773, term60773.getClass(), "date", term60774);
        setByteField(term60778, term60778.getClass(), "hour", (byte) 23);
        setByteField(term60778, term60778.getClass(), "minute", (byte) 29);
        setByteField(term60778, term60778.getClass(), "second", (byte) 17);
        setIntField(term60778, term60778.getClass(), "nano", 491252353);
        setField(term60773, term60773.getClass(), "time", term60778);
        setField(term60747, term60747.getClass(), "accessTime", term60773);
        setField(term60745, term60745.getClass(), "card", term60747);
        setField(term60745, term60745.getClass(), "userName", "qxEkaqdKPG");
        setIntField(term60745, term60745.getClass(), "isNetMember", -1752896);
        setIntField(term60745, term60745.getClass(), "iconId", -1202458563);
        setIntField(term60745, term60745.getClass(), "plateId", -974221589);
        setIntField(term60745, term60745.getClass(), "titleId", -167704667);
        setIntField(term60745, term60745.getClass(), "partnerId", -820617926);
        setIntField(term60745, term60745.getClass(), "frameId", -1871142929);
        setIntField(term60745, term60745.getClass(), "selectMapId", -1594964553);
        setIntField(term60745, term60745.getClass(), "totalAwake", -1839071263);
        setIntField(term60745, term60745.getClass(), "gradeRating", 1247519674);
        setIntField(term60745, term60745.getClass(), "musicRating", -460205484);
        setIntField(term60745, term60745.getClass(), "playerRating", -1144163240);
        setIntField(term60745, term60745.getClass(), "highestRating", 2135238175);
        setIntField(term60745, term60745.getClass(), "gradeRank", -407365393);
        setIntField(term60745, term60745.getClass(), "classRank", 1408195458);
        setIntField(term60745, term60745.getClass(), "courseRank", 1129173756);
        setField(term60745, term60745.getClass(), "charaSlot", term60810);
        setField(term60745, term60745.getClass(), "charaLockSlot", term60826);
        setLongField(term60745, term60745.getClass(), "contentBit", 8453512367875425981L);
        setIntField(term60745, term60745.getClass(), "playCount", 267573446);
        setField(term60745, term60745.getClass(), "eventWatchedDate", "VclIptmKrF");
        setField(term60745, term60745.getClass(), "lastGameId", "wcTeSHCZwz");
        setField(term60745, term60745.getClass(), "lastRomVersion", "fxxnbYOiZZ");
        setField(term60745, term60745.getClass(), "lastDataVersion", "CTnRYaYXia");
        setField(term60745, term60745.getClass(), "lastLoginDate", "SUIYUFtCCe");
        setField(term60745, term60745.getClass(), "lastPlayDate", "eKCrPCkedw");
        setIntField(term60745, term60745.getClass(), "lastPlayCredit", -1319954987);
        setIntField(term60745, term60745.getClass(), "lastPlayMode", 701324276);
        setIntField(term60745, term60745.getClass(), "lastPlaceId", -2141408767);
        setField(term60745, term60745.getClass(), "lastPlaceName", "VAFSknHLsZ");
        setIntField(term60745, term60745.getClass(), "lastAllNetId", 2033366485);
        setIntField(term60745, term60745.getClass(), "lastRegionId", 688731975);
        setField(term60745, term60745.getClass(), "lastRegionName", "MamzBtwhiz");
        setField(term60745, term60745.getClass(), "lastClientId", "wVOypfVLsP");
        setField(term60745, term60745.getClass(), "lastCountryCode", "pEazBcUUWX");
        setIntField(term60745, term60745.getClass(), "lastSelectEMoney", 1198340749);
        setIntField(term60745, term60745.getClass(), "lastSelectTicket", -385710681);
        setIntField(term60745, term60745.getClass(), "lastSelectCourse", 1624133267);
        setIntField(term60745, term60745.getClass(), "lastCountCourse", -1547947305);
        setField(term60745, term60745.getClass(), "firstGameId", "nlvRWrTxvz");
        setField(term60745, term60745.getClass(), "firstRomVersion", "isMKwgUmka");
        setField(term60745, term60745.getClass(), "firstDataVersion", "pDIyzhDtTy");
        setField(term60745, term60745.getClass(), "firstPlayDate", "wXiUlhXQoC");
        setField(term60745, term60745.getClass(), "compatibleCmVersion", "gKhmgJzimH");
        setField(term60745, term60745.getClass(), "dailyBonusDate", "OzRiWLVXNx");
        setField(term60745, term60745.getClass(), "dailyCourseBonusDate", "pktmgYsknu");
        setField(term60745, term60745.getClass(), "lastPairLoginDate", "SsMHzYNeji");
        setField(term60745, term60745.getClass(), "lastTrialPlayDate", "wzAFLFdaEQ");
        setIntField(term60745, term60745.getClass(), "playVsCount", -919225635);
        setIntField(term60745, term60745.getClass(), "playSyncCount", -1044514554);
        setIntField(term60745, term60745.getClass(), "winCount", 35189099);
        setIntField(term60745, term60745.getClass(), "helpCount", -1399937823);
        setIntField(term60745, term60745.getClass(), "comboCount", 1439151010);
        setLongField(term60745, term60745.getClass(), "totalDeluxscore", -5710142537128696043L);
        setLongField(term60745, term60745.getClass(), "totalBasicDeluxscore", 3423802125971060085L);
        setLongField(term60745, term60745.getClass(), "totalAdvancedDeluxscore", -4876190539375195221L);
        setLongField(term60745, term60745.getClass(), "totalExpertDeluxscore", -5262639910779325902L);
        setLongField(term60745, term60745.getClass(), "totalMasterDeluxscore", 6267421205498097015L);
        setLongField(term60745, term60745.getClass(), "totalReMasterDeluxscore", 2972970902155476483L);
        setIntField(term60745, term60745.getClass(), "totalSync", 520109121);
        setIntField(term60745, term60745.getClass(), "totalBasicSync", -1374704112);
        setIntField(term60745, term60745.getClass(), "totalAdvancedSync", 1603677150);
        setIntField(term60745, term60745.getClass(), "totalExpertSync", -926340720);
        setIntField(term60745, term60745.getClass(), "totalMasterSync", -1134329349);
        setIntField(term60745, term60745.getClass(), "totalReMasterSync", -1590495256);
        setLongField(term60745, term60745.getClass(), "totalAchievement", -6060448108932211661L);
        setLongField(term60745, term60745.getClass(), "totalBasicAchievement", -4280668709580845965L);
        setLongField(term60745, term60745.getClass(), "totalAdvancedAchievement", -8669140240741599474L);
        setLongField(term60745, term60745.getClass(), "totalExpertAchievement", -1131029419147589872L);
        setLongField(term60745, term60745.getClass(), "totalMasterAchievement", -5753794060274661933L);
        setLongField(term60745, term60745.getClass(), "totalReMasterAchievement", -631692052300282581L);
        setLongField(term60745, term60745.getClass(), "playerOldRating", -2145666439433256886L);
        setLongField(term60745, term60745.getClass(), "playerNewRating", 4364197754861747163L);
        setIntField(term60745, term60745.getClass(), "banState", 1804035317);
        setLongField(term60745, term60745.getClass(), "dateTime", -2350743764086921250L);
        setField(term60743, term60743.getClass(), "user", term60745);
        setIntField(term60743, term60743.getClass(), "musicId", -1627336108);
        setIntField(term60743, term60743.getClass(), "level", -70819831);
        setIntField(term60743, term60743.getClass(), "playCount", 1601014438);
        setIntField(term60743, term60743.getClass(), "achievement", -1549492777);
        setIntField(term60743, term60743.getClass(), "comboStatus", -1166523434);
        setIntField(term60743, term60743.getClass(), "syncStatus", -1459222679);
        setIntField(term60743, term60743.getClass(), "deluxscoreMax", 91387193);
        setIntField(term60743, term60743.getClass(), "scoreRank", -457093173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScoreRank", argTypes, term60743, args);
    }

};


