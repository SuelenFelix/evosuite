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

public class UserExtend_setExtendContentBit_149340924325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156906;
     Object term157285;

    public UserExtend_setExtendContentBit_149340924325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term156912 = new Long(-4714000263923324167L);
        Integer term156975 = new Integer(-971143668);
        ArrayList term156973 = new ArrayList();
        ((ArrayList) term156973).add(term156975);
        Integer term156981 = new Integer(127763053);
        Integer term156983 = new Integer(968035207);
        Integer term156985 = new Integer(-643589717);
        Integer term156987 = new Integer(-1599482698);
        Integer term156989 = new Integer(-370600915);
        Integer term156991 = new Integer(-311572875);
        Integer term156993 = new Integer(355595594);
        ArrayList term156979 = new ArrayList();
        ((ArrayList) term156979).add(term156981);
        ((ArrayList) term156979).add(term156983);
        ((ArrayList) term156979).add(term156985);
        ((ArrayList) term156979).add(term156987);
        ((ArrayList) term156979).add(term156989);
        ((ArrayList) term156979).add(term156991);
        ((ArrayList) term156979).add(term156993);
        Integer term157277 = new Integer(842697786);
        ArrayList term157275 = new ArrayList();
        ((ArrayList) term157275).add(term157277);
        ArrayList term157281 = new ArrayList();
        term156906 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        Object term156908 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term156910 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term156926 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156927 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156931 = newInstance(Class.forName("java.time.LocalTime"));
        Object term156936 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156937 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156941 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term156906, term156906.getClass(), "id", 5476908332056798537L);
        setLongField(term156908, term156908.getClass(), "id", -1246408628373508012L);
        setLongField(term156910, term156910.getClass(), "id", -6478745274246057222L);
        setField(term156910, term156910.getClass(), "extId", term156912);
        setField(term156910, term156910.getClass(), "luid", "vQjtGUwOfe");
        setIntField(term156927, term156927.getClass(), "year", 2016);
        setShortField(term156927, term156927.getClass(), "month", (short) 5);
        setShortField(term156927, term156927.getClass(), "day", (short) 15);
        setField(term156926, term156926.getClass(), "date", term156927);
        setByteField(term156931, term156931.getClass(), "hour", (byte) 13);
        setByteField(term156931, term156931.getClass(), "minute", (byte) 7);
        setByteField(term156931, term156931.getClass(), "second", (byte) 29);
        setIntField(term156931, term156931.getClass(), "nano", 36973761);
        setField(term156926, term156926.getClass(), "time", term156931);
        setField(term156910, term156910.getClass(), "registerTime", term156926);
        setIntField(term156937, term156937.getClass(), "year", 2028);
        setShortField(term156937, term156937.getClass(), "month", (short) 11);
        setShortField(term156937, term156937.getClass(), "day", (short) 8);
        setField(term156936, term156936.getClass(), "date", term156937);
        setByteField(term156941, term156941.getClass(), "hour", (byte) 11);
        setByteField(term156941, term156941.getClass(), "minute", (byte) 41);
        setByteField(term156941, term156941.getClass(), "second", (byte) 26);
        setIntField(term156941, term156941.getClass(), "nano", 234822620);
        setField(term156936, term156936.getClass(), "time", term156941);
        setField(term156910, term156910.getClass(), "accessTime", term156936);
        setField(term156908, term156908.getClass(), "card", term156910);
        setField(term156908, term156908.getClass(), "userName", "XQbCHMjIJN");
        setIntField(term156908, term156908.getClass(), "isNetMember", -466521355);
        setIntField(term156908, term156908.getClass(), "iconId", -1955693211);
        setIntField(term156908, term156908.getClass(), "plateId", -7776274);
        setIntField(term156908, term156908.getClass(), "titleId", 261333033);
        setIntField(term156908, term156908.getClass(), "partnerId", 2106793317);
        setIntField(term156908, term156908.getClass(), "frameId", 1986891073);
        setIntField(term156908, term156908.getClass(), "selectMapId", -2061943399);
        setIntField(term156908, term156908.getClass(), "totalAwake", 1790913385);
        setIntField(term156908, term156908.getClass(), "gradeRating", 115596044);
        setIntField(term156908, term156908.getClass(), "musicRating", -2070075342);
        setIntField(term156908, term156908.getClass(), "playerRating", -546499544);
        setIntField(term156908, term156908.getClass(), "highestRating", 546477713);
        setIntField(term156908, term156908.getClass(), "gradeRank", -1529353819);
        setIntField(term156908, term156908.getClass(), "classRank", 115568532);
        setIntField(term156908, term156908.getClass(), "courseRank", 1917902884);
        setField(term156908, term156908.getClass(), "charaSlot", term156973);
        setField(term156908, term156908.getClass(), "charaLockSlot", term156979);
        setLongField(term156908, term156908.getClass(), "contentBit", 3163262868554272785L);
        setIntField(term156908, term156908.getClass(), "playCount", 247896466);
        setField(term156908, term156908.getClass(), "eventWatchedDate", "amaRjUoHzE");
        setField(term156908, term156908.getClass(), "lastGameId", "wZvDZQbQkT");
        setField(term156908, term156908.getClass(), "lastRomVersion", "PjoFrjVnvp");
        setField(term156908, term156908.getClass(), "lastDataVersion", "GpMCgmyrOD");
        setField(term156908, term156908.getClass(), "lastLoginDate", "PLzRVzTTYD");
        setField(term156908, term156908.getClass(), "lastPlayDate", "CqbaNMhyiw");
        setIntField(term156908, term156908.getClass(), "lastPlayCredit", -931397750);
        setIntField(term156908, term156908.getClass(), "lastPlayMode", 1967564631);
        setIntField(term156908, term156908.getClass(), "lastPlaceId", -1201113309);
        setField(term156908, term156908.getClass(), "lastPlaceName", "wONtKlWTYQ");
        setIntField(term156908, term156908.getClass(), "lastAllNetId", 1234432017);
        setIntField(term156908, term156908.getClass(), "lastRegionId", -1323037797);
        setField(term156908, term156908.getClass(), "lastRegionName", "bWswflOaHX");
        setField(term156908, term156908.getClass(), "lastClientId", "foIizkyVeR");
        setField(term156908, term156908.getClass(), "lastCountryCode", "eohWMLzQjb");
        setIntField(term156908, term156908.getClass(), "lastSelectEMoney", -534003181);
        setIntField(term156908, term156908.getClass(), "lastSelectTicket", 656088138);
        setIntField(term156908, term156908.getClass(), "lastSelectCourse", -1756129889);
        setIntField(term156908, term156908.getClass(), "lastCountCourse", -1649701020);
        setField(term156908, term156908.getClass(), "firstGameId", "rVRShyvOxF");
        setField(term156908, term156908.getClass(), "firstRomVersion", "esjLVLaZjU");
        setField(term156908, term156908.getClass(), "firstDataVersion", "sjMukKEPTQ");
        setField(term156908, term156908.getClass(), "firstPlayDate", "AarWepexbz");
        setField(term156908, term156908.getClass(), "compatibleCmVersion", "XaYdQMGKRk");
        setField(term156908, term156908.getClass(), "dailyBonusDate", "kIIognzCdz");
        setField(term156908, term156908.getClass(), "dailyCourseBonusDate", "urMZxEQIXl");
        setField(term156908, term156908.getClass(), "lastPairLoginDate", "EoYFVoOjqB");
        setField(term156908, term156908.getClass(), "lastTrialPlayDate", "fWgDjgGWKF");
        setIntField(term156908, term156908.getClass(), "playVsCount", 183048798);
        setIntField(term156908, term156908.getClass(), "playSyncCount", 50192659);
        setIntField(term156908, term156908.getClass(), "winCount", -1586884307);
        setIntField(term156908, term156908.getClass(), "helpCount", 761198462);
        setIntField(term156908, term156908.getClass(), "comboCount", -2001015455);
        setLongField(term156908, term156908.getClass(), "totalDeluxscore", -2863346279002051597L);
        setLongField(term156908, term156908.getClass(), "totalBasicDeluxscore", 8484845463796458489L);
        setLongField(term156908, term156908.getClass(), "totalAdvancedDeluxscore", 6844090800515537410L);
        setLongField(term156908, term156908.getClass(), "totalExpertDeluxscore", -1624923670031801093L);
        setLongField(term156908, term156908.getClass(), "totalMasterDeluxscore", 569733731026445703L);
        setLongField(term156908, term156908.getClass(), "totalReMasterDeluxscore", 3266559929139394086L);
        setIntField(term156908, term156908.getClass(), "totalSync", -1300443569);
        setIntField(term156908, term156908.getClass(), "totalBasicSync", 1758954430);
        setIntField(term156908, term156908.getClass(), "totalAdvancedSync", 343381557);
        setIntField(term156908, term156908.getClass(), "totalExpertSync", 1072458409);
        setIntField(term156908, term156908.getClass(), "totalMasterSync", -369157778);
        setIntField(term156908, term156908.getClass(), "totalReMasterSync", -1406308770);
        setLongField(term156908, term156908.getClass(), "totalAchievement", -2010921040891117409L);
        setLongField(term156908, term156908.getClass(), "totalBasicAchievement", -8298120273216209299L);
        setLongField(term156908, term156908.getClass(), "totalAdvancedAchievement", -4382708033180016508L);
        setLongField(term156908, term156908.getClass(), "totalExpertAchievement", 3847813637209840298L);
        setLongField(term156908, term156908.getClass(), "totalMasterAchievement", -1924935306238826190L);
        setLongField(term156908, term156908.getClass(), "totalReMasterAchievement", 2587802307541052389L);
        setLongField(term156908, term156908.getClass(), "playerOldRating", 3533169544094281550L);
        setLongField(term156908, term156908.getClass(), "playerNewRating", -200593928551791147L);
        setIntField(term156908, term156908.getClass(), "banState", 1787438187);
        setLongField(term156908, term156908.getClass(), "dateTime", -2958525951944477629L);
        setField(term156906, term156906.getClass(), "user", term156908);
        setIntField(term156906, term156906.getClass(), "selectMusicId", -1595839174);
        setIntField(term156906, term156906.getClass(), "selectDifficultyId", -842864130);
        setIntField(term156906, term156906.getClass(), "categoryIndex", 1397121874);
        setIntField(term156906, term156906.getClass(), "musicIndex", 81915067);
        setIntField(term156906, term156906.getClass(), "extraFlag", 81408490);
        setIntField(term156906, term156906.getClass(), "selectScoreType", 242316145);
        setLongField(term156906, term156906.getClass(), "extendContentBit", 3445861884516336038L);
        setBooleanField(term156906, term156906.getClass(), "isPhotoAgree", false);
        setBooleanField(term156906, term156906.getClass(), "isGotoCodeRead", false);
        setBooleanField(term156906, term156906.getClass(), "selectResultDetails", true);
        setIntField(term156906, term156906.getClass(), "sortCategorySetting", 1646990992);
        setIntField(term156906, term156906.getClass(), "sortMusicSetting", 1908475105);
        setField(term156906, term156906.getClass(), "selectedCardList", term157275);
        setField(term156906, term156906.getClass(), "encountMapNpcList", term157281);
        term157285 = new Long(-938134894793146194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term157285;
        callMethod(klass, "setExtendContentBit", argTypes, term156906, args);
    }

};


