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

public class UserData_setMapIconId_86713853353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288807;
     Object term288884;

    public UserData_setMapIconId_86713853353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288807 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term288807, term288807.getClass(), "id", 0L);
        setField(term288807, term288807.getClass(), "card", null);
        setField(term288807, term288807.getClass(), "userName", null);
        setIntField(term288807, term288807.getClass(), "level", 0);
        setIntField(term288807, term288807.getClass(), "reincarnationNum", 0);
        setField(term288807, term288807.getClass(), "exp", null);
        setLongField(term288807, term288807.getClass(), "point", 0L);
        setLongField(term288807, term288807.getClass(), "totalPoint", 0L);
        setIntField(term288807, term288807.getClass(), "playCount", 0);
        setIntField(term288807, term288807.getClass(), "multiPlayCount", 0);
        setIntField(term288807, term288807.getClass(), "playerRating", 0);
        setIntField(term288807, term288807.getClass(), "highestRating", 0);
        setIntField(term288807, term288807.getClass(), "nameplateId", 0);
        setIntField(term288807, term288807.getClass(), "frameId", 0);
        setIntField(term288807, term288807.getClass(), "characterId", 0);
        setIntField(term288807, term288807.getClass(), "trophyId", 0);
        setIntField(term288807, term288807.getClass(), "playedTutorialBit", 0);
        setIntField(term288807, term288807.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term288807, term288807.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term288807, term288807.getClass(), "totalMapNum", 0);
        setLongField(term288807, term288807.getClass(), "totalHiScore", 0L);
        setLongField(term288807, term288807.getClass(), "totalBasicHighScore", 0L);
        setLongField(term288807, term288807.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term288807, term288807.getClass(), "totalExpertHighScore", 0L);
        setLongField(term288807, term288807.getClass(), "totalMasterHighScore", 0L);
        setLongField(term288807, term288807.getClass(), "totalUltimaHighScore", 0L);
        setField(term288807, term288807.getClass(), "eventWatchedDate", null);
        setIntField(term288807, term288807.getClass(), "friendCount", 0);
        setField(term288807, term288807.getClass(), "firstGameId", null);
        setField(term288807, term288807.getClass(), "firstRomVersion", null);
        setField(term288807, term288807.getClass(), "firstDataVersion", null);
        setField(term288807, term288807.getClass(), "firstPlayDate", null);
        setField(term288807, term288807.getClass(), "lastGameId", null);
        setField(term288807, term288807.getClass(), "lastRomVersion", null);
        setField(term288807, term288807.getClass(), "lastDataVersion", null);
        setField(term288807, term288807.getClass(), "lastLoginDate", null);
        setField(term288807, term288807.getClass(), "lastPlayDate", null);
        setIntField(term288807, term288807.getClass(), "lastPlaceId", 0);
        setField(term288807, term288807.getClass(), "lastPlaceName", null);
        setField(term288807, term288807.getClass(), "lastRegionId", null);
        setField(term288807, term288807.getClass(), "lastRegionName", null);
        setField(term288807, term288807.getClass(), "lastAllNetId", null);
        setField(term288807, term288807.getClass(), "lastClientId", null);
        setField(term288807, term288807.getClass(), "lastCountryCode", null);
        setField(term288807, term288807.getClass(), "userNameEx", null);
        setField(term288807, term288807.getClass(), "compatibleCmVersion", null);
        setIntField(term288807, term288807.getClass(), "medal", 0);
        setIntField(term288807, term288807.getClass(), "mapIconId", 0);
        setIntField(term288807, term288807.getClass(), "voiceId", 0);
        setIntField(term288807, term288807.getClass(), "avatarWear", 0);
        setIntField(term288807, term288807.getClass(), "avatarHead", 0);
        setIntField(term288807, term288807.getClass(), "avatarFace", 0);
        setIntField(term288807, term288807.getClass(), "avatarSkin", 0);
        setIntField(term288807, term288807.getClass(), "avatarItem", 0);
        setIntField(term288807, term288807.getClass(), "avatarFront", 0);
        setIntField(term288807, term288807.getClass(), "avatarBack", 0);
        setIntField(term288807, term288807.getClass(), "classEmblemBase", 0);
        setIntField(term288807, term288807.getClass(), "classEmblemMedal", 0);
        setIntField(term288807, term288807.getClass(), "stockedGridCount", 0);
        setIntField(term288807, term288807.getClass(), "exMapLoopCount", 0);
        setIntField(term288807, term288807.getClass(), "netBattlePlayCount", 0);
        setIntField(term288807, term288807.getClass(), "netBattleWinCount", 0);
        setIntField(term288807, term288807.getClass(), "netBattleLoseCount", 0);
        setIntField(term288807, term288807.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term288807, term288807.getClass(), "charaIllustId", 0);
        setIntField(term288807, term288807.getClass(), "skillId", 0);
        setIntField(term288807, term288807.getClass(), "overPowerPoint", 0);
        setIntField(term288807, term288807.getClass(), "overPowerRate", 0);
        setIntField(term288807, term288807.getClass(), "overPowerLowerRank", 0);
        setIntField(term288807, term288807.getClass(), "avatarPoint", 0);
        setIntField(term288807, term288807.getClass(), "battleRankId", 0);
        setIntField(term288807, term288807.getClass(), "battleRankPoint", 0);
        setIntField(term288807, term288807.getClass(), "eliteRankPoint", 0);
        setIntField(term288807, term288807.getClass(), "netBattle1stCount", 0);
        setIntField(term288807, term288807.getClass(), "netBattle2ndCount", 0);
        setIntField(term288807, term288807.getClass(), "netBattle3rdCount", 0);
        setIntField(term288807, term288807.getClass(), "netBattle4thCount", 0);
        setIntField(term288807, term288807.getClass(), "netBattleCorrection", 0);
        setIntField(term288807, term288807.getClass(), "netBattleErrCnt", 0);
        setIntField(term288807, term288807.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term288807, term288807.getClass(), "battleRewardStatus", 0);
        setIntField(term288807, term288807.getClass(), "battleRewardIndex", 0);
        setIntField(term288807, term288807.getClass(), "battleRewardCount", 0);
        setIntField(term288807, term288807.getClass(), "ext1", 0);
        setIntField(term288807, term288807.getClass(), "ext2", 0);
        setIntField(term288807, term288807.getClass(), "ext3", 0);
        setIntField(term288807, term288807.getClass(), "ext4", 0);
        setIntField(term288807, term288807.getClass(), "ext5", 0);
        setIntField(term288807, term288807.getClass(), "ext6", 0);
        setIntField(term288807, term288807.getClass(), "ext7", 0);
        setIntField(term288807, term288807.getClass(), "ext8", 0);
        setIntField(term288807, term288807.getClass(), "ext9", 0);
        setIntField(term288807, term288807.getClass(), "ext10", 0);
        setField(term288807, term288807.getClass(), "extStr1", null);
        setField(term288807, term288807.getClass(), "extStr2", null);
        setLongField(term288807, term288807.getClass(), "extLong1", 0L);
        setLongField(term288807, term288807.getClass(), "extLong2", 0L);
        setField(term288807, term288807.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term288807, term288807.getClass(), "isNetBattleHost", false);
        setIntField(term288807, term288807.getClass(), "netBattleEndState", 0);
        term288884 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term288884;
        callMethod(klass, "setMapIconId", argTypes, term288807, args);
    }

};


