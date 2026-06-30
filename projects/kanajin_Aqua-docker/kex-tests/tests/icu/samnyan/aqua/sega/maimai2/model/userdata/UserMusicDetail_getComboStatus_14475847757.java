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

public class UserMusicDetail_getComboStatus_14475847757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58976;

    public UserMusicDetail_getComboStatus_14475847757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58982 = new Long(-8463029266761149071L);
        Integer term59045 = new Integer(1190753616);
        Integer term59047 = new Integer(-752378450);
        Integer term59049 = new Integer(848907965);
        Integer term59051 = new Integer(1865070548);
        Integer term59053 = new Integer(1904515443);
        Integer term59055 = new Integer(1361126430);
        Integer term59057 = new Integer(1728588701);
        Integer term59059 = new Integer(-355769268);
        ArrayList term59043 = new ArrayList();
        ((ArrayList) term59043).add(term59045);
        ((ArrayList) term59043).add(term59047);
        ((ArrayList) term59043).add(term59049);
        ((ArrayList) term59043).add(term59051);
        ((ArrayList) term59043).add(term59053);
        ((ArrayList) term59043).add(term59055);
        ((ArrayList) term59043).add(term59057);
        ((ArrayList) term59043).add(term59059);
        Integer term59065 = new Integer(-114460662);
        Integer term59067 = new Integer(-355376034);
        Integer term59069 = new Integer(588390599);
        Integer term59071 = new Integer(-95969566);
        Integer term59073 = new Integer(-68615285);
        Integer term59075 = new Integer(-337504086);
        Integer term59077 = new Integer(2074130991);
        Integer term59079 = new Integer(532588266);
        ArrayList term59063 = new ArrayList();
        ((ArrayList) term59063).add(term59065);
        ((ArrayList) term59063).add(term59067);
        ((ArrayList) term59063).add(term59069);
        ((ArrayList) term59063).add(term59071);
        ((ArrayList) term59063).add(term59073);
        ((ArrayList) term59063).add(term59075);
        ((ArrayList) term59063).add(term59077);
        ((ArrayList) term59063).add(term59079);
        term58976 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        Object term58978 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term58980 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term58996 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58997 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59001 = newInstance(Class.forName("java.time.LocalTime"));
        Object term59006 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59007 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59011 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term58976, term58976.getClass(), "id", -4569299590968645007L);
        setLongField(term58978, term58978.getClass(), "id", -4026624946106334837L);
        setLongField(term58980, term58980.getClass(), "id", 3465513040115241688L);
        setField(term58980, term58980.getClass(), "extId", term58982);
        setField(term58980, term58980.getClass(), "luid", "aASfcqfBbh");
        setIntField(term58997, term58997.getClass(), "year", 2021);
        setShortField(term58997, term58997.getClass(), "month", (short) 5);
        setShortField(term58997, term58997.getClass(), "day", (short) 6);
        setField(term58996, term58996.getClass(), "date", term58997);
        setByteField(term59001, term59001.getClass(), "hour", (byte) 21);
        setByteField(term59001, term59001.getClass(), "minute", (byte) 10);
        setByteField(term59001, term59001.getClass(), "second", (byte) 43);
        setIntField(term59001, term59001.getClass(), "nano", 123313014);
        setField(term58996, term58996.getClass(), "time", term59001);
        setField(term58980, term58980.getClass(), "registerTime", term58996);
        setIntField(term59007, term59007.getClass(), "year", 2011);
        setShortField(term59007, term59007.getClass(), "month", (short) 6);
        setShortField(term59007, term59007.getClass(), "day", (short) 21);
        setField(term59006, term59006.getClass(), "date", term59007);
        setByteField(term59011, term59011.getClass(), "hour", (byte) 3);
        setByteField(term59011, term59011.getClass(), "minute", (byte) 19);
        setByteField(term59011, term59011.getClass(), "second", (byte) 41);
        setIntField(term59011, term59011.getClass(), "nano", 920537748);
        setField(term59006, term59006.getClass(), "time", term59011);
        setField(term58980, term58980.getClass(), "accessTime", term59006);
        setField(term58978, term58978.getClass(), "card", term58980);
        setField(term58978, term58978.getClass(), "userName", "DwpOIkpRFT");
        setIntField(term58978, term58978.getClass(), "isNetMember", 1297681432);
        setIntField(term58978, term58978.getClass(), "iconId", 820668311);
        setIntField(term58978, term58978.getClass(), "plateId", -43239204);
        setIntField(term58978, term58978.getClass(), "titleId", -1525054580);
        setIntField(term58978, term58978.getClass(), "partnerId", 1528804559);
        setIntField(term58978, term58978.getClass(), "frameId", -706860271);
        setIntField(term58978, term58978.getClass(), "selectMapId", -1268460209);
        setIntField(term58978, term58978.getClass(), "totalAwake", 1050300885);
        setIntField(term58978, term58978.getClass(), "gradeRating", -1623966228);
        setIntField(term58978, term58978.getClass(), "musicRating", 1085534206);
        setIntField(term58978, term58978.getClass(), "playerRating", -825946504);
        setIntField(term58978, term58978.getClass(), "highestRating", 1618408809);
        setIntField(term58978, term58978.getClass(), "gradeRank", 1511487617);
        setIntField(term58978, term58978.getClass(), "classRank", 338598562);
        setIntField(term58978, term58978.getClass(), "courseRank", 1528748257);
        setField(term58978, term58978.getClass(), "charaSlot", term59043);
        setField(term58978, term58978.getClass(), "charaLockSlot", term59063);
        setLongField(term58978, term58978.getClass(), "contentBit", 5260379851065937225L);
        setIntField(term58978, term58978.getClass(), "playCount", 494744342);
        setField(term58978, term58978.getClass(), "eventWatchedDate", "LPlTDoLrUy");
        setField(term58978, term58978.getClass(), "lastGameId", "XETimBHIKG");
        setField(term58978, term58978.getClass(), "lastRomVersion", "nOKVZSyfbZ");
        setField(term58978, term58978.getClass(), "lastDataVersion", "adHZFgDoEH");
        setField(term58978, term58978.getClass(), "lastLoginDate", "vjNETNMDhQ");
        setField(term58978, term58978.getClass(), "lastPlayDate", "pexqQqwSNj");
        setIntField(term58978, term58978.getClass(), "lastPlayCredit", -1662933444);
        setIntField(term58978, term58978.getClass(), "lastPlayMode", 1648583497);
        setIntField(term58978, term58978.getClass(), "lastPlaceId", -132156499);
        setField(term58978, term58978.getClass(), "lastPlaceName", "myfXkIEBSV");
        setIntField(term58978, term58978.getClass(), "lastAllNetId", -1222668512);
        setIntField(term58978, term58978.getClass(), "lastRegionId", 1109294828);
        setField(term58978, term58978.getClass(), "lastRegionName", "LSrqDVjzEP");
        setField(term58978, term58978.getClass(), "lastClientId", "CPZCLJxTuA");
        setField(term58978, term58978.getClass(), "lastCountryCode", "ivAOXnVjmg");
        setIntField(term58978, term58978.getClass(), "lastSelectEMoney", -596850824);
        setIntField(term58978, term58978.getClass(), "lastSelectTicket", 1619317687);
        setIntField(term58978, term58978.getClass(), "lastSelectCourse", -1335475299);
        setIntField(term58978, term58978.getClass(), "lastCountCourse", 1764067908);
        setField(term58978, term58978.getClass(), "firstGameId", "FivesaUeHG");
        setField(term58978, term58978.getClass(), "firstRomVersion", "TnpXhZmCRY");
        setField(term58978, term58978.getClass(), "firstDataVersion", "ECVAXFhrTP");
        setField(term58978, term58978.getClass(), "firstPlayDate", "ypytdNbrBc");
        setField(term58978, term58978.getClass(), "compatibleCmVersion", "XvrJCOSYei");
        setField(term58978, term58978.getClass(), "dailyBonusDate", "QdRcxOxNSl");
        setField(term58978, term58978.getClass(), "dailyCourseBonusDate", "lvdsucnNvR");
        setField(term58978, term58978.getClass(), "lastPairLoginDate", "mSjSKfeMUn");
        setField(term58978, term58978.getClass(), "lastTrialPlayDate", "nVXCBYnEcg");
        setIntField(term58978, term58978.getClass(), "playVsCount", 1906236006);
        setIntField(term58978, term58978.getClass(), "playSyncCount", -279175941);
        setIntField(term58978, term58978.getClass(), "winCount", -574044161);
        setIntField(term58978, term58978.getClass(), "helpCount", -101199395);
        setIntField(term58978, term58978.getClass(), "comboCount", 894150826);
        setLongField(term58978, term58978.getClass(), "totalDeluxscore", -358904349595052653L);
        setLongField(term58978, term58978.getClass(), "totalBasicDeluxscore", -6117082530291957563L);
        setLongField(term58978, term58978.getClass(), "totalAdvancedDeluxscore", 8605580628003894246L);
        setLongField(term58978, term58978.getClass(), "totalExpertDeluxscore", 2742759719072632386L);
        setLongField(term58978, term58978.getClass(), "totalMasterDeluxscore", 8577592614427713625L);
        setLongField(term58978, term58978.getClass(), "totalReMasterDeluxscore", 6370524950953117569L);
        setIntField(term58978, term58978.getClass(), "totalSync", -261894603);
        setIntField(term58978, term58978.getClass(), "totalBasicSync", 1163902450);
        setIntField(term58978, term58978.getClass(), "totalAdvancedSync", 548941697);
        setIntField(term58978, term58978.getClass(), "totalExpertSync", 647865140);
        setIntField(term58978, term58978.getClass(), "totalMasterSync", 552764103);
        setIntField(term58978, term58978.getClass(), "totalReMasterSync", -913811608);
        setLongField(term58978, term58978.getClass(), "totalAchievement", 3987997174812419775L);
        setLongField(term58978, term58978.getClass(), "totalBasicAchievement", -313071413817626779L);
        setLongField(term58978, term58978.getClass(), "totalAdvancedAchievement", -460099854831988621L);
        setLongField(term58978, term58978.getClass(), "totalExpertAchievement", 8567604378841612757L);
        setLongField(term58978, term58978.getClass(), "totalMasterAchievement", 4248644875418274020L);
        setLongField(term58978, term58978.getClass(), "totalReMasterAchievement", 2220195077881026021L);
        setLongField(term58978, term58978.getClass(), "playerOldRating", -613788131903895980L);
        setLongField(term58978, term58978.getClass(), "playerNewRating", -5544764664016667081L);
        setIntField(term58978, term58978.getClass(), "banState", 895728550);
        setLongField(term58978, term58978.getClass(), "dateTime", 2228513255568046812L);
        setField(term58976, term58976.getClass(), "user", term58978);
        setIntField(term58976, term58976.getClass(), "musicId", -419871359);
        setIntField(term58976, term58976.getClass(), "level", 812478175);
        setIntField(term58976, term58976.getClass(), "playCount", -133199375);
        setIntField(term58976, term58976.getClass(), "achievement", -356245449);
        setIntField(term58976, term58976.getClass(), "comboStatus", -1305056502);
        setIntField(term58976, term58976.getClass(), "syncStatus", 1382545880);
        setIntField(term58976, term58976.getClass(), "deluxscoreMax", -1299406001);
        setIntField(term58976, term58976.getClass(), "scoreRank", -1360145510);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComboStatus", argTypes, term58976, args);
    }

};


