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
import java.lang.Long;

public class UserData_setExtLong1_1903013957401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292595;
     Object term292672;

    public UserData_setExtLong1_1903013957401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292595 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term292595, term292595.getClass(), "id", 0L);
        setField(term292595, term292595.getClass(), "card", null);
        setField(term292595, term292595.getClass(), "userName", null);
        setIntField(term292595, term292595.getClass(), "level", 0);
        setIntField(term292595, term292595.getClass(), "reincarnationNum", 0);
        setField(term292595, term292595.getClass(), "exp", null);
        setLongField(term292595, term292595.getClass(), "point", 0L);
        setLongField(term292595, term292595.getClass(), "totalPoint", 0L);
        setIntField(term292595, term292595.getClass(), "playCount", 0);
        setIntField(term292595, term292595.getClass(), "multiPlayCount", 0);
        setIntField(term292595, term292595.getClass(), "playerRating", 0);
        setIntField(term292595, term292595.getClass(), "highestRating", 0);
        setIntField(term292595, term292595.getClass(), "nameplateId", 0);
        setIntField(term292595, term292595.getClass(), "frameId", 0);
        setIntField(term292595, term292595.getClass(), "characterId", 0);
        setIntField(term292595, term292595.getClass(), "trophyId", 0);
        setIntField(term292595, term292595.getClass(), "playedTutorialBit", 0);
        setIntField(term292595, term292595.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term292595, term292595.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term292595, term292595.getClass(), "totalMapNum", 0);
        setLongField(term292595, term292595.getClass(), "totalHiScore", 0L);
        setLongField(term292595, term292595.getClass(), "totalBasicHighScore", 0L);
        setLongField(term292595, term292595.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term292595, term292595.getClass(), "totalExpertHighScore", 0L);
        setLongField(term292595, term292595.getClass(), "totalMasterHighScore", 0L);
        setLongField(term292595, term292595.getClass(), "totalUltimaHighScore", 0L);
        setField(term292595, term292595.getClass(), "eventWatchedDate", null);
        setIntField(term292595, term292595.getClass(), "friendCount", 0);
        setField(term292595, term292595.getClass(), "firstGameId", null);
        setField(term292595, term292595.getClass(), "firstRomVersion", null);
        setField(term292595, term292595.getClass(), "firstDataVersion", null);
        setField(term292595, term292595.getClass(), "firstPlayDate", null);
        setField(term292595, term292595.getClass(), "lastGameId", null);
        setField(term292595, term292595.getClass(), "lastRomVersion", null);
        setField(term292595, term292595.getClass(), "lastDataVersion", null);
        setField(term292595, term292595.getClass(), "lastLoginDate", null);
        setField(term292595, term292595.getClass(), "lastPlayDate", null);
        setIntField(term292595, term292595.getClass(), "lastPlaceId", 0);
        setField(term292595, term292595.getClass(), "lastPlaceName", null);
        setField(term292595, term292595.getClass(), "lastRegionId", null);
        setField(term292595, term292595.getClass(), "lastRegionName", null);
        setField(term292595, term292595.getClass(), "lastAllNetId", null);
        setField(term292595, term292595.getClass(), "lastClientId", null);
        setField(term292595, term292595.getClass(), "lastCountryCode", null);
        setField(term292595, term292595.getClass(), "userNameEx", null);
        setField(term292595, term292595.getClass(), "compatibleCmVersion", null);
        setIntField(term292595, term292595.getClass(), "medal", 0);
        setIntField(term292595, term292595.getClass(), "mapIconId", 0);
        setIntField(term292595, term292595.getClass(), "voiceId", 0);
        setIntField(term292595, term292595.getClass(), "avatarWear", 0);
        setIntField(term292595, term292595.getClass(), "avatarHead", 0);
        setIntField(term292595, term292595.getClass(), "avatarFace", 0);
        setIntField(term292595, term292595.getClass(), "avatarSkin", 0);
        setIntField(term292595, term292595.getClass(), "avatarItem", 0);
        setIntField(term292595, term292595.getClass(), "avatarFront", 0);
        setIntField(term292595, term292595.getClass(), "avatarBack", 0);
        setIntField(term292595, term292595.getClass(), "classEmblemBase", 0);
        setIntField(term292595, term292595.getClass(), "classEmblemMedal", 0);
        setIntField(term292595, term292595.getClass(), "stockedGridCount", 0);
        setIntField(term292595, term292595.getClass(), "exMapLoopCount", 0);
        setIntField(term292595, term292595.getClass(), "netBattlePlayCount", 0);
        setIntField(term292595, term292595.getClass(), "netBattleWinCount", 0);
        setIntField(term292595, term292595.getClass(), "netBattleLoseCount", 0);
        setIntField(term292595, term292595.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term292595, term292595.getClass(), "charaIllustId", 0);
        setIntField(term292595, term292595.getClass(), "skillId", 0);
        setIntField(term292595, term292595.getClass(), "overPowerPoint", 0);
        setIntField(term292595, term292595.getClass(), "overPowerRate", 0);
        setIntField(term292595, term292595.getClass(), "overPowerLowerRank", 0);
        setIntField(term292595, term292595.getClass(), "avatarPoint", 0);
        setIntField(term292595, term292595.getClass(), "battleRankId", 0);
        setIntField(term292595, term292595.getClass(), "battleRankPoint", 0);
        setIntField(term292595, term292595.getClass(), "eliteRankPoint", 0);
        setIntField(term292595, term292595.getClass(), "netBattle1stCount", 0);
        setIntField(term292595, term292595.getClass(), "netBattle2ndCount", 0);
        setIntField(term292595, term292595.getClass(), "netBattle3rdCount", 0);
        setIntField(term292595, term292595.getClass(), "netBattle4thCount", 0);
        setIntField(term292595, term292595.getClass(), "netBattleCorrection", 0);
        setIntField(term292595, term292595.getClass(), "netBattleErrCnt", 0);
        setIntField(term292595, term292595.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term292595, term292595.getClass(), "battleRewardStatus", 0);
        setIntField(term292595, term292595.getClass(), "battleRewardIndex", 0);
        setIntField(term292595, term292595.getClass(), "battleRewardCount", 0);
        setIntField(term292595, term292595.getClass(), "ext1", 0);
        setIntField(term292595, term292595.getClass(), "ext2", 0);
        setIntField(term292595, term292595.getClass(), "ext3", 0);
        setIntField(term292595, term292595.getClass(), "ext4", 0);
        setIntField(term292595, term292595.getClass(), "ext5", 0);
        setIntField(term292595, term292595.getClass(), "ext6", 0);
        setIntField(term292595, term292595.getClass(), "ext7", 0);
        setIntField(term292595, term292595.getClass(), "ext8", 0);
        setIntField(term292595, term292595.getClass(), "ext9", 0);
        setIntField(term292595, term292595.getClass(), "ext10", 0);
        setField(term292595, term292595.getClass(), "extStr1", null);
        setField(term292595, term292595.getClass(), "extStr2", null);
        setLongField(term292595, term292595.getClass(), "extLong1", 0L);
        setLongField(term292595, term292595.getClass(), "extLong2", 0L);
        setField(term292595, term292595.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term292595, term292595.getClass(), "isNetBattleHost", false);
        setIntField(term292595, term292595.getClass(), "netBattleEndState", 0);
        term292672 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term292672;
        callMethod(klass, "setExtLong1", argTypes, term292595, args);
    }

};


