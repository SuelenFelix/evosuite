package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserGameOptionEx_setExt2_110539825226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321661;
     Object term321959;

    public UserGameOptionEx_setExt2_110539825226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term321667 = new Long(-4561371668792438386L);
        term321661 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term321663 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term321665 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term321681 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term321682 = newInstance(Class.forName("java.time.LocalDate"));
        Object term321686 = newInstance(Class.forName("java.time.LocalTime"));
        Object term321691 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term321692 = newInstance(Class.forName("java.time.LocalDate"));
        Object term321696 = newInstance(Class.forName("java.time.LocalTime"));
        Object term321713 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term321714 = newInstance(Class.forName("java.time.LocalDate"));
        Object term321718 = newInstance(Class.forName("java.time.LocalTime"));
        Object term321774 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term321775 = newInstance(Class.forName("java.time.LocalDate"));
        Object term321779 = newInstance(Class.forName("java.time.LocalTime"));
        Object term321822 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term321823 = newInstance(Class.forName("java.time.LocalDate"));
        Object term321827 = newInstance(Class.forName("java.time.LocalTime"));
        Object term321868 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term321869 = newInstance(Class.forName("java.time.LocalDate"));
        Object term321873 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term321661, term321661.getClass(), "id", 1380164438427854364L);
        setLongField(term321663, term321663.getClass(), "id", -6362522706978971268L);
        setLongField(term321665, term321665.getClass(), "id", -2522674076029091825L);
        setField(term321665, term321665.getClass(), "extId", term321667);
        setField(term321665, term321665.getClass(), "luid", "zsUxsLbtqp");
        setIntField(term321682, term321682.getClass(), "year", 2013);
        setShortField(term321682, term321682.getClass(), "month", (short) 8);
        setShortField(term321682, term321682.getClass(), "day", (short) 6);
        setField(term321681, term321681.getClass(), "date", term321682);
        setByteField(term321686, term321686.getClass(), "hour", (byte) 23);
        setByteField(term321686, term321686.getClass(), "minute", (byte) 18);
        setByteField(term321686, term321686.getClass(), "second", (byte) 13);
        setIntField(term321686, term321686.getClass(), "nano", 389305885);
        setField(term321681, term321681.getClass(), "time", term321686);
        setField(term321665, term321665.getClass(), "registerTime", term321681);
        setIntField(term321692, term321692.getClass(), "year", 2012);
        setShortField(term321692, term321692.getClass(), "month", (short) 1);
        setShortField(term321692, term321692.getClass(), "day", (short) 14);
        setField(term321691, term321691.getClass(), "date", term321692);
        setByteField(term321696, term321696.getClass(), "hour", (byte) 22);
        setByteField(term321696, term321696.getClass(), "minute", (byte) 51);
        setByteField(term321696, term321696.getClass(), "second", (byte) 39);
        setIntField(term321696, term321696.getClass(), "nano", 521800113);
        setField(term321691, term321691.getClass(), "time", term321696);
        setField(term321665, term321665.getClass(), "accessTime", term321691);
        setField(term321663, term321663.getClass(), "card", term321665);
        setField(term321663, term321663.getClass(), "userName", "Dflpnxyaws");
        setIntField(term321714, term321714.getClass(), "year", 2028);
        setShortField(term321714, term321714.getClass(), "month", (short) 3);
        setShortField(term321714, term321714.getClass(), "day", (short) 19);
        setField(term321713, term321713.getClass(), "date", term321714);
        setByteField(term321718, term321718.getClass(), "hour", (byte) 8);
        setByteField(term321718, term321718.getClass(), "minute", (byte) 15);
        setByteField(term321718, term321718.getClass(), "second", (byte) 45);
        setIntField(term321718, term321718.getClass(), "nano", 419281303);
        setField(term321713, term321713.getClass(), "time", term321718);
        setField(term321663, term321663.getClass(), "lastLoginDate", term321713);
        setBooleanField(term321663, term321663.getClass(), "isWebJoin", true);
        setField(term321663, term321663.getClass(), "webLimitDate", "sBVtXchAVo");
        setIntField(term321663, term321663.getClass(), "level", -776177554);
        setIntField(term321663, term321663.getClass(), "reincarnationNum", 814192996);
        setField(term321663, term321663.getClass(), "exp", "iQgpBjoGXJ");
        setLongField(term321663, term321663.getClass(), "point", 6514661041339380792L);
        setLongField(term321663, term321663.getClass(), "totalPoint", 1630517848186010052L);
        setIntField(term321663, term321663.getClass(), "playCount", -1434369644);
        setIntField(term321663, term321663.getClass(), "multiPlayCount", 1542077120);
        setIntField(term321663, term321663.getClass(), "multiWinCount", 253803182);
        setIntField(term321663, term321663.getClass(), "requestResCount", -503416247);
        setIntField(term321663, term321663.getClass(), "acceptResCount", -1351088914);
        setIntField(term321663, term321663.getClass(), "successResCount", -1384346068);
        setIntField(term321663, term321663.getClass(), "playerRating", 1031876799);
        setIntField(term321663, term321663.getClass(), "highestRating", 1136599393);
        setIntField(term321663, term321663.getClass(), "nameplateId", -2098067829);
        setIntField(term321663, term321663.getClass(), "frameId", 1361717897);
        setIntField(term321663, term321663.getClass(), "characterId", -1603247889);
        setIntField(term321663, term321663.getClass(), "trophyId", 1850330908);
        setIntField(term321663, term321663.getClass(), "playedTutorialBit", -349376083);
        setIntField(term321663, term321663.getClass(), "firstTutorialCancelNum", 432624685);
        setIntField(term321663, term321663.getClass(), "masterTutorialCancelNum", 571190552);
        setIntField(term321663, term321663.getClass(), "totalRepertoireCount", -1418759353);
        setIntField(term321663, term321663.getClass(), "totalMapNum", -221912114);
        setLongField(term321663, term321663.getClass(), "totalHiScore", -1577738122228170388L);
        setLongField(term321663, term321663.getClass(), "totalBasicHighScore", -2947529743135344514L);
        setLongField(term321663, term321663.getClass(), "totalAdvancedHighScore", -2237065568332618745L);
        setLongField(term321663, term321663.getClass(), "totalExpertHighScore", -5825087959656031943L);
        setLongField(term321663, term321663.getClass(), "totalMasterHighScore", 8941286771740170460L);
        setIntField(term321775, term321775.getClass(), "year", 2013);
        setShortField(term321775, term321775.getClass(), "month", (short) 1);
        setShortField(term321775, term321775.getClass(), "day", (short) 18);
        setField(term321774, term321774.getClass(), "date", term321775);
        setByteField(term321779, term321779.getClass(), "hour", (byte) 19);
        setByteField(term321779, term321779.getClass(), "minute", (byte) 39);
        setByteField(term321779, term321779.getClass(), "second", (byte) 20);
        setIntField(term321779, term321779.getClass(), "nano", 771008656);
        setField(term321774, term321774.getClass(), "time", term321779);
        setField(term321663, term321663.getClass(), "eventWatchedDate", term321774);
        setIntField(term321663, term321663.getClass(), "friendCount", -1894129360);
        setBooleanField(term321663, term321663.getClass(), "isMaimai", true);
        setField(term321663, term321663.getClass(), "firstGameId", "mWztTjhUcj");
        setField(term321663, term321663.getClass(), "firstRomVersion", "nBCsrSCNym");
        setField(term321663, term321663.getClass(), "firstDataVersion", "yWwxzvskUK");
        setIntField(term321823, term321823.getClass(), "year", 2019);
        setShortField(term321823, term321823.getClass(), "month", (short) 8);
        setShortField(term321823, term321823.getClass(), "day", (short) 9);
        setField(term321822, term321822.getClass(), "date", term321823);
        setByteField(term321827, term321827.getClass(), "hour", (byte) 16);
        setByteField(term321827, term321827.getClass(), "minute", (byte) 37);
        setByteField(term321827, term321827.getClass(), "second", (byte) 3);
        setIntField(term321827, term321827.getClass(), "nano", 681396548);
        setField(term321822, term321822.getClass(), "time", term321827);
        setField(term321663, term321663.getClass(), "firstPlayDate", term321822);
        setField(term321663, term321663.getClass(), "lastGameId", "DpghyDxPRQ");
        setField(term321663, term321663.getClass(), "lastRomVersion", "dejAqujyZr");
        setField(term321663, term321663.getClass(), "lastDataVersion", "YOOpOJUVhi");
        setIntField(term321869, term321869.getClass(), "year", 2026);
        setShortField(term321869, term321869.getClass(), "month", (short) 5);
        setShortField(term321869, term321869.getClass(), "day", (short) 15);
        setField(term321868, term321868.getClass(), "date", term321869);
        setByteField(term321873, term321873.getClass(), "hour", (byte) 6);
        setByteField(term321873, term321873.getClass(), "minute", (byte) 55);
        setByteField(term321873, term321873.getClass(), "second", (byte) 2);
        setIntField(term321873, term321873.getClass(), "nano", 755062802);
        setField(term321868, term321868.getClass(), "time", term321873);
        setField(term321663, term321663.getClass(), "lastPlayDate", term321868);
        setIntField(term321663, term321663.getClass(), "lastPlaceId", 44325120);
        setField(term321663, term321663.getClass(), "lastPlaceName", "BzYCBybylB");
        setField(term321663, term321663.getClass(), "lastRegionId", "KGmEuVckVx");
        setField(term321663, term321663.getClass(), "lastRegionName", "JIqJWTPJSn");
        setField(term321663, term321663.getClass(), "lastAllNetId", "gnxtJXVkUK");
        setField(term321663, term321663.getClass(), "lastClientId", "lposbQqAUU");
        setField(term321661, term321661.getClass(), "user", term321663);
        setIntField(term321661, term321661.getClass(), "ext1", -1187562082);
        setIntField(term321661, term321661.getClass(), "ext2", 1154282396);
        setIntField(term321661, term321661.getClass(), "ext3", -1659679206);
        setIntField(term321661, term321661.getClass(), "ext4", -779611389);
        setIntField(term321661, term321661.getClass(), "ext5", 288629669);
        setIntField(term321661, term321661.getClass(), "ext6", -1713658812);
        setIntField(term321661, term321661.getClass(), "ext7", 1823664605);
        setIntField(term321661, term321661.getClass(), "ext8", 355918575);
        setIntField(term321661, term321661.getClass(), "ext9", -296980553);
        setIntField(term321661, term321661.getClass(), "ext10", -1224161037);
        setIntField(term321661, term321661.getClass(), "ext11", 1173114117);
        setIntField(term321661, term321661.getClass(), "ext12", -2050055378);
        setIntField(term321661, term321661.getClass(), "ext13", -1602048673);
        setIntField(term321661, term321661.getClass(), "ext14", 1412996249);
        setIntField(term321661, term321661.getClass(), "ext15", 1976406061);
        setIntField(term321661, term321661.getClass(), "ext16", 1582458922);
        setIntField(term321661, term321661.getClass(), "ext17", 1466992358);
        setIntField(term321661, term321661.getClass(), "ext18", 1374687727);
        setIntField(term321661, term321661.getClass(), "ext19", 1326183861);
        setIntField(term321661, term321661.getClass(), "ext20", -2097776148);
        term321959 = new Integer(236546092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term321959;
        callMethod(klass, "setExt2", argTypes, term321661, args);
    }

};


