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

public class UserDetail_setTotalBasicAchievement_1104778305145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278151;
     Object term278514;

    public UserDetail_setTotalBasicAchievement_1104778305145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term278155 = new Long(6269054578518955349L);
        Integer term278218 = new Integer(-1459222679);
        Integer term278220 = new Integer(91387193);
        Integer term278222 = new Integer(-457093173);
        Integer term278224 = new Integer(-738503746);
        Integer term278226 = new Integer(1118865267);
        Integer term278228 = new Integer(1899392740);
        ArrayList term278216 = new ArrayList();
        ((ArrayList) term278216).add(term278218);
        ((ArrayList) term278216).add(term278220);
        ((ArrayList) term278216).add(term278222);
        ((ArrayList) term278216).add(term278224);
        ((ArrayList) term278216).add(term278226);
        ((ArrayList) term278216).add(term278228);
        Integer term278234 = new Integer(144291847);
        Integer term278236 = new Integer(263154490);
        Integer term278238 = new Integer(1685033038);
        Integer term278240 = new Integer(1455872685);
        Integer term278242 = new Integer(-895803070);
        Integer term278244 = new Integer(-2065313027);
        ArrayList term278232 = new ArrayList();
        ((ArrayList) term278232).add(term278234);
        ((ArrayList) term278232).add(term278236);
        ((ArrayList) term278232).add(term278238);
        ((ArrayList) term278232).add(term278240);
        ((ArrayList) term278232).add(term278242);
        ((ArrayList) term278232).add(term278244);
        term278151 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term278153 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term278169 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term278170 = newInstance(Class.forName("java.time.LocalDate"));
        Object term278174 = newInstance(Class.forName("java.time.LocalTime"));
        Object term278179 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term278180 = newInstance(Class.forName("java.time.LocalDate"));
        Object term278184 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term278151, term278151.getClass(), "id", 3606814530654223478L);
        setLongField(term278153, term278153.getClass(), "id", 395992112824653293L);
        setField(term278153, term278153.getClass(), "extId", term278155);
        setField(term278153, term278153.getClass(), "luid", "HJDtyPLFgE");
        setIntField(term278170, term278170.getClass(), "year", 2017);
        setShortField(term278170, term278170.getClass(), "month", (short) 11);
        setShortField(term278170, term278170.getClass(), "day", (short) 12);
        setField(term278169, term278169.getClass(), "date", term278170);
        setByteField(term278174, term278174.getClass(), "hour", (byte) 19);
        setByteField(term278174, term278174.getClass(), "minute", (byte) 40);
        setByteField(term278174, term278174.getClass(), "second", (byte) 41);
        setIntField(term278174, term278174.getClass(), "nano", 761400982);
        setField(term278169, term278169.getClass(), "time", term278174);
        setField(term278153, term278153.getClass(), "registerTime", term278169);
        setIntField(term278180, term278180.getClass(), "year", 2023);
        setShortField(term278180, term278180.getClass(), "month", (short) 11);
        setShortField(term278180, term278180.getClass(), "day", (short) 8);
        setField(term278179, term278179.getClass(), "date", term278180);
        setByteField(term278184, term278184.getClass(), "hour", (byte) 3);
        setByteField(term278184, term278184.getClass(), "minute", (byte) 26);
        setByteField(term278184, term278184.getClass(), "second", (byte) 27);
        setIntField(term278184, term278184.getClass(), "nano", 261817318);
        setField(term278179, term278179.getClass(), "time", term278184);
        setField(term278153, term278153.getClass(), "accessTime", term278179);
        setField(term278151, term278151.getClass(), "card", term278153);
        setField(term278151, term278151.getClass(), "userName", "dFmJxbLTYH");
        setIntField(term278151, term278151.getClass(), "isNetMember", 1024031566);
        setIntField(term278151, term278151.getClass(), "iconId", 1809869083);
        setIntField(term278151, term278151.getClass(), "plateId", 1866562735);
        setIntField(term278151, term278151.getClass(), "titleId", 1326832867);
        setIntField(term278151, term278151.getClass(), "partnerId", 1653843083);
        setIntField(term278151, term278151.getClass(), "frameId", -2127993423);
        setIntField(term278151, term278151.getClass(), "selectMapId", -1138128703);
        setIntField(term278151, term278151.getClass(), "totalAwake", -1090810908);
        setIntField(term278151, term278151.getClass(), "gradeRating", -1060340214);
        setIntField(term278151, term278151.getClass(), "musicRating", 1049390881);
        setIntField(term278151, term278151.getClass(), "playerRating", -130861498);
        setIntField(term278151, term278151.getClass(), "highestRating", -395878863);
        setIntField(term278151, term278151.getClass(), "gradeRank", -168654922);
        setIntField(term278151, term278151.getClass(), "classRank", 1714355511);
        setIntField(term278151, term278151.getClass(), "courseRank", -1848405319);
        setField(term278151, term278151.getClass(), "charaSlot", term278216);
        setField(term278151, term278151.getClass(), "charaLockSlot", term278232);
        setLongField(term278151, term278151.getClass(), "contentBit", -4324282798219104256L);
        setIntField(term278151, term278151.getClass(), "playCount", 863171872);
        setField(term278151, term278151.getClass(), "eventWatchedDate", "XFMEZbiUJt");
        setField(term278151, term278151.getClass(), "lastGameId", "bMUTgRJrfr");
        setField(term278151, term278151.getClass(), "lastRomVersion", "AiITUhJkJU");
        setField(term278151, term278151.getClass(), "lastDataVersion", "vrdcxFmoiP");
        setField(term278151, term278151.getClass(), "lastLoginDate", "GtvElQvKPH");
        setField(term278151, term278151.getClass(), "lastPlayDate", "cOSgncciPE");
        setIntField(term278151, term278151.getClass(), "lastPlayCredit", 424577741);
        setIntField(term278151, term278151.getClass(), "lastPlayMode", 124462440);
        setIntField(term278151, term278151.getClass(), "lastPlaceId", -582145829);
        setField(term278151, term278151.getClass(), "lastPlaceName", "DsuqUYdhHr");
        setIntField(term278151, term278151.getClass(), "lastAllNetId", -1001580103);
        setIntField(term278151, term278151.getClass(), "lastRegionId", 114200603);
        setField(term278151, term278151.getClass(), "lastRegionName", "zydfWNkGTk");
        setField(term278151, term278151.getClass(), "lastClientId", "JQUYGZnGvW");
        setField(term278151, term278151.getClass(), "lastCountryCode", "tnkxAtWMbF");
        setIntField(term278151, term278151.getClass(), "lastSelectEMoney", -118675729);
        setIntField(term278151, term278151.getClass(), "lastSelectTicket", 140313614);
        setIntField(term278151, term278151.getClass(), "lastSelectCourse", -1773035656);
        setIntField(term278151, term278151.getClass(), "lastCountCourse", 1654490474);
        setField(term278151, term278151.getClass(), "firstGameId", "XKUBaukekX");
        setField(term278151, term278151.getClass(), "firstRomVersion", "IYWVYrRcKf");
        setField(term278151, term278151.getClass(), "firstDataVersion", "gVkscSyrAF");
        setField(term278151, term278151.getClass(), "firstPlayDate", "iEhjaMuTSF");
        setField(term278151, term278151.getClass(), "compatibleCmVersion", "qJrFbnMItH");
        setField(term278151, term278151.getClass(), "dailyBonusDate", "budoEMvbXU");
        setField(term278151, term278151.getClass(), "dailyCourseBonusDate", "RrHQiUwApR");
        setField(term278151, term278151.getClass(), "lastPairLoginDate", "hoYSPkUlUz");
        setField(term278151, term278151.getClass(), "lastTrialPlayDate", "IcvbaPtHCI");
        setIntField(term278151, term278151.getClass(), "playVsCount", -1109715656);
        setIntField(term278151, term278151.getClass(), "playSyncCount", 459543779);
        setIntField(term278151, term278151.getClass(), "winCount", 997601106);
        setIntField(term278151, term278151.getClass(), "helpCount", 2022393400);
        setIntField(term278151, term278151.getClass(), "comboCount", 987907202);
        setLongField(term278151, term278151.getClass(), "totalDeluxscore", -7735030717299405043L);
        setLongField(term278151, term278151.getClass(), "totalBasicDeluxscore", -1310236160215504134L);
        setLongField(term278151, term278151.getClass(), "totalAdvancedDeluxscore", 5435119851827403881L);
        setLongField(term278151, term278151.getClass(), "totalExpertDeluxscore", -3141616557728371938L);
        setLongField(term278151, term278151.getClass(), "totalMasterDeluxscore", 5856519380743730900L);
        setLongField(term278151, term278151.getClass(), "totalReMasterDeluxscore", -8465837051485668399L);
        setIntField(term278151, term278151.getClass(), "totalSync", 2129251057);
        setIntField(term278151, term278151.getClass(), "totalBasicSync", -1299562763);
        setIntField(term278151, term278151.getClass(), "totalAdvancedSync", -668992598);
        setIntField(term278151, term278151.getClass(), "totalExpertSync", -1617142593);
        setIntField(term278151, term278151.getClass(), "totalMasterSync", 1288566760);
        setIntField(term278151, term278151.getClass(), "totalReMasterSync", 2045294676);
        setLongField(term278151, term278151.getClass(), "totalAchievement", 3884082146833094381L);
        setLongField(term278151, term278151.getClass(), "totalBasicAchievement", 5347964522902878449L);
        setLongField(term278151, term278151.getClass(), "totalAdvancedAchievement", -6399289914085130370L);
        setLongField(term278151, term278151.getClass(), "totalExpertAchievement", 1530672874918410705L);
        setLongField(term278151, term278151.getClass(), "totalMasterAchievement", -6655121235167409628L);
        setLongField(term278151, term278151.getClass(), "totalReMasterAchievement", -8282880649726465919L);
        setLongField(term278151, term278151.getClass(), "playerOldRating", -6411702594182735307L);
        setLongField(term278151, term278151.getClass(), "playerNewRating", 7051482691766700370L);
        setIntField(term278151, term278151.getClass(), "banState", -865007679);
        setLongField(term278151, term278151.getClass(), "dateTime", 8878117138932980189L);
        term278514 = new Long(3211545370978154136L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term278514;
        callMethod(klass, "setTotalBasicAchievement", argTypes, term278151, args);
    }

};


