package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserData_setExt8_177742008396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292204;
     Object term292281;

    public UserData_setExt8_177742008396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292204 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term292204, term292204.getClass(), "id", 0L);
        setField(term292204, term292204.getClass(), "card", null);
        setField(term292204, term292204.getClass(), "userName", null);
        setIntField(term292204, term292204.getClass(), "level", 0);
        setIntField(term292204, term292204.getClass(), "reincarnationNum", 0);
        setField(term292204, term292204.getClass(), "exp", null);
        setLongField(term292204, term292204.getClass(), "point", 0L);
        setLongField(term292204, term292204.getClass(), "totalPoint", 0L);
        setIntField(term292204, term292204.getClass(), "playCount", 0);
        setIntField(term292204, term292204.getClass(), "multiPlayCount", 0);
        setIntField(term292204, term292204.getClass(), "playerRating", 0);
        setIntField(term292204, term292204.getClass(), "highestRating", 0);
        setIntField(term292204, term292204.getClass(), "nameplateId", 0);
        setIntField(term292204, term292204.getClass(), "frameId", 0);
        setIntField(term292204, term292204.getClass(), "characterId", 0);
        setIntField(term292204, term292204.getClass(), "trophyId", 0);
        setIntField(term292204, term292204.getClass(), "playedTutorialBit", 0);
        setIntField(term292204, term292204.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term292204, term292204.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term292204, term292204.getClass(), "totalMapNum", 0);
        setLongField(term292204, term292204.getClass(), "totalHiScore", 0L);
        setLongField(term292204, term292204.getClass(), "totalBasicHighScore", 0L);
        setLongField(term292204, term292204.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term292204, term292204.getClass(), "totalExpertHighScore", 0L);
        setLongField(term292204, term292204.getClass(), "totalMasterHighScore", 0L);
        setLongField(term292204, term292204.getClass(), "totalUltimaHighScore", 0L);
        setField(term292204, term292204.getClass(), "eventWatchedDate", null);
        setIntField(term292204, term292204.getClass(), "friendCount", 0);
        setField(term292204, term292204.getClass(), "firstGameId", null);
        setField(term292204, term292204.getClass(), "firstRomVersion", null);
        setField(term292204, term292204.getClass(), "firstDataVersion", null);
        setField(term292204, term292204.getClass(), "firstPlayDate", null);
        setField(term292204, term292204.getClass(), "lastGameId", null);
        setField(term292204, term292204.getClass(), "lastRomVersion", null);
        setField(term292204, term292204.getClass(), "lastDataVersion", null);
        setField(term292204, term292204.getClass(), "lastLoginDate", null);
        setField(term292204, term292204.getClass(), "lastPlayDate", null);
        setIntField(term292204, term292204.getClass(), "lastPlaceId", 0);
        setField(term292204, term292204.getClass(), "lastPlaceName", null);
        setField(term292204, term292204.getClass(), "lastRegionId", null);
        setField(term292204, term292204.getClass(), "lastRegionName", null);
        setField(term292204, term292204.getClass(), "lastAllNetId", null);
        setField(term292204, term292204.getClass(), "lastClientId", null);
        setField(term292204, term292204.getClass(), "lastCountryCode", null);
        setField(term292204, term292204.getClass(), "userNameEx", null);
        setField(term292204, term292204.getClass(), "compatibleCmVersion", null);
        setIntField(term292204, term292204.getClass(), "medal", 0);
        setIntField(term292204, term292204.getClass(), "mapIconId", 0);
        setIntField(term292204, term292204.getClass(), "voiceId", 0);
        setIntField(term292204, term292204.getClass(), "avatarWear", 0);
        setIntField(term292204, term292204.getClass(), "avatarHead", 0);
        setIntField(term292204, term292204.getClass(), "avatarFace", 0);
        setIntField(term292204, term292204.getClass(), "avatarSkin", 0);
        setIntField(term292204, term292204.getClass(), "avatarItem", 0);
        setIntField(term292204, term292204.getClass(), "avatarFront", 0);
        setIntField(term292204, term292204.getClass(), "avatarBack", 0);
        setIntField(term292204, term292204.getClass(), "classEmblemBase", 0);
        setIntField(term292204, term292204.getClass(), "classEmblemMedal", 0);
        setIntField(term292204, term292204.getClass(), "stockedGridCount", 0);
        setIntField(term292204, term292204.getClass(), "exMapLoopCount", 0);
        setIntField(term292204, term292204.getClass(), "netBattlePlayCount", 0);
        setIntField(term292204, term292204.getClass(), "netBattleWinCount", 0);
        setIntField(term292204, term292204.getClass(), "netBattleLoseCount", 0);
        setIntField(term292204, term292204.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term292204, term292204.getClass(), "charaIllustId", 0);
        setIntField(term292204, term292204.getClass(), "skillId", 0);
        setIntField(term292204, term292204.getClass(), "overPowerPoint", 0);
        setIntField(term292204, term292204.getClass(), "overPowerRate", 0);
        setIntField(term292204, term292204.getClass(), "overPowerLowerRank", 0);
        setIntField(term292204, term292204.getClass(), "avatarPoint", 0);
        setIntField(term292204, term292204.getClass(), "battleRankId", 0);
        setIntField(term292204, term292204.getClass(), "battleRankPoint", 0);
        setIntField(term292204, term292204.getClass(), "eliteRankPoint", 0);
        setIntField(term292204, term292204.getClass(), "netBattle1stCount", 0);
        setIntField(term292204, term292204.getClass(), "netBattle2ndCount", 0);
        setIntField(term292204, term292204.getClass(), "netBattle3rdCount", 0);
        setIntField(term292204, term292204.getClass(), "netBattle4thCount", 0);
        setIntField(term292204, term292204.getClass(), "netBattleCorrection", 0);
        setIntField(term292204, term292204.getClass(), "netBattleErrCnt", 0);
        setIntField(term292204, term292204.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term292204, term292204.getClass(), "battleRewardStatus", 0);
        setIntField(term292204, term292204.getClass(), "battleRewardIndex", 0);
        setIntField(term292204, term292204.getClass(), "battleRewardCount", 0);
        setIntField(term292204, term292204.getClass(), "ext1", 0);
        setIntField(term292204, term292204.getClass(), "ext2", 0);
        setIntField(term292204, term292204.getClass(), "ext3", 0);
        setIntField(term292204, term292204.getClass(), "ext4", 0);
        setIntField(term292204, term292204.getClass(), "ext5", 0);
        setIntField(term292204, term292204.getClass(), "ext6", 0);
        setIntField(term292204, term292204.getClass(), "ext7", 0);
        setIntField(term292204, term292204.getClass(), "ext8", 0);
        setIntField(term292204, term292204.getClass(), "ext9", 0);
        setIntField(term292204, term292204.getClass(), "ext10", 0);
        setField(term292204, term292204.getClass(), "extStr1", null);
        setField(term292204, term292204.getClass(), "extStr2", null);
        setLongField(term292204, term292204.getClass(), "extLong1", 0L);
        setLongField(term292204, term292204.getClass(), "extLong2", 0L);
        setField(term292204, term292204.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term292204, term292204.getClass(), "isNetBattleHost", false);
        setIntField(term292204, term292204.getClass(), "netBattleEndState", 0);
        term292281 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term292281;
        callMethod(klass, "setExt8", argTypes, term292204, args);
    }

};


