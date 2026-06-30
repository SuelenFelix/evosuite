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

public class UserDetail_getContentBit_109489220621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206963;

    public UserDetail_getContentBit_109489220621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term206967 = new Long(-5552123402871285352L);
        ArrayList term207028 = new ArrayList();
        Integer term207034 = new Integer(720355914);
        ArrayList term207032 = new ArrayList();
        ((ArrayList) term207032).add(term207034);
        term206963 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term206965 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term206981 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term206982 = newInstance(Class.forName("java.time.LocalDate"));
        Object term206986 = newInstance(Class.forName("java.time.LocalTime"));
        Object term206991 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term206992 = newInstance(Class.forName("java.time.LocalDate"));
        Object term206996 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term206963, term206963.getClass(), "id", -2746737972931875478L);
        setLongField(term206965, term206965.getClass(), "id", -2149342198360488972L);
        setField(term206965, term206965.getClass(), "extId", term206967);
        setField(term206965, term206965.getClass(), "luid", "gFagUPdepk");
        setIntField(term206982, term206982.getClass(), "year", 2012);
        setShortField(term206982, term206982.getClass(), "month", (short) 2);
        setShortField(term206982, term206982.getClass(), "day", (short) 16);
        setField(term206981, term206981.getClass(), "date", term206982);
        setByteField(term206986, term206986.getClass(), "hour", (byte) 5);
        setByteField(term206986, term206986.getClass(), "minute", (byte) 12);
        setByteField(term206986, term206986.getClass(), "second", (byte) 33);
        setIntField(term206986, term206986.getClass(), "nano", 551526646);
        setField(term206981, term206981.getClass(), "time", term206986);
        setField(term206965, term206965.getClass(), "registerTime", term206981);
        setIntField(term206992, term206992.getClass(), "year", 2028);
        setShortField(term206992, term206992.getClass(), "month", (short) 5);
        setShortField(term206992, term206992.getClass(), "day", (short) 29);
        setField(term206991, term206991.getClass(), "date", term206992);
        setByteField(term206996, term206996.getClass(), "hour", (byte) 0);
        setByteField(term206996, term206996.getClass(), "minute", (byte) 20);
        setByteField(term206996, term206996.getClass(), "second", (byte) 4);
        setIntField(term206996, term206996.getClass(), "nano", 186776026);
        setField(term206991, term206991.getClass(), "time", term206996);
        setField(term206965, term206965.getClass(), "accessTime", term206991);
        setField(term206963, term206963.getClass(), "card", term206965);
        setField(term206963, term206963.getClass(), "userName", "CxWFYeMwJm");
        setIntField(term206963, term206963.getClass(), "isNetMember", 1629598973);
        setIntField(term206963, term206963.getClass(), "iconId", 26411664);
        setIntField(term206963, term206963.getClass(), "plateId", 1791622790);
        setIntField(term206963, term206963.getClass(), "titleId", -1666988360);
        setIntField(term206963, term206963.getClass(), "partnerId", 1304377188);
        setIntField(term206963, term206963.getClass(), "frameId", 348283942);
        setIntField(term206963, term206963.getClass(), "selectMapId", 776006341);
        setIntField(term206963, term206963.getClass(), "totalAwake", 1145867680);
        setIntField(term206963, term206963.getClass(), "gradeRating", 1382995321);
        setIntField(term206963, term206963.getClass(), "musicRating", 375758346);
        setIntField(term206963, term206963.getClass(), "playerRating", 128390500);
        setIntField(term206963, term206963.getClass(), "highestRating", 2129617215);
        setIntField(term206963, term206963.getClass(), "gradeRank", 123578164);
        setIntField(term206963, term206963.getClass(), "classRank", 496578261);
        setIntField(term206963, term206963.getClass(), "courseRank", -685473621);
        setField(term206963, term206963.getClass(), "charaSlot", term207028);
        setField(term206963, term206963.getClass(), "charaLockSlot", term207032);
        setLongField(term206963, term206963.getClass(), "contentBit", -7034296151494978066L);
        setIntField(term206963, term206963.getClass(), "playCount", -1507226157);
        setField(term206963, term206963.getClass(), "eventWatchedDate", "DYdDFUiAFX");
        setField(term206963, term206963.getClass(), "lastGameId", "cdGQYldbrW");
        setField(term206963, term206963.getClass(), "lastRomVersion", "lwVGewXNkA");
        setField(term206963, term206963.getClass(), "lastDataVersion", "mgbtuVQdfq");
        setField(term206963, term206963.getClass(), "lastLoginDate", "THQSpaljMm");
        setField(term206963, term206963.getClass(), "lastPlayDate", "bjNoIGSbRa");
        setIntField(term206963, term206963.getClass(), "lastPlayCredit", 2048976325);
        setIntField(term206963, term206963.getClass(), "lastPlayMode", 1946370960);
        setIntField(term206963, term206963.getClass(), "lastPlaceId", -1208286860);
        setField(term206963, term206963.getClass(), "lastPlaceName", "eIxxueawmN");
        setIntField(term206963, term206963.getClass(), "lastAllNetId", -1558614690);
        setIntField(term206963, term206963.getClass(), "lastRegionId", -1007231272);
        setField(term206963, term206963.getClass(), "lastRegionName", "volmBRjfjo");
        setField(term206963, term206963.getClass(), "lastClientId", "lTWvOENdcy");
        setField(term206963, term206963.getClass(), "lastCountryCode", "ScNRCxypAO");
        setIntField(term206963, term206963.getClass(), "lastSelectEMoney", 616194988);
        setIntField(term206963, term206963.getClass(), "lastSelectTicket", 875212303);
        setIntField(term206963, term206963.getClass(), "lastSelectCourse", -1724746051);
        setIntField(term206963, term206963.getClass(), "lastCountCourse", -1978836967);
        setField(term206963, term206963.getClass(), "firstGameId", "jauAZKXWsp");
        setField(term206963, term206963.getClass(), "firstRomVersion", "ZSwsDVYLra");
        setField(term206963, term206963.getClass(), "firstDataVersion", "GefAefFWCB");
        setField(term206963, term206963.getClass(), "firstPlayDate", "NFDAfgipvv");
        setField(term206963, term206963.getClass(), "compatibleCmVersion", "iDqyyAyaWC");
        setField(term206963, term206963.getClass(), "dailyBonusDate", "JWnRzsRhyi");
        setField(term206963, term206963.getClass(), "dailyCourseBonusDate", "OajYNYoFoO");
        setField(term206963, term206963.getClass(), "lastPairLoginDate", "YmnfzUxjAx");
        setField(term206963, term206963.getClass(), "lastTrialPlayDate", "BoxVogOjdw");
        setIntField(term206963, term206963.getClass(), "playVsCount", 223766580);
        setIntField(term206963, term206963.getClass(), "playSyncCount", -1028401307);
        setIntField(term206963, term206963.getClass(), "winCount", -749032967);
        setIntField(term206963, term206963.getClass(), "helpCount", 399255289);
        setIntField(term206963, term206963.getClass(), "comboCount", -188927419);
        setLongField(term206963, term206963.getClass(), "totalDeluxscore", -6146142113347625999L);
        setLongField(term206963, term206963.getClass(), "totalBasicDeluxscore", -7133010630953586020L);
        setLongField(term206963, term206963.getClass(), "totalAdvancedDeluxscore", -1097157523065435288L);
        setLongField(term206963, term206963.getClass(), "totalExpertDeluxscore", -7844861193927750132L);
        setLongField(term206963, term206963.getClass(), "totalMasterDeluxscore", -860682302683028822L);
        setLongField(term206963, term206963.getClass(), "totalReMasterDeluxscore", 17244785355570463L);
        setIntField(term206963, term206963.getClass(), "totalSync", 865923167);
        setIntField(term206963, term206963.getClass(), "totalBasicSync", 411168220);
        setIntField(term206963, term206963.getClass(), "totalAdvancedSync", -37027662);
        setIntField(term206963, term206963.getClass(), "totalExpertSync", 1314903229);
        setIntField(term206963, term206963.getClass(), "totalMasterSync", 1315243912);
        setIntField(term206963, term206963.getClass(), "totalReMasterSync", 1457074887);
        setLongField(term206963, term206963.getClass(), "totalAchievement", 995195003475950632L);
        setLongField(term206963, term206963.getClass(), "totalBasicAchievement", -2796992689516620991L);
        setLongField(term206963, term206963.getClass(), "totalAdvancedAchievement", 8580748612869592157L);
        setLongField(term206963, term206963.getClass(), "totalExpertAchievement", -5159869066555402511L);
        setLongField(term206963, term206963.getClass(), "totalMasterAchievement", -1243173272477811733L);
        setLongField(term206963, term206963.getClass(), "totalReMasterAchievement", -5732733563551384959L);
        setLongField(term206963, term206963.getClass(), "playerOldRating", 6507693519590541316L);
        setLongField(term206963, term206963.getClass(), "playerNewRating", -666884393422185190L);
        setIntField(term206963, term206963.getClass(), "banState", 1963312777);
        setLongField(term206963, term206963.getClass(), "dateTime", -6395891323159812853L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContentBit", argTypes, term206963, args);
    }

};


