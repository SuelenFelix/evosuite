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

public class UserGameOptionEx_getExt11_157174177013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315407;

    public UserGameOptionEx_getExt11_157174177013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term315413 = new Long(3535528164828723056L);
        term315407 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term315409 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term315411 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term315427 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term315428 = newInstance(Class.forName("java.time.LocalDate"));
        Object term315432 = newInstance(Class.forName("java.time.LocalTime"));
        Object term315437 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term315438 = newInstance(Class.forName("java.time.LocalDate"));
        Object term315442 = newInstance(Class.forName("java.time.LocalTime"));
        Object term315459 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term315460 = newInstance(Class.forName("java.time.LocalDate"));
        Object term315464 = newInstance(Class.forName("java.time.LocalTime"));
        Object term315520 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term315521 = newInstance(Class.forName("java.time.LocalDate"));
        Object term315525 = newInstance(Class.forName("java.time.LocalTime"));
        Object term315568 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term315569 = newInstance(Class.forName("java.time.LocalDate"));
        Object term315573 = newInstance(Class.forName("java.time.LocalTime"));
        Object term315614 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term315615 = newInstance(Class.forName("java.time.LocalDate"));
        Object term315619 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term315407, term315407.getClass(), "id", 733656404089314249L);
        setLongField(term315409, term315409.getClass(), "id", 1801000213877603286L);
        setLongField(term315411, term315411.getClass(), "id", 6616955996274687903L);
        setField(term315411, term315411.getClass(), "extId", term315413);
        setField(term315411, term315411.getClass(), "luid", "HzMfMKgKlf");
        setIntField(term315428, term315428.getClass(), "year", 2017);
        setShortField(term315428, term315428.getClass(), "month", (short) 4);
        setShortField(term315428, term315428.getClass(), "day", (short) 20);
        setField(term315427, term315427.getClass(), "date", term315428);
        setByteField(term315432, term315432.getClass(), "hour", (byte) 9);
        setByteField(term315432, term315432.getClass(), "minute", (byte) 51);
        setByteField(term315432, term315432.getClass(), "second", (byte) 56);
        setIntField(term315432, term315432.getClass(), "nano", 616842827);
        setField(term315427, term315427.getClass(), "time", term315432);
        setField(term315411, term315411.getClass(), "registerTime", term315427);
        setIntField(term315438, term315438.getClass(), "year", 2029);
        setShortField(term315438, term315438.getClass(), "month", (short) 6);
        setShortField(term315438, term315438.getClass(), "day", (short) 21);
        setField(term315437, term315437.getClass(), "date", term315438);
        setByteField(term315442, term315442.getClass(), "hour", (byte) 2);
        setByteField(term315442, term315442.getClass(), "minute", (byte) 46);
        setByteField(term315442, term315442.getClass(), "second", (byte) 7);
        setIntField(term315442, term315442.getClass(), "nano", 851275988);
        setField(term315437, term315437.getClass(), "time", term315442);
        setField(term315411, term315411.getClass(), "accessTime", term315437);
        setField(term315409, term315409.getClass(), "card", term315411);
        setField(term315409, term315409.getClass(), "userName", "syeDEkvOkO");
        setIntField(term315460, term315460.getClass(), "year", 2018);
        setShortField(term315460, term315460.getClass(), "month", (short) 11);
        setShortField(term315460, term315460.getClass(), "day", (short) 14);
        setField(term315459, term315459.getClass(), "date", term315460);
        setByteField(term315464, term315464.getClass(), "hour", (byte) 0);
        setByteField(term315464, term315464.getClass(), "minute", (byte) 48);
        setByteField(term315464, term315464.getClass(), "second", (byte) 10);
        setIntField(term315464, term315464.getClass(), "nano", 223122377);
        setField(term315459, term315459.getClass(), "time", term315464);
        setField(term315409, term315409.getClass(), "lastLoginDate", term315459);
        setBooleanField(term315409, term315409.getClass(), "isWebJoin", true);
        setField(term315409, term315409.getClass(), "webLimitDate", "sgApZzdiHM");
        setIntField(term315409, term315409.getClass(), "level", 1769359180);
        setIntField(term315409, term315409.getClass(), "reincarnationNum", 1096535388);
        setField(term315409, term315409.getClass(), "exp", "vAEHmJcPSd");
        setLongField(term315409, term315409.getClass(), "point", -3290833408389403753L);
        setLongField(term315409, term315409.getClass(), "totalPoint", 3827140775468483778L);
        setIntField(term315409, term315409.getClass(), "playCount", -1584065017);
        setIntField(term315409, term315409.getClass(), "multiPlayCount", 1503808151);
        setIntField(term315409, term315409.getClass(), "multiWinCount", -1186485599);
        setIntField(term315409, term315409.getClass(), "requestResCount", -1502880400);
        setIntField(term315409, term315409.getClass(), "acceptResCount", 93955884);
        setIntField(term315409, term315409.getClass(), "successResCount", 1900672421);
        setIntField(term315409, term315409.getClass(), "playerRating", 128643836);
        setIntField(term315409, term315409.getClass(), "highestRating", 1120713422);
        setIntField(term315409, term315409.getClass(), "nameplateId", -758128625);
        setIntField(term315409, term315409.getClass(), "frameId", 1701172049);
        setIntField(term315409, term315409.getClass(), "characterId", -679302956);
        setIntField(term315409, term315409.getClass(), "trophyId", -2037557020);
        setIntField(term315409, term315409.getClass(), "playedTutorialBit", -1132081641);
        setIntField(term315409, term315409.getClass(), "firstTutorialCancelNum", 70482654);
        setIntField(term315409, term315409.getClass(), "masterTutorialCancelNum", 78894621);
        setIntField(term315409, term315409.getClass(), "totalRepertoireCount", -1060180315);
        setIntField(term315409, term315409.getClass(), "totalMapNum", -2103989969);
        setLongField(term315409, term315409.getClass(), "totalHiScore", -7886523375925893926L);
        setLongField(term315409, term315409.getClass(), "totalBasicHighScore", 1196966682262295867L);
        setLongField(term315409, term315409.getClass(), "totalAdvancedHighScore", -82669485577258761L);
        setLongField(term315409, term315409.getClass(), "totalExpertHighScore", -3074499818274191179L);
        setLongField(term315409, term315409.getClass(), "totalMasterHighScore", 3389102477696255827L);
        setIntField(term315521, term315521.getClass(), "year", 2010);
        setShortField(term315521, term315521.getClass(), "month", (short) 8);
        setShortField(term315521, term315521.getClass(), "day", (short) 9);
        setField(term315520, term315520.getClass(), "date", term315521);
        setByteField(term315525, term315525.getClass(), "hour", (byte) 7);
        setByteField(term315525, term315525.getClass(), "minute", (byte) 43);
        setByteField(term315525, term315525.getClass(), "second", (byte) 44);
        setIntField(term315525, term315525.getClass(), "nano", 551051174);
        setField(term315520, term315520.getClass(), "time", term315525);
        setField(term315409, term315409.getClass(), "eventWatchedDate", term315520);
        setIntField(term315409, term315409.getClass(), "friendCount", 1898547444);
        setBooleanField(term315409, term315409.getClass(), "isMaimai", false);
        setField(term315409, term315409.getClass(), "firstGameId", "dOvqKQlKUa");
        setField(term315409, term315409.getClass(), "firstRomVersion", "ZjyndZHfXg");
        setField(term315409, term315409.getClass(), "firstDataVersion", "mWarigMEMX");
        setIntField(term315569, term315569.getClass(), "year", 2025);
        setShortField(term315569, term315569.getClass(), "month", (short) 8);
        setShortField(term315569, term315569.getClass(), "day", (short) 23);
        setField(term315568, term315568.getClass(), "date", term315569);
        setByteField(term315573, term315573.getClass(), "hour", (byte) 11);
        setByteField(term315573, term315573.getClass(), "minute", (byte) 30);
        setByteField(term315573, term315573.getClass(), "second", (byte) 21);
        setIntField(term315573, term315573.getClass(), "nano", 199155015);
        setField(term315568, term315568.getClass(), "time", term315573);
        setField(term315409, term315409.getClass(), "firstPlayDate", term315568);
        setField(term315409, term315409.getClass(), "lastGameId", "UbOEkDKQTT");
        setField(term315409, term315409.getClass(), "lastRomVersion", "IWWuxiwNhE");
        setField(term315409, term315409.getClass(), "lastDataVersion", "tecOgyBctJ");
        setIntField(term315615, term315615.getClass(), "year", 2026);
        setShortField(term315615, term315615.getClass(), "month", (short) 12);
        setShortField(term315615, term315615.getClass(), "day", (short) 21);
        setField(term315614, term315614.getClass(), "date", term315615);
        setByteField(term315619, term315619.getClass(), "hour", (byte) 3);
        setByteField(term315619, term315619.getClass(), "minute", (byte) 48);
        setByteField(term315619, term315619.getClass(), "second", (byte) 58);
        setIntField(term315619, term315619.getClass(), "nano", 851385930);
        setField(term315614, term315614.getClass(), "time", term315619);
        setField(term315409, term315409.getClass(), "lastPlayDate", term315614);
        setIntField(term315409, term315409.getClass(), "lastPlaceId", 1498682661);
        setField(term315409, term315409.getClass(), "lastPlaceName", "rSSuONUDGA");
        setField(term315409, term315409.getClass(), "lastRegionId", "WmInSFSxSk");
        setField(term315409, term315409.getClass(), "lastRegionName", "rmbZwfUyua");
        setField(term315409, term315409.getClass(), "lastAllNetId", "GzCjLjIGCd");
        setField(term315409, term315409.getClass(), "lastClientId", "oYSEWvyjcR");
        setField(term315407, term315407.getClass(), "user", term315409);
        setIntField(term315407, term315407.getClass(), "ext1", -1994146092);
        setIntField(term315407, term315407.getClass(), "ext2", -1922551623);
        setIntField(term315407, term315407.getClass(), "ext3", -97883265);
        setIntField(term315407, term315407.getClass(), "ext4", -1515636576);
        setIntField(term315407, term315407.getClass(), "ext5", -220487550);
        setIntField(term315407, term315407.getClass(), "ext6", -640851007);
        setIntField(term315407, term315407.getClass(), "ext7", 549291991);
        setIntField(term315407, term315407.getClass(), "ext8", 1727193345);
        setIntField(term315407, term315407.getClass(), "ext9", 779226069);
        setIntField(term315407, term315407.getClass(), "ext10", 1360267381);
        setIntField(term315407, term315407.getClass(), "ext11", -1238229215);
        setIntField(term315407, term315407.getClass(), "ext12", 1604817674);
        setIntField(term315407, term315407.getClass(), "ext13", 1716104970);
        setIntField(term315407, term315407.getClass(), "ext14", 611301077);
        setIntField(term315407, term315407.getClass(), "ext15", 1776391412);
        setIntField(term315407, term315407.getClass(), "ext16", 206840742);
        setIntField(term315407, term315407.getClass(), "ext17", 2082328508);
        setIntField(term315407, term315407.getClass(), "ext18", -162243930);
        setIntField(term315407, term315407.getClass(), "ext19", 872217662);
        setIntField(term315407, term315407.getClass(), "ext20", 1675988214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt11", argTypes, term315407, args);
    }

};


