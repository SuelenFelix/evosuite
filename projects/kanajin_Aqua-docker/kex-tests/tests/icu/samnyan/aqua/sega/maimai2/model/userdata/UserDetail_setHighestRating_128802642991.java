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

public class UserDetail_setHighestRating_128802642991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4281187;
     Object term4281552;

    public UserDetail_setHighestRating_128802642991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4281191 = new Long(-945634812351574587L);
        Integer term4281254 = new Integer(600354879);
        Integer term4281256 = new Integer(-1910867502);
        Integer term4281258 = new Integer(-681154934);
        Integer term4281260 = new Integer(-1605929703);
        Integer term4281262 = new Integer(-299263678);
        Integer term4281264 = new Integer(347664273);
        Integer term4281266 = new Integer(1180386145);
        ArrayList term4281252 = new ArrayList();
        ((ArrayList) term4281252).add(term4281254);
        ((ArrayList) term4281252).add(term4281256);
        ((ArrayList) term4281252).add(term4281258);
        ((ArrayList) term4281252).add(term4281260);
        ((ArrayList) term4281252).add(term4281262);
        ((ArrayList) term4281252).add(term4281264);
        ((ArrayList) term4281252).add(term4281266);
        Integer term4281272 = new Integer(-1226044289);
        Integer term4281274 = new Integer(803651464);
        Integer term4281276 = new Integer(-1466570615);
        Integer term4281278 = new Integer(-471545371);
        Integer term4281280 = new Integer(-505396503);
        Integer term4281282 = new Integer(1161692766);
        ArrayList term4281270 = new ArrayList();
        ((ArrayList) term4281270).add(term4281272);
        ((ArrayList) term4281270).add(term4281274);
        ((ArrayList) term4281270).add(term4281276);
        ((ArrayList) term4281270).add(term4281278);
        ((ArrayList) term4281270).add(term4281280);
        ((ArrayList) term4281270).add(term4281282);
        term4281187 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4281189 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4281205 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4281206 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4281210 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4281215 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4281216 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4281220 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4281187, term4281187.getClass(), "id", 1204976897618863865L);
        setLongField(term4281189, term4281189.getClass(), "id", 6402903470571261075L);
        setField(term4281189, term4281189.getClass(), "extId", term4281191);
        setField(term4281189, term4281189.getClass(), "luid", "TiaUcncADC");
        setIntField(term4281206, term4281206.getClass(), "year", 2015);
        setShortField(term4281206, term4281206.getClass(), "month", (short) 6);
        setShortField(term4281206, term4281206.getClass(), "day", (short) 22);
        setField(term4281205, term4281205.getClass(), "date", term4281206);
        setByteField(term4281210, term4281210.getClass(), "hour", (byte) 8);
        setByteField(term4281210, term4281210.getClass(), "minute", (byte) 18);
        setByteField(term4281210, term4281210.getClass(), "second", (byte) 14);
        setIntField(term4281210, term4281210.getClass(), "nano", 426388793);
        setField(term4281205, term4281205.getClass(), "time", term4281210);
        setField(term4281189, term4281189.getClass(), "registerTime", term4281205);
        setIntField(term4281216, term4281216.getClass(), "year", 2025);
        setShortField(term4281216, term4281216.getClass(), "month", (short) 2);
        setShortField(term4281216, term4281216.getClass(), "day", (short) 8);
        setField(term4281215, term4281215.getClass(), "date", term4281216);
        setByteField(term4281220, term4281220.getClass(), "hour", (byte) 1);
        setByteField(term4281220, term4281220.getClass(), "minute", (byte) 44);
        setByteField(term4281220, term4281220.getClass(), "second", (byte) 47);
        setIntField(term4281220, term4281220.getClass(), "nano", 427696119);
        setField(term4281215, term4281215.getClass(), "time", term4281220);
        setField(term4281189, term4281189.getClass(), "accessTime", term4281215);
        setField(term4281187, term4281187.getClass(), "card", term4281189);
        setField(term4281187, term4281187.getClass(), "userName", "nbfLcmUwFO");
        setIntField(term4281187, term4281187.getClass(), "isNetMember", 1899086757);
        setIntField(term4281187, term4281187.getClass(), "iconId", -989025561);
        setIntField(term4281187, term4281187.getClass(), "plateId", -1348213130);
        setIntField(term4281187, term4281187.getClass(), "titleId", -1769395201);
        setIntField(term4281187, term4281187.getClass(), "partnerId", 1228365685);
        setIntField(term4281187, term4281187.getClass(), "frameId", -908039002);
        setIntField(term4281187, term4281187.getClass(), "selectMapId", -1053026008);
        setIntField(term4281187, term4281187.getClass(), "totalAwake", 756297154);
        setIntField(term4281187, term4281187.getClass(), "gradeRating", 56586234);
        setIntField(term4281187, term4281187.getClass(), "musicRating", -797456717);
        setIntField(term4281187, term4281187.getClass(), "playerRating", -1640572468);
        setIntField(term4281187, term4281187.getClass(), "highestRating", -453415485);
        setIntField(term4281187, term4281187.getClass(), "gradeRank", 1028029081);
        setIntField(term4281187, term4281187.getClass(), "classRank", 1265730419);
        setIntField(term4281187, term4281187.getClass(), "courseRank", 998132674);
        setField(term4281187, term4281187.getClass(), "charaSlot", term4281252);
        setField(term4281187, term4281187.getClass(), "charaLockSlot", term4281270);
        setLongField(term4281187, term4281187.getClass(), "contentBit", 5013046011175761677L);
        setIntField(term4281187, term4281187.getClass(), "playCount", -815441630);
        setField(term4281187, term4281187.getClass(), "eventWatchedDate", "RPByrmEGFk");
        setField(term4281187, term4281187.getClass(), "lastGameId", "hNwtvdDdgr");
        setField(term4281187, term4281187.getClass(), "lastRomVersion", "ZvhYzdHCKz");
        setField(term4281187, term4281187.getClass(), "lastDataVersion", "mPBUposChl");
        setField(term4281187, term4281187.getClass(), "lastLoginDate", "dyvZQIxkiJ");
        setField(term4281187, term4281187.getClass(), "lastPlayDate", "FwmLHshzAy");
        setIntField(term4281187, term4281187.getClass(), "lastPlayCredit", 1450465274);
        setIntField(term4281187, term4281187.getClass(), "lastPlayMode", -572968232);
        setIntField(term4281187, term4281187.getClass(), "lastPlaceId", 2136630252);
        setField(term4281187, term4281187.getClass(), "lastPlaceName", "cvQdMSEDKT");
        setIntField(term4281187, term4281187.getClass(), "lastAllNetId", -393151166);
        setIntField(term4281187, term4281187.getClass(), "lastRegionId", -1401766896);
        setField(term4281187, term4281187.getClass(), "lastRegionName", "MwxqFCZqPS");
        setField(term4281187, term4281187.getClass(), "lastClientId", "KaLpezcoAG");
        setField(term4281187, term4281187.getClass(), "lastCountryCode", "AGGcdPGGOG");
        setIntField(term4281187, term4281187.getClass(), "lastSelectEMoney", 178433050);
        setIntField(term4281187, term4281187.getClass(), "lastSelectTicket", -1719739827);
        setIntField(term4281187, term4281187.getClass(), "lastSelectCourse", 402342555);
        setIntField(term4281187, term4281187.getClass(), "lastCountCourse", 829798999);
        setField(term4281187, term4281187.getClass(), "firstGameId", "dXgZFlnlxn");
        setField(term4281187, term4281187.getClass(), "firstRomVersion", "iNLOuAtwYr");
        setField(term4281187, term4281187.getClass(), "firstDataVersion", "daJNAqUduD");
        setField(term4281187, term4281187.getClass(), "firstPlayDate", "qiVtWnAaki");
        setField(term4281187, term4281187.getClass(), "compatibleCmVersion", "nbMbspGqwQ");
        setField(term4281187, term4281187.getClass(), "dailyBonusDate", "YJEOsZvtOw");
        setField(term4281187, term4281187.getClass(), "dailyCourseBonusDate", "CWyvPhlyvq");
        setField(term4281187, term4281187.getClass(), "lastPairLoginDate", "mRrfZQWkqH");
        setField(term4281187, term4281187.getClass(), "lastTrialPlayDate", "pRrXomFglB");
        setIntField(term4281187, term4281187.getClass(), "playVsCount", -1477478745);
        setIntField(term4281187, term4281187.getClass(), "playSyncCount", -858517012);
        setIntField(term4281187, term4281187.getClass(), "winCount", 427458766);
        setIntField(term4281187, term4281187.getClass(), "helpCount", 1313983068);
        setIntField(term4281187, term4281187.getClass(), "comboCount", -1098035624);
        setLongField(term4281187, term4281187.getClass(), "totalDeluxscore", -2893299066933520156L);
        setLongField(term4281187, term4281187.getClass(), "totalBasicDeluxscore", 4711751435105285103L);
        setLongField(term4281187, term4281187.getClass(), "totalAdvancedDeluxscore", 4488794692730036711L);
        setLongField(term4281187, term4281187.getClass(), "totalExpertDeluxscore", 3585054367936110665L);
        setLongField(term4281187, term4281187.getClass(), "totalMasterDeluxscore", 8387947162164950455L);
        setLongField(term4281187, term4281187.getClass(), "totalReMasterDeluxscore", -807488752327993535L);
        setIntField(term4281187, term4281187.getClass(), "totalSync", 990649086);
        setIntField(term4281187, term4281187.getClass(), "totalBasicSync", 1019920377);
        setIntField(term4281187, term4281187.getClass(), "totalAdvancedSync", 1378816130);
        setIntField(term4281187, term4281187.getClass(), "totalExpertSync", 962344676);
        setIntField(term4281187, term4281187.getClass(), "totalMasterSync", -813485245);
        setIntField(term4281187, term4281187.getClass(), "totalReMasterSync", 783170380);
        setLongField(term4281187, term4281187.getClass(), "totalAchievement", -7729723655796908478L);
        setLongField(term4281187, term4281187.getClass(), "totalBasicAchievement", 4617971270087259062L);
        setLongField(term4281187, term4281187.getClass(), "totalAdvancedAchievement", 8643143178613613612L);
        setLongField(term4281187, term4281187.getClass(), "totalExpertAchievement", -8987115553298274360L);
        setLongField(term4281187, term4281187.getClass(), "totalMasterAchievement", 2925381374957394931L);
        setLongField(term4281187, term4281187.getClass(), "totalReMasterAchievement", 3929470012286716062L);
        setLongField(term4281187, term4281187.getClass(), "playerOldRating", -5196305333028822701L);
        setLongField(term4281187, term4281187.getClass(), "playerNewRating", -2143608012628438429L);
        setIntField(term4281187, term4281187.getClass(), "banState", 52555522);
        setLongField(term4281187, term4281187.getClass(), "dateTime", 5060999915323892971L);
        term4281552 = new Integer(-1338125671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4281552;
        callMethod(klass, "setHighestRating", argTypes, term4281187, args);
    }

};


