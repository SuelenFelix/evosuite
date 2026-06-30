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

public class UserDetail_setDailyCourseBonusDate_994450580124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4300291;

    public UserDetail_setDailyCourseBonusDate_994450580124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4300295 = new Long(-6620434607349317470L);
        Integer term4300358 = new Integer(-909873191);
        Integer term4300360 = new Integer(-17106495);
        ArrayList term4300356 = new ArrayList();
        ((ArrayList) term4300356).add(term4300358);
        ((ArrayList) term4300356).add(term4300360);
        Integer term4300366 = new Integer(-1205540932);
        Integer term4300368 = new Integer(-1477355747);
        ArrayList term4300364 = new ArrayList();
        ((ArrayList) term4300364).add(term4300366);
        ((ArrayList) term4300364).add(term4300368);
        term4300291 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4300293 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4300309 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4300310 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4300314 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4300319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4300320 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4300324 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4300291, term4300291.getClass(), "id", -6860862789892269366L);
        setLongField(term4300293, term4300293.getClass(), "id", 7862006399581320719L);
        setField(term4300293, term4300293.getClass(), "extId", term4300295);
        setField(term4300293, term4300293.getClass(), "luid", "LsXzgBMVjU");
        setIntField(term4300310, term4300310.getClass(), "year", 2010);
        setShortField(term4300310, term4300310.getClass(), "month", (short) 11);
        setShortField(term4300310, term4300310.getClass(), "day", (short) 16);
        setField(term4300309, term4300309.getClass(), "date", term4300310);
        setByteField(term4300314, term4300314.getClass(), "hour", (byte) 2);
        setByteField(term4300314, term4300314.getClass(), "minute", (byte) 11);
        setByteField(term4300314, term4300314.getClass(), "second", (byte) 5);
        setIntField(term4300314, term4300314.getClass(), "nano", 948994187);
        setField(term4300309, term4300309.getClass(), "time", term4300314);
        setField(term4300293, term4300293.getClass(), "registerTime", term4300309);
        setIntField(term4300320, term4300320.getClass(), "year", 2010);
        setShortField(term4300320, term4300320.getClass(), "month", (short) 9);
        setShortField(term4300320, term4300320.getClass(), "day", (short) 6);
        setField(term4300319, term4300319.getClass(), "date", term4300320);
        setByteField(term4300324, term4300324.getClass(), "hour", (byte) 1);
        setByteField(term4300324, term4300324.getClass(), "minute", (byte) 22);
        setByteField(term4300324, term4300324.getClass(), "second", (byte) 20);
        setIntField(term4300324, term4300324.getClass(), "nano", 16725146);
        setField(term4300319, term4300319.getClass(), "time", term4300324);
        setField(term4300293, term4300293.getClass(), "accessTime", term4300319);
        setField(term4300291, term4300291.getClass(), "card", term4300293);
        setField(term4300291, term4300291.getClass(), "userName", "vZTMFjWWmr");
        setIntField(term4300291, term4300291.getClass(), "isNetMember", -1309191450);
        setIntField(term4300291, term4300291.getClass(), "iconId", 658834914);
        setIntField(term4300291, term4300291.getClass(), "plateId", 2040160969);
        setIntField(term4300291, term4300291.getClass(), "titleId", -481273353);
        setIntField(term4300291, term4300291.getClass(), "partnerId", -26319341);
        setIntField(term4300291, term4300291.getClass(), "frameId", -948303712);
        setIntField(term4300291, term4300291.getClass(), "selectMapId", 1416389229);
        setIntField(term4300291, term4300291.getClass(), "totalAwake", -1321298434);
        setIntField(term4300291, term4300291.getClass(), "gradeRating", 1537332672);
        setIntField(term4300291, term4300291.getClass(), "musicRating", 1772188976);
        setIntField(term4300291, term4300291.getClass(), "playerRating", -834418767);
        setIntField(term4300291, term4300291.getClass(), "highestRating", 1911389865);
        setIntField(term4300291, term4300291.getClass(), "gradeRank", -1904515417);
        setIntField(term4300291, term4300291.getClass(), "classRank", -2136938913);
        setIntField(term4300291, term4300291.getClass(), "courseRank", 362875464);
        setField(term4300291, term4300291.getClass(), "charaSlot", term4300356);
        setField(term4300291, term4300291.getClass(), "charaLockSlot", term4300364);
        setLongField(term4300291, term4300291.getClass(), "contentBit", 3016313987970703657L);
        setIntField(term4300291, term4300291.getClass(), "playCount", 2022644739);
        setField(term4300291, term4300291.getClass(), "eventWatchedDate", "OxTElreXYr");
        setField(term4300291, term4300291.getClass(), "lastGameId", "cRmPqOiUAV");
        setField(term4300291, term4300291.getClass(), "lastRomVersion", "ntTaZJBwAZ");
        setField(term4300291, term4300291.getClass(), "lastDataVersion", "iYrSyXzkOO");
        setField(term4300291, term4300291.getClass(), "lastLoginDate", "rrJdeXpfXX");
        setField(term4300291, term4300291.getClass(), "lastPlayDate", "assonVSNrY");
        setIntField(term4300291, term4300291.getClass(), "lastPlayCredit", -208355756);
        setIntField(term4300291, term4300291.getClass(), "lastPlayMode", 262385556);
        setIntField(term4300291, term4300291.getClass(), "lastPlaceId", -563608517);
        setField(term4300291, term4300291.getClass(), "lastPlaceName", "RbLhVNoiVF");
        setIntField(term4300291, term4300291.getClass(), "lastAllNetId", 1144790798);
        setIntField(term4300291, term4300291.getClass(), "lastRegionId", -413526282);
        setField(term4300291, term4300291.getClass(), "lastRegionName", "fvXjOpZfhZ");
        setField(term4300291, term4300291.getClass(), "lastClientId", "TTtpPMaPbB");
        setField(term4300291, term4300291.getClass(), "lastCountryCode", "XjseRCEHwB");
        setIntField(term4300291, term4300291.getClass(), "lastSelectEMoney", -840833521);
        setIntField(term4300291, term4300291.getClass(), "lastSelectTicket", -224265255);
        setIntField(term4300291, term4300291.getClass(), "lastSelectCourse", 1014191774);
        setIntField(term4300291, term4300291.getClass(), "lastCountCourse", 92527738);
        setField(term4300291, term4300291.getClass(), "firstGameId", "KNKcmCqXxo");
        setField(term4300291, term4300291.getClass(), "firstRomVersion", "FsqkpcDxeY");
        setField(term4300291, term4300291.getClass(), "firstDataVersion", "sMWRmRLZgD");
        setField(term4300291, term4300291.getClass(), "firstPlayDate", "EBiAzRaJjC");
        setField(term4300291, term4300291.getClass(), "compatibleCmVersion", "mtXBQOyhtg");
        setField(term4300291, term4300291.getClass(), "dailyBonusDate", "NHwVquWJGR");
        setField(term4300291, term4300291.getClass(), "dailyCourseBonusDate", "hHYQKHBHQk");
        setField(term4300291, term4300291.getClass(), "lastPairLoginDate", "ICXWwIZgAI");
        setField(term4300291, term4300291.getClass(), "lastTrialPlayDate", "YPHFBTdWFg");
        setIntField(term4300291, term4300291.getClass(), "playVsCount", -1762117003);
        setIntField(term4300291, term4300291.getClass(), "playSyncCount", -217982740);
        setIntField(term4300291, term4300291.getClass(), "winCount", -1792995707);
        setIntField(term4300291, term4300291.getClass(), "helpCount", -857438507);
        setIntField(term4300291, term4300291.getClass(), "comboCount", 958752395);
        setLongField(term4300291, term4300291.getClass(), "totalDeluxscore", 869285892405698983L);
        setLongField(term4300291, term4300291.getClass(), "totalBasicDeluxscore", -7829120849148558299L);
        setLongField(term4300291, term4300291.getClass(), "totalAdvancedDeluxscore", 3794028219815333036L);
        setLongField(term4300291, term4300291.getClass(), "totalExpertDeluxscore", -4856236294360705513L);
        setLongField(term4300291, term4300291.getClass(), "totalMasterDeluxscore", -458590069686802053L);
        setLongField(term4300291, term4300291.getClass(), "totalReMasterDeluxscore", -1596174905276922707L);
        setIntField(term4300291, term4300291.getClass(), "totalSync", -2141587155);
        setIntField(term4300291, term4300291.getClass(), "totalBasicSync", 1167768816);
        setIntField(term4300291, term4300291.getClass(), "totalAdvancedSync", 1988707745);
        setIntField(term4300291, term4300291.getClass(), "totalExpertSync", -322292926);
        setIntField(term4300291, term4300291.getClass(), "totalMasterSync", 641095672);
        setIntField(term4300291, term4300291.getClass(), "totalReMasterSync", 501064208);
        setLongField(term4300291, term4300291.getClass(), "totalAchievement", 8739568666261372750L);
        setLongField(term4300291, term4300291.getClass(), "totalBasicAchievement", -1495784137449041907L);
        setLongField(term4300291, term4300291.getClass(), "totalAdvancedAchievement", 4160323203158634498L);
        setLongField(term4300291, term4300291.getClass(), "totalExpertAchievement", 7656164866497335360L);
        setLongField(term4300291, term4300291.getClass(), "totalMasterAchievement", -6708554902382455264L);
        setLongField(term4300291, term4300291.getClass(), "totalReMasterAchievement", -8706148742642684722L);
        setLongField(term4300291, term4300291.getClass(), "playerOldRating", 8233335226541621018L);
        setLongField(term4300291, term4300291.getClass(), "playerNewRating", -7474347197026407772L);
        setIntField(term4300291, term4300291.getClass(), "banState", -1476308757);
        setLongField(term4300291, term4300291.getClass(), "dateTime", 6718069036566136276L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iYTFWcGtlB";
        callMethod(klass, "setDailyCourseBonusDate", argTypes, term4300291, args);
    }

};


