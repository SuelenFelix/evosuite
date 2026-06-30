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

public class UserDetail_setBanState_1855912414152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4316287;
     Object term4316648;

    public UserDetail_setBanState_1855912414152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4316291 = new Long(3000898825884778616L);
        Integer term4316354 = new Integer(1315243912);
        Integer term4316356 = new Integer(1457074887);
        Integer term4316358 = new Integer(1963312777);
        Integer term4316360 = new Integer(-1162599119);
        Integer term4316362 = new Integer(-151931152);
        Integer term4316364 = new Integer(14184131);
        Integer term4316366 = new Integer(357749330);
        Integer term4316368 = new Integer(33679397);
        Integer term4316370 = new Integer(613527123);
        ArrayList term4316352 = new ArrayList();
        ((ArrayList) term4316352).add(term4316354);
        ((ArrayList) term4316352).add(term4316356);
        ((ArrayList) term4316352).add(term4316358);
        ((ArrayList) term4316352).add(term4316360);
        ((ArrayList) term4316352).add(term4316362);
        ((ArrayList) term4316352).add(term4316364);
        ((ArrayList) term4316352).add(term4316366);
        ((ArrayList) term4316352).add(term4316368);
        ((ArrayList) term4316352).add(term4316370);
        Integer term4316376 = new Integer(312461013);
        Integer term4316378 = new Integer(1548945209);
        ArrayList term4316374 = new ArrayList();
        ((ArrayList) term4316374).add(term4316376);
        ((ArrayList) term4316374).add(term4316378);
        term4316287 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4316289 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4316305 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4316306 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4316310 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4316315 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4316316 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4316320 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4316287, term4316287.getClass(), "id", 7487433411151667453L);
        setLongField(term4316289, term4316289.getClass(), "id", 8762954491844991841L);
        setField(term4316289, term4316289.getClass(), "extId", term4316291);
        setField(term4316289, term4316289.getClass(), "luid", "spiRSwgrtS");
        setIntField(term4316306, term4316306.getClass(), "year", 2028);
        setShortField(term4316306, term4316306.getClass(), "month", (short) 1);
        setShortField(term4316306, term4316306.getClass(), "day", (short) 11);
        setField(term4316305, term4316305.getClass(), "date", term4316306);
        setByteField(term4316310, term4316310.getClass(), "hour", (byte) 13);
        setByteField(term4316310, term4316310.getClass(), "minute", (byte) 2);
        setByteField(term4316310, term4316310.getClass(), "second", (byte) 30);
        setIntField(term4316310, term4316310.getClass(), "nano", 166941250);
        setField(term4316305, term4316305.getClass(), "time", term4316310);
        setField(term4316289, term4316289.getClass(), "registerTime", term4316305);
        setIntField(term4316316, term4316316.getClass(), "year", 2019);
        setShortField(term4316316, term4316316.getClass(), "month", (short) 9);
        setShortField(term4316316, term4316316.getClass(), "day", (short) 25);
        setField(term4316315, term4316315.getClass(), "date", term4316316);
        setByteField(term4316320, term4316320.getClass(), "hour", (byte) 3);
        setByteField(term4316320, term4316320.getClass(), "minute", (byte) 14);
        setByteField(term4316320, term4316320.getClass(), "second", (byte) 5);
        setIntField(term4316320, term4316320.getClass(), "nano", 329380853);
        setField(term4316315, term4316315.getClass(), "time", term4316320);
        setField(term4316289, term4316289.getClass(), "accessTime", term4316315);
        setField(term4316287, term4316287.getClass(), "card", term4316289);
        setField(term4316287, term4316287.getClass(), "userName", "jbiLNUfmRh");
        setIntField(term4316287, term4316287.getClass(), "isNetMember", -600946684);
        setIntField(term4316287, term4316287.getClass(), "iconId", 310508674);
        setIntField(term4316287, term4316287.getClass(), "plateId", 690272629);
        setIntField(term4316287, term4316287.getClass(), "titleId", 569428253);
        setIntField(term4316287, term4316287.getClass(), "partnerId", 629449159);
        setIntField(term4316287, term4316287.getClass(), "frameId", 1235645220);
        setIntField(term4316287, term4316287.getClass(), "selectMapId", -1503206559);
        setIntField(term4316287, term4316287.getClass(), "totalAwake", -531989737);
        setIntField(term4316287, term4316287.getClass(), "gradeRating", 1490865042);
        setIntField(term4316287, term4316287.getClass(), "musicRating", 51983211);
        setIntField(term4316287, term4316287.getClass(), "playerRating", -1456075502);
        setIntField(term4316287, term4316287.getClass(), "highestRating", 1156335088);
        setIntField(term4316287, term4316287.getClass(), "gradeRank", 603560406);
        setIntField(term4316287, term4316287.getClass(), "classRank", -4516699);
        setIntField(term4316287, term4316287.getClass(), "courseRank", 1884634913);
        setField(term4316287, term4316287.getClass(), "charaSlot", term4316352);
        setField(term4316287, term4316287.getClass(), "charaLockSlot", term4316374);
        setLongField(term4316287, term4316287.getClass(), "contentBit", -6881986328790699605L);
        setIntField(term4316287, term4316287.getClass(), "playCount", 716636892);
        setField(term4316287, term4316287.getClass(), "eventWatchedDate", "PAkFUcqPCS");
        setField(term4316287, term4316287.getClass(), "lastGameId", "xyXGrSrCKq");
        setField(term4316287, term4316287.getClass(), "lastRomVersion", "egtXEBxrau");
        setField(term4316287, term4316287.getClass(), "lastDataVersion", "pUgSkLvOqo");
        setField(term4316287, term4316287.getClass(), "lastLoginDate", "QpKVGzTfJc");
        setField(term4316287, term4316287.getClass(), "lastPlayDate", "tZszPbalAf");
        setIntField(term4316287, term4316287.getClass(), "lastPlayCredit", -919001877);
        setIntField(term4316287, term4316287.getClass(), "lastPlayMode", 1229763751);
        setIntField(term4316287, term4316287.getClass(), "lastPlaceId", -1707779557);
        setField(term4316287, term4316287.getClass(), "lastPlaceName", "ppLTIRwMor");
        setIntField(term4316287, term4316287.getClass(), "lastAllNetId", 42816986);
        setIntField(term4316287, term4316287.getClass(), "lastRegionId", 2060351792);
        setField(term4316287, term4316287.getClass(), "lastRegionName", "YIGDMqLAvq");
        setField(term4316287, term4316287.getClass(), "lastClientId", "UvWYdCiXKr");
        setField(term4316287, term4316287.getClass(), "lastCountryCode", "SjGJCQAYTn");
        setIntField(term4316287, term4316287.getClass(), "lastSelectEMoney", 2003750696);
        setIntField(term4316287, term4316287.getClass(), "lastSelectTicket", 771734847);
        setIntField(term4316287, term4316287.getClass(), "lastSelectCourse", -211761367);
        setIntField(term4316287, term4316287.getClass(), "lastCountCourse", -735861386);
        setField(term4316287, term4316287.getClass(), "firstGameId", "veJmVJHfUx");
        setField(term4316287, term4316287.getClass(), "firstRomVersion", "amGKJvjbyo");
        setField(term4316287, term4316287.getClass(), "firstDataVersion", "ZCSxUYyrwJ");
        setField(term4316287, term4316287.getClass(), "firstPlayDate", "vvkRUuFKaa");
        setField(term4316287, term4316287.getClass(), "compatibleCmVersion", "wyRslVmKFZ");
        setField(term4316287, term4316287.getClass(), "dailyBonusDate", "xVTuqTzlgy");
        setField(term4316287, term4316287.getClass(), "dailyCourseBonusDate", "LoilkLpIRH");
        setField(term4316287, term4316287.getClass(), "lastPairLoginDate", "DMbnfSdedI");
        setField(term4316287, term4316287.getClass(), "lastTrialPlayDate", "bctOfgcWXX");
        setIntField(term4316287, term4316287.getClass(), "playVsCount", 1937782347);
        setIntField(term4316287, term4316287.getClass(), "playSyncCount", -287435387);
        setIntField(term4316287, term4316287.getClass(), "winCount", 594706425);
        setIntField(term4316287, term4316287.getClass(), "helpCount", 1105447838);
        setIntField(term4316287, term4316287.getClass(), "comboCount", 1594507389);
        setLongField(term4316287, term4316287.getClass(), "totalDeluxscore", 5377719229425835941L);
        setLongField(term4316287, term4316287.getClass(), "totalBasicDeluxscore", 7928475993060130920L);
        setLongField(term4316287, term4316287.getClass(), "totalAdvancedDeluxscore", -877973849145685072L);
        setLongField(term4316287, term4316287.getClass(), "totalExpertDeluxscore", -4719177280824625797L);
        setLongField(term4316287, term4316287.getClass(), "totalMasterDeluxscore", -5741586642339290040L);
        setLongField(term4316287, term4316287.getClass(), "totalReMasterDeluxscore", -633016023497847636L);
        setIntField(term4316287, term4316287.getClass(), "totalSync", -96364318);
        setIntField(term4316287, term4316287.getClass(), "totalBasicSync", -1231643034);
        setIntField(term4316287, term4316287.getClass(), "totalAdvancedSync", -1090316416);
        setIntField(term4316287, term4316287.getClass(), "totalExpertSync", -1977237631);
        setIntField(term4316287, term4316287.getClass(), "totalMasterSync", -2058604086);
        setIntField(term4316287, term4316287.getClass(), "totalReMasterSync", -2033953631);
        setLongField(term4316287, term4316287.getClass(), "totalAchievement", 6216397632915670304L);
        setLongField(term4316287, term4316287.getClass(), "totalBasicAchievement", -5379400889664576725L);
        setLongField(term4316287, term4316287.getClass(), "totalAdvancedAchievement", -6655001630470800547L);
        setLongField(term4316287, term4316287.getClass(), "totalExpertAchievement", -1148089922707570767L);
        setLongField(term4316287, term4316287.getClass(), "totalMasterAchievement", 4115652601580897365L);
        setLongField(term4316287, term4316287.getClass(), "totalReMasterAchievement", 3275142192559978725L);
        setLongField(term4316287, term4316287.getClass(), "playerOldRating", -4258306600492321639L);
        setLongField(term4316287, term4316287.getClass(), "playerNewRating", -4501054446625694208L);
        setIntField(term4316287, term4316287.getClass(), "banState", -1038827506);
        setLongField(term4316287, term4316287.getClass(), "dateTime", -4341455117450998987L);
        term4316648 = new Integer(189781192);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4316648;
        callMethod(klass, "setBanState", argTypes, term4316287, args);
    }

};


