package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Boolean;

public class UserMusicDetail_setAllPerfect_47971939920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185713;
     Object term185899;

    public UserMusicDetail_setAllPerfect_47971939920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term185719 = new Long(6695041041196724237L);
        term185713 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term185715 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term185717 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term185733 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term185734 = newInstance(Class.forName("java.time.LocalDate"));
        Object term185738 = newInstance(Class.forName("java.time.LocalTime"));
        Object term185743 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term185744 = newInstance(Class.forName("java.time.LocalDate"));
        Object term185748 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term185713, term185713.getClass(), "id", 6140052465174132392L);
        setLongField(term185715, term185715.getClass(), "id", 3429269088703450074L);
        setLongField(term185717, term185717.getClass(), "id", 5075494854539116407L);
        setField(term185717, term185717.getClass(), "extId", term185719);
        setField(term185717, term185717.getClass(), "luid", "sUmSSAVUAl");
        setIntField(term185734, term185734.getClass(), "year", 2029);
        setShortField(term185734, term185734.getClass(), "month", (short) 12);
        setShortField(term185734, term185734.getClass(), "day", (short) 20);
        setField(term185733, term185733.getClass(), "date", term185734);
        setByteField(term185738, term185738.getClass(), "hour", (byte) 12);
        setByteField(term185738, term185738.getClass(), "minute", (byte) 40);
        setByteField(term185738, term185738.getClass(), "second", (byte) 30);
        setIntField(term185738, term185738.getClass(), "nano", 927903151);
        setField(term185733, term185733.getClass(), "time", term185738);
        setField(term185717, term185717.getClass(), "registerTime", term185733);
        setIntField(term185744, term185744.getClass(), "year", 2011);
        setShortField(term185744, term185744.getClass(), "month", (short) 9);
        setShortField(term185744, term185744.getClass(), "day", (short) 13);
        setField(term185743, term185743.getClass(), "date", term185744);
        setByteField(term185748, term185748.getClass(), "hour", (byte) 23);
        setByteField(term185748, term185748.getClass(), "minute", (byte) 46);
        setByteField(term185748, term185748.getClass(), "second", (byte) 54);
        setIntField(term185748, term185748.getClass(), "nano", 701561816);
        setField(term185743, term185743.getClass(), "time", term185748);
        setField(term185717, term185717.getClass(), "accessTime", term185743);
        setField(term185715, term185715.getClass(), "card", term185717);
        setIntField(term185715, term185715.getClass(), "lastDataVersion", -541988136);
        setField(term185715, term185715.getClass(), "userName", "bUrzffmZhc");
        setIntField(term185715, term185715.getClass(), "point", 818394896);
        setIntField(term185715, term185715.getClass(), "totalPoint", -1182098560);
        setIntField(term185715, term185715.getClass(), "iconId", 529650646);
        setIntField(term185715, term185715.getClass(), "nameplateId", 1813971731);
        setIntField(term185715, term185715.getClass(), "frameId", 700640894);
        setIntField(term185715, term185715.getClass(), "trophyId", 572668176);
        setIntField(term185715, term185715.getClass(), "playCount", -1002226339);
        setIntField(term185715, term185715.getClass(), "playVsCount", 1490553632);
        setIntField(term185715, term185715.getClass(), "playSyncCount", 179885232);
        setIntField(term185715, term185715.getClass(), "winCount", -393205381);
        setIntField(term185715, term185715.getClass(), "helpCount", -920498508);
        setIntField(term185715, term185715.getClass(), "comboCount", 1037247993);
        setIntField(term185715, term185715.getClass(), "feverCount", 961726677);
        setIntField(term185715, term185715.getClass(), "totalHiScore", -979766939);
        setIntField(term185715, term185715.getClass(), "totalEasyHighScore", 797732558);
        setIntField(term185715, term185715.getClass(), "totalBasicHighScore", -324959782);
        setIntField(term185715, term185715.getClass(), "totalAdvancedHighScore", 1569651442);
        setIntField(term185715, term185715.getClass(), "totalExpertHighScore", 1959099942);
        setIntField(term185715, term185715.getClass(), "totalMasterHighScore", 1932069628);
        setIntField(term185715, term185715.getClass(), "totalReMasterHighScore", 1649311104);
        setIntField(term185715, term185715.getClass(), "totalHighSync", 1025506057);
        setIntField(term185715, term185715.getClass(), "totalEasySync", 601059365);
        setIntField(term185715, term185715.getClass(), "totalBasicSync", 1026733238);
        setIntField(term185715, term185715.getClass(), "totalAdvancedSync", 921660563);
        setIntField(term185715, term185715.getClass(), "totalExpertSync", 420714103);
        setIntField(term185715, term185715.getClass(), "totalMasterSync", 232994413);
        setIntField(term185715, term185715.getClass(), "totalReMasterSync", -1475487845);
        setIntField(term185715, term185715.getClass(), "playerRating", 268873567);
        setIntField(term185715, term185715.getClass(), "highestRating", 1530898333);
        setIntField(term185715, term185715.getClass(), "rankAuthTailId", -1199255687);
        setField(term185715, term185715.getClass(), "eventWatchedDate", "hvogGekBHB");
        setField(term185715, term185715.getClass(), "webLimitDate", "KAxZjUYFWX");
        setIntField(term185715, term185715.getClass(), "challengeTrackPhase", -830059594);
        setIntField(term185715, term185715.getClass(), "firstPlayBits", -1110175286);
        setField(term185715, term185715.getClass(), "lastPlayDate", "dnWLZqVKzE");
        setIntField(term185715, term185715.getClass(), "lastPlaceId", 1740225475);
        setField(term185715, term185715.getClass(), "lastPlaceName", "yKNhWIXreq");
        setIntField(term185715, term185715.getClass(), "lastRegionId", 1222984530);
        setField(term185715, term185715.getClass(), "lastRegionName", "aGkAdbRgHR");
        setField(term185715, term185715.getClass(), "lastClientId", "SFoAEuJBfh");
        setField(term185715, term185715.getClass(), "lastCountryCode", "zXNGAMtbCF");
        setIntField(term185715, term185715.getClass(), "eventPoint", -404928510);
        setIntField(term185715, term185715.getClass(), "totalLv", -1093163646);
        setIntField(term185715, term185715.getClass(), "lastLoginBonusDay", 1804120888);
        setIntField(term185715, term185715.getClass(), "lastSurvivalBonusDay", -192927013);
        setIntField(term185715, term185715.getClass(), "loginBonusLv", 1550154031);
        setField(term185713, term185713.getClass(), "user", term185715);
        setIntField(term185713, term185713.getClass(), "musicId", 929794933);
        setIntField(term185713, term185713.getClass(), "level", 1124974525);
        setIntField(term185713, term185713.getClass(), "playCount", -1399728021);
        setIntField(term185713, term185713.getClass(), "scoreMax", 369311910);
        setIntField(term185713, term185713.getClass(), "syncRateMax", 11296902);
        setBooleanField(term185713, term185713.getClass(), "isAllPerfect", true);
        setIntField(term185713, term185713.getClass(), "isAllPerfectPlus", -225155806);
        setIntField(term185713, term185713.getClass(), "fullCombo", -1557465700);
        setIntField(term185713, term185713.getClass(), "maxFever", 549674955);
        setIntField(term185713, term185713.getClass(), "achievement", 1093615997);
        term185899 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term185899;
        callMethod(klass, "setAllPerfect", argTypes, term185713, args);
    }

};


