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

public class UserData_setOverPowerPoint_1399877648372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290308;
     Object term290385;

    public UserData_setOverPowerPoint_1399877648372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290308 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term290308, term290308.getClass(), "id", 0L);
        setField(term290308, term290308.getClass(), "card", null);
        setField(term290308, term290308.getClass(), "userName", null);
        setIntField(term290308, term290308.getClass(), "level", 0);
        setIntField(term290308, term290308.getClass(), "reincarnationNum", 0);
        setField(term290308, term290308.getClass(), "exp", null);
        setLongField(term290308, term290308.getClass(), "point", 0L);
        setLongField(term290308, term290308.getClass(), "totalPoint", 0L);
        setIntField(term290308, term290308.getClass(), "playCount", 0);
        setIntField(term290308, term290308.getClass(), "multiPlayCount", 0);
        setIntField(term290308, term290308.getClass(), "playerRating", 0);
        setIntField(term290308, term290308.getClass(), "highestRating", 0);
        setIntField(term290308, term290308.getClass(), "nameplateId", 0);
        setIntField(term290308, term290308.getClass(), "frameId", 0);
        setIntField(term290308, term290308.getClass(), "characterId", 0);
        setIntField(term290308, term290308.getClass(), "trophyId", 0);
        setIntField(term290308, term290308.getClass(), "playedTutorialBit", 0);
        setIntField(term290308, term290308.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term290308, term290308.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term290308, term290308.getClass(), "totalMapNum", 0);
        setLongField(term290308, term290308.getClass(), "totalHiScore", 0L);
        setLongField(term290308, term290308.getClass(), "totalBasicHighScore", 0L);
        setLongField(term290308, term290308.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term290308, term290308.getClass(), "totalExpertHighScore", 0L);
        setLongField(term290308, term290308.getClass(), "totalMasterHighScore", 0L);
        setLongField(term290308, term290308.getClass(), "totalUltimaHighScore", 0L);
        setField(term290308, term290308.getClass(), "eventWatchedDate", null);
        setIntField(term290308, term290308.getClass(), "friendCount", 0);
        setField(term290308, term290308.getClass(), "firstGameId", null);
        setField(term290308, term290308.getClass(), "firstRomVersion", null);
        setField(term290308, term290308.getClass(), "firstDataVersion", null);
        setField(term290308, term290308.getClass(), "firstPlayDate", null);
        setField(term290308, term290308.getClass(), "lastGameId", null);
        setField(term290308, term290308.getClass(), "lastRomVersion", null);
        setField(term290308, term290308.getClass(), "lastDataVersion", null);
        setField(term290308, term290308.getClass(), "lastLoginDate", null);
        setField(term290308, term290308.getClass(), "lastPlayDate", null);
        setIntField(term290308, term290308.getClass(), "lastPlaceId", 0);
        setField(term290308, term290308.getClass(), "lastPlaceName", null);
        setField(term290308, term290308.getClass(), "lastRegionId", null);
        setField(term290308, term290308.getClass(), "lastRegionName", null);
        setField(term290308, term290308.getClass(), "lastAllNetId", null);
        setField(term290308, term290308.getClass(), "lastClientId", null);
        setField(term290308, term290308.getClass(), "lastCountryCode", null);
        setField(term290308, term290308.getClass(), "userNameEx", null);
        setField(term290308, term290308.getClass(), "compatibleCmVersion", null);
        setIntField(term290308, term290308.getClass(), "medal", 0);
        setIntField(term290308, term290308.getClass(), "mapIconId", 0);
        setIntField(term290308, term290308.getClass(), "voiceId", 0);
        setIntField(term290308, term290308.getClass(), "avatarWear", 0);
        setIntField(term290308, term290308.getClass(), "avatarHead", 0);
        setIntField(term290308, term290308.getClass(), "avatarFace", 0);
        setIntField(term290308, term290308.getClass(), "avatarSkin", 0);
        setIntField(term290308, term290308.getClass(), "avatarItem", 0);
        setIntField(term290308, term290308.getClass(), "avatarFront", 0);
        setIntField(term290308, term290308.getClass(), "avatarBack", 0);
        setIntField(term290308, term290308.getClass(), "classEmblemBase", 0);
        setIntField(term290308, term290308.getClass(), "classEmblemMedal", 0);
        setIntField(term290308, term290308.getClass(), "stockedGridCount", 0);
        setIntField(term290308, term290308.getClass(), "exMapLoopCount", 0);
        setIntField(term290308, term290308.getClass(), "netBattlePlayCount", 0);
        setIntField(term290308, term290308.getClass(), "netBattleWinCount", 0);
        setIntField(term290308, term290308.getClass(), "netBattleLoseCount", 0);
        setIntField(term290308, term290308.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term290308, term290308.getClass(), "charaIllustId", 0);
        setIntField(term290308, term290308.getClass(), "skillId", 0);
        setIntField(term290308, term290308.getClass(), "overPowerPoint", 0);
        setIntField(term290308, term290308.getClass(), "overPowerRate", 0);
        setIntField(term290308, term290308.getClass(), "overPowerLowerRank", 0);
        setIntField(term290308, term290308.getClass(), "avatarPoint", 0);
        setIntField(term290308, term290308.getClass(), "battleRankId", 0);
        setIntField(term290308, term290308.getClass(), "battleRankPoint", 0);
        setIntField(term290308, term290308.getClass(), "eliteRankPoint", 0);
        setIntField(term290308, term290308.getClass(), "netBattle1stCount", 0);
        setIntField(term290308, term290308.getClass(), "netBattle2ndCount", 0);
        setIntField(term290308, term290308.getClass(), "netBattle3rdCount", 0);
        setIntField(term290308, term290308.getClass(), "netBattle4thCount", 0);
        setIntField(term290308, term290308.getClass(), "netBattleCorrection", 0);
        setIntField(term290308, term290308.getClass(), "netBattleErrCnt", 0);
        setIntField(term290308, term290308.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term290308, term290308.getClass(), "battleRewardStatus", 0);
        setIntField(term290308, term290308.getClass(), "battleRewardIndex", 0);
        setIntField(term290308, term290308.getClass(), "battleRewardCount", 0);
        setIntField(term290308, term290308.getClass(), "ext1", 0);
        setIntField(term290308, term290308.getClass(), "ext2", 0);
        setIntField(term290308, term290308.getClass(), "ext3", 0);
        setIntField(term290308, term290308.getClass(), "ext4", 0);
        setIntField(term290308, term290308.getClass(), "ext5", 0);
        setIntField(term290308, term290308.getClass(), "ext6", 0);
        setIntField(term290308, term290308.getClass(), "ext7", 0);
        setIntField(term290308, term290308.getClass(), "ext8", 0);
        setIntField(term290308, term290308.getClass(), "ext9", 0);
        setIntField(term290308, term290308.getClass(), "ext10", 0);
        setField(term290308, term290308.getClass(), "extStr1", null);
        setField(term290308, term290308.getClass(), "extStr2", null);
        setLongField(term290308, term290308.getClass(), "extLong1", 0L);
        setLongField(term290308, term290308.getClass(), "extLong2", 0L);
        setField(term290308, term290308.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term290308, term290308.getClass(), "isNetBattleHost", false);
        setIntField(term290308, term290308.getClass(), "netBattleEndState", 0);
        term290385 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term290385;
        callMethod(klass, "setOverPowerPoint", argTypes, term290308, args);
    }

};


