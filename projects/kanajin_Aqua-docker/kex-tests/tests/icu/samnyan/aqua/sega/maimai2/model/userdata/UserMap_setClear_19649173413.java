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
import java.lang.Boolean;

public class UserMap_setClear_19649173413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term581309;
     Object term581655;

    public UserMap_setClear_19649173413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term581315 = new Long(3853743792832767733L);
        ArrayList term581376 = new ArrayList();
        ArrayList term581380 = new ArrayList();
        term581309 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap"));
        Object term581311 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term581313 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term581329 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term581330 = newInstance(Class.forName("java.time.LocalDate"));
        Object term581334 = newInstance(Class.forName("java.time.LocalTime"));
        Object term581339 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term581340 = newInstance(Class.forName("java.time.LocalDate"));
        Object term581344 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term581309, term581309.getClass(), "id", -2894689247632553853L);
        setLongField(term581311, term581311.getClass(), "id", -8489190063759849130L);
        setLongField(term581313, term581313.getClass(), "id", -5497923501387438079L);
        setField(term581313, term581313.getClass(), "extId", term581315);
        setField(term581313, term581313.getClass(), "luid", "SlSXnopuwc");
        setIntField(term581330, term581330.getClass(), "year", 2014);
        setShortField(term581330, term581330.getClass(), "month", (short) 9);
        setShortField(term581330, term581330.getClass(), "day", (short) 10);
        setField(term581329, term581329.getClass(), "date", term581330);
        setByteField(term581334, term581334.getClass(), "hour", (byte) 17);
        setByteField(term581334, term581334.getClass(), "minute", (byte) 2);
        setByteField(term581334, term581334.getClass(), "second", (byte) 57);
        setIntField(term581334, term581334.getClass(), "nano", 88462228);
        setField(term581329, term581329.getClass(), "time", term581334);
        setField(term581313, term581313.getClass(), "registerTime", term581329);
        setIntField(term581340, term581340.getClass(), "year", 2025);
        setShortField(term581340, term581340.getClass(), "month", (short) 4);
        setShortField(term581340, term581340.getClass(), "day", (short) 8);
        setField(term581339, term581339.getClass(), "date", term581340);
        setByteField(term581344, term581344.getClass(), "hour", (byte) 6);
        setByteField(term581344, term581344.getClass(), "minute", (byte) 37);
        setByteField(term581344, term581344.getClass(), "second", (byte) 39);
        setIntField(term581344, term581344.getClass(), "nano", 553724922);
        setField(term581339, term581339.getClass(), "time", term581344);
        setField(term581313, term581313.getClass(), "accessTime", term581339);
        setField(term581311, term581311.getClass(), "card", term581313);
        setField(term581311, term581311.getClass(), "userName", "rWSZxQkkEz");
        setIntField(term581311, term581311.getClass(), "isNetMember", 2040700634);
        setIntField(term581311, term581311.getClass(), "iconId", -450140864);
        setIntField(term581311, term581311.getClass(), "plateId", -850090414);
        setIntField(term581311, term581311.getClass(), "titleId", -2046723622);
        setIntField(term581311, term581311.getClass(), "partnerId", -1205737808);
        setIntField(term581311, term581311.getClass(), "frameId", -375346320);
        setIntField(term581311, term581311.getClass(), "selectMapId", 1063300990);
        setIntField(term581311, term581311.getClass(), "totalAwake", -915432644);
        setIntField(term581311, term581311.getClass(), "gradeRating", 376765254);
        setIntField(term581311, term581311.getClass(), "musicRating", -1213867565);
        setIntField(term581311, term581311.getClass(), "playerRating", 1144345987);
        setIntField(term581311, term581311.getClass(), "highestRating", -1825427041);
        setIntField(term581311, term581311.getClass(), "gradeRank", 1915006925);
        setIntField(term581311, term581311.getClass(), "classRank", -1866202463);
        setIntField(term581311, term581311.getClass(), "courseRank", -21328021);
        setField(term581311, term581311.getClass(), "charaSlot", term581376);
        setField(term581311, term581311.getClass(), "charaLockSlot", term581380);
        setLongField(term581311, term581311.getClass(), "contentBit", 2812718502268320741L);
        setIntField(term581311, term581311.getClass(), "playCount", -876386947);
        setField(term581311, term581311.getClass(), "eventWatchedDate", "uRutPPExaI");
        setField(term581311, term581311.getClass(), "lastGameId", "DThNnAnmhk");
        setField(term581311, term581311.getClass(), "lastRomVersion", "JukvUxPHlf");
        setField(term581311, term581311.getClass(), "lastDataVersion", "zEJlHVgsKr");
        setField(term581311, term581311.getClass(), "lastLoginDate", "yPgtZjOyqh");
        setField(term581311, term581311.getClass(), "lastPlayDate", "IofvoeygdJ");
        setIntField(term581311, term581311.getClass(), "lastPlayCredit", -127843164);
        setIntField(term581311, term581311.getClass(), "lastPlayMode", -857600227);
        setIntField(term581311, term581311.getClass(), "lastPlaceId", -1495269493);
        setField(term581311, term581311.getClass(), "lastPlaceName", "BZyQOGxytD");
        setIntField(term581311, term581311.getClass(), "lastAllNetId", -1078394001);
        setIntField(term581311, term581311.getClass(), "lastRegionId", 873013790);
        setField(term581311, term581311.getClass(), "lastRegionName", "JJkLUIvvKS");
        setField(term581311, term581311.getClass(), "lastClientId", "uofmATDUVe");
        setField(term581311, term581311.getClass(), "lastCountryCode", "MetEwEIDOa");
        setIntField(term581311, term581311.getClass(), "lastSelectEMoney", 60710154);
        setIntField(term581311, term581311.getClass(), "lastSelectTicket", 1730885095);
        setIntField(term581311, term581311.getClass(), "lastSelectCourse", 825006271);
        setIntField(term581311, term581311.getClass(), "lastCountCourse", -1323697272);
        setField(term581311, term581311.getClass(), "firstGameId", "yyYvhhHLtF");
        setField(term581311, term581311.getClass(), "firstRomVersion", "LXkhmyzjgc");
        setField(term581311, term581311.getClass(), "firstDataVersion", "tpkNHbaIoJ");
        setField(term581311, term581311.getClass(), "firstPlayDate", "kOYKwmZJFc");
        setField(term581311, term581311.getClass(), "compatibleCmVersion", "dxqKTQNHwJ");
        setField(term581311, term581311.getClass(), "dailyBonusDate", "raeyRctJnG");
        setField(term581311, term581311.getClass(), "dailyCourseBonusDate", "qTZJpQYlPe");
        setField(term581311, term581311.getClass(), "lastPairLoginDate", "WVybiRJSvW");
        setField(term581311, term581311.getClass(), "lastTrialPlayDate", "fiZbPkHFuY");
        setIntField(term581311, term581311.getClass(), "playVsCount", 144719710);
        setIntField(term581311, term581311.getClass(), "playSyncCount", -1023593259);
        setIntField(term581311, term581311.getClass(), "winCount", -676313797);
        setIntField(term581311, term581311.getClass(), "helpCount", -1276993943);
        setIntField(term581311, term581311.getClass(), "comboCount", -1229695435);
        setLongField(term581311, term581311.getClass(), "totalDeluxscore", 466288114347201729L);
        setLongField(term581311, term581311.getClass(), "totalBasicDeluxscore", 8307688507521553295L);
        setLongField(term581311, term581311.getClass(), "totalAdvancedDeluxscore", -5668419638606158227L);
        setLongField(term581311, term581311.getClass(), "totalExpertDeluxscore", 3189921450745041024L);
        setLongField(term581311, term581311.getClass(), "totalMasterDeluxscore", -4355866822330084096L);
        setLongField(term581311, term581311.getClass(), "totalReMasterDeluxscore", -864329992426220351L);
        setIntField(term581311, term581311.getClass(), "totalSync", 899226591);
        setIntField(term581311, term581311.getClass(), "totalBasicSync", 1440634443);
        setIntField(term581311, term581311.getClass(), "totalAdvancedSync", 451670539);
        setIntField(term581311, term581311.getClass(), "totalExpertSync", 2067919368);
        setIntField(term581311, term581311.getClass(), "totalMasterSync", -1775231763);
        setIntField(term581311, term581311.getClass(), "totalReMasterSync", -975241402);
        setLongField(term581311, term581311.getClass(), "totalAchievement", -8355559249456332812L);
        setLongField(term581311, term581311.getClass(), "totalBasicAchievement", 2337601922828843521L);
        setLongField(term581311, term581311.getClass(), "totalAdvancedAchievement", 2964024594340578207L);
        setLongField(term581311, term581311.getClass(), "totalExpertAchievement", 3037787476100972440L);
        setLongField(term581311, term581311.getClass(), "totalMasterAchievement", -4261627414030499622L);
        setLongField(term581311, term581311.getClass(), "totalReMasterAchievement", 1589143052037477576L);
        setLongField(term581311, term581311.getClass(), "playerOldRating", 924523485010754275L);
        setLongField(term581311, term581311.getClass(), "playerNewRating", 7978350946539455301L);
        setIntField(term581311, term581311.getClass(), "banState", 485747514);
        setLongField(term581311, term581311.getClass(), "dateTime", 2108855586644635524L);
        setField(term581309, term581309.getClass(), "user", term581311);
        setIntField(term581309, term581309.getClass(), "mapId", 1641477662);
        setIntField(term581309, term581309.getClass(), "distance", 181739427);
        setBooleanField(term581309, term581309.getClass(), "isLock", true);
        setBooleanField(term581309, term581309.getClass(), "isClear", true);
        setBooleanField(term581309, term581309.getClass(), "isComplete", false);
        term581655 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term581655;
        callMethod(klass, "setClear", argTypes, term581309, args);
    }

};


