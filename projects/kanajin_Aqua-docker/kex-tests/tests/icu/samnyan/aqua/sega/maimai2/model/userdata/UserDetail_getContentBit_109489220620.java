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

public class UserDetail_getContentBit_109489220620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206908;

    public UserDetail_getContentBit_109489220620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term206912 = new Long(-5552123402871285352L);
        ArrayList term206973 = new ArrayList();
        Integer term206979 = new Integer(720355914);
        ArrayList term206977 = new ArrayList();
        ((ArrayList) term206977).add(term206979);
        term206908 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term206910 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term206926 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term206927 = newInstance(Class.forName("java.time.LocalDate"));
        Object term206931 = newInstance(Class.forName("java.time.LocalTime"));
        Object term206936 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term206937 = newInstance(Class.forName("java.time.LocalDate"));
        Object term206941 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term206908, term206908.getClass(), "id", -2746737972931875478L);
        setLongField(term206910, term206910.getClass(), "id", -2149342198360488972L);
        setField(term206910, term206910.getClass(), "extId", term206912);
        setField(term206910, term206910.getClass(), "luid", "gFagUPdepk");
        setIntField(term206927, term206927.getClass(), "year", 2012);
        setShortField(term206927, term206927.getClass(), "month", (short) 2);
        setShortField(term206927, term206927.getClass(), "day", (short) 16);
        setField(term206926, term206926.getClass(), "date", term206927);
        setByteField(term206931, term206931.getClass(), "hour", (byte) 5);
        setByteField(term206931, term206931.getClass(), "minute", (byte) 12);
        setByteField(term206931, term206931.getClass(), "second", (byte) 33);
        setIntField(term206931, term206931.getClass(), "nano", 551526646);
        setField(term206926, term206926.getClass(), "time", term206931);
        setField(term206910, term206910.getClass(), "registerTime", term206926);
        setIntField(term206937, term206937.getClass(), "year", 2028);
        setShortField(term206937, term206937.getClass(), "month", (short) 5);
        setShortField(term206937, term206937.getClass(), "day", (short) 29);
        setField(term206936, term206936.getClass(), "date", term206937);
        setByteField(term206941, term206941.getClass(), "hour", (byte) 0);
        setByteField(term206941, term206941.getClass(), "minute", (byte) 20);
        setByteField(term206941, term206941.getClass(), "second", (byte) 4);
        setIntField(term206941, term206941.getClass(), "nano", 186776026);
        setField(term206936, term206936.getClass(), "time", term206941);
        setField(term206910, term206910.getClass(), "accessTime", term206936);
        setField(term206908, term206908.getClass(), "card", term206910);
        setField(term206908, term206908.getClass(), "userName", "CxWFYeMwJm");
        setIntField(term206908, term206908.getClass(), "isNetMember", 1629598973);
        setIntField(term206908, term206908.getClass(), "iconId", 26411664);
        setIntField(term206908, term206908.getClass(), "plateId", 1791622790);
        setIntField(term206908, term206908.getClass(), "titleId", -1666988360);
        setIntField(term206908, term206908.getClass(), "partnerId", 1304377188);
        setIntField(term206908, term206908.getClass(), "frameId", 348283942);
        setIntField(term206908, term206908.getClass(), "selectMapId", 776006341);
        setIntField(term206908, term206908.getClass(), "totalAwake", 1145867680);
        setIntField(term206908, term206908.getClass(), "gradeRating", 1382995321);
        setIntField(term206908, term206908.getClass(), "musicRating", 375758346);
        setIntField(term206908, term206908.getClass(), "playerRating", 128390500);
        setIntField(term206908, term206908.getClass(), "highestRating", 2129617215);
        setIntField(term206908, term206908.getClass(), "gradeRank", 123578164);
        setIntField(term206908, term206908.getClass(), "classRank", 496578261);
        setIntField(term206908, term206908.getClass(), "courseRank", -685473621);
        setField(term206908, term206908.getClass(), "charaSlot", term206973);
        setField(term206908, term206908.getClass(), "charaLockSlot", term206977);
        setLongField(term206908, term206908.getClass(), "contentBit", -7034296151494978066L);
        setIntField(term206908, term206908.getClass(), "playCount", -1507226157);
        setField(term206908, term206908.getClass(), "eventWatchedDate", "DYdDFUiAFX");
        setField(term206908, term206908.getClass(), "lastGameId", "cdGQYldbrW");
        setField(term206908, term206908.getClass(), "lastRomVersion", "lwVGewXNkA");
        setField(term206908, term206908.getClass(), "lastDataVersion", "mgbtuVQdfq");
        setField(term206908, term206908.getClass(), "lastLoginDate", "THQSpaljMm");
        setField(term206908, term206908.getClass(), "lastPlayDate", "bjNoIGSbRa");
        setIntField(term206908, term206908.getClass(), "lastPlayCredit", 2048976325);
        setIntField(term206908, term206908.getClass(), "lastPlayMode", 1946370960);
        setIntField(term206908, term206908.getClass(), "lastPlaceId", -1208286860);
        setField(term206908, term206908.getClass(), "lastPlaceName", "eIxxueawmN");
        setIntField(term206908, term206908.getClass(), "lastAllNetId", -1558614690);
        setIntField(term206908, term206908.getClass(), "lastRegionId", -1007231272);
        setField(term206908, term206908.getClass(), "lastRegionName", "volmBRjfjo");
        setField(term206908, term206908.getClass(), "lastClientId", "lTWvOENdcy");
        setField(term206908, term206908.getClass(), "lastCountryCode", "ScNRCxypAO");
        setIntField(term206908, term206908.getClass(), "lastSelectEMoney", 616194988);
        setIntField(term206908, term206908.getClass(), "lastSelectTicket", 875212303);
        setIntField(term206908, term206908.getClass(), "lastSelectCourse", -1724746051);
        setIntField(term206908, term206908.getClass(), "lastCountCourse", -1978836967);
        setField(term206908, term206908.getClass(), "firstGameId", "jauAZKXWsp");
        setField(term206908, term206908.getClass(), "firstRomVersion", "ZSwsDVYLra");
        setField(term206908, term206908.getClass(), "firstDataVersion", "GefAefFWCB");
        setField(term206908, term206908.getClass(), "firstPlayDate", "NFDAfgipvv");
        setField(term206908, term206908.getClass(), "compatibleCmVersion", "iDqyyAyaWC");
        setField(term206908, term206908.getClass(), "dailyBonusDate", "JWnRzsRhyi");
        setField(term206908, term206908.getClass(), "dailyCourseBonusDate", "OajYNYoFoO");
        setField(term206908, term206908.getClass(), "lastPairLoginDate", "YmnfzUxjAx");
        setField(term206908, term206908.getClass(), "lastTrialPlayDate", "BoxVogOjdw");
        setIntField(term206908, term206908.getClass(), "playVsCount", 223766580);
        setIntField(term206908, term206908.getClass(), "playSyncCount", -1028401307);
        setIntField(term206908, term206908.getClass(), "winCount", -749032967);
        setIntField(term206908, term206908.getClass(), "helpCount", 399255289);
        setIntField(term206908, term206908.getClass(), "comboCount", -188927419);
        setLongField(term206908, term206908.getClass(), "totalDeluxscore", -6146142113347625999L);
        setLongField(term206908, term206908.getClass(), "totalBasicDeluxscore", -7133010630953586020L);
        setLongField(term206908, term206908.getClass(), "totalAdvancedDeluxscore", -1097157523065435288L);
        setLongField(term206908, term206908.getClass(), "totalExpertDeluxscore", -7844861193927750132L);
        setLongField(term206908, term206908.getClass(), "totalMasterDeluxscore", -860682302683028822L);
        setLongField(term206908, term206908.getClass(), "totalReMasterDeluxscore", 17244785355570463L);
        setIntField(term206908, term206908.getClass(), "totalSync", 865923167);
        setIntField(term206908, term206908.getClass(), "totalBasicSync", 411168220);
        setIntField(term206908, term206908.getClass(), "totalAdvancedSync", -37027662);
        setIntField(term206908, term206908.getClass(), "totalExpertSync", 1314903229);
        setIntField(term206908, term206908.getClass(), "totalMasterSync", 1315243912);
        setIntField(term206908, term206908.getClass(), "totalReMasterSync", 1457074887);
        setLongField(term206908, term206908.getClass(), "totalAchievement", 995195003475950632L);
        setLongField(term206908, term206908.getClass(), "totalBasicAchievement", -2796992689516620991L);
        setLongField(term206908, term206908.getClass(), "totalAdvancedAchievement", 8580748612869592157L);
        setLongField(term206908, term206908.getClass(), "totalExpertAchievement", -5159869066555402511L);
        setLongField(term206908, term206908.getClass(), "totalMasterAchievement", -1243173272477811733L);
        setLongField(term206908, term206908.getClass(), "totalReMasterAchievement", -5732733563551384959L);
        setLongField(term206908, term206908.getClass(), "playerOldRating", 6507693519590541316L);
        setLongField(term206908, term206908.getClass(), "playerNewRating", -666884393422185190L);
        setIntField(term206908, term206908.getClass(), "banState", 1963312777);
        setLongField(term206908, term206908.getClass(), "dateTime", -6395891323159812853L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContentBit", argTypes, term206908, args);
    }

};


