package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserKop_setAuthKey_164448617612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276804;

    public UserKop_setAuthKey_164448617612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term276810 = new Long(678465732474023847L);
        term276804 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        Object term276806 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term276808 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term276824 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term276825 = newInstance(Class.forName("java.time.LocalDate"));
        Object term276829 = newInstance(Class.forName("java.time.LocalTime"));
        Object term276834 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term276835 = newInstance(Class.forName("java.time.LocalDate"));
        Object term276839 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term276804, term276804.getClass(), "id", 1267172445594907739L);
        setLongField(term276806, term276806.getClass(), "id", 1326306072560235410L);
        setLongField(term276808, term276808.getClass(), "id", -5597819678251025282L);
        setField(term276808, term276808.getClass(), "extId", term276810);
        setField(term276808, term276808.getClass(), "luid", "pbdmztefxU");
        setIntField(term276825, term276825.getClass(), "year", 2012);
        setShortField(term276825, term276825.getClass(), "month", (short) 11);
        setShortField(term276825, term276825.getClass(), "day", (short) 1);
        setField(term276824, term276824.getClass(), "date", term276825);
        setByteField(term276829, term276829.getClass(), "hour", (byte) 8);
        setByteField(term276829, term276829.getClass(), "minute", (byte) 55);
        setByteField(term276829, term276829.getClass(), "second", (byte) 17);
        setIntField(term276829, term276829.getClass(), "nano", 9669014);
        setField(term276824, term276824.getClass(), "time", term276829);
        setField(term276808, term276808.getClass(), "registerTime", term276824);
        setIntField(term276835, term276835.getClass(), "year", 2019);
        setShortField(term276835, term276835.getClass(), "month", (short) 2);
        setShortField(term276835, term276835.getClass(), "day", (short) 18);
        setField(term276834, term276834.getClass(), "date", term276835);
        setByteField(term276839, term276839.getClass(), "hour", (byte) 2);
        setByteField(term276839, term276839.getClass(), "minute", (byte) 58);
        setByteField(term276839, term276839.getClass(), "second", (byte) 45);
        setIntField(term276839, term276839.getClass(), "nano", 485835688);
        setField(term276834, term276834.getClass(), "time", term276839);
        setField(term276808, term276808.getClass(), "accessTime", term276834);
        setField(term276806, term276806.getClass(), "card", term276808);
        setField(term276806, term276806.getClass(), "userName", "PuJpvbpDKR");
        setIntField(term276806, term276806.getClass(), "level", -1729704168);
        setIntField(term276806, term276806.getClass(), "reincarnationNum", 1241252702);
        setLongField(term276806, term276806.getClass(), "exp", -6585874542840453228L);
        setLongField(term276806, term276806.getClass(), "point", 7031143339427626397L);
        setLongField(term276806, term276806.getClass(), "totalPoint", -8745420300857447317L);
        setIntField(term276806, term276806.getClass(), "playCount", 882120045);
        setIntField(term276806, term276806.getClass(), "jewelCount", -1734009796);
        setIntField(term276806, term276806.getClass(), "totalJewelCount", -1222260900);
        setIntField(term276806, term276806.getClass(), "medalCount", -1352047391);
        setIntField(term276806, term276806.getClass(), "playerRating", -1386981120);
        setIntField(term276806, term276806.getClass(), "highestRating", 1663576476);
        setIntField(term276806, term276806.getClass(), "battlePoint", 2099451652);
        setIntField(term276806, term276806.getClass(), "bestBattlePoint", 625456249);
        setIntField(term276806, term276806.getClass(), "overDamageBattlePoint", 1362447449);
        setBooleanField(term276806, term276806.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term276806, term276806.getClass(), "nameplateId", -933803674);
        setIntField(term276806, term276806.getClass(), "trophyId", -1916802044);
        setIntField(term276806, term276806.getClass(), "cardId", 2096433637);
        setIntField(term276806, term276806.getClass(), "characterId", 2092295726);
        setIntField(term276806, term276806.getClass(), "characterVoiceNo", -1325848090);
        setIntField(term276806, term276806.getClass(), "tabSetting", -275376863);
        setIntField(term276806, term276806.getClass(), "tabSortSetting", 1486576583);
        setIntField(term276806, term276806.getClass(), "cardCategorySetting", 1196365284);
        setIntField(term276806, term276806.getClass(), "cardSortSetting", -1296052345);
        setIntField(term276806, term276806.getClass(), "rivalScoreCategorySetting", -1741342336);
        setIntField(term276806, term276806.getClass(), "playedTutorialBit", 144712107);
        setIntField(term276806, term276806.getClass(), "firstTutorialCancelNum", -348432573);
        setLongField(term276806, term276806.getClass(), "sumTechHighScore", -64040951972752402L);
        setLongField(term276806, term276806.getClass(), "sumTechBasicHighScore", -6870108559944732570L);
        setLongField(term276806, term276806.getClass(), "sumTechAdvancedHighScore", -8966235463418520956L);
        setLongField(term276806, term276806.getClass(), "sumTechExpertHighScore", 9000369246548657325L);
        setLongField(term276806, term276806.getClass(), "sumTechMasterHighScore", 2104328216902636752L);
        setLongField(term276806, term276806.getClass(), "sumTechLunaticHighScore", -806817931626673057L);
        setLongField(term276806, term276806.getClass(), "sumBattleHighScore", 1321561475612142698L);
        setLongField(term276806, term276806.getClass(), "sumBattleBasicHighScore", -6311531409882138118L);
        setLongField(term276806, term276806.getClass(), "sumBattleAdvancedHighScore", 4515473697581549329L);
        setLongField(term276806, term276806.getClass(), "sumBattleExpertHighScore", -5412103189336277248L);
        setLongField(term276806, term276806.getClass(), "sumBattleMasterHighScore", 3043190021974849776L);
        setLongField(term276806, term276806.getClass(), "sumBattleLunaticHighScore", -7221455487734525482L);
        setField(term276806, term276806.getClass(), "eventWatchedDate", "aDywfjbiui");
        setField(term276806, term276806.getClass(), "cmEventWatchedDate", "sjLStQGrFs");
        setField(term276806, term276806.getClass(), "firstGameId", "YTNLhcKYKW");
        setField(term276806, term276806.getClass(), "firstRomVersion", "pSSwBgnrrm");
        setField(term276806, term276806.getClass(), "firstDataVersion", "CIecTelJYL");
        setField(term276806, term276806.getClass(), "firstPlayDate", "CRdlcDvmNm");
        setField(term276806, term276806.getClass(), "lastGameId", "KNCIEMtVHz");
        setField(term276806, term276806.getClass(), "lastRomVersion", "aHiCCXkIIc");
        setField(term276806, term276806.getClass(), "lastDataVersion", "nMtsxQIOdu");
        setField(term276806, term276806.getClass(), "compatibleCmVersion", "LndvtyUwdc");
        setField(term276806, term276806.getClass(), "lastPlayDate", "LnwCYOTQzr");
        setIntField(term276806, term276806.getClass(), "lastPlaceId", -790220684);
        setField(term276806, term276806.getClass(), "lastPlaceName", "EClPOOvOQZ");
        setIntField(term276806, term276806.getClass(), "lastRegionId", -1136429703);
        setField(term276806, term276806.getClass(), "lastRegionName", "pGQdokmFhs");
        setIntField(term276806, term276806.getClass(), "lastAllNetId", 1641910855);
        setField(term276806, term276806.getClass(), "lastClientId", "VzYfsmeeBD");
        setIntField(term276806, term276806.getClass(), "lastUsedDeckId", -931705492);
        setIntField(term276806, term276806.getClass(), "lastPlayMusicLevel", -1080465792);
        setIntField(term276806, term276806.getClass(), "lastEmoneyBrand", -1135972176);
        setField(term276804, term276804.getClass(), "user", term276806);
        setField(term276804, term276804.getClass(), "authKey", "HjqSzxKjga");
        setIntField(term276804, term276804.getClass(), "kopId", -2059730428);
        setIntField(term276804, term276804.getClass(), "areaId", -549676791);
        setIntField(term276804, term276804.getClass(), "totalTechScore", -156722358);
        setIntField(term276804, term276804.getClass(), "totalPlatinumScore", 284639590);
        setField(term276804, term276804.getClass(), "techRecordDate", "ZgNgomDQwE");
        setBooleanField(term276804, term276804.getClass(), "isTotalTechNewRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hjlLFUSUSr";
        callMethod(klass, "setAuthKey", argTypes, term276804, args);
    }

};


