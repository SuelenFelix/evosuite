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

public class UserExtend_setSortCategorySetting_179856458329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159300;
     Object term159685;

    public UserExtend_setSortCategorySetting_179856458329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term159306 = new Long(-88538481937688851L);
        Integer term159369 = new Integer(-123945804);
        Integer term159371 = new Integer(2133669766);
        ArrayList term159367 = new ArrayList();
        ((ArrayList) term159367).add(term159369);
        ((ArrayList) term159367).add(term159371);
        Integer term159377 = new Integer(-1423215684);
        Integer term159379 = new Integer(-1096652631);
        Integer term159381 = new Integer(1116810901);
        Integer term159383 = new Integer(1944430959);
        Integer term159385 = new Integer(98801346);
        Integer term159387 = new Integer(2133290622);
        Integer term159389 = new Integer(-164869996);
        ArrayList term159375 = new ArrayList();
        ((ArrayList) term159375).add(term159377);
        ((ArrayList) term159375).add(term159379);
        ((ArrayList) term159375).add(term159381);
        ((ArrayList) term159375).add(term159383);
        ((ArrayList) term159375).add(term159385);
        ((ArrayList) term159375).add(term159387);
        ((ArrayList) term159375).add(term159389);
        Integer term159673 = new Integer(1415001538);
        Integer term159675 = new Integer(1738077695);
        Integer term159677 = new Integer(-1351117314);
        ArrayList term159671 = new ArrayList();
        ((ArrayList) term159671).add(term159673);
        ((ArrayList) term159671).add(term159675);
        ((ArrayList) term159671).add(term159677);
        ArrayList term159681 = new ArrayList();
        term159300 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        Object term159302 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term159304 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term159320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term159321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term159325 = newInstance(Class.forName("java.time.LocalTime"));
        Object term159330 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term159331 = newInstance(Class.forName("java.time.LocalDate"));
        Object term159335 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term159300, term159300.getClass(), "id", 8447253874124151417L);
        setLongField(term159302, term159302.getClass(), "id", 576054595696591965L);
        setLongField(term159304, term159304.getClass(), "id", -1307471244279084505L);
        setField(term159304, term159304.getClass(), "extId", term159306);
        setField(term159304, term159304.getClass(), "luid", "CDXBhicnsV");
        setIntField(term159321, term159321.getClass(), "year", 2012);
        setShortField(term159321, term159321.getClass(), "month", (short) 7);
        setShortField(term159321, term159321.getClass(), "day", (short) 23);
        setField(term159320, term159320.getClass(), "date", term159321);
        setByteField(term159325, term159325.getClass(), "hour", (byte) 8);
        setByteField(term159325, term159325.getClass(), "minute", (byte) 33);
        setByteField(term159325, term159325.getClass(), "second", (byte) 50);
        setIntField(term159325, term159325.getClass(), "nano", 663997596);
        setField(term159320, term159320.getClass(), "time", term159325);
        setField(term159304, term159304.getClass(), "registerTime", term159320);
        setIntField(term159331, term159331.getClass(), "year", 2018);
        setShortField(term159331, term159331.getClass(), "month", (short) 5);
        setShortField(term159331, term159331.getClass(), "day", (short) 18);
        setField(term159330, term159330.getClass(), "date", term159331);
        setByteField(term159335, term159335.getClass(), "hour", (byte) 22);
        setByteField(term159335, term159335.getClass(), "minute", (byte) 7);
        setByteField(term159335, term159335.getClass(), "second", (byte) 58);
        setIntField(term159335, term159335.getClass(), "nano", 802311880);
        setField(term159330, term159330.getClass(), "time", term159335);
        setField(term159304, term159304.getClass(), "accessTime", term159330);
        setField(term159302, term159302.getClass(), "card", term159304);
        setField(term159302, term159302.getClass(), "userName", "BzaFlqnXjh");
        setIntField(term159302, term159302.getClass(), "isNetMember", 1699678944);
        setIntField(term159302, term159302.getClass(), "iconId", 397705958);
        setIntField(term159302, term159302.getClass(), "plateId", -2020526142);
        setIntField(term159302, term159302.getClass(), "titleId", -1006830210);
        setIntField(term159302, term159302.getClass(), "partnerId", -599874501);
        setIntField(term159302, term159302.getClass(), "frameId", -1593160251);
        setIntField(term159302, term159302.getClass(), "selectMapId", -2106831428);
        setIntField(term159302, term159302.getClass(), "totalAwake", 975763128);
        setIntField(term159302, term159302.getClass(), "gradeRating", 1330448484);
        setIntField(term159302, term159302.getClass(), "musicRating", 1167601196);
        setIntField(term159302, term159302.getClass(), "playerRating", 1489040264);
        setIntField(term159302, term159302.getClass(), "highestRating", 1289652116);
        setIntField(term159302, term159302.getClass(), "gradeRank", -1858752303);
        setIntField(term159302, term159302.getClass(), "classRank", 1593556104);
        setIntField(term159302, term159302.getClass(), "courseRank", -1885334834);
        setField(term159302, term159302.getClass(), "charaSlot", term159367);
        setField(term159302, term159302.getClass(), "charaLockSlot", term159375);
        setLongField(term159302, term159302.getClass(), "contentBit", 4099470012856890917L);
        setIntField(term159302, term159302.getClass(), "playCount", 2085947852);
        setField(term159302, term159302.getClass(), "eventWatchedDate", "GkpQCrijZx");
        setField(term159302, term159302.getClass(), "lastGameId", "IxKqBRlNhC");
        setField(term159302, term159302.getClass(), "lastRomVersion", "luSAqFzxeY");
        setField(term159302, term159302.getClass(), "lastDataVersion", "gHSquTdfrK");
        setField(term159302, term159302.getClass(), "lastLoginDate", "lwSNhfQGzI");
        setField(term159302, term159302.getClass(), "lastPlayDate", "MvvzPTyVSb");
        setIntField(term159302, term159302.getClass(), "lastPlayCredit", 1307739693);
        setIntField(term159302, term159302.getClass(), "lastPlayMode", -1344952093);
        setIntField(term159302, term159302.getClass(), "lastPlaceId", 275140854);
        setField(term159302, term159302.getClass(), "lastPlaceName", "aLyUXyVGbN");
        setIntField(term159302, term159302.getClass(), "lastAllNetId", 342655355);
        setIntField(term159302, term159302.getClass(), "lastRegionId", -553978498);
        setField(term159302, term159302.getClass(), "lastRegionName", "OHqCZWvTjl");
        setField(term159302, term159302.getClass(), "lastClientId", "UqemyfWxle");
        setField(term159302, term159302.getClass(), "lastCountryCode", "nhoRGmIXDW");
        setIntField(term159302, term159302.getClass(), "lastSelectEMoney", 617878322);
        setIntField(term159302, term159302.getClass(), "lastSelectTicket", -353426707);
        setIntField(term159302, term159302.getClass(), "lastSelectCourse", -253812858);
        setIntField(term159302, term159302.getClass(), "lastCountCourse", 712815497);
        setField(term159302, term159302.getClass(), "firstGameId", "jlNEkpWcyV");
        setField(term159302, term159302.getClass(), "firstRomVersion", "FKSbPLBPmr");
        setField(term159302, term159302.getClass(), "firstDataVersion", "LCslPgYXVZ");
        setField(term159302, term159302.getClass(), "firstPlayDate", "qOrFOOrfRo");
        setField(term159302, term159302.getClass(), "compatibleCmVersion", "QubZHCpfda");
        setField(term159302, term159302.getClass(), "dailyBonusDate", "OKkmdNRQTI");
        setField(term159302, term159302.getClass(), "dailyCourseBonusDate", "mMCbEcTRXT");
        setField(term159302, term159302.getClass(), "lastPairLoginDate", "EdRaWmJlWR");
        setField(term159302, term159302.getClass(), "lastTrialPlayDate", "idXxJetlwQ");
        setIntField(term159302, term159302.getClass(), "playVsCount", -1214671637);
        setIntField(term159302, term159302.getClass(), "playSyncCount", -1325475544);
        setIntField(term159302, term159302.getClass(), "winCount", 1004795738);
        setIntField(term159302, term159302.getClass(), "helpCount", -1747791244);
        setIntField(term159302, term159302.getClass(), "comboCount", -1374498853);
        setLongField(term159302, term159302.getClass(), "totalDeluxscore", -3403340174287273634L);
        setLongField(term159302, term159302.getClass(), "totalBasicDeluxscore", 6769911770463090345L);
        setLongField(term159302, term159302.getClass(), "totalAdvancedDeluxscore", -5006360652769891001L);
        setLongField(term159302, term159302.getClass(), "totalExpertDeluxscore", 6339968460314730005L);
        setLongField(term159302, term159302.getClass(), "totalMasterDeluxscore", 1051202900428385995L);
        setLongField(term159302, term159302.getClass(), "totalReMasterDeluxscore", 7911824389949685997L);
        setIntField(term159302, term159302.getClass(), "totalSync", -814553112);
        setIntField(term159302, term159302.getClass(), "totalBasicSync", 1599790039);
        setIntField(term159302, term159302.getClass(), "totalAdvancedSync", 1889930669);
        setIntField(term159302, term159302.getClass(), "totalExpertSync", -1483368907);
        setIntField(term159302, term159302.getClass(), "totalMasterSync", 1828188096);
        setIntField(term159302, term159302.getClass(), "totalReMasterSync", -1247504501);
        setLongField(term159302, term159302.getClass(), "totalAchievement", 529093208672644693L);
        setLongField(term159302, term159302.getClass(), "totalBasicAchievement", -2273969036758191240L);
        setLongField(term159302, term159302.getClass(), "totalAdvancedAchievement", 8467225225335859164L);
        setLongField(term159302, term159302.getClass(), "totalExpertAchievement", 9024458491641782107L);
        setLongField(term159302, term159302.getClass(), "totalMasterAchievement", -6117016617567898848L);
        setLongField(term159302, term159302.getClass(), "totalReMasterAchievement", 4842247741615837059L);
        setLongField(term159302, term159302.getClass(), "playerOldRating", -2533772733372888013L);
        setLongField(term159302, term159302.getClass(), "playerNewRating", -2417758228864199096L);
        setIntField(term159302, term159302.getClass(), "banState", 1466658826);
        setLongField(term159302, term159302.getClass(), "dateTime", -5856331080463916998L);
        setField(term159300, term159300.getClass(), "user", term159302);
        setIntField(term159300, term159300.getClass(), "selectMusicId", 994181101);
        setIntField(term159300, term159300.getClass(), "selectDifficultyId", -1812379052);
        setIntField(term159300, term159300.getClass(), "categoryIndex", 1506407459);
        setIntField(term159300, term159300.getClass(), "musicIndex", 1873066034);
        setIntField(term159300, term159300.getClass(), "extraFlag", 969867590);
        setIntField(term159300, term159300.getClass(), "selectScoreType", 779493218);
        setLongField(term159300, term159300.getClass(), "extendContentBit", 7407503809123627471L);
        setBooleanField(term159300, term159300.getClass(), "isPhotoAgree", true);
        setBooleanField(term159300, term159300.getClass(), "isGotoCodeRead", false);
        setBooleanField(term159300, term159300.getClass(), "selectResultDetails", true);
        setIntField(term159300, term159300.getClass(), "sortCategorySetting", -1446558435);
        setIntField(term159300, term159300.getClass(), "sortMusicSetting", -1399316678);
        setField(term159300, term159300.getClass(), "selectedCardList", term159671);
        setField(term159300, term159300.getClass(), "encountMapNpcList", term159681);
        term159685 = new Integer(-1519298903);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term159685;
        callMethod(klass, "setSortCategorySetting", argTypes, term159300, args);
    }

};


