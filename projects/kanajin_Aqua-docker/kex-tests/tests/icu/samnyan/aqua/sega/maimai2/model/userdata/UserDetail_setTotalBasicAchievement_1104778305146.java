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

public class UserDetail_setTotalBasicAchievement_1104778305146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278206;
     Object term278569;

    public UserDetail_setTotalBasicAchievement_1104778305146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term278210 = new Long(6269054578518955349L);
        Integer term278273 = new Integer(-1459222679);
        Integer term278275 = new Integer(91387193);
        Integer term278277 = new Integer(-457093173);
        Integer term278279 = new Integer(-738503746);
        Integer term278281 = new Integer(1118865267);
        Integer term278283 = new Integer(1899392740);
        ArrayList term278271 = new ArrayList();
        ((ArrayList) term278271).add(term278273);
        ((ArrayList) term278271).add(term278275);
        ((ArrayList) term278271).add(term278277);
        ((ArrayList) term278271).add(term278279);
        ((ArrayList) term278271).add(term278281);
        ((ArrayList) term278271).add(term278283);
        Integer term278289 = new Integer(144291847);
        Integer term278291 = new Integer(263154490);
        Integer term278293 = new Integer(1685033038);
        Integer term278295 = new Integer(1455872685);
        Integer term278297 = new Integer(-895803070);
        Integer term278299 = new Integer(-2065313027);
        ArrayList term278287 = new ArrayList();
        ((ArrayList) term278287).add(term278289);
        ((ArrayList) term278287).add(term278291);
        ((ArrayList) term278287).add(term278293);
        ((ArrayList) term278287).add(term278295);
        ((ArrayList) term278287).add(term278297);
        ((ArrayList) term278287).add(term278299);
        term278206 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term278208 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term278224 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term278225 = newInstance(Class.forName("java.time.LocalDate"));
        Object term278229 = newInstance(Class.forName("java.time.LocalTime"));
        Object term278234 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term278235 = newInstance(Class.forName("java.time.LocalDate"));
        Object term278239 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term278206, term278206.getClass(), "id", 3606814530654223478L);
        setLongField(term278208, term278208.getClass(), "id", 395992112824653293L);
        setField(term278208, term278208.getClass(), "extId", term278210);
        setField(term278208, term278208.getClass(), "luid", "HJDtyPLFgE");
        setIntField(term278225, term278225.getClass(), "year", 2017);
        setShortField(term278225, term278225.getClass(), "month", (short) 11);
        setShortField(term278225, term278225.getClass(), "day", (short) 12);
        setField(term278224, term278224.getClass(), "date", term278225);
        setByteField(term278229, term278229.getClass(), "hour", (byte) 19);
        setByteField(term278229, term278229.getClass(), "minute", (byte) 40);
        setByteField(term278229, term278229.getClass(), "second", (byte) 41);
        setIntField(term278229, term278229.getClass(), "nano", 761400982);
        setField(term278224, term278224.getClass(), "time", term278229);
        setField(term278208, term278208.getClass(), "registerTime", term278224);
        setIntField(term278235, term278235.getClass(), "year", 2023);
        setShortField(term278235, term278235.getClass(), "month", (short) 11);
        setShortField(term278235, term278235.getClass(), "day", (short) 8);
        setField(term278234, term278234.getClass(), "date", term278235);
        setByteField(term278239, term278239.getClass(), "hour", (byte) 3);
        setByteField(term278239, term278239.getClass(), "minute", (byte) 26);
        setByteField(term278239, term278239.getClass(), "second", (byte) 27);
        setIntField(term278239, term278239.getClass(), "nano", 261817318);
        setField(term278234, term278234.getClass(), "time", term278239);
        setField(term278208, term278208.getClass(), "accessTime", term278234);
        setField(term278206, term278206.getClass(), "card", term278208);
        setField(term278206, term278206.getClass(), "userName", "dFmJxbLTYH");
        setIntField(term278206, term278206.getClass(), "isNetMember", 1024031566);
        setIntField(term278206, term278206.getClass(), "iconId", 1809869083);
        setIntField(term278206, term278206.getClass(), "plateId", 1866562735);
        setIntField(term278206, term278206.getClass(), "titleId", 1326832867);
        setIntField(term278206, term278206.getClass(), "partnerId", 1653843083);
        setIntField(term278206, term278206.getClass(), "frameId", -2127993423);
        setIntField(term278206, term278206.getClass(), "selectMapId", -1138128703);
        setIntField(term278206, term278206.getClass(), "totalAwake", -1090810908);
        setIntField(term278206, term278206.getClass(), "gradeRating", -1060340214);
        setIntField(term278206, term278206.getClass(), "musicRating", 1049390881);
        setIntField(term278206, term278206.getClass(), "playerRating", -130861498);
        setIntField(term278206, term278206.getClass(), "highestRating", -395878863);
        setIntField(term278206, term278206.getClass(), "gradeRank", -168654922);
        setIntField(term278206, term278206.getClass(), "classRank", 1714355511);
        setIntField(term278206, term278206.getClass(), "courseRank", -1848405319);
        setField(term278206, term278206.getClass(), "charaSlot", term278271);
        setField(term278206, term278206.getClass(), "charaLockSlot", term278287);
        setLongField(term278206, term278206.getClass(), "contentBit", -4324282798219104256L);
        setIntField(term278206, term278206.getClass(), "playCount", 863171872);
        setField(term278206, term278206.getClass(), "eventWatchedDate", "XFMEZbiUJt");
        setField(term278206, term278206.getClass(), "lastGameId", "bMUTgRJrfr");
        setField(term278206, term278206.getClass(), "lastRomVersion", "AiITUhJkJU");
        setField(term278206, term278206.getClass(), "lastDataVersion", "vrdcxFmoiP");
        setField(term278206, term278206.getClass(), "lastLoginDate", "GtvElQvKPH");
        setField(term278206, term278206.getClass(), "lastPlayDate", "cOSgncciPE");
        setIntField(term278206, term278206.getClass(), "lastPlayCredit", 424577741);
        setIntField(term278206, term278206.getClass(), "lastPlayMode", 124462440);
        setIntField(term278206, term278206.getClass(), "lastPlaceId", -582145829);
        setField(term278206, term278206.getClass(), "lastPlaceName", "DsuqUYdhHr");
        setIntField(term278206, term278206.getClass(), "lastAllNetId", -1001580103);
        setIntField(term278206, term278206.getClass(), "lastRegionId", 114200603);
        setField(term278206, term278206.getClass(), "lastRegionName", "zydfWNkGTk");
        setField(term278206, term278206.getClass(), "lastClientId", "JQUYGZnGvW");
        setField(term278206, term278206.getClass(), "lastCountryCode", "tnkxAtWMbF");
        setIntField(term278206, term278206.getClass(), "lastSelectEMoney", -118675729);
        setIntField(term278206, term278206.getClass(), "lastSelectTicket", 140313614);
        setIntField(term278206, term278206.getClass(), "lastSelectCourse", -1773035656);
        setIntField(term278206, term278206.getClass(), "lastCountCourse", 1654490474);
        setField(term278206, term278206.getClass(), "firstGameId", "XKUBaukekX");
        setField(term278206, term278206.getClass(), "firstRomVersion", "IYWVYrRcKf");
        setField(term278206, term278206.getClass(), "firstDataVersion", "gVkscSyrAF");
        setField(term278206, term278206.getClass(), "firstPlayDate", "iEhjaMuTSF");
        setField(term278206, term278206.getClass(), "compatibleCmVersion", "qJrFbnMItH");
        setField(term278206, term278206.getClass(), "dailyBonusDate", "budoEMvbXU");
        setField(term278206, term278206.getClass(), "dailyCourseBonusDate", "RrHQiUwApR");
        setField(term278206, term278206.getClass(), "lastPairLoginDate", "hoYSPkUlUz");
        setField(term278206, term278206.getClass(), "lastTrialPlayDate", "IcvbaPtHCI");
        setIntField(term278206, term278206.getClass(), "playVsCount", -1109715656);
        setIntField(term278206, term278206.getClass(), "playSyncCount", 459543779);
        setIntField(term278206, term278206.getClass(), "winCount", 997601106);
        setIntField(term278206, term278206.getClass(), "helpCount", 2022393400);
        setIntField(term278206, term278206.getClass(), "comboCount", 987907202);
        setLongField(term278206, term278206.getClass(), "totalDeluxscore", -7735030717299405043L);
        setLongField(term278206, term278206.getClass(), "totalBasicDeluxscore", -1310236160215504134L);
        setLongField(term278206, term278206.getClass(), "totalAdvancedDeluxscore", 5435119851827403881L);
        setLongField(term278206, term278206.getClass(), "totalExpertDeluxscore", -3141616557728371938L);
        setLongField(term278206, term278206.getClass(), "totalMasterDeluxscore", 5856519380743730900L);
        setLongField(term278206, term278206.getClass(), "totalReMasterDeluxscore", -8465837051485668399L);
        setIntField(term278206, term278206.getClass(), "totalSync", 2129251057);
        setIntField(term278206, term278206.getClass(), "totalBasicSync", -1299562763);
        setIntField(term278206, term278206.getClass(), "totalAdvancedSync", -668992598);
        setIntField(term278206, term278206.getClass(), "totalExpertSync", -1617142593);
        setIntField(term278206, term278206.getClass(), "totalMasterSync", 1288566760);
        setIntField(term278206, term278206.getClass(), "totalReMasterSync", 2045294676);
        setLongField(term278206, term278206.getClass(), "totalAchievement", 3884082146833094381L);
        setLongField(term278206, term278206.getClass(), "totalBasicAchievement", 5347964522902878449L);
        setLongField(term278206, term278206.getClass(), "totalAdvancedAchievement", -6399289914085130370L);
        setLongField(term278206, term278206.getClass(), "totalExpertAchievement", 1530672874918410705L);
        setLongField(term278206, term278206.getClass(), "totalMasterAchievement", -6655121235167409628L);
        setLongField(term278206, term278206.getClass(), "totalReMasterAchievement", -8282880649726465919L);
        setLongField(term278206, term278206.getClass(), "playerOldRating", -6411702594182735307L);
        setLongField(term278206, term278206.getClass(), "playerNewRating", 7051482691766700370L);
        setIntField(term278206, term278206.getClass(), "banState", -865007679);
        setLongField(term278206, term278206.getClass(), "dateTime", 8878117138932980189L);
        term278569 = new Long(3211545370978154136L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term278569;
        callMethod(klass, "setTotalBasicAchievement", argTypes, term278206, args);
    }

};


