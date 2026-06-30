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

public class UserCharacter_setUseCount_146439087612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192006;
     Object term192363;

    public UserCharacter_setUseCount_146439087612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term192012 = new Long(-8398381579707958144L);
        Integer term192075 = new Integer(406731696);
        Integer term192077 = new Integer(690233885);
        Integer term192079 = new Integer(-1482271539);
        Integer term192081 = new Integer(52686140);
        Integer term192083 = new Integer(-352835881);
        Integer term192085 = new Integer(2119021005);
        ArrayList term192073 = new ArrayList();
        ((ArrayList) term192073).add(term192075);
        ((ArrayList) term192073).add(term192077);
        ((ArrayList) term192073).add(term192079);
        ((ArrayList) term192073).add(term192081);
        ((ArrayList) term192073).add(term192083);
        ((ArrayList) term192073).add(term192085);
        ArrayList term192089 = new ArrayList();
        term192006 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter"));
        Object term192008 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term192010 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term192026 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term192027 = newInstance(Class.forName("java.time.LocalDate"));
        Object term192031 = newInstance(Class.forName("java.time.LocalTime"));
        Object term192036 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term192037 = newInstance(Class.forName("java.time.LocalDate"));
        Object term192041 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term192006, term192006.getClass(), "id", -8337123816733562994L);
        setLongField(term192008, term192008.getClass(), "id", -8921672016906534362L);
        setLongField(term192010, term192010.getClass(), "id", 1234590873555457498L);
        setField(term192010, term192010.getClass(), "extId", term192012);
        setField(term192010, term192010.getClass(), "luid", "rVKVHcfKQD");
        setIntField(term192027, term192027.getClass(), "year", 2028);
        setShortField(term192027, term192027.getClass(), "month", (short) 10);
        setShortField(term192027, term192027.getClass(), "day", (short) 5);
        setField(term192026, term192026.getClass(), "date", term192027);
        setByteField(term192031, term192031.getClass(), "hour", (byte) 0);
        setByteField(term192031, term192031.getClass(), "minute", (byte) 53);
        setByteField(term192031, term192031.getClass(), "second", (byte) 18);
        setIntField(term192031, term192031.getClass(), "nano", 567999687);
        setField(term192026, term192026.getClass(), "time", term192031);
        setField(term192010, term192010.getClass(), "registerTime", term192026);
        setIntField(term192037, term192037.getClass(), "year", 2029);
        setShortField(term192037, term192037.getClass(), "month", (short) 7);
        setShortField(term192037, term192037.getClass(), "day", (short) 30);
        setField(term192036, term192036.getClass(), "date", term192037);
        setByteField(term192041, term192041.getClass(), "hour", (byte) 23);
        setByteField(term192041, term192041.getClass(), "minute", (byte) 35);
        setByteField(term192041, term192041.getClass(), "second", (byte) 35);
        setIntField(term192041, term192041.getClass(), "nano", 848673909);
        setField(term192036, term192036.getClass(), "time", term192041);
        setField(term192010, term192010.getClass(), "accessTime", term192036);
        setField(term192008, term192008.getClass(), "card", term192010);
        setField(term192008, term192008.getClass(), "userName", "TvgFLUmwwW");
        setIntField(term192008, term192008.getClass(), "isNetMember", -826362969);
        setIntField(term192008, term192008.getClass(), "iconId", 1062563319);
        setIntField(term192008, term192008.getClass(), "plateId", 515240740);
        setIntField(term192008, term192008.getClass(), "titleId", -1221744120);
        setIntField(term192008, term192008.getClass(), "partnerId", 1995800837);
        setIntField(term192008, term192008.getClass(), "frameId", -59523762);
        setIntField(term192008, term192008.getClass(), "selectMapId", 25345151);
        setIntField(term192008, term192008.getClass(), "totalAwake", 651655016);
        setIntField(term192008, term192008.getClass(), "gradeRating", -1388448851);
        setIntField(term192008, term192008.getClass(), "musicRating", -1565944347);
        setIntField(term192008, term192008.getClass(), "playerRating", 20706388);
        setIntField(term192008, term192008.getClass(), "highestRating", 836069699);
        setIntField(term192008, term192008.getClass(), "gradeRank", 1595274836);
        setIntField(term192008, term192008.getClass(), "classRank", 691227128);
        setIntField(term192008, term192008.getClass(), "courseRank", 1336238944);
        setField(term192008, term192008.getClass(), "charaSlot", term192073);
        setField(term192008, term192008.getClass(), "charaLockSlot", term192089);
        setLongField(term192008, term192008.getClass(), "contentBit", -5594266310801831914L);
        setIntField(term192008, term192008.getClass(), "playCount", -523694473);
        setField(term192008, term192008.getClass(), "eventWatchedDate", "LrNiWJYyTG");
        setField(term192008, term192008.getClass(), "lastGameId", "ELrjumEBLg");
        setField(term192008, term192008.getClass(), "lastRomVersion", "xbmZKVroup");
        setField(term192008, term192008.getClass(), "lastDataVersion", "LZMAvggNMe");
        setField(term192008, term192008.getClass(), "lastLoginDate", "vnpnXFWzvr");
        setField(term192008, term192008.getClass(), "lastPlayDate", "cbudVbeXed");
        setIntField(term192008, term192008.getClass(), "lastPlayCredit", 662814388);
        setIntField(term192008, term192008.getClass(), "lastPlayMode", -988634792);
        setIntField(term192008, term192008.getClass(), "lastPlaceId", -985800486);
        setField(term192008, term192008.getClass(), "lastPlaceName", "nUwJJPksYx");
        setIntField(term192008, term192008.getClass(), "lastAllNetId", 104926979);
        setIntField(term192008, term192008.getClass(), "lastRegionId", 21442244);
        setField(term192008, term192008.getClass(), "lastRegionName", "bkYmvWePQT");
        setField(term192008, term192008.getClass(), "lastClientId", "jxDxrLRRcq");
        setField(term192008, term192008.getClass(), "lastCountryCode", "rTpdeGCRay");
        setIntField(term192008, term192008.getClass(), "lastSelectEMoney", -644090733);
        setIntField(term192008, term192008.getClass(), "lastSelectTicket", 1357265093);
        setIntField(term192008, term192008.getClass(), "lastSelectCourse", -383207990);
        setIntField(term192008, term192008.getClass(), "lastCountCourse", 115447081);
        setField(term192008, term192008.getClass(), "firstGameId", "zXdwBSOjJU");
        setField(term192008, term192008.getClass(), "firstRomVersion", "fCgIgrkuJo");
        setField(term192008, term192008.getClass(), "firstDataVersion", "ymsVUhZoWG");
        setField(term192008, term192008.getClass(), "firstPlayDate", "rZQVdeAYlM");
        setField(term192008, term192008.getClass(), "compatibleCmVersion", "miQpwHDBxH");
        setField(term192008, term192008.getClass(), "dailyBonusDate", "SDiMckZWSA");
        setField(term192008, term192008.getClass(), "dailyCourseBonusDate", "lBtaWtPHWf");
        setField(term192008, term192008.getClass(), "lastPairLoginDate", "ebaQRypTcS");
        setField(term192008, term192008.getClass(), "lastTrialPlayDate", "acbKooiVyt");
        setIntField(term192008, term192008.getClass(), "playVsCount", -1256761775);
        setIntField(term192008, term192008.getClass(), "playSyncCount", -203447420);
        setIntField(term192008, term192008.getClass(), "winCount", -1006644586);
        setIntField(term192008, term192008.getClass(), "helpCount", -1509130004);
        setIntField(term192008, term192008.getClass(), "comboCount", 2130734848);
        setLongField(term192008, term192008.getClass(), "totalDeluxscore", -8038991382672778520L);
        setLongField(term192008, term192008.getClass(), "totalBasicDeluxscore", 1528436527758807897L);
        setLongField(term192008, term192008.getClass(), "totalAdvancedDeluxscore", 8596776356769062426L);
        setLongField(term192008, term192008.getClass(), "totalExpertDeluxscore", 5489801275022449174L);
        setLongField(term192008, term192008.getClass(), "totalMasterDeluxscore", 3670199197813857510L);
        setLongField(term192008, term192008.getClass(), "totalReMasterDeluxscore", -6945994942019671231L);
        setIntField(term192008, term192008.getClass(), "totalSync", 1166123699);
        setIntField(term192008, term192008.getClass(), "totalBasicSync", -1457506209);
        setIntField(term192008, term192008.getClass(), "totalAdvancedSync", -1619288980);
        setIntField(term192008, term192008.getClass(), "totalExpertSync", -1191842125);
        setIntField(term192008, term192008.getClass(), "totalMasterSync", 800085811);
        setIntField(term192008, term192008.getClass(), "totalReMasterSync", -991536181);
        setLongField(term192008, term192008.getClass(), "totalAchievement", 998429988856827865L);
        setLongField(term192008, term192008.getClass(), "totalBasicAchievement", -8091705543121844925L);
        setLongField(term192008, term192008.getClass(), "totalAdvancedAchievement", 1302712590640978911L);
        setLongField(term192008, term192008.getClass(), "totalExpertAchievement", -7957881599739235622L);
        setLongField(term192008, term192008.getClass(), "totalMasterAchievement", -396071947160054847L);
        setLongField(term192008, term192008.getClass(), "totalReMasterAchievement", 2937562706259874365L);
        setLongField(term192008, term192008.getClass(), "playerOldRating", 206671275196386798L);
        setLongField(term192008, term192008.getClass(), "playerNewRating", -7596468049174943101L);
        setIntField(term192008, term192008.getClass(), "banState", 1245758357);
        setLongField(term192008, term192008.getClass(), "dateTime", -8934829546091064707L);
        setField(term192006, term192006.getClass(), "user", term192008);
        setIntField(term192006, term192006.getClass(), "characterId", 957593927);
        setIntField(term192006, term192006.getClass(), "level", 1947837575);
        setIntField(term192006, term192006.getClass(), "awakening", 1877399032);
        setIntField(term192006, term192006.getClass(), "useCount", -322909871);
        term192363 = new Integer(-1837027129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term192363;
        callMethod(klass, "setUseCount", argTypes, term192006, args);
    }

};


